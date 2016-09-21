package no.hal.pgo.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class EOperationView extends AbstractSelectionView {

	@Override
	protected boolean isValidSelection(Object o) {
		return o instanceof EObject;
	}

	protected EObject getSelectedEObject() {
		return (EObject) getSelection();
	}

	protected String noEOperationsAvailableItem = "<No EOperations available>";

	protected String toString(EOperation operation) {
		String item = operation.getName() + "(";
		for (EParameter param : operation.getEParameters()) {
			if (param != operation.getEParameters().get(0)) {
				item += ",";
			}
			EClassifier type = param.getEType();
			item += type.getName() + (param.isMany() ? '*' : 0) + " " + param.getName(); 
		}
		item += ")";
		return item;
	}

	@Override
	protected void updateView() {
		EObject selection = getSelectedEObject();
		EClass eClass = (selection != null ? selection.eClass() : null);
		// don't re-populate and reset selection, when the EClass is the same
		if (eClass != operationsCombo.getData()) {
			EList<EOperation> operations = (eClass != null ? eClass.getEAllOperations() : new BasicEList<>());
			String[] items = new String[operations.size()];
			for (int i = 0; i < items.length; i++) {
				items[i] = toString(operations.get(i));
			}
			operationsCombo.setItems(items);
			if (items.length > 0) {
				operationsCombo.select(0);
			} else {
				operationsCombo.setText(noEOperationsAvailableItem);
			}
			operationsCombo.setData(eClass);
		}
		eOperationSelected();
	}

	protected void eOperationSelected() {
		eOperationSelected(getSelectedEOperation());
	}

	protected EOperation getSelectedEOperation() {
		EClass eClass = (EClass) operationsCombo.getData();
		EOperation operation = null;
		int selectionIndex = operationsCombo.getSelectionIndex();
		if (eClass != null && selectionIndex >= 0) {
			EList<EOperation> operations = eClass.getEAllOperations();
			if (selectionIndex < operations.size()) {
				operation = operations.get(selectionIndex);
			}
		}
		return operation;
	}
	
	private Combo operationsCombo;
	private Button invokeButton;

	protected Control getOperationSelectionControl() {
		return operationsCombo;
	}

	private PropertySheetPage propertySheetPage;
	
	private Text resultText;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		parent.setLayout(new GridLayout(2, false));

		Label eOperationsLabel = new Label(parent, SWT.NONE);
		eOperationsLabel.setText("Operations");
		eOperationsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		operationsCombo = new Combo(parent, SWT.READ_ONLY | SWT.DROP_DOWN);
		operationsCombo.setText(noEOperationsAvailableItem);
		operationsCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				eOperationSelected();
			}
		});
		operationsCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		propertySheetPage = new PropertySheetPage();
		propertySheetPage.createControl(parent);
		propertySheetPage.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		invokeButton = new Button(parent, SWT.PUSH);
		invokeButton.setText("Invoke!");
		invokeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		invokeButton.addSelectionListener(invokeButtonSelected);
		
		resultText = new Text(parent, SWT.MULTI | SWT.WRAP);
		resultText.setEditable(false);
		resultText.setText("\n\n\n");
		resultText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));		
	}

	private EOperationEClassManager eOperationEClassManager = new EOperationEClassManager();
	private Map<EOperation, EObject> eOperationObjects = new HashMap<>();

	protected void eOperationSelected(EOperation operation) {
		EObject eObject = getSelectedEObject();
		EObject eOperationObject = null;
		if (operation != null) {
			eOperationObject = eOperationObjects.get(operation);
			if (eOperationObject == null) {
				eOperationObject = eOperationEClassManager.getEOperationObject(operation, eObject);
				eOperationObjects.put(operation, eOperationObject);
			} else {
				EOperationEClassManager.setEOperationObjectEObject(eOperationObject, eObject);
			}
		}
		invokeButton.setEnabled(eOperationObject != null);
		updatePropertySheet(eOperationObject != null ? EOperationEClassManager.getEOperationObjectArguments(eOperationObject) : null);
	}

	protected void updatePropertySheet(EObject eObject) {
		if (editingDomainProvider != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) editingDomainProvider.getEditingDomain();
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(editingDomain.getAdapterFactory()));
		}
		StructuredSelection selection = (eObject != null && editingDomainProvider != null ? new StructuredSelection(eObject) : StructuredSelection.EMPTY);
		propertySheetPage.selectionChanged(null, selection);
	}

	private SelectionListener invokeButtonSelected = new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			EObject eOperationObject = eOperationObjects.get(getSelectedEOperation());
			if (EOperationEClassManager.isEOperationObject(eOperationObject)) {
				EOperationInvocation operationInvocation = new EOperationInvocation(eOperationObject);
				operationInvocation.execute(editingDomainProvider, null) ; // ((Control) e.widget).getShell());
				resultText.setText(String.valueOf(operationInvocation.getInvocationResult()));
				resultText.getParent().layout();
			}
		}
	};

	@Override
	public void setFocus() {
		operationsCombo.setFocus();
	}
}