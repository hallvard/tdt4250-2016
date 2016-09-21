package no.hal.pgo.http;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class DefaultRequestQueryExecutor implements IRequestQueryExecutor {

	private IReferenceResolver referenceResolver;
	
	public IReferenceResolver getReferenceResolver() {
		return referenceResolver;
	}

	public void setReferenceResolver(IReferenceResolver referenceResolver) {
		this.referenceResolver = referenceResolver;
	}

	@Override
	public Object getRequestQueryResult(EObject target, String op, Map<String, ?> parameters) {
		if (parameters == null || parameters.size() == 0) {
			EStructuralFeature feature = target.eClass().getEStructuralFeature(op);
			if (feature != null) {
				Object value = target.eGet(feature);
				return value;
			}
		} else {
			nextOp: for (EOperation eOp : target.eClass().getEAllOperations()) {
				EList<Object> args = new BasicEList<Object>();
				for (EParameter param : eOp.getEParameters()) {
					if (parameters.containsKey(param.getName())) {
						Object paramValue = parameters.get(param.getName()), arg = null;
						EClassifier type = param.getEType();
						if (type.isInstance(paramValue)) {
							arg = paramValue;
						} else if (type instanceof EDataType) {
							arg = EcoreUtil.convertToString((EDataType) type, String.valueOf(paramValue));
						} else if (getReferenceResolver() != null) {
							arg = getReferenceResolver().resolveReference(String.valueOf(paramValue), target);
						}
						if (arg != null && type.isInstance(arg)) {
							if (param.isMany()) {
								arg = ECollections.singletonEList(arg);
							}
							args.add(arg);
						} else {
							continue nextOp;
						}
					}
				}
				try {
					return target.eInvoke(eOp, args);
				} catch (InvocationTargetException e) {
					throw new IllegalArgumentException("Couldn't invoke " + eOp.getName() + " on " + args);
				}
			}
		}
		return null;
	}
}
