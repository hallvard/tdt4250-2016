package no.hal.pgo.osm.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import no.hal.pgo.osm.Member;
import no.hal.pgo.osm.NodeRef;
import no.hal.pgo.osm.OSM;
import no.hal.pgo.osm.OsmPackage;
import no.hal.pgo.osm.Relation;
import no.hal.pgo.osm.Way;

public class UnresolvedOSMReferencesRemover extends OsmSwitch<Boolean> {
	
	public boolean removeN(Collection<? extends EObject> col) {
		Iterator<? extends EObject> it = col.iterator();
		while (it.hasNext()) {
			EObject next = it.next();
			Boolean remove = doSwitch(next);
			if (Boolean.TRUE.equals(remove)) {
				it.remove();
//				System.out.println("Removed " + next);
			}
		}
		return col.isEmpty();
	}

	public boolean removeN(EObject owner, EReference ref) {
		return removeN((Collection<? extends EObject>) owner.eGet(ref));
	}
	
	@Override
	public Boolean caseNodeRef(NodeRef nodeRef) {
		return nodeRef.getRef() == null;
	}
	
	@Override
	public Boolean caseMember(Member member) {
		return member.getReference() == null;
	}
	
	@Override
	public Boolean caseWay(Way way) {
		return removeN(way, OsmPackage.eINSTANCE.getWay_Nodes());
	}

	@Override
	public Boolean caseRelation(Relation relation) {
		return removeN(relation, OsmPackage.eINSTANCE.getRelation_Members());
	}
	
	@Override
	public Boolean caseOSM(OSM osm) {
		return removeN(osm, OsmPackage.eINSTANCE.getOSM_Ways()) & removeN(osm, OsmPackage.eINSTANCE.getOSM_Relations());
	}
}
