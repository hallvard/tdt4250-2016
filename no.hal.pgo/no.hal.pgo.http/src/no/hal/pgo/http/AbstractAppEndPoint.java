package no.hal.pgo.http;

import java.io.File;
import java.util.Dictionary;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.http.HttpService;

import no.hal.pgo.http.util.ResourceProvider;

public abstract class AbstractAppEndPoint {

	private HttpService httpService;
	
	public HttpService getHttpService() {
		return httpService;
	}

	protected void setHttpService(HttpService httpService) {
		this.httpService = httpService;
		try {
			if (appEndPoint != null) {
				registerAppEndPoint(appEndPoint);
			}
		} catch (Exception e) {
		}
	}

	protected void unsetHttpService(HttpService httpService) {
		try {
			if (appEndPoint != null) {
				unregisterAppEndPoint(appEndPoint);
			}
		} catch (Exception e) {
		}
		this.httpService = null;
	}

	private IResourceEndPointProvider resourceEndPointProvider;
	
	protected void setResourceEndPointProvider(IResourceEndPointProvider resourceEndPointProvider) {
		this.resourceEndPointProvider = resourceEndPointProvider;
	}
	protected void unsetResourceEndPointProvider(IResourceEndPointProvider resourceEndPointProvider) {
		this.resourceEndPointProvider = null;
	}

	protected static class AppEndPointData {
		public String alias;
		public URI resourceUri;
		public ResourceProvider resourceProvider;
	}

	private AppEndPointData appEndPoint;
	
	protected void activate(ComponentContext context) {
		Dictionary<String, Object> properties = context.getProperties();
		AppEndPointData appEndPoint = new AppEndPointData();
		appEndPoint.alias = String.valueOf(properties.get("alias"));
		appEndPoint.resourceUri = URI.createURI(String.valueOf(properties.get("appUri")));
		registerAppEndPoint(appEndPoint);
	}
	
	protected Resource getResource(AppEndPointData appEndPoint) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource appResource = resourceSet.getResource(appEndPoint.resourceUri, true);
		EcoreUtil.resolveAll(resourceSet);
		for (Resource resource : resourceSet.getResources()) {
			ensureResource(resource, appEndPoint);
			if (resource == appResource) {
				appEndPoint.resourceUri = resource.getURI();
			}
		}
		return appResource;
	}

	protected void ensureResource(Resource resource, AppEndPointData appEndPoint) {
		URI uri = resource.getURI();
		if (isReadOnly(uri) || isReadOnly(resource.getResourceSet().getURIConverter().normalize(uri))) {
			File file = FrameworkUtil.getBundle(this.getClass()).getBundleContext().getDataFile(appEndPoint.alias + "/" + uri.lastSegment());
			resource.setURI(URI.createFileURI(file.getAbsolutePath()));
		}
	}
	
	protected boolean isReadOnly(URI uri) {
		String scheme = uri.scheme();
		return ! "file".equals(scheme);
	}

	protected void deactivate() {
		try {
			if (appEndPoint != null) {
				unregisterAppEndPoint(appEndPoint);
			}
		} catch (Exception e) {
		}
	}

	protected void registerAppEndPoint(AppEndPointData appEndPoint) {
		String alias = appEndPoint.alias.startsWith("/") ? appEndPoint.alias : "/" + appEndPoint.alias;
		Resource resource = getResource(appEndPoint);
		appEndPoint.resourceProvider = new ResourceProvider(resource);
		appEndPoint.resourceProvider.setName(alias.substring(1) + "/data");
		resourceEndPointProvider.addResourceProvider(appEndPoint.resourceProvider);
	}
	
	protected void unregisterAppEndPoint(AppEndPointData appEndPoint) {
		if (appEndPoint.resourceProvider != null) {
			resourceEndPointProvider.removeResourceProvider(appEndPoint.resourceProvider);
		}
	}
}
