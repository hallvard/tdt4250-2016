/**
 */
package no.hal.pgo.osm.util.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pgo.osm.OsmFactory;
import no.hal.pgo.osm.Tag;
import no.hal.pgo.osm.Tags;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String) <em>Has Tag</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Tagged#getTag(java.lang.String) <em>Get Tag</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String, java.lang.String) <em>Has Tag</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TagsTest extends TestCase {

	/**
	 * The fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tags fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TagsTest.class);
	}

	/**
	 * Constructs a new Tags test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tags fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tags getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmFactory.eINSTANCE.createTags());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String) <em>Has Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.Tagged#hasTag(java.lang.String)
	 * @generated NOT
	 */
	public void testHasTag__String() {
		Tags tags = getFixture();
		assertFalse(tags.hasTag("tag1"));
		assertFalse(tags.hasTag("tag2"));

		Tag tag1 = OsmFactory.eINSTANCE.createTag(),  tag2 = OsmFactory.eINSTANCE.createTag();
		tags.getTags().add(tag1);
		tags.getTags().add(tag2);

		assertFalse(tags.hasTag("tag1"));
		assertFalse(tags.hasTag("tag2"));

		tag1.setKey("tag1");
		assertTrue(tags.hasTag("tag1"));
		assertFalse(tags.hasTag("tag2"));

		tag2.setKey("tag2");
		assertTrue(tags.hasTag("tag1"));
		assertTrue(tags.hasTag("tag2"));
	}

	/**
	 * Tests the '{@link no.hal.pgo.osm.Tagged#getTag(java.lang.String) <em>Get Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.Tagged#getTag(java.lang.String)
	 * @generated NOT
	 */
	public void testGetTag__String() {
		Tags tags = getFixture();
		assertEquals(null, tags.getTag("tag1"));
		assertEquals(null, tags.getTag("tag2"));

		Tag tag1 = OsmFactory.eINSTANCE.createTag(),  tag2 = OsmFactory.eINSTANCE.createTag();
		tags.getTags().add(tag1);
		tags.getTags().add(tag2);
		assertEquals(null, tags.getTag("tag1"));
		assertEquals(null, tags.getTag("tag2"));

		tag1.setKey("tag1");
		assertEquals(null, tags.getTag("tag1"));
		assertEquals(null, tags.getTag("tag2"));

		tag1.setValue("value1");		
		assertEquals("value1", tags.getTag("tag1"));
		assertEquals(null, tags.getTag("tag2"));

		tag2.setKey("tag2");
		assertEquals("value1", tags.getTag("tag1"));
		assertEquals(null, tags.getTag("tag2"));

		tag2.setValue("value2");		
		assertEquals("value1", tags.getTag("tag1"));
		assertEquals("value2", tags.getTag("tag2"));
	}

	/**
	 * Tests the '{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String, java.lang.String) <em>Has Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pgo.osm.Tagged#hasTag(java.lang.String, java.lang.String)
	 * @generated NOT
	 */
	public void testHasTag__String_String() {
		Tags tags = getFixture();
		assertFalse(tags.hasTag("tag1"));
		assertFalse(tags.hasTag("tag2"));
		Tag tag1 = OsmFactory.eINSTANCE.createTag(),  tag2 = OsmFactory.eINSTANCE.createTag();
		tags.getTags().add(tag1);
		tags.getTags().add(tag2);
		assertFalse(tags.hasTag("tag1", "value1"));
		assertFalse(tags.hasTag("tag2", "value2"));

		tag1.setKey("tag1");
		assertFalse(tags.hasTag("tag1", "value1"));
		assertFalse(tags.hasTag("tag2", "value2"));

		tag1.setValue("value1");		
		assertFalse(tags.hasTag("tag1", "value0"));
		assertTrue(tags.hasTag("tag1", "value1"));
		assertFalse(tags.hasTag("tag2", "value2"));

		tag2.setKey("tag2");
		assertFalse(tags.hasTag("tag1", "value0"));
		assertTrue(tags.hasTag("tag1", "value1"));
		assertFalse(tags.hasTag("tag2", "value2"));

		tag2.setValue("value2");		
		assertFalse(tags.hasTag("tag1", "value0"));
		assertTrue(tags.hasTag("tag1", "value1"));
		assertFalse(tags.hasTag("tag2", "value0"));
		assertTrue(tags.hasTag("tag2", "value2"));
	}

} //TagsTest
