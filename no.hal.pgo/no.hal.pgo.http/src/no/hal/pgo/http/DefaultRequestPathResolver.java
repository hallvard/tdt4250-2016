package no.hal.pgo.http;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class DefaultRequestPathResolver implements IRequestPathResolver {

	private String pathPrefix = null;
	
	public String getPathPrefix() {
		return pathPrefix;
	}

	public void setPathPrefix(String pathPrefix) {
		this.pathPrefix = pathPrefix;
	}

	@Override
	public EObject getEObjectForPath(Resource resource, String... segments) {
		StringBuilder builder = new StringBuilder();
		if (getPathPrefix() != null) {
			builder.append(getPathPrefix());
		}
		if (builder.length() == 0 || builder.charAt(0) != '/') {
			builder.insert(0, '/');
		}
		for (int i = 0; i < segments.length; i++) {
			String segment = segments[i];
			if (segment.length() >= 1 && Character.isLowerCase(segment.charAt(0))) {
				segment = '@' + segment;
			}
			String numString = null;
			try {
				Integer.valueOf(segment);
				numString = segment;
			} catch (NumberFormatException e) {
			}
			if (numString != null) {
				builder.append(".");
				builder.append(numString);
			} else {
				if (builder.charAt(builder.length() - 1) != '/') {
					builder.append("/");
				}
				builder.append(segment);
			}
		}
		return resource.getEObject(builder.toString());
	}
}
