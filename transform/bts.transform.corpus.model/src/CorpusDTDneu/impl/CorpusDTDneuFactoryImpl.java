/*
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CorpusDTDneuFactoryImpl extends EFactoryImpl implements CorpusDTDneuFactory {
    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CorpusDTDneuFactoryImpl() {
        super();
    }

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static CorpusDTDneuFactory init() {
        try {
            CorpusDTDneuFactory theCorpusDTDneuFactory = (CorpusDTDneuFactory) EPackage.Registry.INSTANCE.getEFactory(CorpusDTDneuPackage.eNS_URI);
            if (theCorpusDTDneuFactory != null) {
                return theCorpusDTDneuFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CorpusDTDneuFactoryImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @deprecated
     */
    @Deprecated
    public static CorpusDTDneuPackage getPackage() {
        return CorpusDTDneuPackage.eINSTANCE;
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
            case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE:
                return createBausteinPassageType();
            case CorpusDTDneuPackage.DATE_THS_TYPE:
                return createDateThsType();
            case CorpusDTDneuPackage.DATE_TYPE:
                return createDateType();
            case CorpusDTDneuPackage.DOCUMENT_ROOT:
                return createDocumentRoot();
            case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE:
                return createEgyPunctuationType();
            case CorpusDTDneuPackage.EGY_SENT_TYPE:
                return createEgySentType();
            case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE:
                return createEgySubTxtType();
            case CorpusDTDneuPackage.EGY_SZENARIO_TYPE:
                return createEgySzenarioType();
            case CorpusDTDneuPackage.EGY_TB1_TYPE:
                return createEgyTB1Type();
            case CorpusDTDneuPackage.EGY_TB3_END_TYPE:
                return createEgyTB3EndType();
            case CorpusDTDneuPackage.EGY_TB3_START_TYPE:
                return createEgyTB3StartType();
            case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE:
                return createEgyTxtCorpusType();
            case CorpusDTDneuPackage.EGY_TXT_TYPE:
                return createEgyTxtType();
            case CorpusDTDneuPackage.EGY_WORD_TYPE:
                return createEgyWordType();
            case CorpusDTDneuPackage.FORMATTING_ELEMENT_TYPE:
                return createFormattingElementType();
            case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE:
                return createGlossePassageType();
            case CorpusDTDneuPackage.GLOSSE_TYPE:
                return createGlosseType();
            case CorpusDTDneuPackage.LANGUAGE_PASSAGE_TYPE:
                return createLanguagePassageType();
            case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE:
                return createLeipzigPassageType();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE:
                return createLineCountType();
            case CorpusDTDneuPackage.NOTE_TYPE:
                return createNoteType();
            case CorpusDTDneuPackage.PASSPORT_DATA_ITEM:
                return createPassportDataItem();
            case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE:
                return createPassportDataItemType();
            case CorpusDTDneuPackage.PICTURES_TABLE_TYPE:
                return createPicturesTableType();
            case CorpusDTDneuPackage.PICTURE_TYPE:
                return createPictureType();
            case CorpusDTDneuPackage.PUNCTUATION_TYPE:
                return createPunctuationType();
            case CorpusDTDneuPackage.TC_ARRANGEMENT_TYPE:
                return createTCArrangementType();
            case CorpusDTDneuPackage.TC_CAPTION_TYPE:
                return createTCCaptionType();
            case CorpusDTDneuPackage.TC_GROUP_TYPE:
                return createTCGroupType();
            case CorpusDTDneuPackage.TC_HEADER_TYPE:
                return createTCHeaderType();
            case CorpusDTDneuPackage.TC_LOCATION_TYPE:
                return createTCLocationType();
            case CorpusDTDneuPackage.TC_OBJECT_TYPE:
                return createTCObjectType();
            case CorpusDTDneuPackage.TC_OBJ_PART_TYPE:
                return createTCObjPartType();
            case CorpusDTDneuPackage.TC_PASSPORT_TYPE:
                return createTCPassportType();
            case CorpusDTDneuPackage.TC_PICTURE_TYPE:
                return createTCPictureType();
            case CorpusDTDneuPackage.TC_SCENE_TYPE:
                return createTCSceneType();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE:
                return createTCSuperTextType();
            case CorpusDTDneuPackage.TC_TEXT_TYPE:
                return createTCTextType();
            case CorpusDTDneuPackage.THS_ENTRY_TYPE:
                return createThsEntryType();
            case CorpusDTDneuPackage.WORK_TYPE:
                return createWorkType();
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
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case CorpusDTDneuPackage.CATEGORY_TYPE:
                return createCategoryTypeFromString(eDataType, initialValue);
            case CorpusDTDneuPackage.CATEGORY_TYPE1:
                return createCategoryType1FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.LTYPE_TYPE:
                return createLTypeTypeFromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE:
                return createTypeTypeFromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE1:
                return createTypeType1FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE2:
                return createTypeType2FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE3:
                return createTypeType3FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE4:
                return createTypeType4FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE5:
                return createTypeType5FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE6:
                return createTypeType6FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE7:
                return createTypeType7FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE8:
                return createTypeType8FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.CATEGORY_TYPE_OBJECT:
                return createCategoryTypeObjectFromString(eDataType, initialValue);
            case CorpusDTDneuPackage.CATEGORY_TYPE_OBJECT1:
                return createCategoryTypeObject1FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.LTYPE_TYPE_OBJECT:
                return createLTypeTypeObjectFromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT:
                return createTypeTypeObjectFromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT1:
                return createTypeTypeObject1FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT2:
                return createTypeTypeObject2FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT3:
                return createTypeTypeObject3FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT4:
                return createTypeTypeObject4FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT5:
                return createTypeTypeObject5FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT6:
                return createTypeTypeObject6FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT7:
                return createTypeTypeObject7FromString(eDataType, initialValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT8:
                return createTypeTypeObject8FromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case CorpusDTDneuPackage.CATEGORY_TYPE:
                return convertCategoryTypeToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.CATEGORY_TYPE1:
                return convertCategoryType1ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.LTYPE_TYPE:
                return convertLTypeTypeToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE:
                return convertTypeTypeToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE1:
                return convertTypeType1ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE2:
                return convertTypeType2ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE3:
                return convertTypeType3ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE4:
                return convertTypeType4ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE5:
                return convertTypeType5ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE6:
                return convertTypeType6ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE7:
                return convertTypeType7ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE8:
                return convertTypeType8ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.CATEGORY_TYPE_OBJECT:
                return convertCategoryTypeObjectToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.CATEGORY_TYPE_OBJECT1:
                return convertCategoryTypeObject1ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.LTYPE_TYPE_OBJECT:
                return convertLTypeTypeObjectToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT:
                return convertTypeTypeObjectToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT1:
                return convertTypeTypeObject1ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT2:
                return convertTypeTypeObject2ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT3:
                return convertTypeTypeObject3ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT4:
                return convertTypeTypeObject4ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT5:
                return convertTypeTypeObject5ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT6:
                return convertTypeTypeObject6ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT7:
                return convertTypeTypeObject7ToString(eDataType, instanceValue);
            case CorpusDTDneuPackage.TYPE_TYPE_OBJECT8:
                return convertTypeTypeObject8ToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BausteinPassageType createBausteinPassageType() {
        return new BausteinPassageTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public DateThsType createDateThsType() {
        return new DateThsTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public DateType createDateType() {
        return new DateTypeImpl();
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
    public EgyPunctuationType createEgyPunctuationType() {
        return new EgyPunctuationTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgySentType createEgySentType() {
        return new EgySentTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgySubTxtType createEgySubTxtType() {
        return new EgySubTxtTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgySzenarioType createEgySzenarioType() {
        return new EgySzenarioTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgyTB1Type createEgyTB1Type() {
        return new EgyTB1TypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgyTB3EndType createEgyTB3EndType() {
        return new EgyTB3EndTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgyTB3StartType createEgyTB3StartType() {
        return new EgyTB3StartTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgyTxtCorpusType createEgyTxtCorpusType() {
        return new EgyTxtCorpusTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgyTxtType createEgyTxtType() {
        return new EgyTxtTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EgyWordType createEgyWordType() {
        return new EgyWordTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FormattingElementType createFormattingElementType() {
        return new FormattingElementTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public GlossePassageType createGlossePassageType() {
        return new GlossePassageTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public GlosseType createGlosseType() {
        return new GlosseTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LanguagePassageType createLanguagePassageType() {
        return new LanguagePassageTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LeipzigPassageType createLeipzigPassageType() {
        return new LeipzigPassageTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LineCountType createLineCountType() {
        return new LineCountTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NoteType createNoteType() {
        return new NoteTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public PassportDataItem createPassportDataItem() {
        return new PassportDataItemImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public PassportDataItemType createPassportDataItemType() {
        return new PassportDataItemTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public PicturesTableType createPicturesTableType() {
        return new PicturesTableTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public PictureType createPictureType() {
        return new PictureTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public PunctuationType createPunctuationType() {
        return new PunctuationTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCArrangementType createTCArrangementType() {
        return new TCArrangementTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCCaptionType createTCCaptionType() {
        return new TCCaptionTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCGroupType createTCGroupType() {
        return new TCGroupTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCHeaderType createTCHeaderType() {
        return new TCHeaderTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCLocationType createTCLocationType() {
        return new TCLocationTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCObjectType createTCObjectType() {
        return new TCObjectTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCObjPartType createTCObjPartType() {
        return new TCObjPartTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCPassportType createTCPassportType() {
        return new TCPassportTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCPictureType createTCPictureType() {
        return new TCPictureTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCSceneType createTCSceneType() {
        return new TCSceneTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCSuperTextType createTCSuperTextType() {
        return new TCSuperTextTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCTextType createTCTextType() {
        return new TCTextTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ThsEntryType createThsEntryType() {
        return new ThsEntryTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public WorkType createWorkType() {
        return new WorkTypeImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CategoryType createCategoryTypeFromString(EDataType eDataType, String initialValue) {
        CategoryType result = CategoryType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCategoryTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CategoryType1 createCategoryType1FromString(EDataType eDataType, String initialValue) {
        CategoryType1 result = CategoryType1.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCategoryType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LTypeType createLTypeTypeFromString(EDataType eDataType, String initialValue) {
        LTypeType result = LTypeType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertLTypeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
        TypeType result = TypeType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
        TypeType1 result = TypeType1.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType2 createTypeType2FromString(EDataType eDataType, String initialValue) {
        TypeType2 result = TypeType2.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType3 createTypeType3FromString(EDataType eDataType, String initialValue) {
        TypeType3 result = TypeType3.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType3ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType4 createTypeType4FromString(EDataType eDataType, String initialValue) {
        TypeType4 result = TypeType4.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType4ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType5 createTypeType5FromString(EDataType eDataType, String initialValue) {
        TypeType5 result = TypeType5.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType5ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType6 createTypeType6FromString(EDataType eDataType, String initialValue) {
        TypeType6 result = TypeType6.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType6ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType7 createTypeType7FromString(EDataType eDataType, String initialValue) {
        TypeType7 result = TypeType7.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType7ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType8 createTypeType8FromString(EDataType eDataType, String initialValue) {
        TypeType8 result = TypeType8.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeType8ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CategoryType createCategoryTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createCategoryTypeFromString(CorpusDTDneuPackage.Literals.CATEGORY_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCategoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCategoryTypeToString(CorpusDTDneuPackage.Literals.CATEGORY_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CategoryType1 createCategoryTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createCategoryType1FromString(CorpusDTDneuPackage.Literals.CATEGORY_TYPE1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCategoryTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertCategoryType1ToString(CorpusDTDneuPackage.Literals.CATEGORY_TYPE1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LTypeType createLTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createLTypeTypeFromString(CorpusDTDneuPackage.Literals.LTYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertLTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertLTypeTypeToString(CorpusDTDneuPackage.Literals.LTYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType1 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTypeType1FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType1ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType3 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createTypeType3FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE3, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType3ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE3, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType5 createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
        return createTypeType5FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE5, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType5ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE5, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType2 createTypeTypeObject3FromString(EDataType eDataType, String initialValue) {
        return createTypeType2FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE2, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject3ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType2ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE2, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType createTypeTypeObject4FromString(EDataType eDataType, String initialValue) {
        return createTypeTypeFromString(CorpusDTDneuPackage.Literals.TYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject4ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeTypeToString(CorpusDTDneuPackage.Literals.TYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType6 createTypeTypeObject5FromString(EDataType eDataType, String initialValue) {
        return createTypeType6FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE6, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject5ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType6ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE6, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType4 createTypeTypeObject6FromString(EDataType eDataType, String initialValue) {
        return createTypeType4FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE4, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject6ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType4ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE4, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType7 createTypeTypeObject7FromString(EDataType eDataType, String initialValue) {
        return createTypeType7FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE7, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject7ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType7ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE7, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType8 createTypeTypeObject8FromString(EDataType eDataType, String initialValue) {
        return createTypeType8FromString(CorpusDTDneuPackage.Literals.TYPE_TYPE8, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObject8ToString(EDataType eDataType, Object instanceValue) {
        return convertTypeType8ToString(CorpusDTDneuPackage.Literals.TYPE_TYPE8, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CorpusDTDneuPackage getCorpusDTDneuPackage() {
        return (CorpusDTDneuPackage) getEPackage();
    }

} //CorpusDTDneuFactoryImpl
