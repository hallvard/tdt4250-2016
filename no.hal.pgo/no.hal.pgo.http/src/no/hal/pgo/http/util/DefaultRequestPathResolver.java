package no.hal.pgo.http.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pgo.http.IReferenceResolver;
import no.hal.pgo.http.IRequestPathResolver;

@Component
public class DefaultRequestPathResolver extends CompositeReferenceResolver implements IRequestPathResolver {

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
	public Object getObjectForPath(Resource resource, String... segments) {
		RequestSupport requestSupport = new RequestSupport(resource.getContents());
		requestSupport.setReferenceResolver(this);
		for (int i = 0; i < segments.length; i++) {
			String segment = segments[i];
			requestSupport.nextStep(segment, null);
		}
		return requestSupport.getObjects();
	}
}
