/**
 */
package no.hal.pgo.osm.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pgo.osm.Node;
import no.hal.pgo.osm.NodeRef;
import no.hal.pgo.osm.OsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pgo.osm.GeoLocated#getLatLong() <em>Get Lat Long</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NodeRefTest extends TestCase {

	/**
	 * The fixture for this Node Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeRefTest.class);
	}

	/**
	 * Constructs a new Node Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Node Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NodeRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Node Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeRef getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmFactory.eINSTANCE.createNodeRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link no.hal.pgo.osm.GeoLocated#getLatLong() <em>Get Lat Long</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.GeoLocated#getLatLong()
	 * @generated NOT
	 */
	public void testGetLatLong() {
		Node node = OsmFactory.eINSTANCE.createNode();
		node.setLatitude(62);
		node.setLongitude(12);
		NodeRef nodeRef = getFixture();
		nodeRef.setRef(node);
		assertEquals(node.getLatLong(), nodeRef.getLatLong());
	}

} //NodeRefTest
