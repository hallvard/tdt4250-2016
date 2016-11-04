/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Tags#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getTags()
 * @model
 * @generated
 */
public interface Tags extends Tagged {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.osm.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see no.hal.pgo.osm.OsmPackage#getTags_Tags()
	 * @model containment="true"
	 *        extendedMetaData="name='tag' kind='element'"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Defaults</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Tagged getTagDefaults();

} // Tags
