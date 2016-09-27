package no.hal.pgo.http;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceProvider extends IRequestHelper {
	public String getName();
	public Resource getResource();
}
