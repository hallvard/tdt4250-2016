/**
 */
package no.hal.pgo.osm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pgo.osm.NodeRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see no.hal.pgo.osm.OsmPackage#getNodeRef()
 * @model
 * @generated
 */
public interface NodeRef extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Node)
	 * @see no.hal.pgo.osm.OsmPackage#getNodeRef_Ref()
	 * @model extendedMetaData="kind='attribute'"
	 * @generated
	 */
	Node getRef();

	/**
	 * Sets the value of the '{@link no.hal.pgo.osm.NodeRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Node value);

} // NodeRef
