/**
 */
package no.hal.pgo.osm.impl;

import no.hal.pgo.osm.MetaData;
import no.hal.pgo.osm.OsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.impl.MetaDataImpl#getOsmBase <em>Osm Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaDataImpl extends MinimalEObjectImpl.Container implements MetaData {
	/**
	 * The default value of the '{@link #getOsmBase() <em>Osm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsmBase()
	 * @generated
	 * @ordered
	 */
	protected static final String OSM_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsmBase() <em>Osm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsmBase()
	 * @generated
	 * @ordered
	 */
	protected String osmBase = OSM_BASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsmBase() {
		return osmBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsmBase(String newOsmBase) {
		String oldOsmBase = osmBase;
		osmBase = newOsmBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.META_DATA__OSM_BASE, oldOsmBase, osmBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmPackage.META_DATA__OSM_BASE:
				return getOsmBase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsmPackage.META_DATA__OSM_BASE:
				setOsmBase((String)newValue);
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
			case OsmPackage.META_DATA__OSM_BASE:
				setOsmBase(OSM_BASE_EDEFAULT);
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
			case OsmPackage.META_DATA__OSM_BASE:
				return OSM_BASE_EDEFAULT == null ? osmBase != null : !OSM_BASE_EDEFAULT.equals(osmBase);
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
		result.append(" (osmBase: ");
		result.append(osmBase);
		result.append(')');
		return result.toString();
	}

} //MetaDataImpl
