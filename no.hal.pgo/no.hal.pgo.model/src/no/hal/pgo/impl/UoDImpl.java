/**
 */
package no.hal.pgo.impl;

import java.util.Collection;
import no.hal.pgo.PGame;
import no.hal.pgo.Person;
import no.hal.pgo.PgoPackage;
import no.hal.pgo.UoD;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.impl.UoDImpl#getGames <em>Games</em>}</li>
 *   <li>{@link no.hal.pgo.impl.UoDImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UoDImpl extends MinimalEObjectImpl.Container implements UoD {
	/**
	 * The cached value of the '{@link #getGames() <em>Games</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGames()
	 * @generated
	 * @ordered
	 */
	protected EList<PGame> games;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PgoPackage.Literals.UO_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PGame> getGames() {
		if (games == null) {
			games = new EObjectContainmentEList<PGame>(PGame.class, this, PgoPackage.UO_D__GAMES);
		}
		return games;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, PgoPackage.UO_D__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PgoPackage.UO_D__GAMES:
				return ((InternalEList<?>)getGames()).basicRemove(otherEnd, msgs);
			case PgoPackage.UO_D__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PgoPackage.UO_D__GAMES:
				return getGames();
			case PgoPackage.UO_D__PERSONS:
				return getPersons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PgoPackage.UO_D__GAMES:
				getGames().clear();
				getGames().addAll((Collection<? extends PGame>)newValue);
				return;
			case PgoPackage.UO_D__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PgoPackage.UO_D__GAMES:
				getGames().clear();
				return;
			case PgoPackage.UO_D__PERSONS:
				getPersons().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PgoPackage.UO_D__GAMES:
				return games != null && !games.isEmpty();
			case PgoPackage.UO_D__PERSONS:
				return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UoDImpl
