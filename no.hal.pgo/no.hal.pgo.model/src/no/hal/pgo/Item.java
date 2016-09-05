/**
 */
package no.hal.pgo;

import no.hal.pgo.osm.GeoLocated;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.Item#getLocation <em>Location</em>}</li>
 *   <li>{@link no.hal.pgo.Item#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.PgoPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GeoLocated)
	 * @see no.hal.pgo.PgoPackage#getItem_Location()
	 * @model
	 * @generated
	 */
	GeoLocated getLocation();

	/**
	 * Sets the value of the '{@link no.hal.pgo.Item#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GeoLocated value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pgo.Player#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Player)
	 * @see no.hal.pgo.PgoPackage#getItem_Owner()
	 * @see no.hal.pgo.Player#getInventory
	 * @model opposite="inventory"
	 * @generated
	 */
	Player getOwner();

	/**
	 * Sets the value of the '{@link no.hal.pgo.Item#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Player value);

} // Item
