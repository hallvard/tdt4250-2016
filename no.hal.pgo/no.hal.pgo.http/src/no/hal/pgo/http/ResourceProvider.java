package no.hal.pgo.http;

import java.io.Writer;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class ResourceProvider implements IResourceProvider, IRequestPathResolver, IRequestQueryExecutor, IResponseSerializer {

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

	private IRequestPathResolver requestPathResolver = null;
	private IRequestQueryExecutor requestQueryExecutor = null;
	private IResponseSerializer responseSerializer = null;

	@Override
	public IRequestPathResolver getRequestPathResolver() {
		return requestPathResolver;
	}

	public void setRequestPathResolver(IRequestPathResolver requestPathResolver) {
		this.requestPathResolver = requestPathResolver;
	}

	@Override
	public IRequestQueryExecutor getRequestQueryExecutor() {
		return requestQueryExecutor;
	}

	public void setRequestQueryExecutor(IRequestQueryExecutor requestQueryExecutor) {
		this.requestQueryExecutor = requestQueryExecutor;
	}

	@Override
	public IResponseSerializer getResponseSerializer() {
		return responseSerializer;
	}

	public void setResponseSerializer(IResponseSerializer responseSerializer) {
		this.responseSerializer = responseSerializer;
	}
	
	// IRequestPathResolver
	
	@Override
	public EObject getEObjectForPath(Resource resource, String... segments) {
		if (getRequestPathResolver() != null) {
			return getRequestPathResolver().getEObjectForPath(resource, segments);
		}
		return null;
	}
	
	// IRequestQueryExecutor
	
	@Override
	public Object getRequestQueryResult(EObject target, String op, Map<String, ?> parameters) {
		return getRequestQueryExecutor() != null ? getRequestQueryExecutor().getRequestQueryResult(target, op, parameters) : null;
	}
	
	// IResponseSerializer
	
	@Override
	public void serialize(Object object, Writer writer) throws Exception {
		if (getResponseSerializer() != null) {
			getResponseSerializer().serialize(object, writer);
		}
	}
}
