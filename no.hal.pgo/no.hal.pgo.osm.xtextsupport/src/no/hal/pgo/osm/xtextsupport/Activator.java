package no.hal.pgo.osm.xtextsupport;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

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
	
	public Bundle getBundle() {
		return FrameworkUtil.getBundle(this.getClass());
	}
	
	public Injector getInjector() {
		return injector;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
		injector = Guice.createInjector(new OsmRuntimeModule());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		injector = null;
	}
}
