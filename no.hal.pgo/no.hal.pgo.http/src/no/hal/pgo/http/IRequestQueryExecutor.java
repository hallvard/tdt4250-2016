package no.hal.pgo.http;

import java.util.Collection;
import java.util.Map;

public interface IRequestQueryExecutor {
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters);
}
