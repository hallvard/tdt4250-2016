/**
 */
package pgohttpestest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pgohttpestest.PgohttpestestFactory
 * @model kind="package"
 * @generated
 */
public class PgohttpestestPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "pgohttpestest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "platform:/plugin/no.hal.pgo.http.test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "pgohttpestest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PgohttpestestPackage eINSTANCE = pgohttpestest.PgohttpestestPackage.init();

	/**
	 * The meta object id for the '{@link pgohttpestest.Root <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgohttpestest.Root
	 * @see pgohttpestest.PgohttpestestPackage#getRoot()
	 * @generated
	 */
	public static final int ROOT = 0;

	/**
	 * The feature id for the '<em><b>As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOT__AS = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOT__B = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pgohttpestest.A <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgohttpestest.A
	 * @see pgohttpestest.PgohttpestestPackage#getA()
	 * @generated
	 */
	public static final int A = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int A__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int A__VALUE = 1;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int A_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pgohttpestest.B <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgohttpestest.B
	 * @see pgohttpestest.PgohttpestestPackage#getB()
	 * @generated
	 */
	public static final int B = 2;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int B__CS = 0;

	/**
	 * The feature id for the '<em><b>Priv1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int B__PRIV1 = 1;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int B_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Last C</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int B___LAST_C = 0;

	/**
	 * The operation id for the '<em>Priv2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int B___PRIV2 = 1;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int B_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link pgohttpestest.C <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgohttpestest.C
	 * @see pgohttpestest.PgohttpestestPackage#getC()
	 * @generated
	 */
	public static final int C = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int C__NAME = 0;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int C_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Rot Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int C___ROT_NAME__INT_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int C_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link pgohttpestest.D <em>D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgohttpestest.D
	 * @see pgohttpestest.PgohttpestestPackage#getD()
	 * @generated
	 */
	public static final int D = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int D__NAME = C__NAME;

	/**
	 * The number of structural features of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int D_FEATURE_COUNT = C_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Rot Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int D___ROT_NAME__INT_BOOLEAN = C___ROT_NAME__INT_BOOLEAN;

	/**
	 * The number of operations of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int D_OPERATION_COUNT = C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pgohttpestest.Priv <em>Priv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgohttpestest.Priv
	 * @see pgohttpestest.PgohttpestestPackage#getPriv()
	 * @generated
	 */
	public static final int PRIV = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIV__NAME = 0;

	/**
	 * The number of structural features of the '<em>Priv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIV_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Priv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIV_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pgohttpestest.PgohttpestestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PgohttpestestPackage() {
		super(eNS_URI, PgohttpestestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PgohttpestestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PgohttpestestPackage init() {
		if (isInited) return (PgohttpestestPackage)EPackage.Registry.INSTANCE.getEPackage(PgohttpestestPackage.eNS_URI);

		// Obtain or create and register package
		PgohttpestestPackage thePgohttpestestPackage = (PgohttpestestPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PgohttpestestPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PgohttpestestPackage());

		isInited = true;

		// Create package meta-data objects
		thePgohttpestestPackage.createPackageContents();

		// Initialize created meta-data
		thePgohttpestestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePgohttpestestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PgohttpestestPackage.eNS_URI, thePgohttpestestPackage);
		return thePgohttpestestPackage;
	}


	/**
	 * Returns the meta object for class '{@link pgohttpestest.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see pgohttpestest.Root
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link pgohttpestest.Root#getAs <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>As</em>'.
	 * @see pgohttpestest.Root#getAs()
	 * @see #getRoot()
	 * @generated
	 */
	public EReference getRoot_As() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link pgohttpestest.Root#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see pgohttpestest.Root#getB()
	 * @see #getRoot()
	 * @generated
	 */
	public EReference getRoot_B() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link pgohttpestest.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see pgohttpestest.A
	 * @generated
	 */
	public EClass getA() {
		return aEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link pgohttpestest.A#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pgohttpestest.A#getName()
	 * @see #getA()
	 * @generated
	 */
	public EAttribute getA_Name() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link pgohttpestest.A#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pgohttpestest.A#getValue()
	 * @see #getA()
	 * @generated
	 */
	public EAttribute getA_Value() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link pgohttpestest.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see pgohttpestest.B
	 * @generated
	 */
	public EClass getB() {
		return bEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link pgohttpestest.B#getCs <em>Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cs</em>'.
	 * @see pgohttpestest.B#getCs()
	 * @see #getB()
	 * @generated
	 */
	public EReference getB_Cs() {
		return (EReference)bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link pgohttpestest.B#getPriv1 <em>Priv1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priv1</em>'.
	 * @see pgohttpestest.B#getPriv1()
	 * @see #getB()
	 * @generated
	 */
	public EAttribute getB_Priv1() {
		return (EAttribute)bEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the '{@link pgohttpestest.B#lastC() <em>Last C</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Last C</em>' operation.
	 * @see pgohttpestest.B#lastC()
	 * @generated
	 */
	public EOperation getB__LastC() {
		return bEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link pgohttpestest.B#priv2() <em>Priv2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Priv2</em>' operation.
	 * @see pgohttpestest.B#priv2()
	 * @generated
	 */
	public EOperation getB__Priv2() {
		return bEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for class '{@link pgohttpestest.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C</em>'.
	 * @see pgohttpestest.C
	 * @generated
	 */
	public EClass getC() {
		return cEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link pgohttpestest.C#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pgohttpestest.C#getName()
	 * @see #getC()
	 * @generated
	 */
	public EAttribute getC_Name() {
		return (EAttribute)cEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the '{@link pgohttpestest.C#rotName(int, boolean) <em>Rot Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rot Name</em>' operation.
	 * @see pgohttpestest.C#rotName(int, boolean)
	 * @generated
	 */
	public EOperation getC__RotName__int_boolean() {
		return cEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for class '{@link pgohttpestest.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D</em>'.
	 * @see pgohttpestest.D
	 * @generated
	 */
	public EClass getD() {
		return dEClass;
	}


	/**
	 * Returns the meta object for class '{@link pgohttpestest.Priv <em>Priv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priv</em>'.
	 * @see pgohttpestest.Priv
	 * @generated
	 */
	public EClass getPriv() {
		return privEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link pgohttpestest.Priv#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pgohttpestest.Priv#getName()
	 * @see #getPriv()
	 * @generated
	 */
	public EAttribute getPriv_Name() {
		return (EAttribute)privEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PgohttpestestFactory getPgohttpestestFactory() {
		return (PgohttpestestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__AS);
		createEReference(rootEClass, ROOT__B);

		aEClass = createEClass(A);
		createEAttribute(aEClass, A__NAME);
		createEAttribute(aEClass, A__VALUE);

		bEClass = createEClass(B);
		createEReference(bEClass, B__CS);
		createEAttribute(bEClass, B__PRIV1);
		createEOperation(bEClass, B___LAST_C);
		createEOperation(bEClass, B___PRIV2);

		cEClass = createEClass(C);
		createEAttribute(cEClass, C__NAME);
		createEOperation(cEClass, C___ROT_NAME__INT_BOOLEAN);

		dEClass = createEClass(D);

		privEClass = createEClass(PRIV);
		createEAttribute(privEClass, PRIV__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dEClass.getESuperTypes().add(this.getC());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_As(), this.getA(), null, "as", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_B(), this.getB(), null, "b", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aEClass, pgohttpestest.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Name(), ecorePackage.getEString(), "name", null, 0, 1, pgohttpestest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Value(), ecorePackage.getEInt(), "value", null, 0, 1, pgohttpestest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bEClass, pgohttpestest.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getB_Cs(), this.getC(), null, "cs", null, 0, -1, pgohttpestest.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getB_Cs().getEKeys().add(this.getC_Name());
		initEAttribute(getB_Priv1(), ecorePackage.getEInt(), "priv1", null, 0, 1, pgohttpestest.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getB__LastC(), this.getC(), "lastC", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getB__Priv2(), this.getPriv(), "priv2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cEClass, pgohttpestest.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC_Name(), ecorePackage.getEString(), "name", null, 0, 1, pgohttpestest.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getC__RotName__int_boolean(), ecorePackage.getEString(), "rotName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "distance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dEClass, pgohttpestest.D.class, "D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privEClass, Priv.class, "Priv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriv_Name(), ecorePackage.getEString(), "name", null, 0, 1, Priv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// no.hal.pgo.http.util.RequestSupport
		createNoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>no.hal.pgo.http.util.RequestSupport</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNoAnnotations() {
		String source = "no.hal.pgo.http.util.RequestSupport";	
		addAnnotation
		  (getB_Priv1(), 
		   source, 
		   new String[] {
			 "exclude", "true"
		   });	
		addAnnotation
		  (privEClass, 
		   source, 
		   new String[] {
			 "exclude", "true"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link pgohttpestest.Root <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgohttpestest.Root
		 * @see pgohttpestest.PgohttpestestPackage#getRoot()
		 * @generated
		 */
		public static final EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOT__AS = eINSTANCE.getRoot_As();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOT__B = eINSTANCE.getRoot_B();

		/**
		 * The meta object literal for the '{@link pgohttpestest.A <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgohttpestest.A
		 * @see pgohttpestest.PgohttpestestPackage#getA()
		 * @generated
		 */
		public static final EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute A__NAME = eINSTANCE.getA_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute A__VALUE = eINSTANCE.getA_Value();

		/**
		 * The meta object literal for the '{@link pgohttpestest.B <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgohttpestest.B
		 * @see pgohttpestest.PgohttpestestPackage#getB()
		 * @generated
		 */
		public static final EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Cs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference B__CS = eINSTANCE.getB_Cs();

		/**
		 * The meta object literal for the '<em><b>Priv1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute B__PRIV1 = eINSTANCE.getB_Priv1();

		/**
		 * The meta object literal for the '<em><b>Last C</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation B___LAST_C = eINSTANCE.getB__LastC();

		/**
		 * The meta object literal for the '<em><b>Priv2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation B___PRIV2 = eINSTANCE.getB__Priv2();

		/**
		 * The meta object literal for the '{@link pgohttpestest.C <em>C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgohttpestest.C
		 * @see pgohttpestest.PgohttpestestPackage#getC()
		 * @generated
		 */
		public static final EClass C = eINSTANCE.getC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute C__NAME = eINSTANCE.getC_Name();

		/**
		 * The meta object literal for the '<em><b>Rot Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation C___ROT_NAME__INT_BOOLEAN = eINSTANCE.getC__RotName__int_boolean();

		/**
		 * The meta object literal for the '{@link pgohttpestest.D <em>D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgohttpestest.D
		 * @see pgohttpestest.PgohttpestestPackage#getD()
		 * @generated
		 */
		public static final EClass D = eINSTANCE.getD();

		/**
		 * The meta object literal for the '{@link pgohttpestest.Priv <em>Priv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgohttpestest.Priv
		 * @see pgohttpestest.PgohttpestestPackage#getPriv()
		 * @generated
		 */
		public static final EClass PRIV = eINSTANCE.getPriv();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRIV__NAME = eINSTANCE.getPriv_Name();

	}

} //PgohttpestestPackage
