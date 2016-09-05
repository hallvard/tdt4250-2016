/**
 */
package no.hal.pgo.osm.tests;

import junit.textui.TestRunner;

import no.hal.pgo.osm.OSMElement;
import no.hal.pgo.osm.OsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSM Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSMElementTest extends TagsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSMElementTest.class);
	}

	/**
	 * Constructs a new OSM Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSMElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OSM Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSMElement getFixture() {
		return (OSMElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmFactory.eINSTANCE.createOSMElement());
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

} //OSMElementTest
