package no.hal.pgo.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EOperationEClassManager {

	private EPackage operationArgumentsPackage;
	
	private EPackage getEOperationEPackage() {
		if (operationArgumentsPackage == null) {
			operationArgumentsPackage = EcoreFactory.eINSTANCE.createEPackage();
			operationArgumentsPackage.setEFactoryInstance(EcoreFactory.eINSTANCE.createEFactory());
		}
		return operationArgumentsPackage;
	}

	private static String objectReferenceName = "_objectRef";
	private static String eOperationReferenceName = "_eOperationRef";
	private static String argumentsReferenceName = "_argumentsRef";

	public EObject getEOperationObject(EOperation operation, EObject eObject) {
		EClass argumentsClass = getEOperationArgumentsEClass(operation);
		EClass operationClass = getEOperationEClass(operation, argumentsClass);
		EObject operationObject = EcoreUtil.create(operationClass);
		setEOperationObjectEObject(operationObject, eObject);
		operationObject.eSet(operationClass.getEStructuralFeature(eOperationReferenceName), operation);
		operationObject.eSet(operationClass.getEStructuralFeature(argumentsReferenceName), EcoreUtil.create(argumentsClass));
		return operationObject;
	}
	
	public static boolean isEOperationObject(EObject operationObject) {
		EClass operationClass = operationObject.eClass();
		return operationClass.getEStructuralFeature(objectReferenceName) != null &&
				operationClass.getEStructuralFeature(eOperationReferenceName) != null &&
				operationClass.getEStructuralFeature(argumentsReferenceName) != null;
	}

	public static EObject getEOperationObjectEObject(EObject operationObject) {
		return (EObject) operationObject.eGet(operationObject.eClass().getEStructuralFeature(objectReferenceName));		
	}
	public static EOperation getEOperationObjectEOperation(EObject operationObject) {
		return (EOperation) operationObject.eGet(operationObject.eClass().getEStructuralFeature(eOperationReferenceName));
	}
	public static void setEOperationObjectEObject(EObject operationObject, EObject eObject) {
		operationObject.eSet(operationObject.eClass().getEStructuralFeature(objectReferenceName), eObject);		
	}

	public static EObject getEOperationObjectArguments(EObject operationObject) {
		return (EObject) operationObject.eGet(operationObject.eClass().getEStructuralFeature(argumentsReferenceName));		
	}
	
	private EClass getEOperationEClass(EOperation operation, EClass argumentsClass) {
		EPackage ePackage = getEOperationEPackage();
		String eClassName = operation.getName() + "_operation";
		EClass eClass = (EClass) ePackage.getEClassifier(eClassName);
		if (eClass == null) {
			eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(eClassName);
			createEObjectEReference(eClass, operation.getEContainingClass(), objectReferenceName, false);
			createEObjectEReference(eClass, operation.eClass(), eOperationReferenceName, false);
			createEObjectEReference(eClass, argumentsClass, argumentsReferenceName, true);
			ePackage.getEClassifiers().add(eClass);
		}
		return eClass;
	}

	public EClass getEOperationArgumentsEClass(EOperation operation) {
		EPackage ePackage = getEOperationEPackage();
		String eClassName = operation.getName() + "_arguments";
		EClass eClass = (EClass) ePackage.getEClassifier(eClassName);
		if (eClass == null) {
			eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(eClassName);
			for (EParameter param : operation.getEParameters()) {
				EStructuralFeature property = createEStructuralFeature(param);
				eClass.getEStructuralFeatures().add(property);
			}
			ePackage.getEClassifiers().add(eClass);
		}
		return eClass;
	}

	protected EStructuralFeature createEStructuralFeature(EParameter param) {
		EClassifier type = param.getEType();
		EStructuralFeature property = (type instanceof EClass ? EcoreFactory.eINSTANCE.createEReference() : EcoreFactory.eINSTANCE.createEAttribute());
		property.setName(param.getName());
		property.setEType(type);
		property.setLowerBound(param.getLowerBound());
		property.setUpperBound(param.getUpperBound());
		return property;
	}

	private EReference createEObjectEReference(EClass owner, EClass type, String name, boolean containment) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(name);
		ref.setEType(type);
		owner.getEStructuralFeatures().add(ref);
		ref.setContainment(containment);
		return ref;
	}
}
