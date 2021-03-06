package no.hal.pgo.http;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import no.hal.pgo.http.auth.AuthenticationHandler;
import no.hal.pgo.http.auth.AuthenticationHandlerProvider;
import no.hal.pgo.http.util.RequestHelper;

@Component(immediate=true)
public class ResourceEndPointProvider extends RequestHelper implements IResourceEndPointProvider, AuthenticationHandlerProvider {

	private Collection<IResourceProvider> resourceProviders = new ArrayList<IResourceProvider>();

	@Override
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeResourceProvider"
			)
	public synchronized void addResourceProvider(IResourceProvider resourceProvider) {
		if (! resourceProviders.contains(resourceProvider)) {
			resourceProviders.add(resourceProvider);
			registerResourceProvider(resourceProvider);
		}
	}
	@Override
	public synchronized void removeResourceProvider(IResourceProvider resourceProvider) {
		if (resourceProviders.remove(resourceProvider)) {
			unregisterResourceProvider(resourceProvider);
		}
	}
	protected void unregisterResourceProvider(IResourceProvider resourceProvider) {
		unregisterAlias(resourceProvider.getName());
	}

	@Override
	@Reference(
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetRequestPathResolver"
			)	
	public void setRequestPathResolver(IRequestPathResolver requestPathResolver) {
		super.setRequestPathResolver(requestPathResolver);
	}
	public void unsetRequestPathResolver(IRequestPathResolver requestPathResolver) {
		setRequestPathResolver(null);
	}

	@Override
	@Reference(
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetRequestQueryExecutor"
			)	
	public void setRequestQueryExecutor(IRequestQueryExecutor requestQueryExecutor) {
		super.setRequestQueryExecutor(requestQueryExecutor);
	}
	public void unsetRequestQueryExecutor(IRequestQueryExecutor requestQueryExecutor) {
		setRequestQueryExecutor(null);
	}
	
	@Override
	@Reference(
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetResponseSerializer"
			)	
	public void setResponseSerializer(IResponseSerializer responseSerializer) {
		super.setResponseSerializer(responseSerializer);
	}
	public void unsetResponseSerializer(IResponseSerializer responseSerializer) {
		setResponseSerializer(null);
	}
	
	//

	private HttpService httpService;
	
	@Reference(cardinality=ReferenceCardinality.MANDATORY)
	protected void setHttpService(HttpService httpService) {
		for (IResourceProvider resourceProvider : resourceProviders) {
			registerResourceProvider(resourceProvider);
		}
		this.httpService = httpService;
	}
	protected void unsetHttpService(HttpService httpService) {
		this.httpService = null;	
	}
	
	private Collection<AuthenticationHandler<?>> authenticationHandlers = new ArrayList<AuthenticationHandler<?>>();
	
	@Reference(cardinality=ReferenceCardinality.AT_LEAST_ONE, policy=ReferencePolicy.DYNAMIC, unbind="removeAuthenticationHandler")
	public void addAuthenticationHandler(AuthenticationHandler<?> authenticationHandler) {
		authenticationHandlers.add(authenticationHandler);
	}
	public void removeAuthenticationHandler(AuthenticationHandler<?> authenticationHandler) {
		authenticationHandlers.remove(authenticationHandler);
	}

	@Override
	public AuthenticationHandler<?> getAuthenticationHandler(EObject context) {
		for (AuthenticationHandler<?> authenticationHandler : authenticationHandlers) {
			if (authenticationHandler.acceptsContext(context)) {
				return authenticationHandler;
			}
		}
		return null;
	}
	
	protected void registerResourceProvider(IResourceProvider resourceProvider) {
		String alias = resourceProvider.getName();
		try {
			ResourceServlet servlet = new ResourceServlet(resourceProvider);
			servlet.setRequestHelper(this);
			servlet.setAuthenticationHandler(this);
			httpService.registerServlet(alias.startsWith("/") ? alias : "/" + alias, servlet, null, null);
		} catch (ServletException e) {
		} catch (NamespaceException e) {
		}
	}

	protected void unregisterAlias(String alias) {
		try {
			httpService.unregister("/" + alias);
		} catch (Exception e) {
		}
	}
}
