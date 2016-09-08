/**
 */
package no.hal.pgo.osm.tests;

import junit.textui.TestRunner;
import no.hal.pgo.osm.Node;
import no.hal.pgo.osm.OsmFactory;
import no.hal.pgo.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pgo.osm.GeoLocated#getLatLong() <em>Get Lat Long</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NodeTest extends OSMElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeTest.class);
	}

	/**
	 * Constructs a new Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Node getFixture() {
		return (Node)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmFactory.eINSTANCE.createNode());
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
		Node node = getFixture();
		node.setLatitude(62);
		node.setLongitude(12);
		assertEquals(new LatLong(62, 12), node.getLatLong());
	}

} //NodeTest
