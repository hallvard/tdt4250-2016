package no.hal.pgo.http;

import java.util.Collection;

public interface IRequestPathResolver {
	public Object getObjectForPath(Collection<? extends Object> rootObjects, String... segments);
}
