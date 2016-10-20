package no.hal.pgo.http.auth;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractHttpAuthenticationHandler<P> implements AuthenticationHandler<P> {

	private EObject context;
	private String authHeader;

	@Override
	public P getSubject() {
		P subject = null;
		if (authHeader != null) {
			StringTokenizer st = new StringTokenizer(authHeader);
			if (st.hasMoreTokens() && st.nextToken().equalsIgnoreCase("Basic")) {
				String credentials = null;
				try {
					credentials = new String(Base64.decode(st.nextToken().toCharArray()), "UTF-8");
				} catch (UnsupportedEncodingException e) {
				}
				if (credentials != null) {
					String[] creds = credentials.split(":");
					if (creds.length == 2) {
						subject = getSubject(creds[0].trim(), creds[1].trim(), context);
					}
				}
			}
		}
		return subject;
	}
	
	protected abstract P getSubject(String id, String cred, EObject context);

	@Override
	public boolean acceptRequest(HttpServletRequest req, EObject context) {
		if (! acceptsContext(context)) {
			return false;
		}
		this.context = context;
		this.authHeader = req.getHeader("Authorization");
		return this.authHeader != null;
	}

	@Override
	public void forceAuthentication(HttpServletResponse resp, String message, String key) throws IOException {
		resp.setHeader("WWW-Authenticate", "Basic realm=\"" + key + "\"");
		resp.sendError(401, message);
	}
}
