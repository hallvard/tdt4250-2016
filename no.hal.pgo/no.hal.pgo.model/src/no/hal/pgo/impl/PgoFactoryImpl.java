/**
 */
package no.hal.pgo.impl;

import no.hal.pgo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PgoFactoryImpl extends EFactoryImpl implements PgoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PgoFactory init() {
		try {
			PgoFactory thePgoFactory = (PgoFactory)EPackage.Registry.INSTANCE.getEFactory(PgoPackage.eNS_URI);
			if (thePgoFactory != null) {
				return thePgoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PgoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PgoPackage.PERSON: return createPerson();
			case PgoPackage.PLAYER: return createPlayer();
			case PgoPackage.ITEM: return createItem();
			case PgoPackage.PGAME: return createPGame();
			case PgoPackage.UO_D: return createUoD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGame createPGame() {
		PGameImpl pGame = new PGameImpl();
		return pGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoD createUoD() {
		UoDImpl uoD = new UoDImpl();
		return uoD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgoPackage getPgoPackage() {
		return (PgoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PgoPackage getPackage() {
		return PgoPackage.eINSTANCE;
	}

} //PgoFactoryImpl
