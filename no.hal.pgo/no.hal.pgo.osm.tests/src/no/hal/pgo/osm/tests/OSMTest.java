/**
 */
package no.hal.pgo.osm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pgo.osm.OSM;
import no.hal.pgo.osm.OsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSMTest extends TestCase {

	/**
	 * The fixture for this OSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSMTest.class);
	}

	/**
	 * Constructs a new OSM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSMTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this OSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OSM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this OSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSM getFixture() {
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
		setFixture(OsmFactory.eINSTANCE.createOSM());
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

} //OSMTest
