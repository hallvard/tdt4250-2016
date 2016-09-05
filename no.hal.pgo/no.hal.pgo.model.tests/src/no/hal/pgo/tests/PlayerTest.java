/**
 */
package no.hal.pgo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pgo.PgoFactory;
import no.hal.pgo.Player;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pgo.Player#getName() <em>Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PlayerTest extends TestCase {

	/**
	 * The fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Player fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerTest.class);
	}

	/**
	 * Constructs a new Player test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Player fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Player getFixture() {
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
		setFixture(PgoFactory.eINSTANCE.createPlayer());
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
	 * Tests the '{@link no.hal.pgo.Player#getName() <em>Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.Player#getName()
	 * @generated
	 */
	public void testGetName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.hal.pgo.Player#setName(java.lang.String) <em>Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.Player#setName(java.lang.String)
	 * @generated
	 */
	public void testSetName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PlayerTest
