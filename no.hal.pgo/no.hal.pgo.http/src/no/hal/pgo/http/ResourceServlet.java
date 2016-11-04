package no.hal.pgo.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

import no.hal.pgo.http.auth.AuthenticationHandler;
import no.hal.pgo.http.auth.AuthenticationHandlerProvider;
import no.hal.pgo.http.auth.UnauthorizedException;
import no.hal.pgo.http.util.RequestHelper;
import no.hal.pgo.http.util.ServletUtil;

@SuppressWarnings("serial")
public class ResourceServlet extends HttpServlet {
	
	protected final IResourceProvider resourceProvider;

	public ResourceServlet(IResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
	}

	protected IRequestHelper requestHelper;
	
	public void setRequestHelper(IRequestHelper requestHelper) {
		this.requestHelper = requestHelper;
	}

	protected AuthenticationHandlerProvider authenticationHandlerProvider;
	
	public void setAuthenticationHandler(AuthenticationHandlerProvider authenticationHandlerProvider) {
		this.authenticationHandlerProvider = authenticationHandlerProvider;
	}

	protected LogService logger;
	
	protected LogService getLogger() {
		if (this.logger == null) {
			BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
			ServiceReference<LogService> serviceReference = bundleContext.getServiceReference(LogService.class);
			this.logger = bundleContext.getService(serviceReference);
		}
		return this.logger;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> params = ServletUtil.decodeQuery(req, new HashMap<String, Object>());
		doHelper(req, resp, params);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> params = ServletUtil.decodeQuery(req, new HashMap<String, Object>());
		ServletUtil.decodePostBody(req, params);
		doHelper(req, resp, params);
	}
	
	protected void doHelper(HttpServletRequest req, HttpServletResponse resp, Map<String, Object> params) throws ServletException, IOException {
		String path = req.getPathInfo();
		Collection<String> resourcePath = new ArrayList<String>();
		String op = getResourcePathAndOp(path, resourcePath);
		LogService logger = getLogger();
		if (logger != null) {
			logger.log(LogService.LOG_INFO, "Handling " + path + " as " + resourcePath + " + " + op);
		}
		AuthenticationHandler<?> authenticationHandler = null;
		try {
			Collection<?> objects = resourceProvider.getRootObjects();
			EObject context = (EObject) EcoreUtil.getObjectByType(objects, EcorePackage.eINSTANCE.getEObject());
			authenticationHandler = authenticationHandlerProvider.getAuthenticationHandler(context);
			if (authenticationHandler != null && (! authenticationHandler.acceptRequest(req, context))) {
				authenticationHandler.forceAuthentication(resp, "Request not accepted", resourceProvider.getName());
			} else {
				String[] segments = resourcePath.toArray(new String[resourcePath.size()]);
				IRequestPathResolver requestPathResolver = RequestHelper.get(resourceProvider.getRequestPathResolver(), requestHelper.getRequestPathResolver());
				requestPathResolver.setSubjectProvider(authenticationHandler);
				Object object = requestPathResolver.getObjectForPath(objects, segments);
				Object result = object;
				if (op != null) {
					Collection<?> target = (object instanceof Collection<?> ? (Collection<?>) object : Collections.singletonList(object));
					IRequestQueryExecutor requestQueryExecutor = RequestHelper.get(resourceProvider.getRequestQueryExecutor(), requestHelper.getRequestQueryExecutor());
					requestPathResolver.setSubjectProvider(authenticationHandler);
					result = requestQueryExecutor.getRequestQueryResult(target, op, params);
				}
				IResponseSerializer responseSerializer = RequestHelper.get(resourceProvider.getResponseSerializer(), requestHelper.getResponseSerializer());
				responseSerializer.serialize(result, resp.getWriter());
			}
		} catch (UnauthorizedException ue) {
			if (logger != null) {
				String message = "Unauthorized, " + (authenticationHandlerProvider != null ? "forcing authentication" : "but no authentication handler") + ": " + ue.getMessage();
				logger.log(LogService.LOG_INFO, message);
			}
			if (authenticationHandler != null) {
				authenticationHandler.forceAuthentication(resp, ue.getMessage(), resourceProvider.getName());
			}
		} catch (Exception e) {
			if (logger != null) {
				String message = "Exception during request handling: " + e.getMessage();
				logger.log(LogService.LOG_WARNING, message);
			}
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
}
