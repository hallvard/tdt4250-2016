/**
 */
package no.hal.pgo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pgo.PgoPackage
 * @generated
 */
public interface PgoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PgoFactory eINSTANCE = no.hal.pgo.impl.PgoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>PGame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PGame</em>'.
	 * @generated
	 */
	PGame createPGame();

	/**
	 * Returns a new object of class '<em>Uo D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uo D</em>'.
	 * @generated
	 */
	UoD createUoD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PgoPackage getPgoPackage();

} //PgoFactory
