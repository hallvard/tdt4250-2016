package no.hal.pgo.osm.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import no.hal.pgo.osm.OsmPackage;

public class OsmResourceImplTest {

	OsmResourceFactoryImpl resourceFactory;
	ResourceSet resSet;

	@Before
	public void configureOsm() {
		resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(OsmPackage.eNS_URI, OsmPackage.eINSTANCE);
		resourceFactory = new OsmResourceFactoryImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("osm", resourceFactory);
	}
	
	private Resource load(String resourceName, boolean throwException) throws IOException {
		Resource resource = resSet.createResource(URI.createURI(resourceName));
		Map<?, ? > loadOptions = new HashMap<String, Object>();
		try {
			resource.load(getClass().getResourceAsStream(resourceName), loadOptions);
		} catch (IOException e) {
			System.err.println(e);
			if (throwException) {
				throw e;
			};
		}
		return resource;
	}
	
	@Test
	public void testLoad() {
		try {
			Resource resource = load("gloshaugen-cleaned.osm", true);
			Assert.assertTrue(resource.getErrors().isEmpty());
			Assert.assertFalse(resource.getContents().isEmpty());
		} catch (IOException e) {
			System.err.println(e);
			Assert.fail();
		}
	}

	//

	private static int countObjects(Iterator<EObject> objects) {
		int count = 0;
		while (objects.hasNext()) {
			objects.next();
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		OsmResourceImplTest test = new OsmResourceImplTest();
		test.configureOsm();
		OsmResourceImpl resource = null;
		try {
			resource = (OsmResourceImpl) test.load("gloshaugen-cleaned.osm", false);
			System.out.println(countObjects(resource.getAllContents()) + " objects loaded");
			resource.removeUnresolvedOSMReferences();
			System.out.println(countObjects(resource.getAllContents()) + " objects after purge");
//			URI outputUri = resource.getURI().trimSegments(1).appendSegment("gloshaugen-cleaned.osm");
//			System.out.println("Saving to " + outputUri);
//			resource.save(test.resSet.getURIConverter().createOutputStream(outputUri, null), null);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
