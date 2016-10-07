package no.hal.pgo.http.tests;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;

import pgohttpestest.PgohttpestestPackage;
import pgohttpestest.Root;

public class AbstractPgoHttpTest {

	protected ResourceSet resourceSet;
	protected Resource resource;
	protected Root root;
	
	public void setUp() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(PgohttpestestPackage.eINSTANCE.getNsURI(), PgohttpestestPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		URI uri = URI.createURI(getClass().getResource("Root.xmi").toString());
		resource = resourceSet.getResource(uri, true);
		root = (Root) resource.getContents().get(0);
		assertTrue(resource.getErrors().isEmpty());
	}
	
	protected void testN(Collection<?> expected, Object actual) {
		assertTrue(actual instanceof Collection<?>);
		Collection<?> col = (Collection<?>) actual;
		Assert.assertEquals(expected.size(), col.size());
		Assert.assertEquals(expected, col);
	}

	protected void test1(Object expected, Object actual) {
		if (actual instanceof Collection<?>) {
			Collection<?> col = (Collection<?>) actual;
			Assert.assertEquals(1, col.size());
			Object first = col.iterator().next();
			Assert.assertEquals(expected, first);
		} else {
			Assert.assertEquals(expected, actual);			
		}
	}
	
}
