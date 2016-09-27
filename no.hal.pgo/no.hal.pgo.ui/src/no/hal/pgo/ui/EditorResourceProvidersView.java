package no.hal.pgo.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import no.hal.pgo.http.IResourceEndPointProvider;
import no.hal.pgo.http.util.ResourceProvider;

public class EditorResourceProvidersView extends AbstractSelectionView {

	private Map<IEditingDomainProvider, String> resources = new HashMap<>();
	private Map<String, ResourceProvider> resourceProviders = new HashMap<>();

	protected Resource getResource(IEditingDomainProvider element) {
		return element.getEditingDomain().getResourceSet().getResources().get(0);
	}

	private CheckboxTreeViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		this.viewer = new CheckboxTreeViewer(parent);
		this.viewer.getTree().setHeaderVisible(true);
		this.viewer.setContentProvider(new ITreeContentProvider() {
			@Override
			public Object[] getElements(Object inputElement) {
				return ((Map<IEditingDomainProvider, ?>) inputElement).keySet().toArray();
			}
			@Override
			public boolean hasChildren(Object element) {
				return false;
			}
			@Override
			public Object getParent(Object element) {
				return null;
			}
			@Override
			public Object[] getChildren(Object parentElement) {
				return null;
			}
		});
		TreeViewerColumn nameColumn = new TreeViewerColumn(viewer, SWT.NONE);
		nameColumn.getColumn().setText("Name (alias)");
		nameColumn.getColumn().setWidth(100);
		nameColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) cell.getElement();
				cell.setText(resources.get(editingDomainProvider));
			}
		});
		TreeViewerColumn uriColumn = new TreeViewerColumn(viewer, SWT.NONE);
		uriColumn.getColumn().setText("URI");
		uriColumn.getColumn().setWidth(500);
		uriColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) cell.getElement();
				cell.setText(getResource(editingDomainProvider).getURI().toString());
			}
		});
		this.viewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}
			@Override
			public boolean isChecked(Object element) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) element;
				return hasResourceProvider(editingDomainProvider);
			}
		});
		this.viewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					addResourceProvider((IEditingDomainProvider) event.getElement());
				} else {
					removeResourceProvider((IEditingDomainProvider) event.getElement());					
				}
			}
		});
		IEditorPart editor = getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof IEditingDomainProvider) {
			addResource((IEditingDomainProvider) editor);
		}
		this.viewer.setInput(resources);
	}
	
	@Override
	protected void updateView() {
		viewer.refresh();
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		super.partActivated(part);
		if (part instanceof IEditingDomainProvider) {
			addResource((IEditingDomainProvider) part);
		}
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		super.partActivated(part);
		if (part instanceof IEditingDomainProvider) {
			removeResource((IEditingDomainProvider) part);
		}
	}

	protected void addResource(IEditingDomainProvider editingDomainProvider) {
		Resource resource = getResource(editingDomainProvider);
		if (resource != null) {
			resources.put(editingDomainProvider, resource.getURI().lastSegment());
		}
	}

	protected void removeResource(IEditingDomainProvider editingDomainProvider) {
		Resource resource = getResource(editingDomainProvider);
		if (resource != null) {
			if (hasResourceProvider(editingDomainProvider)) {
				removeResourceProvider(editingDomainProvider);
			}
			resources.remove(editingDomainProvider);
		}
		updateView();
	}
	
	protected boolean hasResourceProvider(IEditingDomainProvider editingDomainProvider) {
		return resourceProviders.containsKey(resources.get(editingDomainProvider));
	}

	private IResourceEndPointProvider getResourceEndPointProvider() {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		ServiceReference<IResourceEndPointProvider> serviceReference = bundleContext.getServiceReference(IResourceEndPointProvider.class);
		return (serviceReference != null ? bundleContext.getService(serviceReference) : null);
	}

	protected void addResourceProvider(IEditingDomainProvider editingDomainProvider) {
		Resource resource = getResource(editingDomainProvider);
		IResourceEndPointProvider endPointProvider = getResourceEndPointProvider();
		if (endPointProvider != null && resource != null) {
			ResourceProvider resourceProvider = new ResourceProvider(resource);
			endPointProvider.addResourceProvider(resourceProvider);
			String key = resources.get(editingDomainProvider);
			resourceProviders.put(key, resourceProvider);
		}
		updateView();
	}

	protected void removeResourceProvider(IEditingDomainProvider editingDomainProvider) {
		IResourceEndPointProvider endPointProvider = getResourceEndPointProvider();
		if (endPointProvider != null) {
			String key = resources.get(editingDomainProvider);
			endPointProvider.removeResourceProvider(resourceProviders.get(key));
			resourceProviders.remove(key);
		}
		updateView();
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
