/**
 */
package noSQLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCollection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link noSQLmetamodel.TCollection#getName <em>Name</em>}</li>
 *   <li>{@link noSQLmetamodel.TCollection#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see noSQLmetamodel.NoSQLmetamodelPackage#getTCollection()
 * @model
 * @generated
 */
public interface TCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see noSQLmetamodel.NoSQLmetamodelPackage#getTCollection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link noSQLmetamodel.TCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link noSQLmetamodel.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see noSQLmetamodel.NoSQLmetamodelPackage#getTCollection_Document()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getDocument();

} // TCollection
