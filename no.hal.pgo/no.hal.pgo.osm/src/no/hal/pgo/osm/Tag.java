/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Tag#getKey <em>Key</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Tag#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see no.hal.pgo.osm.OsmPackage#getTag_Key()
	 * @model extendedMetaData="name='k' kind='attribute'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.Tag#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see no.hal.pgo.osm.OsmPackage#getTag_Value()
	 * @model extendedMetaData="name='v' kind='attribute'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Tag
