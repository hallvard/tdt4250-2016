/**
 */
package no.hal.pgo.osm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pgo.osm.Bounds;
import no.hal.pgo.osm.OsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundsTest extends TestCase {

	/**
	 * The fixture for this Bounds test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bounds fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoundsTest.class);
	}

	/**
	 * Constructs a new Bounds test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bounds test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Bounds fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bounds test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bounds getFixture() {
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
		setFixture(OsmFactory.eINSTANCE.createBounds());
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

} //BoundsTest
