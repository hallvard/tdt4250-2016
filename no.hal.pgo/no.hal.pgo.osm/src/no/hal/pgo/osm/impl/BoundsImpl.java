/**
 */
package no.hal.pgo.osm.impl;

import no.hal.pgo.osm.Bounds;
import no.hal.pgo.osm.OsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.impl.BoundsImpl#getMinLatitute <em>Min Latitute</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.BoundsImpl#getMinLongitude <em>Min Longitude</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.BoundsImpl#getMaxLatitude <em>Max Latitude</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.BoundsImpl#getMaxLongitude <em>Max Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundsImpl extends MinimalEObjectImpl.Container implements Bounds {
	/**
	 * The default value of the '{@link #getMinLatitute() <em>Min Latitute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLatitute()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LATITUTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLatitute() <em>Min Latitute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLatitute()
	 * @generated
	 * @ordered
	 */
	protected float minLatitute = MIN_LATITUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLongitude() <em>Min Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLongitude() <em>Min Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLongitude()
	 * @generated
	 * @ordered
	 */
	protected float minLongitude = MIN_LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLatitude() <em>Max Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxLatitude() <em>Max Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatitude()
	 * @generated
	 * @ordered
	 */
	protected float maxLatitude = MAX_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLongitude() <em>Max Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxLongitude() <em>Max Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLongitude()
	 * @generated
	 * @ordered
	 */
	protected float maxLongitude = MAX_LONGITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.BOUNDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLatitute() {
		return minLatitute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLatitute(float newMinLatitute) {
		float oldMinLatitute = minLatitute;
		minLatitute = newMinLatitute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.BOUNDS__MIN_LATITUTE, oldMinLatitute, minLatitute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLongitude() {
		return minLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLongitude(float newMinLongitude) {
		float oldMinLongitude = minLongitude;
		minLongitude = newMinLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.BOUNDS__MIN_LONGITUDE, oldMinLongitude, minLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxLatitude() {
		return maxLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLatitude(float newMaxLatitude) {
		float oldMaxLatitude = maxLatitude;
		maxLatitude = newMaxLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.BOUNDS__MAX_LATITUDE, oldMaxLatitude, maxLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxLongitude() {
		return maxLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLongitude(float newMaxLongitude) {
		float oldMaxLongitude = maxLongitude;
		maxLongitude = newMaxLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.BOUNDS__MAX_LONGITUDE, oldMaxLongitude, maxLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmPackage.BOUNDS__MIN_LATITUTE:
				return getMinLatitute();
			case OsmPackage.BOUNDS__MIN_LONGITUDE:
				return getMinLongitude();
			case OsmPackage.BOUNDS__MAX_LATITUDE:
				return getMaxLatitude();
			case OsmPackage.BOUNDS__MAX_LONGITUDE:
				return getMaxLongitude();
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
			case OsmPackage.BOUNDS__MIN_LATITUTE:
				setMinLatitute((Float)newValue);
				return;
			case OsmPackage.BOUNDS__MIN_LONGITUDE:
				setMinLongitude((Float)newValue);
				return;
			case OsmPackage.BOUNDS__MAX_LATITUDE:
				setMaxLatitude((Float)newValue);
				return;
			case OsmPackage.BOUNDS__MAX_LONGITUDE:
				setMaxLongitude((Float)newValue);
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
			case OsmPackage.BOUNDS__MIN_LATITUTE:
				setMinLatitute(MIN_LATITUTE_EDEFAULT);
				return;
			case OsmPackage.BOUNDS__MIN_LONGITUDE:
				setMinLongitude(MIN_LONGITUDE_EDEFAULT);
				return;
			case OsmPackage.BOUNDS__MAX_LATITUDE:
				setMaxLatitude(MAX_LATITUDE_EDEFAULT);
				return;
			case OsmPackage.BOUNDS__MAX_LONGITUDE:
				setMaxLongitude(MAX_LONGITUDE_EDEFAULT);
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
			case OsmPackage.BOUNDS__MIN_LATITUTE:
				return minLatitute != MIN_LATITUTE_EDEFAULT;
			case OsmPackage.BOUNDS__MIN_LONGITUDE:
				return minLongitude != MIN_LONGITUDE_EDEFAULT;
			case OsmPackage.BOUNDS__MAX_LATITUDE:
				return maxLatitude != MAX_LATITUDE_EDEFAULT;
			case OsmPackage.BOUNDS__MAX_LONGITUDE:
				return maxLongitude != MAX_LONGITUDE_EDEFAULT;
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
		result.append(" (minLatitute: ");
		result.append(minLatitute);
		result.append(", minLongitude: ");
		result.append(minLongitude);
		result.append(", maxLatitude: ");
		result.append(maxLatitude);
		result.append(", maxLongitude: ");
		result.append(maxLongitude);
		result.append(')');
		return result.toString();
	}

} //BoundsImpl
