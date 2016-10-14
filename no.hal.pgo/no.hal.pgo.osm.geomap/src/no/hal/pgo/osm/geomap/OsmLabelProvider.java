package no.hal.pgo.osm.geomap;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.geomap.jface.LabelImageProvider;

import no.hal.pgo.osm.Tagged;

public class OsmLabelProvider extends LabelImageProvider {

	@Override
	public String getText(Object element) {
		String name = null;
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			if (name == null) {
				EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
				if (nameFeature != null) {
					name = String.valueOf(eObject.eGet(nameFeature));
				}
			}
			if (name == null) {
				for (EOperation op : eObject.eClass().getEOperations()) {
					if ("getName".equals(op.getName()) && op.getEParameters().isEmpty()) {
						try {
							name = String.valueOf(eObject.eInvoke(op, null));
						} catch (InvocationTargetException e) {
						}
						break;
					}
				}
			}
			if (name == null && element instanceof Tagged) {
				Tagged tagged = (Tagged) element;
				name = tagged.getTag("name");
			}
		}
		return (name != null ? name : element != null ? element.getClass().getSimpleName() : null);
	}
}
