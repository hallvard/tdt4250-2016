/**
 */
package no.hal.pgo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.UoD#getGames <em>Games</em>}</li>
 *   <li>{@link no.hal.pgo.UoD#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.PgoPackage#getUoD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePersonIds'"
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.PGame}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Games</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see no.hal.pgo.PgoPackage#getUoD_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<PGame> getGames();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see no.hal.pgo.PgoPackage#getUoD_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // UoD
