package no.hal.pgo.http;

public interface IRequestHelper {
	public IRequestPathResolver getRequestPathResolver();
	public IRequestQueryExecutor getRequestQueryExecutor();
	public IResponseSerializer getResponseSerializer();
}
