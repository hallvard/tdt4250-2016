/**
 */
package no.hal.pgo.osm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.GeoLocation#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link no.hal.pgo.osm.GeoLocation#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getGeoLocation()
 * @model
 * @generated
 */
public interface GeoLocation extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see no.hal.pgo.osm.OsmPackage#getGeoLocation_Latitude()
	 * @model extendedMetaData="name='lat' kind='attribute'"
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.GeoLocation#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see no.hal.pgo.osm.OsmPackage#getGeoLocation_Longitude()
	 * @model extendedMetaData="name='lon' kind='attribute'"
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.GeoLocation#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

} // GeoLocation
