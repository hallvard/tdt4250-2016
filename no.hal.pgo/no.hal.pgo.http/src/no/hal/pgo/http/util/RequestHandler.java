package no.hal.pgo.http.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pgo.http.IReferenceResolver;
import no.hal.pgo.http.IRequestPathResolver;
import no.hal.pgo.http.IRequestQueryExecutor;
import no.hal.pgo.http.auth.ISubjectProvider;

@Component
public class RequestHandler extends CompositeReferenceResolver implements IRequestPathResolver, IRequestQueryExecutor {

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
	
	private ISubjectProvider<?> subjectProvider;
	
	@Reference(cardinality=ReferenceCardinality.OPTIONAL, unbind="unsetSubjectProvider")
	public void setSubjectProvider(ISubjectProvider<?> subjectProvider) {
		this.subjectProvider = subjectProvider;
	}
	public void unsetSubjectProvider(ISubjectProvider<?> subjectProvider) {
		this.subjectProvider = null;
	}

	@Override
	public Object getObjectForPath(Collection<? extends Object> rootObjects, String... segments) {
		RequestSupport requestSupport = new RequestSupport(rootObjects);
		requestSupport.setReferenceResolver(this);
		requestSupport.setSubjectProvider(subjectProvider);
		for (int i = 0; i < segments.length; i++) {
			String segment = segments[i];
			requestSupport.nextStep(segment, null);
		}
		return requestSupport.getObjects();
	}

	@Override
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters) {
		RequestSupport requestSupport = new RequestSupport(new BasicEList<Object>(target));
		requestSupport.setReferenceResolver(this);
		requestSupport.setSubjectProvider(subjectProvider);
		return requestSupport.nextStep(op, parameters);
	}
}
