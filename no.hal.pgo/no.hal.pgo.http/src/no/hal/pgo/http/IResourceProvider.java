package no.hal.pgo.http;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceProvider {
	public String getName();
	public Resource getResource();

	public IRequestPathResolver getRequestPathResolver();
	public IRequestQueryExecutor getRequestQueryExecutor();
	public IResponseSerializer getResponseSerializer();
}
