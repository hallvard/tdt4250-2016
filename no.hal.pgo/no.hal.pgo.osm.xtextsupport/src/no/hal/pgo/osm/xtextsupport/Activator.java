package no.hal.pgo.osm.xtextsupport;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "no.hal.pgo.osm.xtextsupport"; //$NON-NLS-1$

	/**
	 * The constructor
	 */
	public Activator() {
	}
	
	private static Activator plugin;
	
	public static Activator getDefault() {
		return plugin;
	}
	
	private Injector injector;
	
	public Injector getInjector() {
		return injector;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		injector = Guice.createInjector(new OsmRuntimeModule());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		injector = null;
		super.stop(context);
	}
}
