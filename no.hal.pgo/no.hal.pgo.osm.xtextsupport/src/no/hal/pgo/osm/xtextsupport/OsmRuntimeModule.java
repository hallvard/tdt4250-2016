package no.hal.pgo.osm.xtextsupport;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 * Default Guice bindings for managing Ecore resources in the context of Xtext.
 *  
 * @author Jan Koehnlein - Initial contribution and API
 */
public class OsmRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "no.hal.pgo.osm.presentation.OsmEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "osm";
	}
	
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return OsmResourceDescriptionStrategy.class;
	}
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return OsmQualifiedNameProvider.class;
	}
}
