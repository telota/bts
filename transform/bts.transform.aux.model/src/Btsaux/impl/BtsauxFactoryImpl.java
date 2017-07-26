/*
 */
package Btsaux.impl;

import Btsaux.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BtsauxFactoryImpl extends EFactoryImpl implements BtsauxFactory {
    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BtsauxFactoryImpl() {
        super();
    }

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static BtsauxFactory init() {
        try {
            BtsauxFactory theBtsauxFactory = (BtsauxFactory) EPackage.Registry.INSTANCE.getEFactory(BtsauxPackage.eNS_URI);
            if (theBtsauxFactory != null) {
                return theBtsauxFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BtsauxFactoryImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @deprecated
     */
    @Deprecated
    public static BtsauxPackage getPackage() {
        return BtsauxPackage.eINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case BtsauxPackage.AUGROUPS_TYPE:
                return createAugroupsType();
            case BtsauxPackage.AUTHORIZATION_TYPE:
                return createAuthorizationType();
            case BtsauxPackage.AUTHORS_TYPE:
                return createAuthorsType();
            case BtsauxPackage.BWLENGL_TYPE:
                return createBwlenglType();
            case BtsauxPackage.BWLLINK_TYPE:
                return createBwllinkType();
            case BtsauxPackage.BWLLIST_TYPE:
                return createBwllistType();
            case BtsauxPackage.DOCUMENT_ROOT:
                return createDocumentRoot();
            case BtsauxPackage.STUPID_XML_TYPE:
                return createStupidXMLType();
            case BtsauxPackage.THSDATA_TYPE:
                return createThsdataType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public AugroupsType createAugroupsType() {
        return new AugroupsTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public AuthorizationType createAuthorizationType() {
        return new AuthorizationTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public AuthorsType createAuthorsType() {
        return new AuthorsTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BwlenglType createBwlenglType() {
        return new BwlenglTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BwllinkType createBwllinkType() {
        return new BwllinkTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BwllistType createBwllistType() {
        return new BwllistTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        return new DocumentRootImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public StupidXMLType createStupidXMLType() {
        return new StupidXMLTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ThsdataType createThsdataType() {
        return new ThsdataTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BtsauxPackage getBtsauxPackage() {
        return (BtsauxPackage) getEPackage();
    }

} //BtsauxFactoryImpl
