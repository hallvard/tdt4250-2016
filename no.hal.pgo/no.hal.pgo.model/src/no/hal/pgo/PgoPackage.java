/**
 */
package no.hal.pgo;

import no.hal.pgo.osm.OsmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see no.hal.pgo.PgoFactory
 * @model kind="package"
 * @generated
 */
public interface PgoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pgo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pgo.model/model/pgo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PgoPackage eINSTANCE = no.hal.pgo.impl.PgoPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pgo.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.impl.PersonImpl
	 * @see no.hal.pgo.impl.PgoPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.impl.PlayerImpl
	 * @see no.hal.pgo.impl.PgoPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LATITUDE = OsmPackage.GEO_LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LONGITUDE = OsmPackage.GEO_LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PERSON = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NICKNAME = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__XP = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__INVENTORY = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___GET_LAT_LONG = OsmPackage.GEO_LOCATION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.impl.ItemImpl
	 * @see no.hal.pgo.impl.PgoPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.impl.PGameImpl <em>PGame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.impl.PGameImpl
	 * @see no.hal.pgo.impl.PgoPackageImpl#getPGame()
	 * @generated
	 */
	int PGAME = 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAME__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAME__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>PGame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PGame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pgo.impl.UoDImpl <em>Uo D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.impl.UoDImpl
	 * @see no.hal.pgo.impl.PgoPackageImpl#getUoD()
	 * @generated
	 */
	int UO_D = 4;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__GAMES = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pgo.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see no.hal.pgo.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.pgo.Person#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see no.hal.pgo.Person#getIds()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Ids();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pgo.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.hal.pgo.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pgo.Player#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see no.hal.pgo.Player#getPerson()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Person();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.Player#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see no.hal.pgo.Player#getNickname()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pgo.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pgo.Player#getXp <em>Xp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xp</em>'.
	 * @see no.hal.pgo.Player#getXp()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Xp();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pgo.Player#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory</em>'.
	 * @see no.hal.pgo.Player#getInventory()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Inventory();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see no.hal.pgo.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pgo.Item#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see no.hal.pgo.Item#getLocation()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Location();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pgo.Item#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see no.hal.pgo.Item#getOwner()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Owner();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.PGame <em>PGame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PGame</em>'.
	 * @see no.hal.pgo.PGame
	 * @generated
	 */
	EClass getPGame();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.PGame#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.hal.pgo.PGame#getPlayers()
	 * @see #getPGame()
	 * @generated
	 */
	EReference getPGame_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.PGame#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see no.hal.pgo.PGame#getItems()
	 * @see #getPGame()
	 * @generated
	 */
	EReference getPGame_Items();

	/**
	 * Returns the meta object for class '{@link no.hal.pgo.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo D</em>'.
	 * @see no.hal.pgo.UoD
	 * @generated
	 */
	EClass getUoD();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.UoD#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see no.hal.pgo.UoD#getGames()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_Games();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pgo.UoD#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see no.hal.pgo.UoD#getPersons()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_Persons();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PgoFactory getPgoFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pgo.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.impl.PersonImpl
		 * @see no.hal.pgo.impl.PgoPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IDS = eINSTANCE.getPerson_Ids();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.impl.PlayerImpl
		 * @see no.hal.pgo.impl.PgoPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PERSON = eINSTANCE.getPlayer_Person();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NICKNAME = eINSTANCE.getPlayer_Nickname();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Xp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__XP = eINSTANCE.getPlayer_Xp();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__INVENTORY = eINSTANCE.getPlayer_Inventory();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.impl.ItemImpl
		 * @see no.hal.pgo.impl.PgoPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__LOCATION = eINSTANCE.getItem_Location();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__OWNER = eINSTANCE.getItem_Owner();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.impl.PGameImpl <em>PGame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.impl.PGameImpl
		 * @see no.hal.pgo.impl.PgoPackageImpl#getPGame()
		 * @generated
		 */
		EClass PGAME = eINSTANCE.getPGame();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PGAME__PLAYERS = eINSTANCE.getPGame_Players();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PGAME__ITEMS = eINSTANCE.getPGame_Items();

		/**
		 * The meta object literal for the '{@link no.hal.pgo.impl.UoDImpl <em>Uo D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pgo.impl.UoDImpl
		 * @see no.hal.pgo.impl.PgoPackageImpl#getUoD()
		 * @generated
		 */
		EClass UO_D = eINSTANCE.getUoD();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__GAMES = eINSTANCE.getUoD_Games();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__PERSONS = eINSTANCE.getUoD_Persons();

	}

} //PgoPackage
