package no.hal.pgo.http.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;

import no.hal.pgo.http.util.DefaultRequestQueryExecutor;
import no.hal.pgo.http.util.NameReferenceResolver;
import pgohttpestest.C;

public class DefaultRequestQueryExecutorTest extends AbstractPgoHttpTest {

	private DefaultRequestQueryExecutor requestQueryExecutor;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		requestQueryExecutor = new DefaultRequestQueryExecutor();
		requestQueryExecutor.addReferenceResolver(new NameReferenceResolver());
	}
	
	protected Object getResult(Collection<?> target, String op) {
		return requestQueryExecutor.getRequestQueryResult(target, op, null);
	}
	
	protected Object getResult(EObject target, String op, Map<String, ?> parameters) {
		return requestQueryExecutor.getRequestQueryResult(Collections.singleton(target), op, parameters);
	}
	
	protected Object getResult(EObject target, String op, String... keyValues) {
		Map<String, String> parameters = new HashMap<>();
		for (int i = 0; i < keyValues.length; i += 2) {
			parameters.put(keyValues[i], keyValues[i + 1]);
		}
		return requestQueryExecutor.getRequestQueryResult(Collections.singleton(target), op, parameters);
	}

	@Test
	public void testCName() {
		test1("c1", getResult(root.getB().getCs().get(0), "name"));
	}

	@Test
	public void testCsName() {
		testN(Arrays.asList("c1", "c2", "d1", "c3"), getResult(root.getB().getCs(), "name"));
	}

	@Test
	public void testCs0() {
		test1(root.getB().getCs().get(0), getResult(root.getB().getCs(), "0"));
	}

	@Test
	public void testNameRef() {
		// /a1 and /b/d1
		test1(root.getAs().get(0), getResult(root, "a1"));
		test1(root.getB().getCs().get(2), getResult(root.getB(), "d1"));
	}
	
	@Test
	public void testRotName1False() {
		test1("d1", getResult(root.getB().getCs().get(0), "rotName", "distance", "1", "update", "false"));
	}

	@Test
	public void testRotName2True() {
		C c = root.getB().getCs().get(0);
		Object result = getResult(c, "rotName", "distance", "2", "update", "true");
		test1("e1", result);
		test1(c.getName(), result);
	}

//	@Test
//	public void testAs1() {
//		// /as/1
//		test1(root.getAs().get(1), getObjects("as", "1"));
//	}
//	
//	@Test
//	public void testAsName() {
//		// /as/name
//		testN(Arrays.asList("a1", "a2", "a3"), getObjects("as", "name"));
//	}
//
//	@Test
//	public void testB() {
//		// /b
//		test1(root.getB(), getObjects("b"));
//	}
//	
//	@Test
//	public void testBCs() {
//		// /b/cs
//		testN(root.getB().getCs(), getObjects("b", "cs"));
//	}
//
//	@Test
//	public void testBLastCName() {
//		// /b/lastC/name
//		test1("c3", getObjects("b", "lastC", "name"));
//	}
//
//	@Test
//	public void testBCsC2() {
//		// /b/cs/name=c2
//		test1(root.getB().getCs().get(1), getObjects("b", "cs", "name=c2"));
//	}
//
//	@Test
//	public void testBCsD() {
//		// /b/cs/D
//		test1(root.getB().getCs().get(2), getObjects("b", "cs", "D"));
//	}
//	
//	@Test
//	public void testAsRel() {
//		test1(root.getAs().get(1), getObjects("as", "value==3"));
//		test1(root.getAs().get(2), getObjects("as", "value>3"));
//		testN(Arrays.asList(root.getAs().get(1), root.getAs().get(2)), getObjects("as", "value>=3"));
//		testN(Arrays.asList(root.getAs().get(1), root.getAs().get(2)), getObjects("as", "value=>3"));
//		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(1)), getObjects("as", "value<=3"));
//		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(1)), getObjects("as", "value=<3"));
//		test1(root.getAs().get(0), getObjects("as", "value<3"));
//		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(2)), getObjects("as", "value<>3"));
//		testN(Arrays.asList(root.getAs().get(0), root.getAs().get(2)), getObjects("as", "value><3"));
//	}
}
