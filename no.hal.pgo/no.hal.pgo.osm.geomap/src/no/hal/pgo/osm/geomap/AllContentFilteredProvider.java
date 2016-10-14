package no.hal.pgo.osm.geomap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredContentProvider;

import no.hal.pgo.osm.OsmPackage;

public class AllContentFilteredProvider implements IStructuredContentProvider {

	private EClassifier[] classifiers;

	public AllContentFilteredProvider(EClassifier... classifiers) {
		this.classifiers = classifiers;
	}
	public AllContentFilteredProvider() {
		this(OsmPackage.eINSTANCE.getGeoLocated());
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		Collection<Object> elements = new ArrayList<>();
		if (accept(inputElement)) {
			elements.add(inputElement);
		} else if (inputElement instanceof EObject) {
			addElements(((EObject) inputElement).eAllContents(), elements);
		} else if (inputElement instanceof Resource) {
			addElements(((Resource) inputElement).getAllContents(), elements);
		} else if (inputElement instanceof ResourceSet) {
			ResourceSet resourceSet = (ResourceSet) inputElement;
			if (! resourceSet.getResources().isEmpty()) {
				addElements(resourceSet.getResources().get(0).getAllContents(), elements);
			}
		} else if (inputElement instanceof Iterable) {
			addElements(((Iterable<?>) inputElement).iterator(), elements);
		}
		return elements.toArray();
	}

	protected boolean addElement(Object element, Collection<Object> elements) {
		if (accept(element)) {
			elements.add(element);
			return true;
		}
		return false;
	}
	
	protected int addElements(Iterable<?> it, Collection<Object> elements) {
		return addElements(it.iterator(), elements);
	}

	protected int addElements(Iterator<?> it, Collection<Object> elements) {
		int count = 0;
		while (it.hasNext()) {
			Object next = it.next();
			if (addElement(next, elements)) {
				count++;
				if (it instanceof TreeIterator<?>) {
					((TreeIterator<?>) it).prune();
				}
			}
		}
		return count;
	}

	protected boolean accept(Object object) {
		if (classifiers == null || classifiers.length == 0) {
			return true;
		}
		if (classifiers != null && classifiers.length > 0) {
			for (int i = 0; i < classifiers.length; i++) {
				if (classifiers[i].isInstance(object)) {
					return true;
				}
			}
		}
		return false;
	}
}
