package no.hal.pgo.http.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.pgo.http.IResourceProvider;

public class ResourceProvider extends RequestHelper implements IResourceProvider {

	private final Resource resource;
	
	public ResourceProvider(Resource resource) {
		this.resource = resource;
	}

	private String name;
	
	@Override
	public String getName() {
		if (name != null) {
			return name;
		}
		if (resource != null) {
			return defaultName(resource.getURI());
		}
		return null;
	}

	public static String defaultName(URI uri) {
		return uri.trimFileExtension().lastSegment().replace('.', '/');
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Resource getResource() {
		return this.resource;
	}
}
