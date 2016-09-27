/**
 */
package pgohttpestest;

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
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgohttpestest.Root#getAs <em>As</em>}</li>
 *   <li>{@link pgohttpestest.Root#getB <em>B</em>}</li>
 * </ul>
 *
 * @see pgohttpestest.PgohttpestestPackage#getRoot()
 * @model kind="class"
 * @generated
 */
public class Root extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getAs() <em>As</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAs()
	 * @generated
	 * @ordered
	 */
	protected EList<A> as;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected B b;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Root() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PgohttpestestPackage.Literals.ROOT;
	}

	/**
	 * Returns the value of the '<em><b>As</b></em>' containment reference list.
	 * The list contents are of type {@link pgohttpestest.A}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' containment reference list.
	 * @see pgohttpestest.PgohttpestestPackage#getRoot_As()
	 * @model containment="true"
	 * @generated
	 */
	public EList<A> getAs() {
		if (as == null) {
			as = new BasicInternalEList<A>(A.class);
		}
		return as;
	}

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(B)
	 * @see pgohttpestest.PgohttpestestPackage#getRoot_B()
	 * @model containment="true"
	 * @generated
	 */
	public B getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(B newB, NotificationChain msgs) {
		B oldB = b;
		b = newB;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link pgohttpestest.Root#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	public void setB(B newB) {
		if (newB != b) {
			NotificationChain msgs = null;
			if (b != null)
				msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PgohttpestestPackage.ROOT__B, null, msgs);
			if (newB != null)
				msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PgohttpestestPackage.ROOT__B, null, msgs);
			msgs = basicSetB(newB, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PgohttpestestPackage.ROOT__AS:
				return ((InternalEList<?>)getAs()).basicRemove(otherEnd, msgs);
			case PgohttpestestPackage.ROOT__B:
				return basicSetB(null, msgs);
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
			case PgohttpestestPackage.ROOT__AS:
				return getAs();
			case PgohttpestestPackage.ROOT__B:
				return getB();
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
			case PgohttpestestPackage.ROOT__AS:
				getAs().clear();
				getAs().addAll((Collection<? extends A>)newValue);
				return;
			case PgohttpestestPackage.ROOT__B:
				setB((B)newValue);
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
			case PgohttpestestPackage.ROOT__AS:
				getAs().clear();
				return;
			case PgohttpestestPackage.ROOT__B:
				setB((B)null);
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
			case PgohttpestestPackage.ROOT__AS:
				return as != null && !as.isEmpty();
			case PgohttpestestPackage.ROOT__B:
				return b != null;
		}
		return super.eIsSet(featureID);
	}

} // Root
