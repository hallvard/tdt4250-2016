/**
 */
package no.hal.pgo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.PGame#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pgo.PGame#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.PgoPackage#getPGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePlayerNames'"
 * @generated
 */
public interface PGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.hal.pgo.PgoPackage#getPGame_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see no.hal.pgo.PgoPackage#getPGame_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // PGame
