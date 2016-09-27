package no.hal.pgo.http.tests;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import no.hal.pgo.http.util.DefaultRequestPathResolver;
import no.hal.pgo.http.util.NameReferenceResolver;

public class DefaultRequestPathResolverTest extends AbstractPgoHttpTest {

	private DefaultRequestPathResolver requestPathResolver;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		requestPathResolver = new DefaultRequestPathResolver();
		requestPathResolver.addReferenceResolver(new NameReferenceResolver());
	}
	
	protected Object getObjects(String... segments) {
		return requestPathResolver.getObjectForPath(resource, segments);
	}

	@Test
	public void testAs() {
		// /as
		testN(root.getAs(), getObjects("as"));
	}

	@Test
	public void testAs1() {
		// /as/1
		test1(root.getAs().get(1), getObjects("as", "1"));
	}
	
	@Test
	public void testNameRef() {
		// /a1 and /b/d1
		test1(root.getAs().get(0), getObjects("a1"));
		test1(root.getB().getCs().get(2), getObjects("b", "d1"));
	}
	
	@Test
	public void testAsName() {
		// /as/name
		testN(Arrays.asList("a1", "a2", "a3"), getObjects("as", "name"));
	}

	@Test
	public void testB() {
		// /b
		test1(root.getB(), getObjects("b"));
	}
	
	@Test
	public void testBCs() {
		// /b/cs
		testN(root.getB().getCs(), getObjects("b", "cs"));
	}

	@Test
	public void testBLastCName() {
		// /b/lastC/name
		test1("c3", getObjects("b", "lastC", "name"));
	}

	@Test
	public void testBCsC2() {
		// /b/cs/name=c2
		test1(root.getB().getCs().get(1), getObjects("b", "cs", "name=c2"));
	}

	@Test
	public void testBCsD() {
		// /b/cs/D
		test1(root.getB().getCs().get(2), getObjects("b", "cs", "D"));
	}
	
	@Test
	public void testAsRel() {
		test1(root.getAs().get(1), getObjects("as", "value==3"));
		test1(root.getAs().get(2), getObjects("as", "value>3"));
		testN(Arrays.asList(root.getAs().get(1), root.getAs().get(2)), getObjects("as", "value>=3"));
		testN(Arrays.asList(root.getAs().get(1), root.getAs().get(2)), getObjects("as", "value=>3"));
		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(1)), getObjects("as", "value<=3"));
		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(1)), getObjects("as", "value=<3"));
		test1(root.getAs().get(0), getObjects("as", "value<3"));
		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(2)), getObjects("as", "value<>3"));
		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(2)), getObjects("as", "value><3"));
	}
}
