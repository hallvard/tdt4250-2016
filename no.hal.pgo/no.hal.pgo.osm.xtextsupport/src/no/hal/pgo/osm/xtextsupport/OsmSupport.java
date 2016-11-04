package no.hal.pgo.osm.xtextsupport;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import no.hal.pgo.osm.OsmPackage;
import no.hal.pgo.osm.util.OsmResourceFactoryImpl;

public class OsmSupport extends AbstractGenericResourceSupport implements ISetup {

	@Override
	protected Module createGuiceModule() {
		return new OsmRuntimeModule();
	}

	/**
	 * @since 2.5
	 */
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		Injector injector = Guice.createInjector(getGuiceModule());
		injector.injectMembers(this);

		if (! EPackage.Registry.INSTANCE.containsKey(OsmPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(OsmPackage.eNS_URI, OsmPackage.eINSTANCE);
		}
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("osm")) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("osm", new OsmResourceFactoryImpl());
		}
		
		registerInRegistry(false);
		return injector;
	}

	public static void setup() {
		new OsmSupport().registerServices(false);
	}
}
