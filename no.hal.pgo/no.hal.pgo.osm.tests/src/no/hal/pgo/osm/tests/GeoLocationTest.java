/**
 */
package no.hal.pgo.osm.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pgo.osm.GeoLocation;
import no.hal.pgo.osm.OsmFactory;
import no.hal.pgo.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pgo.osm.GeoLocated#getLatLong() <em>Get Lat Long</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GeoLocationTest extends TestCase {

	/**
	 * The fixture for this Geo Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoLocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeoLocationTest.class);
	}

	/**
	 * Constructs a new Geo Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Geo Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GeoLocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Geo Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoLocation getFixture() {
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
		setFixture(OsmFactory.eINSTANCE.createGeoLocation());
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
		GeoLocation location = getFixture();
		location.setLatitude(62);
		location.setLongitude(12);
		assertEquals(new LatLong(62, 12), location.getLatLong());
	}

} //GeoLocationTest
