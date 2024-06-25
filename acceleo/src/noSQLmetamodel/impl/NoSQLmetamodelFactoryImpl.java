/**
 */
package noSQLmetamodel.impl;

import noSQLmetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NoSQLmetamodelFactoryImpl extends EFactoryImpl implements NoSQLmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoSQLmetamodelFactory init() {
		try {
			NoSQLmetamodelFactory theNoSQLmetamodelFactory = (NoSQLmetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(NoSQLmetamodelPackage.eNS_URI);
			if (theNoSQLmetamodelFactory != null) {
				return theNoSQLmetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NoSQLmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSQLmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NoSQLmetamodelPackage.DATA_BASE:
			return createDataBase();
		case NoSQLmetamodelPackage.TCOLLECTION:
			return createTCollection();
		case NoSQLmetamodelPackage.DOCUMENT:
			return createDocument();
		case NoSQLmetamodelPackage.FIELD:
			return createField();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCollection createTCollection() {
		TCollectionImpl tCollection = new TCollectionImpl();
		return tCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoSQLmetamodelPackage getNoSQLmetamodelPackage() {
		return (NoSQLmetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NoSQLmetamodelPackage getPackage() {
		return NoSQLmetamodelPackage.eINSTANCE;
	}

} //NoSQLmetamodelFactoryImpl
