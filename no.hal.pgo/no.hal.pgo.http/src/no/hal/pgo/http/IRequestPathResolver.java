package no.hal.pgo.http;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public interface IRequestPathResolver {
	public EObject getEObjectForPath(Resource resource, String... segments);
}
