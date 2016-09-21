package no.hal.pgo.http;

public interface IResourceEndPointProvider {
	public void addResourceProvider(IResourceProvider resourceProvider);
	public void removeResourceProvider(IResourceProvider resourceProvider);
}
