/**
 */
package no.hal.pgo.osm.impl;

import no.hal.pgo.osm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmFactoryImpl extends EFactoryImpl implements OsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsmFactory init() {
		try {
			OsmFactory theOsmFactory = (OsmFactory)EPackage.Registry.INSTANCE.getEFactory(OsmPackage.eNS_URI);
			if (theOsmFactory != null) {
				return theOsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsmPackage.NODE: return createNode();
			case OsmPackage.GEO_LOCATION: return createGeoLocation();
			case OsmPackage.WAY: return createWay();
			case OsmPackage.NODE_REF: return createNodeRef();
			case OsmPackage.OSM_ELEMENT: return createOSMElement();
			case OsmPackage.TAGS: return createTags();
			case OsmPackage.TAG: return createTag();
			case OsmPackage.RELATION: return createRelation();
			case OsmPackage.MEMBER: return createMember();
			case OsmPackage.BOUNDS: return createBounds();
			case OsmPackage.OSM: return createOSM();
			case OsmPackage.NOTE: return createNote();
			case OsmPackage.META_DATA: return createMetaData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation createGeoLocation() {
		GeoLocationImpl geoLocation = new GeoLocationImpl();
		return geoLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Way createWay() {
		WayImpl way = new WayImpl();
		return way;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeRef createNodeRef() {
		NodeRefImpl nodeRef = new NodeRefImpl();
		return nodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSMElement createOSMElement() {
		OSMElementImpl osmElement = new OSMElementImpl();
		return osmElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds createBounds() {
		BoundsImpl bounds = new BoundsImpl();
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSM createOSM() {
		OSMImpl osm = new OSMImpl();
		return osm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmPackage getOsmPackage() {
		return (OsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsmPackage getPackage() {
		return OsmPackage.eINSTANCE;
	}

} //OsmFactoryImpl
