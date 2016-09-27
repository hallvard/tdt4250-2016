package no.hal.pgo.http.util;

import org.eclipse.emf.ecore.resource.Resource;

import no.hal.pgo.http.IResourceProvider;

public class ResourceProvider extends RequestHelper implements IResourceProvider {

	private final Resource resource;

	public ResourceProvider(Resource resource) {
		this.resource = resource;
	}

	@Override
	public String getName() {
		return (this.resource != null ? this.resource.getURI().lastSegment() : null);
	}

	@Override
	public Resource getResource() {
		return this.resource;
	}
}
