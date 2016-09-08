/**
 */
package no.hal.pgo.osm.impl;

import no.hal.pgo.osm.Bounds;
import no.hal.pgo.osm.GeoLocated;
import no.hal.pgo.osm.GeoLocation;
import no.hal.pgo.osm.Member;
import no.hal.pgo.osm.MetaData;
import no.hal.pgo.osm.Node;
import no.hal.pgo.osm.NodeRef;
import no.hal.pgo.osm.Note;
import no.hal.pgo.osm.OSMElement;
import no.hal.pgo.osm.OsmFactory;
import no.hal.pgo.osm.OsmPackage;
import no.hal.pgo.osm.Relation;
import no.hal.pgo.osm.Tag;
import no.hal.pgo.osm.Tagged;
import no.hal.pgo.osm.Tags;
import no.hal.pgo.osm.Way;

import no.hal.pgo.osm.geoutil.LatLong;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmPackageImpl extends EPackageImpl implements OsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLocatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latLongEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.pgo.osm.OsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsmPackageImpl() {
		super(eNS_URI, OsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsmPackage init() {
		if (isInited) return (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Obtain or create and register package
		OsmPackageImpl theOsmPackage = (OsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OsmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOsmPackage.createPackageContents();

		// Initialize created meta-data
		theOsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsmPackage.eNS_URI, theOsmPackage);
		return theOsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoLocation() {
		return geoLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoLocation_Latitude() {
		return (EAttribute)geoLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoLocation_Longitude() {
		return (EAttribute)geoLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoLocated() {
		return geoLocatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeoLocated__GetLatLong() {
		return geoLocatedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWay() {
		return wayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWay_Nodes() {
		return (EReference)wayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeRef() {
		return nodeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeRef_Ref() {
		return (EReference)nodeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSMElement() {
		return osmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_Id() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_Visible() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_Timestamp() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_User() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_Version() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_Changeset() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSMElement_Uid() {
		return (EAttribute)osmElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagged() {
		return taggedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTagged__HasTag__String() {
		return taggedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTagged__GetTag__String() {
		return taggedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTagged__HasTag__String_String() {
		return taggedEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTags() {
		return tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTags_Tags() {
		return (EReference)tagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Key() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Value() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Members() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Reference() {
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Type() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Role() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBounds() {
		return boundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_MinLatitute() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_MinLongitude() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_MaxLatitude() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_MaxLongitude() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSM() {
		return osmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSM_Nodes() {
		return (EReference)osmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSM_Ways() {
		return (EReference)osmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSM_Relations() {
		return (EReference)osmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSM_Bounds() {
		return (EReference)osmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSM_Version() {
		return (EAttribute)osmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSM_Generator() {
		return (EAttribute)osmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSM_Notes() {
		return (EReference)osmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSM_MetaData() {
		return (EReference)osmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSM_Copyright() {
		return (EAttribute)osmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Contents() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_OsmBase() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatLong() {
		return latLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmFactory getOsmFactory() {
		return (OsmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nodeEClass = createEClass(NODE);

		geoLocationEClass = createEClass(GEO_LOCATION);
		createEAttribute(geoLocationEClass, GEO_LOCATION__LATITUDE);
		createEAttribute(geoLocationEClass, GEO_LOCATION__LONGITUDE);

		geoLocatedEClass = createEClass(GEO_LOCATED);
		createEOperation(geoLocatedEClass, GEO_LOCATED___GET_LAT_LONG);

		wayEClass = createEClass(WAY);
		createEReference(wayEClass, WAY__NODES);

		nodeRefEClass = createEClass(NODE_REF);
		createEReference(nodeRefEClass, NODE_REF__REF);

		osmElementEClass = createEClass(OSM_ELEMENT);
		createEAttribute(osmElementEClass, OSM_ELEMENT__ID);
		createEAttribute(osmElementEClass, OSM_ELEMENT__VISIBLE);
		createEAttribute(osmElementEClass, OSM_ELEMENT__TIMESTAMP);
		createEAttribute(osmElementEClass, OSM_ELEMENT__USER);
		createEAttribute(osmElementEClass, OSM_ELEMENT__VERSION);
		createEAttribute(osmElementEClass, OSM_ELEMENT__CHANGESET);
		createEAttribute(osmElementEClass, OSM_ELEMENT__UID);

		taggedEClass = createEClass(TAGGED);
		createEOperation(taggedEClass, TAGGED___HAS_TAG__STRING);
		createEOperation(taggedEClass, TAGGED___GET_TAG__STRING);
		createEOperation(taggedEClass, TAGGED___HAS_TAG__STRING_STRING);

		tagsEClass = createEClass(TAGS);
		createEReference(tagsEClass, TAGS__TAGS);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__KEY);
		createEAttribute(tagEClass, TAG__VALUE);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__MEMBERS);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__REFERENCE);
		createEAttribute(memberEClass, MEMBER__TYPE);
		createEAttribute(memberEClass, MEMBER__ROLE);

		boundsEClass = createEClass(BOUNDS);
		createEAttribute(boundsEClass, BOUNDS__MIN_LATITUTE);
		createEAttribute(boundsEClass, BOUNDS__MIN_LONGITUDE);
		createEAttribute(boundsEClass, BOUNDS__MAX_LATITUDE);
		createEAttribute(boundsEClass, BOUNDS__MAX_LONGITUDE);

		osmEClass = createEClass(OSM);
		createEReference(osmEClass, OSM__NODES);
		createEReference(osmEClass, OSM__WAYS);
		createEReference(osmEClass, OSM__RELATIONS);
		createEReference(osmEClass, OSM__BOUNDS);
		createEAttribute(osmEClass, OSM__VERSION);
		createEAttribute(osmEClass, OSM__GENERATOR);
		createEReference(osmEClass, OSM__NOTES);
		createEReference(osmEClass, OSM__META_DATA);
		createEAttribute(osmEClass, OSM__COPYRIGHT);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__CONTENTS);

		metaDataEClass = createEClass(META_DATA);
		createEAttribute(metaDataEClass, META_DATA__OSM_BASE);

		// Create data types
		latLongEDataType = createEDataType(LAT_LONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getOSMElement());
		nodeEClass.getESuperTypes().add(this.getGeoLocation());
		geoLocationEClass.getESuperTypes().add(this.getGeoLocated());
		wayEClass.getESuperTypes().add(this.getOSMElement());
		nodeRefEClass.getESuperTypes().add(this.getGeoLocated());
		osmElementEClass.getESuperTypes().add(this.getTags());
		tagsEClass.getESuperTypes().add(this.getTagged());
		relationEClass.getESuperTypes().add(this.getOSMElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geoLocationEClass, GeoLocation.class, "GeoLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoLocation_Latitude(), ecorePackage.getEFloat(), "latitude", null, 0, 1, GeoLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoLocation_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, GeoLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoLocatedEClass, GeoLocated.class, "GeoLocated", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGeoLocated__GetLatLong(), this.getLatLong(), "getLatLong", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wayEClass, Way.class, "Way", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWay_Nodes(), this.getNodeRef(), null, "nodes", null, 0, -1, Way.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeRefEClass, NodeRef.class, "NodeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeRef_Ref(), this.getNode(), null, "ref", null, 0, 1, NodeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmElementEClass, OSMElement.class, "OSMElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSMElement_Id(), ecorePackage.getELong(), "id", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSMElement_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSMElement_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSMElement_User(), ecorePackage.getEString(), "user", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSMElement_Version(), ecorePackage.getEInt(), "version", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSMElement_Changeset(), ecorePackage.getELong(), "changeset", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSMElement_Uid(), ecorePackage.getELong(), "uid", null, 0, 1, OSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedEClass, Tagged.class, "Tagged", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTagged__HasTag__String(), ecorePackage.getEBoolean(), "hasTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTagged__GetTag__String(), ecorePackage.getEString(), "getTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTagged__HasTag__String_String(), ecorePackage.getEBoolean(), "hasTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tagsEClass, Tags.class, "Tags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTags_Tags(), this.getTag(), null, "tags", null, 0, -1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Key(), ecorePackage.getEString(), "key", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Value(), ecorePackage.getEString(), "value", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Members(), this.getMember(), null, "members", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_Reference(), this.getOSMElement(), null, "reference", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Role(), ecorePackage.getEString(), "role", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBounds_MinLatitute(), ecorePackage.getEFloat(), "minLatitute", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_MinLongitude(), ecorePackage.getEFloat(), "minLongitude", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_MaxLatitude(), ecorePackage.getEFloat(), "maxLatitude", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_MaxLongitude(), ecorePackage.getEFloat(), "maxLongitude", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmEClass, no.hal.pgo.osm.OSM.class, "OSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSM_Nodes(), this.getNode(), null, "nodes", null, 0, -1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSM_Ways(), this.getWay(), null, "ways", null, 0, -1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSM_Relations(), this.getRelation(), null, "relations", null, 0, -1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSM_Bounds(), this.getBounds(), null, "bounds", null, 0, 1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSM_Version(), ecorePackage.getEString(), "version", null, 0, 1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSM_Generator(), ecorePackage.getEString(), "generator", null, 0, 1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSM_Notes(), this.getNote(), null, "notes", null, 0, -1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSM_MetaData(), this.getMetaData(), null, "metaData", null, 0, -1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSM_Copyright(), ecorePackage.getEString(), "copyright", null, 0, 1, no.hal.pgo.osm.OSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Contents(), ecorePackage.getEString(), "contents", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaData_OsmBase(), ecorePackage.getEString(), "osmBase", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(latLongEDataType, LatLong.class, "LatLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getGeoLocation_Latitude(), 
		   source, 
		   new String[] {
			 "name", "lat",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getGeoLocation_Longitude(), 
		   source, 
		   new String[] {
			 "name", "lon",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getWay_Nodes(), 
		   source, 
		   new String[] {
			 "name", "nd",
			 "kind", "element"
		   });	
		addAnnotation
		  (getNodeRef_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getTags_Tags(), 
		   source, 
		   new String[] {
			 "name", "tag",
			 "kind", "element"
		   });	
		addAnnotation
		  (getTag_Key(), 
		   source, 
		   new String[] {
			 "name", "k",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getTag_Value(), 
		   source, 
		   new String[] {
			 "name", "v",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getRelation_Members(), 
		   source, 
		   new String[] {
			 "name", "member",
			 "kind", "element"
		   });	
		addAnnotation
		  (getMember_Reference(), 
		   source, 
		   new String[] {
			 "name", "ref",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getBounds_MinLatitute(), 
		   source, 
		   new String[] {
			 "name", "minlat",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getBounds_MinLongitude(), 
		   source, 
		   new String[] {
			 "name", "minlon",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getBounds_MaxLatitude(), 
		   source, 
		   new String[] {
			 "name", "maxlat",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getBounds_MaxLongitude(), 
		   source, 
		   new String[] {
			 "name", "maxlon",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (osmEClass, 
		   source, 
		   new String[] {
			 "name", "osm"
		   });	
		addAnnotation
		  (getOSM_Nodes(), 
		   source, 
		   new String[] {
			 "name", "node",
			 "kind", "element"
		   });	
		addAnnotation
		  (getOSM_Ways(), 
		   source, 
		   new String[] {
			 "name", "way",
			 "kind", "element"
		   });	
		addAnnotation
		  (getOSM_Relations(), 
		   source, 
		   new String[] {
			 "name", "relation",
			 "kind", "element"
		   });	
		addAnnotation
		  (getOSM_Notes(), 
		   source, 
		   new String[] {
			 "name", "note",
			 "kind", "element"
		   });	
		addAnnotation
		  (getOSM_MetaData(), 
		   source, 
		   new String[] {
			 "name", "meta",
			 "kind", "element"
		   });	
		addAnnotation
		  (getNote_Contents(), 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getMetaData_OsmBase(), 
		   source, 
		   new String[] {
			 "name", "osm_base",
			 "kind", "attribute"
		   });
	}

} //OsmPackageImpl
