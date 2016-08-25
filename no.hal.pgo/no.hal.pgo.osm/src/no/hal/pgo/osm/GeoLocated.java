/**
 */
package no.hal.pgo.osm;

import no.hal.pgo.osm.geoutil.LatLong;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Located</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pgo.osm.OsmPackage#getGeoLocated()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeoLocated extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="no.hal.pgo.osm.LatLong"
	 * @generated
	 */
	LatLong getLatLong();

} // GeoLocated
