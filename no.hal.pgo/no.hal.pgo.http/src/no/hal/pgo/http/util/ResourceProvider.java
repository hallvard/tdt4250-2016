package no.hal.pgo.http.util;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.pgo.http.IResourceProvider;

public class ResourceProvider extends RequestHelper implements IResourceProvider {

	private final Resource resource;
	
	public ResourceProvider(Resource resource) {
		this.resource = resource;
	}

	private String name;
	private EClass rootObjectClass;
	
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
	
	public void setRootObjectClass(EClass rootObjectClass) {
		this.rootObjectClass = rootObjectClass;
	}

	public static String defaultName(URI uri) {
		return uri.trimFileExtension().lastSegment().replace('.', '/');
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Collection<? extends Object> getRootObjects() {
		Collection<? extends Object> objects = getResource().getContents();
		if (rootObjectClass != null) {
			objects = EcoreUtil.getObjectsByType(objects, rootObjectClass);
		}
		return objects;
	}
	
	public Resource getResource() {
		return this.resource;
	}
}
