package no.hal.pgo.osm.xtextsupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class OsmResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		QualifiedName qName = qualifiedNameProvider.getFullyQualifiedName(eObject);
		if (qName != null) {
			IEObjectDescription description = EObjectDescription.create(qName, eObject, null);
			acceptor.accept(description);
			return false;
		}
		return true;
	}
}
