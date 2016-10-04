package no.hal.pgo.http;

import java.util.Collection;

public interface IResourceProvider extends IRequestHelper {
	public String getName();
	public Collection<? extends Object> getRootObjects();
}
