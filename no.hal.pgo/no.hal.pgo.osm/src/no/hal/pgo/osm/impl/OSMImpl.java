/**
 */
package no.hal.pgo.osm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pgo.osm.Bounds;
import no.hal.pgo.osm.MetaData;
import no.hal.pgo.osm.Node;
import no.hal.pgo.osm.Note;
import no.hal.pgo.osm.OSM;
import no.hal.pgo.osm.OsmPackage;
import no.hal.pgo.osm.Relation;
import no.hal.pgo.osm.Way;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getWays <em>Ways</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link no.hal.pgo.osm.impl.OSMImpl#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSMImpl extends MinimalEObjectImpl.Container implements OSM {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getWays() <em>Ways</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWays()
	 * @generated
	 * @ordered
	 */
	protected EList<Way> ways;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected String generator = GENERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> notes;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaData> metaData;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.OSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, OsmPackage.OSM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Way> getWays() {
		if (ways == null) {
			ways = new EObjectContainmentEList<Way>(Way.class, this, OsmPackage.OSM__WAYS);
		}
		return ways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, OsmPackage.OSM__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OsmPackage.OSM__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBounds(Bounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OsmPackage.OSM__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OsmPackage.OSM__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerator(String newGenerator) {
		String oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Note> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Note>(Note.class, this, OsmPackage.OSM__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaData> getMetaData() {
		if (metaData == null) {
			metaData = new EObjectContainmentEList<MetaData>(MetaData.class, this, OsmPackage.OSM__META_DATA);
		}
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsmPackage.OSM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM__WAYS:
				return ((InternalEList<?>)getWays()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM__BOUNDS:
				return basicSetBounds(null, msgs);
			case OsmPackage.OSM__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM__META_DATA:
				return ((InternalEList<?>)getMetaData()).basicRemove(otherEnd, msgs);
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
			case OsmPackage.OSM__NODES:
				return getNodes();
			case OsmPackage.OSM__WAYS:
				return getWays();
			case OsmPackage.OSM__RELATIONS:
				return getRelations();
			case OsmPackage.OSM__BOUNDS:
				return getBounds();
			case OsmPackage.OSM__VERSION:
				return getVersion();
			case OsmPackage.OSM__GENERATOR:
				return getGenerator();
			case OsmPackage.OSM__NOTES:
				return getNotes();
			case OsmPackage.OSM__META_DATA:
				return getMetaData();
			case OsmPackage.OSM__COPYRIGHT:
				return getCopyright();
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
			case OsmPackage.OSM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case OsmPackage.OSM__WAYS:
				getWays().clear();
				getWays().addAll((Collection<? extends Way>)newValue);
				return;
			case OsmPackage.OSM__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case OsmPackage.OSM__BOUNDS:
				setBounds((Bounds)newValue);
				return;
			case OsmPackage.OSM__VERSION:
				setVersion((String)newValue);
				return;
			case OsmPackage.OSM__GENERATOR:
				setGenerator((String)newValue);
				return;
			case OsmPackage.OSM__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case OsmPackage.OSM__META_DATA:
				getMetaData().clear();
				getMetaData().addAll((Collection<? extends MetaData>)newValue);
				return;
			case OsmPackage.OSM__COPYRIGHT:
				setCopyright((String)newValue);
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
			case OsmPackage.OSM__NODES:
				getNodes().clear();
				return;
			case OsmPackage.OSM__WAYS:
				getWays().clear();
				return;
			case OsmPackage.OSM__RELATIONS:
				getRelations().clear();
				return;
			case OsmPackage.OSM__BOUNDS:
				setBounds((Bounds)null);
				return;
			case OsmPackage.OSM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OsmPackage.OSM__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case OsmPackage.OSM__NOTES:
				getNotes().clear();
				return;
			case OsmPackage.OSM__META_DATA:
				getMetaData().clear();
				return;
			case OsmPackage.OSM__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
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
			case OsmPackage.OSM__NODES:
				return nodes != null && !nodes.isEmpty();
			case OsmPackage.OSM__WAYS:
				return ways != null && !ways.isEmpty();
			case OsmPackage.OSM__RELATIONS:
				return relations != null && !relations.isEmpty();
			case OsmPackage.OSM__BOUNDS:
				return bounds != null;
			case OsmPackage.OSM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case OsmPackage.OSM__GENERATOR:
				return GENERATOR_EDEFAULT == null ? generator != null : !GENERATOR_EDEFAULT.equals(generator);
			case OsmPackage.OSM__NOTES:
				return notes != null && !notes.isEmpty();
			case OsmPackage.OSM__META_DATA:
				return metaData != null && !metaData.isEmpty();
			case OsmPackage.OSM__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
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
		result.append(" (version: ");
		result.append(version);
		result.append(", generator: ");
		result.append(generator);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(')');
		return result.toString();
	}

} //OSMImpl
