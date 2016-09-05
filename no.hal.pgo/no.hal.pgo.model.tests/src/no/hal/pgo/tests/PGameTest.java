/**
 */
package no.hal.pgo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pgo.PGame;
import no.hal.pgo.PgoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PGame</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PGameTest extends TestCase {

	/**
	 * The fixture for this PGame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PGame fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PGameTest.class);
	}

	/**
	 * Constructs a new PGame test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PGame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PGame fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PGame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PGame getFixture() {
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
		setFixture(PgoFactory.eINSTANCE.createPGame());
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

} //PGameTest
