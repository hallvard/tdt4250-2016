/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.MetaData#getOsmBase <em>Osm Base</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getMetaData()
 * @model
 * @generated
 */
public interface MetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Osm Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osm Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osm Base</em>' attribute.
	 * @see #setOsmBase(String)
	 * @see no.hal.pgo.osm.OsmPackage#getMetaData_OsmBase()
	 * @model extendedMetaData="name='osm_base' kind='attribute'"
	 * @generated
	 */
	String getOsmBase();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.MetaData#getOsmBase <em>Osm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osm Base</em>' attribute.
	 * @see #getOsmBase()
	 * @generated
	 */
	void setOsmBase(String value);

} // MetaData
