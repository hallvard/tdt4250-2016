package no.hal.pgo.http.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;

import no.hal.pgo.http.util.NameReferenceResolver;
import no.hal.pgo.http.util.RequestHandler;
import pgohttpestest.C;

public class RequestHandlerTest extends AbstractPgoHttpTest {

	private RequestHandler requestHandler;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		requestHandler = new RequestHandler();
		requestHandler.addReferenceResolver(new NameReferenceResolver());
	}

	protected Object getObjects(String... segments) {
		return requestHandler.getObjectForPath(resource.getContents(), segments);
	}

	@Test
	public void testAsPath() {
		// /as
		testN(root.getAs(), getObjects("as"));
	}

	@Test
	public void testAs1Path() {
		// /as/1
		test1(root.getAs().get(1), getObjects("as", "1"));
	}
	
	@Test
	public void testNameRefPath() {
		// /a1 and /b/d1
		test1(root.getAs().get(0), getObjects("a1"));
		test1(root.getB().getCs().get(2), getObjects("b", "d1"));
	}
	
	@Test
	public void testAsNamePath() {
		// /as/name
		testN(Arrays.asList("a1", "a2", "a3"), getObjects("as", "name"));
	}

	@Test
	public void testBPath() {
		// /b
		test1(root.getB(), getObjects("b"));
	}
	
	@Test
	public void testBCsPath() {
		// /b/cs
		testN(root.getB().getCs(), getObjects("b", "cs"));
	}

	@Test
	public void testBLastCNamePath() {
		// /b/lastC/name
		test1("c3", getObjects("b", "lastC", "name"));
	}

	@Test
	public void testBCsC2Path() {
		// /b/cs/name=c2
		test1(root.getB().getCs().get(1), getObjects("b", "cs", "name=c2"));
	}

	@Test
	public void testBCsDPath() {
		// /b/cs/D
		test1(root.getB().getCs().get(2), getObjects("b", "cs", "D"));
	}
	
	@Test
	public void testAsRelPath() {
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

	@Test
	public void testPrivPath() {
		testN(Collections.emptyList(), getObjects("b", "priv1"));
		testN(Collections.emptyList(), getObjects("b", "priv2"));
	}
	
	//
	
	protected Object getResult(Collection<?> target, String op) {
		return requestHandler.getRequestQueryResult(target, op, null);
	}
	
	protected Object getResult(EObject target, String op, Map<String, ?> parameters) {
		return requestHandler.getRequestQueryResult(Collections.singleton(target), op, parameters);
	}
	
	protected Object getResult(EObject target, String op, String... keyValues) {
		Map<String, String> parameters = new HashMap<>();
		for (int i = 0; i < keyValues.length; i += 2) {
			parameters.put(keyValues[i], keyValues[i + 1]);
		}
		return requestHandler.getRequestQueryResult(Collections.singleton(target), op, parameters);
	}

	@Test
	public void testCNameQuery() {
		test1("c1", getResult(root.getB().getCs().get(0), "name"));
	}

	@Test
	public void testCsNameQuery() {
		testN(Arrays.asList("c1", "c2", "d1", "c3"), getResult(root.getB().getCs(), "name"));
	}

	@Test
	public void testCs0Query() {
		test1(root.getB().getCs().get(0), getResult(root.getB().getCs(), "0"));
	}

	@Test
	public void testNameRefQuery() {
		// /a1 and /b/d1
		test1(root.getAs().get(0), getResult(root, "a1"));
		test1(root.getB().getCs().get(2), getResult(root.getB(), "d1"));
	}
	
	@Test
	public void testRotName1FalseQuery() {
		test1("d1", getResult(root.getB().getCs().get(0), "rotName", "distance", "1", "update", "false"));
	}

	@Test
	public void testRotName2TrueQuery() {
		C c = root.getB().getCs().get(0);
		Object result = getResult(c, "rotName", "distance", "2", "update", "true");
		test1("e1", result);
		test1(c.getName(), result);
	}
}
