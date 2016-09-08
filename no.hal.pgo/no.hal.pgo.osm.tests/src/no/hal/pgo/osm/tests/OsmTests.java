/**
 */
package no.hal.pgo.osm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>osm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OsmTests("osm Tests");
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(GeoLocationTest.class);
		suite.addTestSuite(WayTest.class);
		suite.addTestSuite(NodeRefTest.class);
		suite.addTestSuite(TagsTest.class);
		suite.addTestSuite(RelationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmTests(String name) {
		super(name);
	}

} //OsmTests
