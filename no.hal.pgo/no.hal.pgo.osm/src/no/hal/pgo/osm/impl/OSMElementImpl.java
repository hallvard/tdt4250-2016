/**
 */
package no.hal.pgo.osm.impl;

import java.util.Date;

import no.hal.pgo.osm.OSMElement;
import no.hal.pgo.osm.OsmPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSM Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#getUser <em>User</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#getChangeset <em>Changeset</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMElementImpl#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OSMElementImpl extends TagsImpl implements OSMElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeset() <em>Changeset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeset()
	 * @generated
	 * @ordered
	 */
	protected static final long CHANGESET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChangeset() <em>Changeset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeset()
	 * @generated
	 * @ordered
	 */
	protected long changeset = CHANGESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final long UID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected long uid = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSMElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.OSM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChangeset() {
		return changeset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeset(long newChangeset) {
		long oldChangeset = changeset;
		changeset = newChangeset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__CHANGESET, oldChangeset, changeset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(long newUid) {
		long oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ELEMENT__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmPackage.OSM_ELEMENT__ID:
				return getId();
			case OsmPackage.OSM_ELEMENT__VISIBLE:
				return isVisible();
			case OsmPackage.OSM_ELEMENT__TIMESTAMP:
				return getTimestamp();
			case OsmPackage.OSM_ELEMENT__USER:
				return getUser();
			case OsmPackage.OSM_ELEMENT__VERSION:
				return getVersion();
			case OsmPackage.OSM_ELEMENT__CHANGESET:
				return getChangeset();
			case OsmPackage.OSM_ELEMENT__UID:
				return getUid();
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
			case OsmPackage.OSM_ELEMENT__ID:
				setId((Long)newValue);
				return;
			case OsmPackage.OSM_ELEMENT__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case OsmPackage.OSM_ELEMENT__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case OsmPackage.OSM_ELEMENT__USER:
				setUser((String)newValue);
				return;
			case OsmPackage.OSM_ELEMENT__VERSION:
				setVersion((Integer)newValue);
				return;
			case OsmPackage.OSM_ELEMENT__CHANGESET:
				setChangeset((Long)newValue);
				return;
			case OsmPackage.OSM_ELEMENT__UID:
				setUid((Long)newValue);
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
			case OsmPackage.OSM_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case OsmPackage.OSM_ELEMENT__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case OsmPackage.OSM_ELEMENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case OsmPackage.OSM_ELEMENT__USER:
				setUser(USER_EDEFAULT);
				return;
			case OsmPackage.OSM_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OsmPackage.OSM_ELEMENT__CHANGESET:
				setChangeset(CHANGESET_EDEFAULT);
				return;
			case OsmPackage.OSM_ELEMENT__UID:
				setUid(UID_EDEFAULT);
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
			case OsmPackage.OSM_ELEMENT__ID:
				return id != ID_EDEFAULT;
			case OsmPackage.OSM_ELEMENT__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case OsmPackage.OSM_ELEMENT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case OsmPackage.OSM_ELEMENT__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case OsmPackage.OSM_ELEMENT__VERSION:
				return version != VERSION_EDEFAULT;
			case OsmPackage.OSM_ELEMENT__CHANGESET:
				return changeset != CHANGESET_EDEFAULT;
			case OsmPackage.OSM_ELEMENT__UID:
				return uid != UID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", visible: ");
		result.append(visible);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", user: ");
		result.append(user);
		result.append(", version: ");
		result.append(version);
		result.append(", changeset: ");
		result.append(changeset);
		result.append(", uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //OSMElementImpl
