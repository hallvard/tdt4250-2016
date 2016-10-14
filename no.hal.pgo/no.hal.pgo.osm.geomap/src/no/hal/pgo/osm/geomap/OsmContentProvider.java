package no.hal.pgo.osm.geomap;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.pgo.osm.Member;
import no.hal.pgo.osm.NodeRef;
import no.hal.pgo.osm.OSMElement;
import no.hal.pgo.osm.Relation;
import no.hal.pgo.osm.Tagged;
import no.hal.pgo.osm.Way;

public class OsmContentProvider extends AllContentFilteredProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Relation) {
			Collection<Object> elements = new ArrayList<>(); 
			for (Member member : ((Relation) inputElement).getMembers()) {
				OSMElement osmElement = member.getReference();
				if (osmElement instanceof Way)
				addElement(osmElement, elements);
			}
		} else if (inputElement instanceof Way) {
			Collection<Object> elements = new ArrayList<>(); 
			for (NodeRef nodeRef : ((Way) inputElement).getNodes()) {
				addElement(nodeRef.getRef(), elements);
			}
		} else if (inputElement instanceof Member) {
			return getElements(((Member) inputElement).getReference());			
		}
		return super.getElements(inputElement);
	}

	@Override
	public boolean addElement(Object inputElement, Collection<Object> elements) {
		int count = elements.size();
		if (inputElement instanceof Relation) {
			addElements(((Relation) inputElement).getMembers(), elements);
		} else if (inputElement instanceof Way) {
			addElements(((Way) inputElement).getNodes(), elements);
		} else if (inputElement instanceof Member) {
			addElement(((Member) inputElement).getReference(), elements);			
		} else if (inputElement instanceof NodeRef) {
			addElement(((NodeRef) inputElement).getRef(), elements);						
		} else {
			super.addElement(inputElement, elements);
		}
		return elements.size() > count;
	}
	
	@Override
	protected boolean accept(Object object) {
		if (! super.accept(object)) {
			return false;
		}
		if (object instanceof NodeRef) {
			object = ((NodeRef) object).getRef();
		}
		if (object instanceof Tagged) {
//			Tagged tagged = (Tagged) object;
//			return tagged.hasTag("name");
		}
		return true;
	}
}
