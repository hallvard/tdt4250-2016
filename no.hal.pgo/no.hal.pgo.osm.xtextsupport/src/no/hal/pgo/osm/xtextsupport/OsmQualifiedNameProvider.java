package no.hal.pgo.osm.xtextsupport;

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import no.hal.pgo.osm.Tagged;

public class OsmQualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {

	private static Pattern idPattern = Pattern.compile("^?[a-zA-Z_][a-zA-Z_0-9]*");
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject eObject) {
		if (eObject instanceof Tagged) {
			Tagged tagged = (Tagged) eObject;
			String prefix = oneOf(tagged, "building", "amenity", "room_type", "tourism"), name = tagged.getTag("name");
			if (name != null) {
				boolean isId = idPattern.matcher(name).matches();
				if (! isId) {
					// ensure name is a legal OsmName
					name = "\"" + name.replace(".","") + "\"";
				}
				return QualifiedName.create(prefix != null ? prefix : "osm", name);
			}
		}
		return null;
	}

	private String oneOf(Tagged tagged, String... tagNames) {
		for (String tagName : tagNames) {
			if (tagged.hasTag(tagName)) {
				return tagged.getTag(tagName);
			}
		}
		return null;
	}

	//
	
	public static void main(String[] args) {
		System.out.println("S6".matches("^?[a-zA-Z_][a-zA-Z_0-9]*"));
	}
}
