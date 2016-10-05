package no.hal.pgo.http.util;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class AnnotationUtil {

	public static boolean includeElement(EModelElement element, String annotationKey, boolean defaultInclude) {
		String include = EcoreUtil.getAnnotation(element, annotationKey, "include"), exclude = EcoreUtil.getAnnotation(element, annotationKey, "exclude");
		return (exclude != null && Boolean.valueOf(exclude) != defaultInclude) || (include != null && Boolean.valueOf(include) == defaultInclude);
	}
	
	public static boolean excludeElement(EModelElement element, String annotationKey) {
		return AnnotationUtil.includeElement(element, annotationKey, false);
	}

	public static boolean includeElement(EModelElement element, String annotationKey) {
		return AnnotationUtil.includeElement(element, annotationKey, true);
	}
	
	public static <T extends ETypedElement> boolean includeTypedElement(T element, String annotationKey) {
		// if explicit exclude of element, return null
		if (AnnotationUtil.excludeElement(element, annotationKey)) {
			return false;
		}
		// if explicit exclude of type, return null
		EClassifier type = element.getEType();
		if (type != null) {
			if (AnnotationUtil.excludeElement(type, annotationKey)) {
				return false;
			}
			// if explicit exclude of package, and not explicit include of type, return null 
			EPackage ePackage = type.getEPackage();
			if (AnnotationUtil.excludeElement(ePackage, annotationKey) && (! AnnotationUtil.includeElement(type, annotationKey))) {
				return false;
			}
		}
		return true;
	}
}
