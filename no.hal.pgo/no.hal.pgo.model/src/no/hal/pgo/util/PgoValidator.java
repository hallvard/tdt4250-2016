/**
 */
package no.hal.pgo.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import no.hal.pgo.Item;
import no.hal.pgo.PGame;
import no.hal.pgo.Person;
import no.hal.pgo.PgoPackage;
import no.hal.pgo.Player;
import no.hal.pgo.UoD;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.pgo.PgoPackage
 * @generated
 */
public class PgoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PgoValidator INSTANCE = new PgoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.pgo";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PgoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PgoPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case PgoPackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case PgoPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case PgoPackage.PGAME:
				return validatePGame((PGame)value, diagnostics, context);
			case PgoPackage.UO_D:
				return validateUoD((UoD)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePGame(PGame pGame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pGame, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pGame, diagnostics, context);
		if (result || diagnostics != null) result &= validatePGame_UniquePlayerNames(pGame, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniquePlayerNames constraint of '<em>PGame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePGame_UniquePlayerNames(PGame pGame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Collection<String> allNames = new ArrayList<>();
		for (Player player : pGame.getPlayers()) {
			String name = player.getName();
			if (name != null) {
				if (allNames.contains(name)) {
					if (diagnostics != null) {
						diagnostics.add
						(createDiagnostic
								(Diagnostic.WARNING,
										DIAGNOSTIC_SOURCE,
										0,
										"_UI_GenericConstraint_diagnostic",
										new Object[] { "UniquePlayerNames", getObjectLabel(pGame, context) },
										new Object[] { pGame },
										context));
					}
					return false;
				}
				allNames.add(name);
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUoD(UoD uoD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(uoD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(uoD, diagnostics, context);
		if (result || diagnostics != null) result &= validateUoD_UniquePersonIds(uoD, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniquePersonIds constraint of '<em>Uo D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUoD_UniquePersonIds(UoD uoD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Collection<String> allIds = new ArrayList<>();
		for (Person person : uoD.getPersons()) {
			for (String id : person.getIds()) {
				if (allIds.contains(id)) {
					if (diagnostics != null) {
						diagnostics.add
						(createDiagnostic
								(Diagnostic.ERROR,
										DIAGNOSTIC_SOURCE,
										0,
										"_UI_GenericConstraint_diagnostic",
										new Object[] { "UniquePersonIds", getObjectLabel(uoD, context) },
										new Object[] { uoD },
										context));
					}
					return false;					
				}
				allIds.add(id);
			}
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PgoValidator
