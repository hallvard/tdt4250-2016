/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Bounds#getMinLatitute <em>Min Latitute</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Bounds#getMinLongitude <em>Min Longitude</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Bounds#getMaxLatitude <em>Max Latitude</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Bounds#getMaxLongitude <em>Max Longitude</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getBounds()
 * @model
 * @generated
 */
public interface Bounds extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Latitute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Latitute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Latitute</em>' attribute.
	 * @see #setMinLatitute(float)
	 * @see no.hal.pgo.osm.OsmPackage#getBounds_MinLatitute()
	 * @model extendedMetaData="name='minlat' kind='attribute'"
	 * @generated
	 */
	float getMinLatitute();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.Bounds#getMinLatitute <em>Min Latitute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Latitute</em>' attribute.
	 * @see #getMinLatitute()
	 * @generated
	 */
	void setMinLatitute(float value);

	/**
	 * Returns the value of the '<em><b>Min Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Longitude</em>' attribute.
	 * @see #setMinLongitude(float)
	 * @see no.hal.pgo.osm.OsmPackage#getBounds_MinLongitude()
	 * @model extendedMetaData="name='minlon' kind='attribute'"
	 * @generated
	 */
	float getMinLongitude();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.Bounds#getMinLongitude <em>Min Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Longitude</em>' attribute.
	 * @see #getMinLongitude()
	 * @generated
	 */
	void setMinLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Max Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Latitude</em>' attribute.
	 * @see #setMaxLatitude(float)
	 * @see no.hal.pgo.osm.OsmPackage#getBounds_MaxLatitude()
	 * @model extendedMetaData="name='maxlat' kind='attribute'"
	 * @generated
	 */
	float getMaxLatitude();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.Bounds#getMaxLatitude <em>Max Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Latitude</em>' attribute.
	 * @see #getMaxLatitude()
	 * @generated
	 */
	void setMaxLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Max Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Longitude</em>' attribute.
	 * @see #setMaxLongitude(float)
	 * @see no.hal.pgo.osm.OsmPackage#getBounds_MaxLongitude()
	 * @model extendedMetaData="name='maxlon' kind='attribute'"
	 * @generated
	 */
	float getMaxLongitude();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.Bounds#getMaxLongitude <em>Max Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Longitude</em>' attribute.
	 * @see #getMaxLongitude()
	 * @generated
	 */
	void setMaxLongitude(float value);

} // Bounds
