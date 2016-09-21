package no.hal.pgo.http;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface IRequestQueryExecutor {
	public Object getRequestQueryResult(EObject target, String op, Map<String, ?> parameters);
}
