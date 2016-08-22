/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Relation#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends OSMElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.osm.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see no.hal.pgo.osm.OsmPackage#getRelation_Members()
	 * @model containment="true"
	 *        extendedMetaData="name='member' kind='element'"
	 * @generated
	 */
	EList<Member> getMembers();

} // Relation
