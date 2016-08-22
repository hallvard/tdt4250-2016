/**
 */
package no.hal.pgo.osm.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import no.hal.pgo.osm.OSM;
import no.hal.pgo.osm.OsmPackage;
import no.hal.pgo.osm.Tagged;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see no.hal.pgo.osm.util.OsmResourceFactoryImpl
 * @generated
 */
public class OsmResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	public OsmResourceImpl(URI uri) {
		super(uri);
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	@Override
	protected EObject getEObjectByID(String id) {
		EObject idObject = super.getEObjectByID(id);
		if (idObject == null) {
			for (EObject eObject : getContents()) {
				if (eObject instanceof OSM) {
					Tagged tagged = getTagged(id, eObject, OsmPackage.eINSTANCE.getOSM_Nodes(), OsmPackage.eINSTANCE.getOSM_Relations());
					if (tagged != null) {
						return tagged;
					}
				}
			}
		}
		return null;
	}

	public static Tagged getTagged(String id, Iterable<? extends Tagged> tags) {
		for (Tagged tagged : tags) {
			if (tagged.hasTag("name", id)) {
				return tagged;
			}
		}
		return null;
	}
	
	public static Tagged getTagged(String id, EObject owner, EReference... refs) {
		for (EReference ref : refs) {
			Tagged tagged = getTagged(id, (Iterable<? extends Tagged>) owner.eGet(ref));
			if (tagged != null) {
				return tagged;
			}
		}
		return null;
	}

	public void removeUnresolvedOSMReferences() {
		new UnresolvedOSMReferencesRemover().removeN(getContents());
	}
} //OsmResourceImpl
