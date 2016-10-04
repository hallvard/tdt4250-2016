package no.hal.pgo.http.util;

import org.eclipse.emf.ecore.EModelElement;
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
		return AnnotationUtil.includeElement(element, annotationKey, false);
	}
}
