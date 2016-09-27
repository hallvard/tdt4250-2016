package no.hal.pgo.http.util;

import no.hal.pgo.http.IRequestHelper;
import no.hal.pgo.http.IRequestPathResolver;
import no.hal.pgo.http.IRequestQueryExecutor;
import no.hal.pgo.http.IResponseSerializer;

public class RequestHelper implements IRequestHelper {
	
	private IRequestHelper delegate;
	
	private IRequestPathResolver requestPathResolver, defaultRequestPathResolver;
	private IRequestQueryExecutor requestQueryExecutor, defaultRequestQueryExecutor;
	private IResponseSerializer responseSerializer, defaultResponseSerializer;

	public static <T> T get(T... t) {
		for (int i = 0; i < t.length; i++) {
			if (t[i] != null) {
				return t[i];
			}
		}
		return null;
	}

	public IRequestHelper getDelegate() {
		return delegate;
	}

	public void setDelegate(IRequestHelper delegate) {
		this.delegate = delegate;
	}

	@Override
	public IRequestPathResolver getRequestPathResolver() {
		return get(requestPathResolver, (delegate != null ? delegate.getRequestPathResolver() : null), defaultRequestPathResolver);
	}

	public void setRequestPathResolver(IRequestPathResolver requestPathResolver) {
		this.requestPathResolver = requestPathResolver;
	}

	public IRequestPathResolver getDefaultRequestPathResolver() {
		return defaultRequestPathResolver;
	}

	public void setDefaultRequestPathResolver(IRequestPathResolver defaultRequestPathResolver) {
		this.defaultRequestPathResolver = defaultRequestPathResolver;
	}

	@Override
	public IRequestQueryExecutor getRequestQueryExecutor() {
		return get(requestQueryExecutor, (delegate != null ? delegate.getRequestQueryExecutor() : null), defaultRequestQueryExecutor);
	}

	public void setRequestQueryExecutor(IRequestQueryExecutor requestQueryExecutor) {
		this.requestQueryExecutor = requestQueryExecutor;
	}

	public IRequestQueryExecutor getDefaultRequestQueryExecutor() {
		return defaultRequestQueryExecutor;
	}

	public void setDefaultRequestQueryExecutor(IRequestQueryExecutor defaultRequestQueryExecutor) {
		this.defaultRequestQueryExecutor = defaultRequestQueryExecutor;
	}

	@Override
	public IResponseSerializer getResponseSerializer() {
		return get(responseSerializer, (delegate != null ? delegate.getResponseSerializer() : null), defaultResponseSerializer);
	}

	public void setResponseSerializer(IResponseSerializer responseSerializer) {
		this.responseSerializer = responseSerializer;
	}

	public IResponseSerializer getDefaultResponseSerializer() {
		return defaultResponseSerializer;
	}

	public void setDefaultResponseSerializer(IResponseSerializer defaultResponseSerializer) {
		this.defaultResponseSerializer = defaultResponseSerializer;
	}
}
