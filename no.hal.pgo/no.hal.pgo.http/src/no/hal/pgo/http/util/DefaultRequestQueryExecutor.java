package no.hal.pgo.http.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pgo.http.IReferenceResolver;
import no.hal.pgo.http.IRequestQueryExecutor;

@Component
public class DefaultRequestQueryExecutor extends CompositeReferenceResolver implements IRequestQueryExecutor {

	@Override
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,			
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeReferenceResolver"
			)
	public void addReferenceResolver(IReferenceResolver referenceResolver) {
		super.addReferenceResolver(referenceResolver);
	}
	@Override
	public void removeReferenceResolver(IReferenceResolver referenceResolver) {
		super.removeReferenceResolver(referenceResolver);
	}

	@Override
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters) {
		RequestSupport requestSupport = new RequestSupport(new BasicEList<Object>(target));
		requestSupport.setReferenceResolver(this);
		return requestSupport.nextStep(op, parameters);
	}
}
