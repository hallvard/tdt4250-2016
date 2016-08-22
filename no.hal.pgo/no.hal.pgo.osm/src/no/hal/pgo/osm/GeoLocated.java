/**
 */
package no.hal.pgo.osm;

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
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getLatitude();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getLongitude();

} // GeoLocated
