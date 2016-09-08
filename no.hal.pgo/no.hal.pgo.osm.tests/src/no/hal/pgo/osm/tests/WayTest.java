/**
 */
package no.hal.pgo.osm.tests;

import junit.textui.TestRunner;

import no.hal.pgo.osm.OsmFactory;
import no.hal.pgo.osm.Way;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Way</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WayTest extends OSMElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WayTest.class);
	}

	/**
	 * Constructs a new Way test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Way test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Way getFixture() {
		return (Way)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmFactory.eINSTANCE.createWay());
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

} //WayTest
