/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pgo.osm.OsmFactory
 * @model kind="package"
 * @generated
 */
public interface OsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openstreetmap.org/v06/osm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "osm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsmPackage eINSTANCE = no.hal.pgo.osm.impl.OsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.Tagged <em>Tagged</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.Tagged
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getTagged()
	 * @generated
	 */
	int TAGGED = 6;

	/**
	 * The number of structural features of the '<em>Tagged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED___HAS_TAG__STRING = 0;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED___GET_TAG__STRING = 1;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED___HAS_TAG__STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>Tagged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.TagsImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__TAGS = TAGGED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = TAGGED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS___HAS_TAG__STRING = TAGGED___HAS_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS___GET_TAG__STRING = TAGGED___GET_TAG__STRING;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS___HAS_TAG__STRING_STRING = TAGGED___HAS_TAG__STRING_STRING;

	/**
	 * The number of operations of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = TAGGED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.OSMElementImpl <em>OSM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.OSMElementImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getOSMElement()
	 * @generated
	 */
	int OSM_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__TAGS = TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__ID = TAGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__VISIBLE = TAGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__TIMESTAMP = TAGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__USER = TAGS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__VERSION = TAGS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Changeset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__CHANGESET = TAGS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT__UID = TAGS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>OSM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT_FEATURE_COUNT = TAGS_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT___HAS_TAG__STRING = TAGS___HAS_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT___GET_TAG__STRING = TAGS___GET_TAG__STRING;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT___HAS_TAG__STRING_STRING = TAGS___HAS_TAG__STRING_STRING;

	/**
	 * The number of operations of the '<em>OSM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ELEMENT_OPERATION_COUNT = TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.NodeImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAGS = OSM_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = OSM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VISIBLE = OSM_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TIMESTAMP = OSM_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__USER = OSM_ELEMENT__USER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VERSION = OSM_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Changeset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHANGESET = OSM_ELEMENT__CHANGESET;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UID = OSM_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LATITUDE = OSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LONGITUDE = OSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = OSM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_TAG__STRING = OSM_ELEMENT___HAS_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_TAG__STRING = OSM_ELEMENT___GET_TAG__STRING;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_TAG__STRING_STRING = OSM_ELEMENT___HAS_TAG__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Latitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_LATITUDE = OSM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Longitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_LONGITUDE = OSM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = OSM_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.GeoLocated <em>Geo Located</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.GeoLocated
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getGeoLocated()
	 * @generated
	 */
	int GEO_LOCATED = 2;

	/**
	 * The number of structural features of the '<em>Geo Located</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Latitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED___GET_LATITUDE = 0;

	/**
	 * The operation id for the '<em>Get Longitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED___GET_LONGITUDE = 1;

	/**
	 * The number of operations of the '<em>Geo Located</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.GeoLocationImpl <em>Geo Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.GeoLocationImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getGeoLocation()
	 * @generated
	 */
	int GEO_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__LATITUDE = GEO_LOCATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__LONGITUDE = GEO_LOCATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FEATURE_COUNT = GEO_LOCATED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Latitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION___GET_LATITUDE = GEO_LOCATED___GET_LATITUDE;

	/**
	 * The operation id for the '<em>Get Longitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION___GET_LONGITUDE = GEO_LOCATED___GET_LONGITUDE;

	/**
	 * The number of operations of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_OPERATION_COUNT = GEO_LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.WayImpl <em>Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.WayImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getWay()
	 * @generated
	 */
	int WAY = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__TAGS = OSM_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__ID = OSM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__VISIBLE = OSM_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__TIMESTAMP = OSM_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__USER = OSM_ELEMENT__USER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__VERSION = OSM_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Changeset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__CHANGESET = OSM_ELEMENT__CHANGESET;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__UID = OSM_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY__NODES = OSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_FEATURE_COUNT = OSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY___HAS_TAG__STRING = OSM_ELEMENT___HAS_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY___GET_TAG__STRING = OSM_ELEMENT___GET_TAG__STRING;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY___HAS_TAG__STRING_STRING = OSM_ELEMENT___HAS_TAG__STRING_STRING;

	/**
	 * The number of operations of the '<em>Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_OPERATION_COUNT = OSM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.NodeRefImpl <em>Node Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.NodeRefImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getNodeRef()
	 * @generated
	 */
	int NODE_REF = 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REF__REF = GEO_LOCATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REF_FEATURE_COUNT = GEO_LOCATED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Latitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REF___GET_LATITUDE = GEO_LOCATED___GET_LATITUDE;

	/**
	 * The operation id for the '<em>Get Longitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REF___GET_LONGITUDE = GEO_LOCATED___GET_LONGITUDE;

	/**
	 * The number of operations of the '<em>Node Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REF_OPERATION_COUNT = GEO_LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.TagImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.RelationImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 9;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TAGS = OSM_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = OSM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VISIBLE = OSM_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TIMESTAMP = OSM_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__USER = OSM_ELEMENT__USER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VERSION = OSM_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Changeset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CHANGESET = OSM_ELEMENT__CHANGESET;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__UID = OSM_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MEMBERS = OSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = OSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___HAS_TAG__STRING = OSM_ELEMENT___HAS_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_TAG__STRING = OSM_ELEMENT___GET_TAG__STRING;

	/**
	 * The operation id for the '<em>Has Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___HAS_TAG__STRING_STRING = OSM_ELEMENT___HAS_TAG__STRING_STRING;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = OSM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.MemberImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 10;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.BoundsImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 11;

	/**
	 * The feature id for the '<em><b>Min Latitute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MIN_LATITUTE = 0;

	/**
	 * The feature id for the '<em><b>Min Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MIN_LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Max Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MAX_LATITUDE = 2;

	/**
	 * The feature id for the '<em><b>Max Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MAX_LONGITUDE = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.OSMImpl <em>OSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.OSMImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getOSM()
	 * @generated
	 */
	int OSM = 12;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__NODES = 0;

	/**
	 * The feature id for the '<em><b>Ways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__WAYS = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__NOTES = 6;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM__META_DATA = 7;

	/**
	 * The number of structural features of the '<em>OSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>OSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.NoteImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 13;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.osm.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.impl.MetaDataImpl
	 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 14;

	/**
	 * The feature id for the '<em><b>Osm Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__OSM_BASE = 0;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see no.hal.pgo.osm.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.GeoLocation <em>Geo Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Location</em>'.
	 * @see no.hal.pgo.osm.GeoLocation
	 * @generated
	 */
	EClass getGeoLocation();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.GeoLocation#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see no.hal.pgo.osm.GeoLocation#getLatitude()
	 * @see #getGeoLocation()
	 * @generated
	 */
	EAttribute getGeoLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.GeoLocation#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see no.hal.pgo.osm.GeoLocation#getLongitude()
	 * @see #getGeoLocation()
	 * @generated
	 */
	EAttribute getGeoLocation_Longitude();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.GeoLocated <em>Geo Located</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Located</em>'.
	 * @see no.hal.pgo.osm.GeoLocated
	 * @generated
	 */
	EClass getGeoLocated();

	/**
	 * Returns the meta object for the '{@link no.hal.pgo.osm.GeoLocated#getLatitude() <em>Get Latitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latitude</em>' operation.
	 * @see no.hal.pgo.osm.GeoLocated#getLatitude()
	 * @generated
	 */
	EOperation getGeoLocated__GetLatitude();

	/**
	 * Returns the meta object for the '{@link no.hal.pgo.osm.GeoLocated#getLongitude() <em>Get Longitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Longitude</em>' operation.
	 * @see no.hal.pgo.osm.GeoLocated#getLongitude()
	 * @generated
	 */
	EOperation getGeoLocated__GetLongitude();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Way <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way</em>'.
	 * @see no.hal.pgo.osm.Way
	 * @generated
	 */
	EClass getWay();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.Way#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see no.hal.pgo.osm.Way#getNodes()
	 * @see #getWay()
	 * @generated
	 */
	EReference getWay_Nodes();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.NodeRef <em>Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Ref</em>'.
	 * @see no.hal.pgo.osm.NodeRef
	 * @generated
	 */
	EClass getNodeRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pgo.osm.NodeRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see no.hal.pgo.osm.NodeRef#getRef()
	 * @see #getNodeRef()
	 * @generated
	 */
	EReference getNodeRef_Ref();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.OSMElement <em>OSM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSM Element</em>'.
	 * @see no.hal.pgo.osm.OSMElement
	 * @generated
	 */
	EClass getOSMElement();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see no.hal.pgo.osm.OSMElement#getId()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see no.hal.pgo.osm.OSMElement#isVisible()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Visible();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see no.hal.pgo.osm.OSMElement#getTimestamp()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see no.hal.pgo.osm.OSMElement#getUser()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_User();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see no.hal.pgo.osm.OSMElement#getVersion()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#getChangeset <em>Changeset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeset</em>'.
	 * @see no.hal.pgo.osm.OSMElement#getChangeset()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Changeset();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSMElement#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see no.hal.pgo.osm.OSMElement#getUid()
	 * @see #getOSMElement()
	 * @generated
	 */
	EAttribute getOSMElement_Uid();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Tagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged</em>'.
	 * @see no.hal.pgo.osm.Tagged
	 * @generated
	 */
	EClass getTagged();

	/**
	 * Returns the meta object for the '{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String) <em>Has Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Tag</em>' operation.
	 * @see no.hal.pgo.osm.Tagged#hasTag(java.lang.String)
	 * @generated
	 */
	EOperation getTagged__HasTag__String();

	/**
	 * Returns the meta object for the '{@link no.hal.pgo.osm.Tagged#getTag(java.lang.String) <em>Get Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tag</em>' operation.
	 * @see no.hal.pgo.osm.Tagged#getTag(java.lang.String)
	 * @generated
	 */
	EOperation getTagged__GetTag__String();

	/**
	 * Returns the meta object for the '{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String, java.lang.String) <em>Has Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Tag</em>' operation.
	 * @see no.hal.pgo.osm.Tagged#hasTag(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getTagged__HasTag__String_String();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags</em>'.
	 * @see no.hal.pgo.osm.Tags
	 * @generated
	 */
	EClass getTags();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.Tags#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see no.hal.pgo.osm.Tags#getTags()
	 * @see #getTags()
	 * @generated
	 */
	EReference getTags_Tags();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see no.hal.pgo.osm.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Tag#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see no.hal.pgo.osm.Tag#getKey()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Key();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.pgo.osm.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see no.hal.pgo.osm.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.Relation#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see no.hal.pgo.osm.Relation#getMembers()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Members();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see no.hal.pgo.osm.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pgo.osm.Member#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see no.hal.pgo.osm.Member#getReference()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Reference();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Member#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.hal.pgo.osm.Member#getType()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Type();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Member#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see no.hal.pgo.osm.Member#getRole()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Role();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see no.hal.pgo.osm.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Bounds#getMinLatitute <em>Min Latitute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Latitute</em>'.
	 * @see no.hal.pgo.osm.Bounds#getMinLatitute()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MinLatitute();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Bounds#getMinLongitude <em>Min Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Longitude</em>'.
	 * @see no.hal.pgo.osm.Bounds#getMinLongitude()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MinLongitude();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Bounds#getMaxLatitude <em>Max Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Latitude</em>'.
	 * @see no.hal.pgo.osm.Bounds#getMaxLatitude()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MaxLatitude();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Bounds#getMaxLongitude <em>Max Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Longitude</em>'.
	 * @see no.hal.pgo.osm.Bounds#getMaxLongitude()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_MaxLongitude();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.OSM <em>OSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSM</em>'.
	 * @see no.hal.pgo.osm.OSM
	 * @generated
	 */
	EClass getOSM();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.OSM#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see no.hal.pgo.osm.OSM#getNodes()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.OSM#getWays <em>Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ways</em>'.
	 * @see no.hal.pgo.osm.OSM#getWays()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Ways();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.OSM#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see no.hal.pgo.osm.OSM#getRelations()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pgo.osm.OSM#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see no.hal.pgo.osm.OSM#getBounds()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSM#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see no.hal.pgo.osm.OSM#getVersion()
	 * @see #getOSM()
	 * @generated
	 */
	EAttribute getOSM_Version();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.OSM#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see no.hal.pgo.osm.OSM#getGenerator()
	 * @see #getOSM()
	 * @generated
	 */
	EAttribute getOSM_Generator();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.OSM#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see no.hal.pgo.osm.OSM#getNotes()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.osm.OSM#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Data</em>'.
	 * @see no.hal.pgo.osm.OSM#getMetaData()
	 * @see #getOSM()
	 * @generated
	 */
	EReference getOSM_MetaData();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see no.hal.pgo.osm.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.Note#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see no.hal.pgo.osm.Note#getContents()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Contents();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.osm.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see no.hal.pgo.osm.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.osm.MetaData#getOsmBase <em>Osm Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osm Base</em>'.
	 * @see no.hal.pgo.osm.MetaData#getOsmBase()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_OsmBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsmFactory getOsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.NodeImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.GeoLocationImpl <em>Geo Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.GeoLocationImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getGeoLocation()
		 * @generated
		 */
		EClass GEO_LOCATION = eINSTANCE.getGeoLocation();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LOCATION__LATITUDE = eINSTANCE.getGeoLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LOCATION__LONGITUDE = eINSTANCE.getGeoLocation_Longitude();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.GeoLocated <em>Geo Located</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.GeoLocated
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getGeoLocated()
		 * @generated
		 */
		EClass GEO_LOCATED = eINSTANCE.getGeoLocated();

		/**
		 * The meta object literal for the '<em><b>Get Latitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEO_LOCATED___GET_LATITUDE = eINSTANCE.getGeoLocated__GetLatitude();

		/**
		 * The meta object literal for the '<em><b>Get Longitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEO_LOCATED___GET_LONGITUDE = eINSTANCE.getGeoLocated__GetLongitude();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.WayImpl <em>Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.WayImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getWay()
		 * @generated
		 */
		EClass WAY = eINSTANCE.getWay();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY__NODES = eINSTANCE.getWay_Nodes();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.NodeRefImpl <em>Node Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.NodeRefImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getNodeRef()
		 * @generated
		 */
		EClass NODE_REF = eINSTANCE.getNodeRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_REF__REF = eINSTANCE.getNodeRef_Ref();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.OSMElementImpl <em>OSM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.OSMElementImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getOSMElement()
		 * @generated
		 */
		EClass OSM_ELEMENT = eINSTANCE.getOSMElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__ID = eINSTANCE.getOSMElement_Id();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__VISIBLE = eINSTANCE.getOSMElement_Visible();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__TIMESTAMP = eINSTANCE.getOSMElement_Timestamp();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__USER = eINSTANCE.getOSMElement_User();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__VERSION = eINSTANCE.getOSMElement_Version();

		/**
		 * The meta object literal for the '<em><b>Changeset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__CHANGESET = eINSTANCE.getOSMElement_Changeset();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ELEMENT__UID = eINSTANCE.getOSMElement_Uid();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.Tagged <em>Tagged</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.Tagged
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getTagged()
		 * @generated
		 */
		EClass TAGGED = eINSTANCE.getTagged();

		/**
		 * The meta object literal for the '<em><b>Has Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAGGED___HAS_TAG__STRING = eINSTANCE.getTagged__HasTag__String();

		/**
		 * The meta object literal for the '<em><b>Get Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAGGED___GET_TAG__STRING = eINSTANCE.getTagged__GetTag__String();

		/**
		 * The meta object literal for the '<em><b>Has Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAGGED___HAS_TAG__STRING_STRING = eINSTANCE.getTagged__HasTag__String_String();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.TagsImpl <em>Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.TagsImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getTags()
		 * @generated
		 */
		EClass TAGS = eINSTANCE.getTags();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS__TAGS = eINSTANCE.getTags_Tags();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.TagImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__KEY = eINSTANCE.getTag_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.RelationImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__MEMBERS = eINSTANCE.getRelation_Members();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.MemberImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__REFERENCE = eINSTANCE.getMember_Reference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__TYPE = eINSTANCE.getMember_Type();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ROLE = eINSTANCE.getMember_Role();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.BoundsImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>Min Latitute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MIN_LATITUTE = eINSTANCE.getBounds_MinLatitute();

		/**
		 * The meta object literal for the '<em><b>Min Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MIN_LONGITUDE = eINSTANCE.getBounds_MinLongitude();

		/**
		 * The meta object literal for the '<em><b>Max Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MAX_LATITUDE = eINSTANCE.getBounds_MaxLatitude();

		/**
		 * The meta object literal for the '<em><b>Max Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__MAX_LONGITUDE = eINSTANCE.getBounds_MaxLongitude();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.OSMImpl <em>OSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.OSMImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getOSM()
		 * @generated
		 */
		EClass OSM = eINSTANCE.getOSM();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__NODES = eINSTANCE.getOSM_Nodes();

		/**
		 * The meta object literal for the '<em><b>Ways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__WAYS = eINSTANCE.getOSM_Ways();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__RELATIONS = eINSTANCE.getOSM_Relations();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__BOUNDS = eINSTANCE.getOSM_Bounds();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM__VERSION = eINSTANCE.getOSM_Version();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM__GENERATOR = eINSTANCE.getOSM_Generator();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__NOTES = eINSTANCE.getOSM_Notes();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM__META_DATA = eINSTANCE.getOSM_MetaData();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.NoteImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__CONTENTS = eINSTANCE.getNote_Contents();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.osm.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.osm.impl.MetaDataImpl
		 * @see no.hal.pgo.osm.impl.OsmPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Osm Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__OSM_BASE = eINSTANCE.getMetaData_OsmBase();

	}

} //OsmPackage
