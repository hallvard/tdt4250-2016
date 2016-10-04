package no.hal.pgo.http.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Component;

import no.hal.pgo.http.IReferenceResolver;

@Component
public class NameReferenceResolver implements IReferenceResolver {

	@Override
	public EObject resolveReference(String reference, EObject context) {
		for (EObject contained : context.eContents()) {
			EStructuralFeature nameFeature = contained.eClass().getEStructuralFeature("name");
			if (nameFeature != null) {
				Object name = contained.eGet(nameFeature);
				if (reference.equals(String.valueOf(name))) {
					return contained;
				}
			}
		}
		return null;
	}
}
