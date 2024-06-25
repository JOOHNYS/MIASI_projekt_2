/**
 */
package noSQLmetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see noSQLmetamodel.NoSQLmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface NoSQLmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "noSQLmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/noSQLmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "noSQLmetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NoSQLmetamodelPackage eINSTANCE = noSQLmetamodel.impl.NoSQLmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link noSQLmetamodel.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noSQLmetamodel.impl.DataBaseImpl
	 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>TCollection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__TCOLLECTION = 1;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noSQLmetamodel.impl.TCollectionImpl <em>TCollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noSQLmetamodel.impl.TCollectionImpl
	 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getTCollection()
	 * @generated
	 */
	int TCOLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION__DOCUMENT = 1;

	/**
	 * The number of structural features of the '<em>TCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noSQLmetamodel.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noSQLmetamodel.impl.DocumentImpl
	 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noSQLmetamodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noSQLmetamodel.impl.FieldImpl
	 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link noSQLmetamodel.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see noSQLmetamodel.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the attribute '{@link noSQLmetamodel.DataBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see noSQLmetamodel.DataBase#getName()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link noSQLmetamodel.DataBase#getTCollection <em>TCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TCollection</em>'.
	 * @see noSQLmetamodel.DataBase#getTCollection()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_TCollection();

	/**
	 * Returns the meta object for class '{@link noSQLmetamodel.TCollection <em>TCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCollection</em>'.
	 * @see noSQLmetamodel.TCollection
	 * @generated
	 */
	EClass getTCollection();

	/**
	 * Returns the meta object for the attribute '{@link noSQLmetamodel.TCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see noSQLmetamodel.TCollection#getName()
	 * @see #getTCollection()
	 * @generated
	 */
	EAttribute getTCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link noSQLmetamodel.TCollection#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see noSQLmetamodel.TCollection#getDocument()
	 * @see #getTCollection()
	 * @generated
	 */
	EReference getTCollection_Document();

	/**
	 * Returns the meta object for class '{@link noSQLmetamodel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see noSQLmetamodel.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link noSQLmetamodel.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see noSQLmetamodel.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link noSQLmetamodel.Document#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see noSQLmetamodel.Document#getField()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Field();

	/**
	 * Returns the meta object for class '{@link noSQLmetamodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see noSQLmetamodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link noSQLmetamodel.Field#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see noSQLmetamodel.Field#getKey()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Key();

	/**
	 * Returns the meta object for the attribute '{@link noSQLmetamodel.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see noSQLmetamodel.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NoSQLmetamodelFactory getNoSQLmetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link noSQLmetamodel.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noSQLmetamodel.impl.DataBaseImpl
		 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__NAME = eINSTANCE.getDataBase_Name();

		/**
		 * The meta object literal for the '<em><b>TCollection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__TCOLLECTION = eINSTANCE.getDataBase_TCollection();

		/**
		 * The meta object literal for the '{@link noSQLmetamodel.impl.TCollectionImpl <em>TCollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noSQLmetamodel.impl.TCollectionImpl
		 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getTCollection()
		 * @generated
		 */
		EClass TCOLLECTION = eINSTANCE.getTCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCOLLECTION__NAME = eINSTANCE.getTCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOLLECTION__DOCUMENT = eINSTANCE.getTCollection_Document();

		/**
		 * The meta object literal for the '{@link noSQLmetamodel.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noSQLmetamodel.impl.DocumentImpl
		 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__FIELD = eINSTANCE.getDocument_Field();

		/**
		 * The meta object literal for the '{@link noSQLmetamodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noSQLmetamodel.impl.FieldImpl
		 * @see noSQLmetamodel.impl.NoSQLmetamodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__KEY = eINSTANCE.getField_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

	}

} //NoSQLmetamodelPackage
