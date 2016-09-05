/**
 */
package no.hal.pgo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import no.hal.pgo.Item;
import no.hal.pgo.Person;
import no.hal.pgo.PgoPackage;
import no.hal.pgo.Player;
import no.hal.pgo.osm.impl.GeoLocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.impl.PlayerImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link no.hal.pgo.impl.PlayerImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link no.hal.pgo.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pgo.impl.PlayerImpl#getXp <em>Xp</em>}</li>
 *   <li>{@link no.hal.pgo.impl.PlayerImpl#getInventory <em>Inventory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends GeoLocationImpl implements Player {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getXp() <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXp()
	 * @generated
	 * @ordered
	 */
	protected static final int XP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXp() <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXp()
	 * @generated
	 * @ordered
	 */
	protected int xp = XP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> inventory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PgoPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PgoPackage.PLAYER__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PgoPackage.PLAYER__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PgoPackage.PLAYER__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return (getNickname() != null || getPerson() == null ? getNickname() : getPerson().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		setNickname(newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getXp() {
		return xp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXp(int newXp) {
		int oldXp = xp;
		xp = newXp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PgoPackage.PLAYER__XP, oldXp, xp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getInventory() {
		if (inventory == null) {
			inventory = new EObjectWithInverseResolvingEList<Item>(Item.class, this, PgoPackage.PLAYER__INVENTORY, PgoPackage.ITEM__OWNER);
		}
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PgoPackage.PLAYER__INVENTORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInventory()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PgoPackage.PLAYER__INVENTORY:
				return ((InternalEList<?>)getInventory()).basicRemove(otherEnd, msgs);
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
			case PgoPackage.PLAYER__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case PgoPackage.PLAYER__NICKNAME:
				return getNickname();
			case PgoPackage.PLAYER__NAME:
				return getName();
			case PgoPackage.PLAYER__XP:
				return getXp();
			case PgoPackage.PLAYER__INVENTORY:
				return getInventory();
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
			case PgoPackage.PLAYER__PERSON:
				setPerson((Person)newValue);
				return;
			case PgoPackage.PLAYER__NICKNAME:
				setNickname((String)newValue);
				return;
			case PgoPackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case PgoPackage.PLAYER__XP:
				setXp((Integer)newValue);
				return;
			case PgoPackage.PLAYER__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Item>)newValue);
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
			case PgoPackage.PLAYER__PERSON:
				setPerson((Person)null);
				return;
			case PgoPackage.PLAYER__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case PgoPackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PgoPackage.PLAYER__XP:
				setXp(XP_EDEFAULT);
				return;
			case PgoPackage.PLAYER__INVENTORY:
				getInventory().clear();
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
			case PgoPackage.PLAYER__PERSON:
				return person != null;
			case PgoPackage.PLAYER__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case PgoPackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case PgoPackage.PLAYER__XP:
				return xp != XP_EDEFAULT;
			case PgoPackage.PLAYER__INVENTORY:
				return inventory != null && !inventory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nickname: ");
		result.append(nickname);
		result.append(", xp: ");
		result.append(xp);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
