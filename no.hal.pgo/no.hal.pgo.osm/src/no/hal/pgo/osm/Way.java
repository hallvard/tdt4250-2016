/**
 */
package no.hal.pgo.osm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Way#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getWay()
 * @model
 * @generated
 */
public interface Way extends OSMElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pgo.osm.NodeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see no.hal.pgo.osm.OsmPackage#getWay_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="name='nd' kind='element'"
	 * @generated
	 */
	EList<NodeRef> getNodes();

} // Way
