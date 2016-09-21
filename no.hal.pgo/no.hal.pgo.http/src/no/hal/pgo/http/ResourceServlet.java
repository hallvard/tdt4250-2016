package no.hal.pgo.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("serial")
public class ResourceServlet extends HttpServlet {
	
	protected final IResourceProvider resourceProvider;

	public ResourceServlet(IResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		String path = req.getPathInfo();
		Collection<String> resourcePath = new ArrayList<String>();
		String op = getResourcePathAndOp(path, resourcePath);
		try {
			Resource resource = resourceProvider.getResource();
			String[] segments = resourcePath.toArray(new String[resourcePath.size()]);
			EObject eObject = resourceProvider.getRequestPathResolver().getEObjectForPath(resource, segments);
			Map<String, Object> params = decodeQuery(req);
			Object result = (eObject != null && op != null  ? resourceProvider.getRequestQueryExecutor().getRequestQueryResult(eObject, op, params) : eObject);
			resourceProvider.getResponseSerializer().serialize(result, resp.getWriter());
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected String getResourcePathAndOp(String path, Collection<String> resourcePath) {
		String op = null;
		if (path != null) {
			int pos = 0;
			while (pos < path.length()) {
				int end = path.indexOf('/', pos);
				if (end < 0) {
					op = path.substring(pos);
					break;
				} else if (end > pos) {
					resourcePath.add(path.substring(pos, end));
				}
				pos = end + 1;
			}
		}
		return op;
	}

	protected Map<String, Object> decodeQuery(HttpServletRequest req) {
		String query = req.getQueryString();
		Map<String,Object> params = new HashMap<String, Object>();
		if (query != null) {
			for (String param : query.split("&")) {
				int pos = param.indexOf('=');
				if (pos > 0) {
					params.put(param.substring(0, pos), param.substring(pos + 1));
				} else {
					params.put(param, true);				
				}
			}
		}
		return params;
	}
}
