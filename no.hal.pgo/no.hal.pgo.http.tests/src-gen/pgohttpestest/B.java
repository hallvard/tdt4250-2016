/**
 */
package pgohttpestest;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgohttpestest.B#getCs <em>Cs</em>}</li>
 *   <li>{@link pgohttpestest.B#getPriv1 <em>Priv1</em>}</li>
 * </ul>
 *
 * @see pgohttpestest.PgohttpestestPackage#getB()
 * @model kind="class"
 * @generated
 */
public class B extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs()
	 * @generated
	 * @ordered
	 */
	protected EList<C> cs;

	/**
	 * The default value of the '{@link #getPriv1() <em>Priv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriv1()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIV1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriv1() <em>Priv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriv1()
	 * @generated
	 * @ordered
	 */
	protected int priv1 = PRIV1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PgohttpestestPackage.Literals.B;
	}

	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference list.
	 * The list contents are of type {@link pgohttpestest.C}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference list.
	 * @see pgohttpestest.PgohttpestestPackage#getB_Cs()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	public EList<C> getCs() {
		if (cs == null) {
			cs = new BasicInternalEList<C>(C.class);
		}
		return cs;
	}

	/**
	 * Returns the value of the '<em><b>Priv1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priv1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priv1</em>' attribute.
	 * @see #setPriv1(int)
	 * @see pgohttpestest.PgohttpestestPackage#getB_Priv1()
	 * @model annotation="no.hal.pgo.http.util.RequestSupport exclude='true'"
	 * @generated
	 */
	public int getPriv1() {
		return priv1;
	}

	/**
	 * Sets the value of the '{@link pgohttpestest.B#getPriv1 <em>Priv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priv1</em>' attribute.
	 * @see #getPriv1()
	 * @generated
	 */
	public void setPriv1(int newPriv1) {
		priv1 = newPriv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public C lastC() {
		EList<C> cs2 = getCs();
		return (cs2.isEmpty() ? null : cs2.get(cs2.size() - 1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public Priv priv2() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PgohttpestestPackage.B__CS:
				return ((InternalEList<?>)getCs()).basicRemove(otherEnd, msgs);
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
			case PgohttpestestPackage.B__CS:
				return getCs();
			case PgohttpestestPackage.B__PRIV1:
				return getPriv1();
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
			case PgohttpestestPackage.B__CS:
				getCs().clear();
				getCs().addAll((Collection<? extends C>)newValue);
				return;
			case PgohttpestestPackage.B__PRIV1:
				setPriv1((Integer)newValue);
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
			case PgohttpestestPackage.B__CS:
				getCs().clear();
				return;
			case PgohttpestestPackage.B__PRIV1:
				setPriv1(PRIV1_EDEFAULT);
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
			case PgohttpestestPackage.B__CS:
				return cs != null && !cs.isEmpty();
			case PgohttpestestPackage.B__PRIV1:
				return priv1 != PRIV1_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PgohttpestestPackage.B___LAST_C:
				return lastC();
			case PgohttpestestPackage.B___PRIV2:
				return priv2();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (priv1: ");
		result.append(priv1);
		result.append(')');
		return result.toString();
	}

} // B
