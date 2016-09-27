package no.hal.pgo.http;

import org.eclipse.emf.ecore.resource.Resource;

public interface IRequestPathResolver {
	public Object getObjectForPath(Resource resource, String... segments);
}
