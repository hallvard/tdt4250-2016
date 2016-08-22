/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pgo.osm.OsmPackage#getTagged()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Tagged extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasTag(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getTag(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasTag(String key, String value);

} // Tagged
