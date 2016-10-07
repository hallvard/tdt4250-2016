package no.hal.pgo.http.auth;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;

public interface AuthenticationHandler<P> extends ISubjectProvider<P> {
	public void acceptRequest(HttpServletRequest req, EObject context);
	public void forceAuthentication(HttpServletResponse resp, String message, String engineKey) throws IOException;
}
