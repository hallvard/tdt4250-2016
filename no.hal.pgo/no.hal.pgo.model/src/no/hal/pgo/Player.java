/**
 */
package no.hal.pgo;

import no.hal.pgo.osm.GeoLocation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.Player#getPerson <em>Person</em>}</li>
 *   <li>{@link no.hal.pgo.Player#getNickname <em>Nickname</em>}</li>
 *   <li>{@link no.hal.pgo.Player#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pgo.Player#getXp <em>Xp</em>}</li>
 *   <li>{@link no.hal.pgo.Player#getInventory <em>Inventory</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.PgoPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends GeoLocation {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see no.hal.pgo.PgoPackage#getPlayer_Person()
	 * @model
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link no.hal.pgo.Player#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see no.hal.pgo.PgoPackage#getPlayer_Nickname()
	 * @model
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link no.hal.pgo.Player#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.pgo.PgoPackage#getPlayer_Name()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.pgo.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xp</em>' attribute.
	 * @see #setXp(int)
	 * @see no.hal.pgo.PgoPackage#getPlayer_Xp()
	 * @model
	 * @generated
	 */
	int getXp();

	/**
	 * Sets the value of the '{@link no.hal.pgo.Player#getXp <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xp</em>' attribute.
	 * @see #getXp()
	 * @generated
	 */
	void setXp(int value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pgo.Item}.
	 * It is bidirectional and its opposite is '{@link no.hal.pgo.Item#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' reference list.
	 * @see no.hal.pgo.PgoPackage#getPlayer_Inventory()
	 * @see no.hal.pgo.Item#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<Item> getInventory();

} // Player
