/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @model kind="package"
 * extendedMetaData="qualified='false'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuFactory
 */
public interface CorpusDTDneuPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "CorpusDTDneu";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "file:/C:/bts/dtd/CorpusDTDneu.xsd";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "CorpusDTDneu";
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.BausteinPassageTypeImpl <em>Baustein Passage Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.BausteinPassageTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getBausteinPassageType()
     */
    int BAUSTEIN_PASSAGE_TYPE = 0;
    /**
     * The feature id for the '<em><b>Baustein</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BAUSTEIN_PASSAGE_TYPE__BAUSTEIN = 0;
    /**
     * The feature id for the '<em><b>Passage ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID = 1;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BAUSTEIN_PASSAGE_TYPE__TYPE = 2;
    /**
     * The number of structural features of the '<em>Baustein Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BAUSTEIN_PASSAGE_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Baustein Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BAUSTEIN_PASSAGE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.DateThsTypeImpl <em>Date Ths Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.DateThsTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getDateThsType()
     */
    int DATE_THS_TYPE = 1;
    /**
     * The feature id for the '<em><b>Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE__TERM = 0;
    /**
     * The feature id for the '<em><b>Lower Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE__LOWER_TERM = 1;
    /**
     * The feature id for the '<em><b>Upper Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE__UPPER_TERM = 2;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE__TYPE = 3;
    /**
     * The feature id for the '<em><b>Year From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE__YEAR_FROM = 4;
    /**
     * The feature id for the '<em><b>Year To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE__YEAR_TO = 5;
    /**
     * The number of structural features of the '<em>Date Ths Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE_FEATURE_COUNT = 6;
    /**
     * The number of operations of the '<em>Date Ths Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_THS_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.DateTypeImpl <em>Date Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.DateTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getDateType()
     */
    int DATE_TYPE = 2;
    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE__MIXED = 0;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE__GROUP = 1;
    /**
     * The feature id for the '<em><b>Date Ths</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE__DATE_THS = 2;
    /**
     * The feature id for the '<em><b>Code</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE__CODE = 3;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE__COMMENT = 4;
    /**
     * The number of structural features of the '<em>Date Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE_FEATURE_COUNT = 5;
    /**
     * The number of operations of the '<em>Date Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DATE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.DocumentRootImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getDocumentRoot()
     */
    int DOCUMENT_ROOT = 3;
    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;
    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__AUTHOR = 3;
    /**
     * The feature id for the '<em><b>Baustein Passage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BAUSTEIN_PASSAGE = 4;
    /**
     * The feature id for the '<em><b>Bibliography</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BIBLIOGRAPHY = 5;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BTS_CODES = 6;
    /**
     * The feature id for the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CODE = 7;
    /**
     * The feature id for the '<em><b>Code1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CODE1 = 8;
    /**
     * The feature id for the '<em><b>Code2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CODE2 = 9;
    /**
     * The feature id for the '<em><b>Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CODES = 10;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMMENT = 11;
    /**
     * The feature id for the '<em><b>Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATE = 12;
    /**
     * The feature id for the '<em><b>Date Ths</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATE_THS = 13;
    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEFINITION = 14;
    /**
     * The feature id for the '<em><b>Depiction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEPICTION = 15;
    /**
     * The feature id for the '<em><b>Egy Punctuation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_PUNCTUATION = 16;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_SENT = 17;
    /**
     * The feature id for the '<em><b>Egy Sub Txt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_SUB_TXT = 18;
    /**
     * The feature id for the '<em><b>Egy Szenario</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_SZENARIO = 19;
    /**
     * The feature id for the '<em><b>Egy TB1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_TB1 = 20;
    /**
     * The feature id for the '<em><b>Egy TB3 End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_TB3_END = 21;
    /**
     * The feature id for the '<em><b>Egy TB3 Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_TB3_START = 22;
    /**
     * The feature id for the '<em><b>Egy Txt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_TXT = 23;
    /**
     * The feature id for the '<em><b>Egy Txt Corpus</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_TXT_CORPUS = 24;
    /**
     * The feature id for the '<em><b>Egy Word</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EGY_WORD = 25;
    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FILE_NAME = 26;
    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FILE_PATH = 27;
    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FORM = 28;
    /**
     * The feature id for the '<em><b>Formatting Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FORMATTING_ELEMENT = 29;
    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FULL_NAME = 30;
    /**
     * The feature id for the '<em><b>Glosse</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOSSE = 31;
    /**
     * The feature id for the '<em><b>Glosse Passage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOSSE_PASSAGE = 32;
    /**
     * The feature id for the '<em><b>Graphics</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GRAPHICS = 33;
    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HIERARCHY = 34;
    /**
     * The feature id for the '<em><b>Lang Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANG_COMMENT = 35;
    /**
     * The feature id for the '<em><b>Language</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANGUAGE = 36;
    /**
     * The feature id for the '<em><b>Language Passage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANGUAGE_PASSAGE = 37;
    /**
     * The feature id for the '<em><b>Leipzig Passage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LEIPZIG_PASSAGE = 38;
    /**
     * The feature id for the '<em><b>Line Count</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LINE_COUNT = 39;
    /**
     * The feature id for the '<em><b>Lower Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOWER_TERM = 40;
    /**
     * The feature id for the '<em><b>Museum Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MUSEUM_NUMBER = 41;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NAME = 42;
    /**
     * The feature id for the '<em><b>Name Sort</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NAME_SORT = 43;
    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NOTE = 44;
    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NOTES = 45;
    /**
     * The feature id for the '<em><b>Object Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OBJECT_TYPE = 46;
    /**
     * The feature id for the '<em><b>Passport Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PASSPORT_DATA_ITEM = 47;
    /**
     * The feature id for the '<em><b>Picture</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PICTURE = 48;
    /**
     * The feature id for the '<em><b>Pictures Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PICTURES_TABLE = 49;
    /**
     * The feature id for the '<em><b>Project</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROJECT = 50;
    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROTOCOL = 51;
    /**
     * The feature id for the '<em><b>Provenance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROVENANCE = 52;
    /**
     * The feature id for the '<em><b>Punctuation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PUNCTUATION = 53;
    /**
     * The feature id for the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCRIPT = 54;
    /**
     * The feature id for the '<em><b>TC Arrangement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_ARRANGEMENT = 55;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_CAPTION = 56;
    /**
     * The feature id for the '<em><b>TC Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_GROUP = 57;
    /**
     * The feature id for the '<em><b>TC Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_HEADER = 58;
    /**
     * The feature id for the '<em><b>TC Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_LOCATION = 59;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_NOTEBOOK = 60;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_OBJECT = 61;
    /**
     * The feature id for the '<em><b>TC Obj Part</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_OBJ_PART = 62;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_PASSPORT = 63;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_PICTURE = 64;
    /**
     * The feature id for the '<em><b>TC Scene</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_SCENE = 65;
    /**
     * The feature id for the '<em><b>TC Super Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_SUPER_TEXT = 66;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TC_TEXT = 67;
    /**
     * The feature id for the '<em><b>Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TERM = 68;
    /**
     * The feature id for the '<em><b>Text Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEXT_TYPE = 69;
    /**
     * The feature id for the '<em><b>Ths Entry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__THS_ENTRY = 70;
    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TITLE = 71;
    /**
     * The feature id for the '<em><b>Translat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSLAT = 72;
    /**
     * The feature id for the '<em><b>Translation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSLATION = 73;
    /**
     * The feature id for the '<em><b>Upper Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__UPPER_TERM = 74;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VALUE = 75;
    /**
     * The feature id for the '<em><b>Wb Folder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WB_FOLDER = 76;
    /**
     * The feature id for the '<em><b>Wb Slips</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WB_SLIPS = 77;
    /**
     * The feature id for the '<em><b>Work</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORK = 78;
    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 79;
    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyPunctuationTypeImpl <em>Egy Punctuation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyPunctuationTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyPunctuationType()
     */
    int EGY_PUNCTUATION_TYPE = 4;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_PUNCTUATION_TYPE__VALUE = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_PUNCTUATION_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_PUNCTUATION_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_PUNCTUATION_TYPE__TYPE = 3;
    /**
     * The number of structural features of the '<em>Egy Punctuation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_PUNCTUATION_TYPE_FEATURE_COUNT = 4;
    /**
     * The number of operations of the '<em>Egy Punctuation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_PUNCTUATION_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgySentTypeImpl <em>Egy Sent Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgySentTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgySentType()
     */
    int EGY_SENT_TYPE = 5;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__VALUE = 0;
    /**
     * The feature id for the '<em><b>Translat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__TRANSLAT = 1;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__BTS_CODES = 2;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__COMMENT = 3;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__GROUP = 4;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__EGY_SENT = 5;
    /**
     * The feature id for the '<em><b>Egy TB1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__EGY_TB1 = 6;
    /**
     * The feature id for the '<em><b>Egy TB3 Start</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__EGY_TB3_START = 7;
    /**
     * The feature id for the '<em><b>Egy TB3 End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__EGY_TB3_END = 8;
    /**
     * The feature id for the '<em><b>Egy Word</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__EGY_WORD = 9;
    /**
     * The feature id for the '<em><b>Line Count</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__LINE_COUNT = 10;
    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__NOTE = 11;
    /**
     * The feature id for the '<em><b>Formatting Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__FORMATTING_ELEMENT = 12;
    /**
     * The feature id for the '<em><b>Language Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__LANGUAGE_PASSAGE = 13;
    /**
     * The feature id for the '<em><b>Baustein Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__BAUSTEIN_PASSAGE = 14;
    /**
     * The feature id for the '<em><b>Leipzig Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__LEIPZIG_PASSAGE = 15;
    /**
     * The feature id for the '<em><b>Glosse Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__GLOSSE_PASSAGE = 16;
    /**
     * The feature id for the '<em><b>Punctuation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__PUNCTUATION = 17;
    /**
     * The feature id for the '<em><b>Egy Punctuation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__EGY_PUNCTUATION = 18;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__AUTHOR = 19;
    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__LANGUAGE = 20;
    /**
     * The feature id for the '<em><b>Leipzig3 Modul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__LEIPZIG3_MODUL = 21;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE__TYPE = 22;
    /**
     * The number of structural features of the '<em>Egy Sent Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE_FEATURE_COUNT = 23;
    /**
     * The number of operations of the '<em>Egy Sent Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SENT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgySubTxtTypeImpl <em>Egy Sub Txt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgySubTxtTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgySubTxtType()
     */
    int EGY_SUB_TXT_TYPE = 6;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__NAME = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>Egy Sub Txt</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__EGY_SUB_TXT = 4;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__EGY_SENT = 5;
    /**
     * The feature id for the '<em><b>Egy TB1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__EGY_TB1 = 6;
    /**
     * The feature id for the '<em><b>Egy Szenario</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__EGY_SZENARIO = 7;
    /**
     * The feature id for the '<em><b>Glosse</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__GLOSSE = 8;
    /**
     * The feature id for the '<em><b>Egy TB3 Start</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__EGY_TB3_START = 9;
    /**
     * The feature id for the '<em><b>Egy TB3 End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__EGY_TB3_END = 10;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE__SORT_KEY = 11;
    /**
     * The number of structural features of the '<em>Egy Sub Txt Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE_FEATURE_COUNT = 12;
    /**
     * The number of operations of the '<em>Egy Sub Txt Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SUB_TXT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgySzenarioTypeImpl <em>Egy Szenario Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgySzenarioTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgySzenarioType()
     */
    int EGY_SZENARIO_TYPE = 7;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SZENARIO_TYPE__EGY_SENT = 0;
    /**
     * The feature id for the '<em><b>Interne Nummer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SZENARIO_TYPE__INTERNE_NUMMER = 1;
    /**
     * The number of structural features of the '<em>Egy Szenario Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SZENARIO_TYPE_FEATURE_COUNT = 2;
    /**
     * The number of operations of the '<em>Egy Szenario Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_SZENARIO_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyTB1TypeImpl <em>Egy TB1 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyTB1TypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTB1Type()
     */
    int EGY_TB1_TYPE = 8;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__NAME = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__EGY_SENT = 4;
    /**
     * The feature id for the '<em><b>Egy TB1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__EGY_TB1 = 5;
    /**
     * The feature id for the '<em><b>Egy TB3 Start</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__EGY_TB3_START = 6;
    /**
     * The feature id for the '<em><b>Egy TB3 End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__EGY_TB3_END = 7;
    /**
     * The feature id for the '<em><b>Egy Word</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__EGY_WORD = 8;
    /**
     * The feature id for the '<em><b>Line Count</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__LINE_COUNT = 9;
    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__NOTE = 10;
    /**
     * The feature id for the '<em><b>Formatting Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__FORMATTING_ELEMENT = 11;
    /**
     * The feature id for the '<em><b>Punctuation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__PUNCTUATION = 12;
    /**
     * The feature id for the '<em><b>Egy Punctuation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE__EGY_PUNCTUATION = 13;
    /**
     * The number of structural features of the '<em>Egy TB1 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE_FEATURE_COUNT = 14;
    /**
     * The number of operations of the '<em>Egy TB1 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB1_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyTB3EndTypeImpl <em>Egy TB3 End Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyTB3EndTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTB3EndType()
     */
    int EGY_TB3_END_TYPE = 9;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE__NAME = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE__ID = 3;
    /**
     * The feature id for the '<em><b>Id Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE__ID_REF = 4;
    /**
     * The number of structural features of the '<em>Egy TB3 End Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE_FEATURE_COUNT = 5;
    /**
     * The number of operations of the '<em>Egy TB3 End Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_END_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl <em>Egy TB3 Start Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyTB3StartTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTB3StartType()
     */
    int EGY_TB3_START_TYPE = 10;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE__NAME = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE__ID = 3;
    /**
     * The feature id for the '<em><b>Id Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE__ID_REF = 4;
    /**
     * The number of structural features of the '<em>Egy TB3 Start Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE_FEATURE_COUNT = 5;
    /**
     * The number of operations of the '<em>Egy TB3 Start Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TB3_START_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl <em>Egy Txt Corpus Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyTxtCorpusTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTxtCorpusType()
     */
    int EGY_TXT_CORPUS_TYPE = 11;
    /**
     * The feature id for the '<em><b>TC Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_HEADER = 0;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__GROUP = 1;
    /**
     * The feature id for the '<em><b>Pictures Table</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__PICTURES_TABLE = 2;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_CAPTION = 3;
    /**
     * The feature id for the '<em><b>TC Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_GROUP = 4;
    /**
     * The feature id for the '<em><b>TC Arrangement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT = 5;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_OBJECT = 6;
    /**
     * The feature id for the '<em><b>TC Obj Part</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_OBJ_PART = 7;
    /**
     * The feature id for the '<em><b>TC Scene</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_SCENE = 8;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__TC_TEXT = 9;
    /**
     * The feature id for the '<em><b>Egy Txt</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__EGY_TXT = 10;
    /**
     * The feature id for the '<em><b>DTD Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE__DTD_VERSION = 11;
    /**
     * The number of structural features of the '<em>Egy Txt Corpus Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE_FEATURE_COUNT = 12;
    /**
     * The number of operations of the '<em>Egy Txt Corpus Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_CORPUS_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyTxtTypeImpl <em>Egy Txt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyTxtTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTxtType()
     */
    int EGY_TXT_TYPE = 12;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__NAME = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>Egy Sub Txt</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__EGY_SUB_TXT = 4;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__EGY_SENT = 5;
    /**
     * The feature id for the '<em><b>Egy TB1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__EGY_TB1 = 6;
    /**
     * The feature id for the '<em><b>Egy Szenario</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__EGY_SZENARIO = 7;
    /**
     * The feature id for the '<em><b>Glosse</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__GLOSSE = 8;
    /**
     * The feature id for the '<em><b>Egy TB3 Start</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__EGY_TB3_START = 9;
    /**
     * The feature id for the '<em><b>Egy TB3 End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE__EGY_TB3_END = 10;
    /**
     * The number of structural features of the '<em>Egy Txt Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE_FEATURE_COUNT = 11;
    /**
     * The number of operations of the '<em>Egy Txt Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_TXT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.EgyWordTypeImpl <em>Egy Word Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.EgyWordTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyWordType()
     */
    int EGY_WORD_TYPE = 13;
    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__FORM = 0;
    /**
     * The feature id for the '<em><b>Translat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__TRANSLAT = 1;
    /**
     * The feature id for the '<em><b>Graphics</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__GRAPHICS = 2;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__BTS_CODES = 3;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__COMMENT = 4;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__AUTHOR = 5;
    /**
     * The feature id for the '<em><b>Connect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__CONNECT = 6;
    /**
     * The feature id for the '<em><b>FKey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__FKEY = 7;
    /**
     * The feature id for the '<em><b>Leipzig3 Modul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__LEIPZIG3_MODUL = 8;
    /**
     * The feature id for the '<em><b>LKey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__LKEY = 9;
    /**
     * The feature id for the '<em><b>LType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__LTYPE = 10;
    /**
     * The feature id for the '<em><b>Reihenfolge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__REIHENFOLGE = 11;
    /**
     * The feature id for the '<em><b>Reihenfolge ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__REIHENFOLGE_ID = 12;
    /**
     * The feature id for the '<em><b>Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__SCRIPT = 13;
    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__STATUS = 14;
    /**
     * The feature id for the '<em><b>WChr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__WCHR = 15;
    /**
     * The feature id for the '<em><b>WType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE__WTYPE = 16;
    /**
     * The number of structural features of the '<em>Egy Word Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE_FEATURE_COUNT = 17;
    /**
     * The number of operations of the '<em>Egy Word Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EGY_WORD_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.FormattingElementTypeImpl <em>Formatting Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.FormattingElementTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getFormattingElementType()
     */
    int FORMATTING_ELEMENT_TYPE = 14;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FORMATTING_ELEMENT_TYPE__VALUE = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FORMATTING_ELEMENT_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FORMATTING_ELEMENT_TYPE__TYPE = 2;
    /**
     * The number of structural features of the '<em>Formatting Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FORMATTING_ELEMENT_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Formatting Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FORMATTING_ELEMENT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.GlossePassageTypeImpl <em>Glosse Passage Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.GlossePassageTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getGlossePassageType()
     */
    int GLOSSE_PASSAGE_TYPE = 15;
    /**
     * The feature id for the '<em><b>Passage ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_PASSAGE_TYPE__PASSAGE_ID = 0;
    /**
     * The feature id for the '<em><b>Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_PASSAGE_TYPE__SCRIPT = 1;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_PASSAGE_TYPE__TYPE = 2;
    /**
     * The number of structural features of the '<em>Glosse Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_PASSAGE_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Glosse Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_PASSAGE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.GlosseTypeImpl <em>Glosse Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.GlosseTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getGlosseType()
     */
    int GLOSSE_TYPE = 16;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__GROUP = 0;
    /**
     * The feature id for the '<em><b>Egy Sent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__EGY_SENT = 1;
    /**
     * The feature id for the '<em><b>Egy TB1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__EGY_TB1 = 2;
    /**
     * The feature id for the '<em><b>Egy TB3 Start</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__EGY_TB3_START = 3;
    /**
     * The feature id for the '<em><b>Egy TB3 End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__EGY_TB3_END = 4;
    /**
     * The feature id for the '<em><b>Egy Word</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__EGY_WORD = 5;
    /**
     * The feature id for the '<em><b>Line Count</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__LINE_COUNT = 6;
    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__NOTE = 7;
    /**
     * The feature id for the '<em><b>Formatting Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__FORMATTING_ELEMENT = 8;
    /**
     * The feature id for the '<em><b>Language Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__LANGUAGE_PASSAGE = 9;
    /**
     * The feature id for the '<em><b>Baustein Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__BAUSTEIN_PASSAGE = 10;
    /**
     * The feature id for the '<em><b>Leipzig Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__LEIPZIG_PASSAGE = 11;
    /**
     * The feature id for the '<em><b>Glosse Passage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__GLOSSE_PASSAGE = 12;
    /**
     * The feature id for the '<em><b>Punctuation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__PUNCTUATION = 13;
    /**
     * The feature id for the '<em><b>Egy Punctuation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__EGY_PUNCTUATION = 14;
    /**
     * The feature id for the '<em><b>Passage ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE__PASSAGE_ID = 15;
    /**
     * The number of structural features of the '<em>Glosse Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE_FEATURE_COUNT = 16;
    /**
     * The number of operations of the '<em>Glosse Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GLOSSE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.LanguagePassageTypeImpl <em>Language Passage Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.LanguagePassageTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLanguagePassageType()
     */
    int LANGUAGE_PASSAGE_TYPE = 17;
    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LANGUAGE_PASSAGE_TYPE__LANGUAGE = 0;
    /**
     * The feature id for the '<em><b>Passage ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LANGUAGE_PASSAGE_TYPE__PASSAGE_ID = 1;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LANGUAGE_PASSAGE_TYPE__TYPE = 2;
    /**
     * The number of structural features of the '<em>Language Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LANGUAGE_PASSAGE_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Language Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LANGUAGE_PASSAGE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.LeipzigPassageTypeImpl <em>Leipzig Passage Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.LeipzigPassageTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLeipzigPassageType()
     */
    int LEIPZIG_PASSAGE_TYPE = 18;
    /**
     * The feature id for the '<em><b>Auszeichnung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG = 0;
    /**
     * The feature id for the '<em><b>Passage ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEIPZIG_PASSAGE_TYPE__PASSAGE_ID = 1;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEIPZIG_PASSAGE_TYPE__TYPE = 2;
    /**
     * The number of structural features of the '<em>Leipzig Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEIPZIG_PASSAGE_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Leipzig Passage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEIPZIG_PASSAGE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.LineCountTypeImpl <em>Line Count Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.LineCountTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLineCountType()
     */
    int LINE_COUNT_TYPE = 19;
    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LINE_COUNT_TYPE__MIXED = 0;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LINE_COUNT_TYPE__GROUP = 1;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LINE_COUNT_TYPE__VALUE = 2;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LINE_COUNT_TYPE__COMMENT = 3;
    /**
     * The number of structural features of the '<em>Line Count Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LINE_COUNT_TYPE_FEATURE_COUNT = 4;
    /**
     * The number of operations of the '<em>Line Count Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LINE_COUNT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.NoteTypeImpl <em>Note Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.NoteTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getNoteType()
     */
    int NOTE_TYPE = 20;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NOTE_TYPE__VALUE = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NOTE_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NOTE_TYPE__COMMENT = 2;
    /**
     * The number of structural features of the '<em>Note Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NOTE_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Note Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NOTE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.PassportDataItemImpl <em>Passport Data Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.PassportDataItemImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPassportDataItem()
     */
    int PASSPORT_DATA_ITEM = 21;
    /**
     * The feature id for the '<em><b>Passport Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM = 0;
    /**
     * The number of structural features of the '<em>Passport Data Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_FEATURE_COUNT = 1;
    /**
     * The number of operations of the '<em>Passport Data Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.PassportDataItemTypeImpl <em>Passport Data Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.PassportDataItemTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPassportDataItemType()
     */
    int PASSPORT_DATA_ITEM_TYPE = 22;
    /**
     * The feature id for the '<em><b>Ths Entry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_TYPE__THS_ENTRY = 0;
    /**
     * The feature id for the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_TYPE__CODE = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_TYPE__CATEGORY = 3;
    /**
     * The number of structural features of the '<em>Passport Data Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_TYPE_FEATURE_COUNT = 4;
    /**
     * The number of operations of the '<em>Passport Data Item Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PASSPORT_DATA_ITEM_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.PicturesTableTypeImpl <em>Pictures Table Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.PicturesTableTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPicturesTableType()
     */
    int PICTURES_TABLE_TYPE = 23;
    /**
     * The feature id for the '<em><b>Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURES_TABLE_TYPE__PICTURE = 0;
    /**
     * The number of structural features of the '<em>Pictures Table Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURES_TABLE_TYPE_FEATURE_COUNT = 1;
    /**
     * The number of operations of the '<em>Pictures Table Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURES_TABLE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.PictureTypeImpl <em>Picture Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.PictureTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPictureType()
     */
    int PICTURE_TYPE = 24;
    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__FILE_NAME = 0;
    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__FILE_PATH = 1;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__NAME = 2;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__AUTHOR = 3;
    /**
     * The feature id for the '<em><b>Bibliography</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__BIBLIOGRAPHY = 4;
    /**
     * The feature id for the '<em><b>Authorization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__AUTHORIZATION = 5;
    /**
     * The feature id for the '<em><b>Dpi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__DPI = 6;
    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__HEIGHT = 7;
    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__KEY = 8;
    /**
     * The feature id for the '<em><b>Pict Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__PICT_TYPE = 9;
    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__SCALE = 10;
    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE__WIDTH = 11;
    /**
     * The number of structural features of the '<em>Picture Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE_FEATURE_COUNT = 12;
    /**
     * The number of operations of the '<em>Picture Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PICTURE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.PunctuationTypeImpl <em>Punctuation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.PunctuationTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPunctuationType()
     */
    int PUNCTUATION_TYPE = 25;
    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PUNCTUATION_TYPE__VALUE = 0;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PUNCTUATION_TYPE__BTS_CODES = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PUNCTUATION_TYPE__COMMENT = 2;
    /**
     * The number of structural features of the '<em>Punctuation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PUNCTUATION_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>Punctuation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PUNCTUATION_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCArrangementTypeImpl <em>TC Arrangement Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCArrangementTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCArrangementType()
     */
    int TC_ARRANGEMENT_TYPE = 26;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>TC Arrangement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__TC_ARRANGEMENT = 4;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__TC_OBJECT = 5;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__AUTHOR = 6;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__SORT_KEY = 7;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE__TC_NAME = 8;
    /**
     * The number of structural features of the '<em>TC Arrangement Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE_FEATURE_COUNT = 9;
    /**
     * The number of operations of the '<em>TC Arrangement Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_ARRANGEMENT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCCaptionTypeImpl <em>TC Caption Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCCaptionTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCCaptionType()
     */
    int TC_CAPTION_TYPE = 27;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_CAPTION = 4;
    /**
     * The feature id for the '<em><b>TC Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_GROUP = 5;
    /**
     * The feature id for the '<em><b>TC Arrangement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_ARRANGEMENT = 6;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_OBJECT = 7;
    /**
     * The feature id for the '<em><b>TC Obj Part</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_OBJ_PART = 8;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_TEXT = 9;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__AUTHOR = 10;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__SORT_KEY = 11;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE__TC_NAME = 12;
    /**
     * The number of structural features of the '<em>TC Caption Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE_FEATURE_COUNT = 13;
    /**
     * The number of operations of the '<em>TC Caption Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_CAPTION_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCGroupTypeImpl <em>TC Group Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCGroupTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCGroupType()
     */
    int TC_GROUP_TYPE = 28;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_CAPTION = 4;
    /**
     * The feature id for the '<em><b>TC Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_GROUP = 5;
    /**
     * The feature id for the '<em><b>TC Arrangement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_ARRANGEMENT = 6;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_OBJECT = 7;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__AUTHOR = 8;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__SORT_KEY = 9;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE__TC_NAME = 10;
    /**
     * The number of structural features of the '<em>TC Group Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE_FEATURE_COUNT = 11;
    /**
     * The number of operations of the '<em>TC Group Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_GROUP_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCHeaderTypeImpl <em>TC Header Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCHeaderTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCHeaderType()
     */
    int TC_HEADER_TYPE = 29;
    /**
     * The feature id for the '<em><b>Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE__DATE = 0;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE__AUTHOR = 1;
    /**
     * The feature id for the '<em><b>Project</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE__PROJECT = 2;
    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE__TITLE = 3;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE__COMMENT = 4;
    /**
     * The number of structural features of the '<em>TC Header Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE_FEATURE_COUNT = 5;
    /**
     * The number of operations of the '<em>TC Header Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_HEADER_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCLocationTypeImpl <em>TC Location Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCLocationTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCLocationType()
     */
    int TC_LOCATION_TYPE = 30;
    /**
     * The feature id for the '<em><b>Ths Entry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_LOCATION_TYPE__THS_ENTRY = 0;
    /**
     * The feature id for the '<em><b>Museum Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_LOCATION_TYPE__MUSEUM_NUMBER = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_LOCATION_TYPE__COMMENT = 2;
    /**
     * The number of structural features of the '<em>TC Location Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_LOCATION_TYPE_FEATURE_COUNT = 3;
    /**
     * The number of operations of the '<em>TC Location Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_LOCATION_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCObjectTypeImpl <em>TC Object Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCObjectTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCObjectType()
     */
    int TC_OBJECT_TYPE = 31;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_CAPTION = 4;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_OBJECT = 5;
    /**
     * The feature id for the '<em><b>TC Obj Part</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_OBJ_PART = 6;
    /**
     * The feature id for the '<em><b>TC Scene</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_SCENE = 7;
    /**
     * The feature id for the '<em><b>TC Super Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_SUPER_TEXT = 8;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_TEXT = 9;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__AUTHOR = 10;
    /**
     * The feature id for the '<em><b>Bearbeitungsstand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__BEARBEITUNGSSTAND = 11;
    /**
     * The feature id for the '<em><b>GIS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__GIS = 12;
    /**
     * The feature id for the '<em><b>Object ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__OBJECT_ID = 13;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__SORT_KEY = 14;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE__TC_NAME = 15;
    /**
     * The number of structural features of the '<em>TC Object Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE_FEATURE_COUNT = 16;
    /**
     * The number of operations of the '<em>TC Object Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJECT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCObjPartTypeImpl <em>TC Obj Part Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCObjPartTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCObjPartType()
     */
    int TC_OBJ_PART_TYPE = 32;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_CAPTION = 4;
    /**
     * The feature id for the '<em><b>TC Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_OBJECT = 5;
    /**
     * The feature id for the '<em><b>TC Obj Part</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_OBJ_PART = 6;
    /**
     * The feature id for the '<em><b>TC Scene</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_SCENE = 7;
    /**
     * The feature id for the '<em><b>TC Super Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_SUPER_TEXT = 8;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_TEXT = 9;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__AUTHOR = 10;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__SORT_KEY = 11;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE__TC_NAME = 12;
    /**
     * The number of structural features of the '<em>TC Obj Part Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE_FEATURE_COUNT = 13;
    /**
     * The number of operations of the '<em>TC Obj Part Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_OBJ_PART_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCPassportTypeImpl <em>TC Passport Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCPassportTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCPassportType()
     */
    int TC_PASSPORT_TYPE = 33;
    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__DEFINITION = 0;
    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__PROTOCOL = 1;
    /**
     * The feature id for the '<em><b>Bibliography</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__BIBLIOGRAPHY = 2;
    /**
     * The feature id for the '<em><b>Provenance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__PROVENANCE = 3;
    /**
     * The feature id for the '<em><b>Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__DATE = 4;
    /**
     * The feature id for the '<em><b>Object Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__OBJECT_TYPE = 5;
    /**
     * The feature id for the '<em><b>Depiction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__DEPICTION = 6;
    /**
     * The feature id for the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__SCRIPT = 7;
    /**
     * The feature id for the '<em><b>Language</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__LANGUAGE = 8;
    /**
     * The feature id for the '<em><b>Lang Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__LANG_COMMENT = 9;
    /**
     * The feature id for the '<em><b>Work</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__WORK = 10;
    /**
     * The feature id for the '<em><b>Text Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__TEXT_TYPE = 11;
    /**
     * The feature id for the '<em><b>Line Count</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__LINE_COUNT = 12;
    /**
     * The feature id for the '<em><b>Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__CODES = 13;
    /**
     * The feature id for the '<em><b>Wb Folder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__WB_FOLDER = 14;
    /**
     * The feature id for the '<em><b>Wb Slips</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__WB_SLIPS = 15;
    /**
     * The feature id for the '<em><b>Code1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__CODE1 = 16;
    /**
     * The feature id for the '<em><b>Code2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__CODE2 = 17;
    /**
     * The feature id for the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__BTS_CODES = 18;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__COMMENT = 19;
    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__NOTES = 20;
    /**
     * The feature id for the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__FULL_NAME = 21;
    /**
     * The feature id for the '<em><b>Name Sort</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__NAME_SORT = 22;
    /**
     * The feature id for the '<em><b>TC Location</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE__TC_LOCATION = 23;
    /**
     * The number of structural features of the '<em>TC Passport Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE_FEATURE_COUNT = 24;
    /**
     * The number of operations of the '<em>TC Passport Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PASSPORT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCPictureTypeImpl <em>TC Picture Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCPictureTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCPictureType()
     */
    int TC_PICTURE_TYPE = 34;
    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PICTURE_TYPE__MIXED = 0;
    /**
     * The feature id for the '<em><b>Picture Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PICTURE_TYPE__PICTURE_TYPE = 1;
    /**
     * The number of structural features of the '<em>TC Picture Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PICTURE_TYPE_FEATURE_COUNT = 2;
    /**
     * The number of operations of the '<em>TC Picture Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_PICTURE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCSceneTypeImpl <em>TC Scene Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCSceneTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCSceneType()
     */
    int TC_SCENE_TYPE = 35;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__GROUP = 3;
    /**
     * The feature id for the '<em><b>TC Caption</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_CAPTION = 4;
    /**
     * The feature id for the '<em><b>TC Scene</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_SCENE = 5;
    /**
     * The feature id for the '<em><b>TC Super Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_SUPER_TEXT = 6;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_TEXT = 7;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__AUTHOR = 8;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__SORT_KEY = 9;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE__TC_NAME = 10;
    /**
     * The number of structural features of the '<em>TC Scene Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE_FEATURE_COUNT = 11;
    /**
     * The number of operations of the '<em>TC Scene Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SCENE_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCSuperTextTypeImpl <em>TC Super Text Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCSuperTextTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCSuperTextType()
     */
    int TC_SUPER_TEXT_TYPE = 36;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>TC Text</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__TC_TEXT = 3;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__AUTHOR = 4;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__SORT_KEY = 5;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE__TC_NAME = 6;
    /**
     * The number of structural features of the '<em>TC Super Text Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE_FEATURE_COUNT = 7;
    /**
     * The number of operations of the '<em>TC Super Text Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_SUPER_TEXT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.TCTextTypeImpl <em>TC Text Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.TCTextTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCTextType()
     */
    int TC_TEXT_TYPE = 37;
    /**
     * The feature id for the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__TC_PASSPORT = 0;
    /**
     * The feature id for the '<em><b>TC Picture</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__TC_PICTURE = 1;
    /**
     * The feature id for the '<em><b>TC Notebook</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__TC_NOTEBOOK = 2;
    /**
     * The feature id for the '<em><b>Egy Txt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__EGY_TXT = 3;
    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__AUTHOR = 4;
    /**
     * The feature id for the '<em><b>Bearbeitungsstand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__BEARBEITUNGSSTAND = 5;
    /**
     * The feature id for the '<em><b>Sort Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__SORT_KEY = 6;
    /**
     * The feature id for the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__TC_NAME = 7;
    /**
     * The feature id for the '<em><b>Text ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE__TEXT_ID = 8;
    /**
     * The number of structural features of the '<em>TC Text Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE_FEATURE_COUNT = 9;
    /**
     * The number of operations of the '<em>TC Text Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TC_TEXT_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.ThsEntryTypeImpl <em>Ths Entry Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.ThsEntryTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getThsEntryType()
     */
    int THS_ENTRY_TYPE = 38;
    /**
     * The feature id for the '<em><b>Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE__TERM = 0;
    /**
     * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE__HIERARCHY = 1;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE__COMMENT = 2;
    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE__CATEGORY = 3;
    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE__KEY = 4;
    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE__TYPE = 5;
    /**
     * The number of structural features of the '<em>Ths Entry Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE_FEATURE_COUNT = 6;
    /**
     * The number of operations of the '<em>Ths Entry Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int THS_ENTRY_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.impl.WorkTypeImpl <em>Work Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.impl.WorkTypeImpl
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getWorkType()
     */
    int WORK_TYPE = 39;
    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_TYPE__NAME = 0;
    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_TYPE__COMMENT = 1;
    /**
     * The feature id for the '<em><b>Thesaurus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_TYPE__THESAURUS = 2;
    /**
     * The feature id for the '<em><b>Version Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_TYPE__VERSION_CODE = 3;
    /**
     * The number of structural features of the '<em>Work Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_TYPE_FEATURE_COUNT = 4;
    /**
     * The number of operations of the '<em>Work Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_TYPE_OPERATION_COUNT = 0;
    /**
     * The meta object id for the '{@link CorpusDTDneu.CategoryType <em>Category Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.CategoryType
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryType()
     */
    int CATEGORY_TYPE = 40;
    /**
     * The meta object id for the '{@link CorpusDTDneu.CategoryType1 <em>Category Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.CategoryType1
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryType1()
     */
    int CATEGORY_TYPE1 = 41;
    /**
     * The meta object id for the '{@link CorpusDTDneu.LTypeType <em>LType Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.LTypeType
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLTypeType()
     */
    int LTYPE_TYPE = 42;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType <em>Type Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType()
     */
    int TYPE_TYPE = 43;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType1 <em>Type Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType1
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType1()
     */
    int TYPE_TYPE1 = 44;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType2 <em>Type Type2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType2
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType2()
     */
    int TYPE_TYPE2 = 45;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType3 <em>Type Type3</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType3
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType3()
     */
    int TYPE_TYPE3 = 46;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType4 <em>Type Type4</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType4
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType4()
     */
    int TYPE_TYPE4 = 47;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType5 <em>Type Type5</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType5
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType5()
     */
    int TYPE_TYPE5 = 48;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType6 <em>Type Type6</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType6
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType6()
     */
    int TYPE_TYPE6 = 49;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType7 <em>Type Type7</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType7
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType7()
     */
    int TYPE_TYPE7 = 50;
    /**
     * The meta object id for the '{@link CorpusDTDneu.TypeType8 <em>Type Type8</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType8
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType8()
     */
    int TYPE_TYPE8 = 51;
    /**
     * The meta object id for the '<em>Category Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.CategoryType
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryTypeObject()
     */
    int CATEGORY_TYPE_OBJECT = 52;
    /**
     * The meta object id for the '<em>Category Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.CategoryType1
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryTypeObject1()
     */
    int CATEGORY_TYPE_OBJECT1 = 53;
    /**
     * The meta object id for the '<em>LType Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.LTypeType
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLTypeTypeObject()
     */
    int LTYPE_TYPE_OBJECT = 54;
    /**
     * The meta object id for the '<em>Type Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType1
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject()
     */
    int TYPE_TYPE_OBJECT = 55;
    /**
     * The meta object id for the '<em>Type Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType3
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject1()
     */
    int TYPE_TYPE_OBJECT1 = 56;
    /**
     * The meta object id for the '<em>Type Type Object2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType5
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject2()
     */
    int TYPE_TYPE_OBJECT2 = 57;
    /**
     * The meta object id for the '<em>Type Type Object3</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType2
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject3()
     */
    int TYPE_TYPE_OBJECT3 = 58;
    /**
     * The meta object id for the '<em>Type Type Object4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject4()
     */
    int TYPE_TYPE_OBJECT4 = 59;
    /**
     * The meta object id for the '<em>Type Type Object5</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType6
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject5()
     */
    int TYPE_TYPE_OBJECT5 = 60;
    /**
     * The meta object id for the '<em>Type Type Object6</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType4
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject6()
     */
    int TYPE_TYPE_OBJECT6 = 61;
    /**
     * The meta object id for the '<em>Type Type Object7</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType7
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject7()
     */
    int TYPE_TYPE_OBJECT7 = 62;
    /**
     * The meta object id for the '<em>Type Type Object8</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see CorpusDTDneu.TypeType8
     * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject8()
     */
    int TYPE_TYPE_OBJECT8 = 63;
    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    CorpusDTDneuPackage eINSTANCE = CorpusDTDneu.impl.CorpusDTDneuPackageImpl.init();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.BausteinPassageType <em>Baustein Passage Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Baustein Passage Type</em>'.
     * @generated
     * @see CorpusDTDneu.BausteinPassageType
     */
    EClass getBausteinPassageType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.BausteinPassageType#getBaustein <em>Baustein</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Baustein</em>'.
     * @generated
     * @see CorpusDTDneu.BausteinPassageType#getBaustein()
     * @see #getBausteinPassageType()
     */
    EAttribute getBausteinPassageType_Baustein();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.BausteinPassageType#getPassageID <em>Passage ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Passage ID</em>'.
     * @generated
     * @see CorpusDTDneu.BausteinPassageType#getPassageID()
     * @see #getBausteinPassageType()
     */
    EAttribute getBausteinPassageType_PassageID();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.BausteinPassageType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.BausteinPassageType#getType()
     * @see #getBausteinPassageType()
     */
    EAttribute getBausteinPassageType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.DateThsType <em>Date Ths Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Date Ths Type</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType
     */
    EClass getDateThsType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DateThsType#getTerm <em>Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Term</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType#getTerm()
     * @see #getDateThsType()
     */
    EAttribute getDateThsType_Term();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DateThsType#getLowerTerm <em>Lower Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Lower Term</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType#getLowerTerm()
     * @see #getDateThsType()
     */
    EAttribute getDateThsType_LowerTerm();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DateThsType#getUpperTerm <em>Upper Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Upper Term</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType#getUpperTerm()
     * @see #getDateThsType()
     */
    EAttribute getDateThsType_UpperTerm();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DateThsType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType#getType()
     * @see #getDateThsType()
     */
    EAttribute getDateThsType_Type();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DateThsType#getYearFrom <em>Year From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Year From</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType#getYearFrom()
     * @see #getDateThsType()
     */
    EAttribute getDateThsType_YearFrom();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DateThsType#getYearTo <em>Year To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Year To</em>'.
     * @generated
     * @see CorpusDTDneu.DateThsType#getYearTo()
     * @see #getDateThsType()
     */
    EAttribute getDateThsType_YearTo();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.DateType <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Date Type</em>'.
     * @generated
     * @see CorpusDTDneu.DateType
     */
    EClass getDateType();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.DateType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @generated
     * @see CorpusDTDneu.DateType#getMixed()
     * @see #getDateType()
     */
    EAttribute getDateType_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.DateType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.DateType#getGroup()
     * @see #getDateType()
     */
    EAttribute getDateType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.DateType#getDateThs <em>Date Ths</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Date Ths</em>'.
     * @generated
     * @see CorpusDTDneu.DateType#getDateThs()
     * @see #getDateType()
     */
    EReference getDateType_DateThs();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.DateType#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Code</em>'.
     * @generated
     * @see CorpusDTDneu.DateType#getCode()
     * @see #getDateType()
     */
    EAttribute getDateType_Code();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.DateType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.DateType#getComment()
     * @see #getDateType()
     */
    EAttribute getDateType_Comment();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Document Root</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link CorpusDTDneu.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link CorpusDTDneu.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getAuthor()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Author();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getBausteinPassage <em>Baustein Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Baustein Passage</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getBausteinPassage()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_BausteinPassage();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getBibliography <em>Bibliography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bibliography</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getBibliography()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Bibliography();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getBtsCodes()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Code</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getCode()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Code();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getCode1 <em>Code1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Code1</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getCode1()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Code1();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getCode2 <em>Code2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Code2</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getCode2()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Code2();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getCodes <em>Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Codes</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getCodes()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Codes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getComment()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Comment();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Date</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getDate()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Date();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getDateThs <em>Date Ths</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Date Ths</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getDateThs()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_DateThs();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getDefinition()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Definition();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getDepiction <em>Depiction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Depiction</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getDepiction()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Depiction();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyPunctuation <em>Egy Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyPunctuation()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyPunctuation();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgySent()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgySent();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgySubTxt <em>Egy Sub Txt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Sub Txt</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgySubTxt()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgySubTxt();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgySzenario <em>Egy Szenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Szenario</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgySzenario()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgySzenario();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyTB1 <em>Egy TB1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy TB1</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyTB1()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyTB1();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyTB3End <em>Egy TB3 End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy TB3 End</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyTB3End()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyTB3End();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyTB3Start <em>Egy TB3 Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy TB3 Start</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyTB3Start()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyTB3Start();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyTxt <em>Egy Txt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Txt</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyTxt()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyTxt();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyTxtCorpus <em>Egy Txt Corpus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Txt Corpus</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyTxtCorpus()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyTxtCorpus();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getEgyWord <em>Egy Word</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Word</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getEgyWord()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_EgyWord();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getFileName()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_FileName();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getFilePath <em>File Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Path</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getFilePath()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_FilePath();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getForm <em>Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Form</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getForm()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Form();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getFormattingElement <em>Formatting Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Formatting Element</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getFormattingElement()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_FormattingElement();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getFullName()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_FullName();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getGlosse <em>Glosse</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Glosse</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getGlosse()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Glosse();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getGlossePassage <em>Glosse Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Glosse Passage</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getGlossePassage()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_GlossePassage();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getGraphics <em>Graphics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Graphics</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getGraphics()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Graphics();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getHierarchy <em>Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Hierarchy</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getHierarchy()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Hierarchy();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getLangComment <em>Lang Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Lang Comment</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getLangComment()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_LangComment();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Language</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getLanguage()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Language();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getLanguagePassage <em>Language Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Language Passage</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getLanguagePassage()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_LanguagePassage();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getLeipzigPassage <em>Leipzig Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Leipzig Passage</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getLeipzigPassage()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_LeipzigPassage();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getLineCount <em>Line Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Line Count</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getLineCount()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_LineCount();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getLowerTerm <em>Lower Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Lower Term</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getLowerTerm()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_LowerTerm();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getMuseumNumber <em>Museum Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Museum Number</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getMuseumNumber()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_MuseumNumber();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getName()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getNameSort <em>Name Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name Sort</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getNameSort()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_NameSort();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Note</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getNote()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Note();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getNotes()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Notes();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getObjectType <em>Object Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Object Type</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getObjectType()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_ObjectType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getPassportDataItem <em>Passport Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Passport Data Item</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getPassportDataItem()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_PassportDataItem();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getPicture <em>Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Picture</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getPicture()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Picture();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getPicturesTable <em>Pictures Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Pictures Table</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getPicturesTable()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_PicturesTable();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Project</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getProject()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Project();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getProtocol()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Protocol();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getProvenance <em>Provenance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Provenance</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getProvenance()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Provenance();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getPunctuation <em>Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getPunctuation()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Punctuation();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getScript()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Script();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCArrangement <em>TC Arrangement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Arrangement</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCArrangement()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCArrangement();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCCaption()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCCaption();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCGroup <em>TC Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Group</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCGroup()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCGroup();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCHeader <em>TC Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Header</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCHeader()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCHeader();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCLocation <em>TC Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Location</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCLocation()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCLocation();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCNotebook()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_TCNotebook();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCObject()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCObject();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCObjPart <em>TC Obj Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Obj Part</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCObjPart()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCObjPart();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCPassport()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCPassport();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCPicture()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCPicture();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCScene <em>TC Scene</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Scene</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCScene()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCScene();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCSuperText <em>TC Super Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Super Text</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCSuperText()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCSuperText();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTCText()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TCText();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getTerm <em>Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Term</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTerm()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Term();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getTextType <em>Text Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Text Type</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTextType()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_TextType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getThsEntry <em>Ths Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Ths Entry</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getThsEntry()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_ThsEntry();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Title</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTitle()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Title();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getTranslat <em>Translat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Translat</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTranslat()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Translat();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getTranslation <em>Translation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Translation</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getTranslation()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Translation();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getUpperTerm <em>Upper Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Upper Term</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getUpperTerm()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_UpperTerm();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getValue()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_Value();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getWbFolder <em>Wb Folder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Wb Folder</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getWbFolder()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_WbFolder();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.DocumentRoot#getWbSlips <em>Wb Slips</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Wb Slips</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getWbSlips()
     * @see #getDocumentRoot()
     */
    EAttribute getDocumentRoot_WbSlips();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.DocumentRoot#getWork <em>Work</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Work</em>'.
     * @generated
     * @see CorpusDTDneu.DocumentRoot#getWork()
     * @see #getDocumentRoot()
     */
    EReference getDocumentRoot_Work();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyPunctuationType <em>Egy Punctuation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Punctuation Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyPunctuationType
     */
    EClass getEgyPunctuationType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyPunctuationType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.EgyPunctuationType#getValue()
     * @see #getEgyPunctuationType()
     */
    EAttribute getEgyPunctuationType_Value();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyPunctuationType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgyPunctuationType#getBtsCodes()
     * @see #getEgyPunctuationType()
     */
    EAttribute getEgyPunctuationType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyPunctuationType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgyPunctuationType#getComment()
     * @see #getEgyPunctuationType()
     */
    EAttribute getEgyPunctuationType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyPunctuationType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyPunctuationType#getType()
     * @see #getEgyPunctuationType()
     */
    EAttribute getEgyPunctuationType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgySentType <em>Egy Sent Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Sent Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType
     */
    EClass getEgySentType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getValue()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Value();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getTranslat <em>Translat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Translat</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getTranslat()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Translat();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getBtsCodes()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getComment()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Comment();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.EgySentType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getGroup()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getEgySent()
     * @see #getEgySentType()
     */
    EReference getEgySentType_EgySent();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getEgyTB1 <em>Egy TB1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB1</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getEgyTB1()
     * @see #getEgySentType()
     */
    EReference getEgySentType_EgyTB1();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getEgyTB3Start <em>Egy TB3 Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 Start</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getEgyTB3Start()
     * @see #getEgySentType()
     */
    EReference getEgySentType_EgyTB3Start();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getEgyTB3End <em>Egy TB3 End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 End</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getEgyTB3End()
     * @see #getEgySentType()
     */
    EReference getEgySentType_EgyTB3End();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getEgyWord <em>Egy Word</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Word</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getEgyWord()
     * @see #getEgySentType()
     */
    EReference getEgySentType_EgyWord();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getLineCount <em>Line Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Line Count</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getLineCount()
     * @see #getEgySentType()
     */
    EReference getEgySentType_LineCount();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Note</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getNote()
     * @see #getEgySentType()
     */
    EReference getEgySentType_Note();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getFormattingElement <em>Formatting Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Formatting Element</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getFormattingElement()
     * @see #getEgySentType()
     */
    EReference getEgySentType_FormattingElement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getLanguagePassage <em>Language Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Language Passage</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getLanguagePassage()
     * @see #getEgySentType()
     */
    EReference getEgySentType_LanguagePassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getBausteinPassage <em>Baustein Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Baustein Passage</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getBausteinPassage()
     * @see #getEgySentType()
     */
    EReference getEgySentType_BausteinPassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getLeipzigPassage <em>Leipzig Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Leipzig Passage</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getLeipzigPassage()
     * @see #getEgySentType()
     */
    EReference getEgySentType_LeipzigPassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getGlossePassage <em>Glosse Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Glosse Passage</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getGlossePassage()
     * @see #getEgySentType()
     */
    EReference getEgySentType_GlossePassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getPunctuation <em>Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getPunctuation()
     * @see #getEgySentType()
     */
    EReference getEgySentType_Punctuation();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySentType#getEgyPunctuation <em>Egy Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getEgyPunctuation()
     * @see #getEgySentType()
     */
    EReference getEgySentType_EgyPunctuation();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getAuthor()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Language</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getLanguage()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Language();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getLeipzig3Modul <em>Leipzig3 Modul</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Leipzig3 Modul</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getLeipzig3Modul()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Leipzig3Modul();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySentType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgySentType#getType()
     * @see #getEgySentType()
     */
    EAttribute getEgySentType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgySubTxtType <em>Egy Sub Txt Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Sub Txt Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType
     */
    EClass getEgySubTxtType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySubTxtType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getName()
     * @see #getEgySubTxtType()
     */
    EAttribute getEgySubTxtType_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySubTxtType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getBtsCodes()
     * @see #getEgySubTxtType()
     */
    EAttribute getEgySubTxtType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySubTxtType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getComment()
     * @see #getEgySubTxtType()
     */
    EAttribute getEgySubTxtType_Comment();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.EgySubTxtType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getGroup()
     * @see #getEgySubTxtType()
     */
    EAttribute getEgySubTxtType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getEgySubTxt <em>Egy Sub Txt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sub Txt</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getEgySubTxt()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_EgySubTxt();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getEgySent()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_EgySent();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getEgyTB1 <em>Egy TB1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB1</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getEgyTB1()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_EgyTB1();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getEgySzenario <em>Egy Szenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Szenario</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getEgySzenario()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_EgySzenario();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getGlosse <em>Glosse</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Glosse</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getGlosse()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_Glosse();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getEgyTB3Start <em>Egy TB3 Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 Start</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getEgyTB3Start()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_EgyTB3Start();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySubTxtType#getEgyTB3End <em>Egy TB3 End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 End</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getEgyTB3End()
     * @see #getEgySubTxtType()
     */
    EReference getEgySubTxtType_EgyTB3End();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySubTxtType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.EgySubTxtType#getSortKey()
     * @see #getEgySubTxtType()
     */
    EAttribute getEgySubTxtType_SortKey();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgySzenarioType <em>Egy Szenario Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Szenario Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgySzenarioType
     */
    EClass getEgySzenarioType();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgySzenarioType#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.EgySzenarioType#getEgySent()
     * @see #getEgySzenarioType()
     */
    EReference getEgySzenarioType_EgySent();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgySzenarioType#getInterneNummer <em>Interne Nummer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Interne Nummer</em>'.
     * @generated
     * @see CorpusDTDneu.EgySzenarioType#getInterneNummer()
     * @see #getEgySzenarioType()
     */
    EAttribute getEgySzenarioType_InterneNummer();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyTB1Type <em>Egy TB1 Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy TB1 Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type
     */
    EClass getEgyTB1Type();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB1Type#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getName()
     * @see #getEgyTB1Type()
     */
    EAttribute getEgyTB1Type_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB1Type#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getBtsCodes()
     * @see #getEgyTB1Type()
     */
    EAttribute getEgyTB1Type_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB1Type#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getComment()
     * @see #getEgyTB1Type()
     */
    EAttribute getEgyTB1Type_Comment();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.EgyTB1Type#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getGroup()
     * @see #getEgyTB1Type()
     */
    EAttribute getEgyTB1Type_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getEgySent()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_EgySent();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getEgyTB1 <em>Egy TB1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB1</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getEgyTB1()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_EgyTB1();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getEgyTB3Start <em>Egy TB3 Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 Start</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getEgyTB3Start()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_EgyTB3Start();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getEgyTB3End <em>Egy TB3 End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 End</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getEgyTB3End()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_EgyTB3End();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getEgyWord <em>Egy Word</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Word</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getEgyWord()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_EgyWord();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getLineCount <em>Line Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Line Count</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getLineCount()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_LineCount();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Note</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getNote()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_Note();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getFormattingElement <em>Formatting Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Formatting Element</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getFormattingElement()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_FormattingElement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getPunctuation <em>Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getPunctuation()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_Punctuation();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTB1Type#getEgyPunctuation <em>Egy Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB1Type#getEgyPunctuation()
     * @see #getEgyTB1Type()
     */
    EReference getEgyTB1Type_EgyPunctuation();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyTB3EndType <em>Egy TB3 End Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy TB3 End Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3EndType
     */
    EClass getEgyTB3EndType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3EndType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3EndType#getName()
     * @see #getEgyTB3EndType()
     */
    EAttribute getEgyTB3EndType_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3EndType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3EndType#getBtsCodes()
     * @see #getEgyTB3EndType()
     */
    EAttribute getEgyTB3EndType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3EndType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3EndType#getComment()
     * @see #getEgyTB3EndType()
     */
    EAttribute getEgyTB3EndType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3EndType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Id</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3EndType#getId()
     * @see #getEgyTB3EndType()
     */
    EAttribute getEgyTB3EndType_Id();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3EndType#getIdRef <em>Id Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Id Ref</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3EndType#getIdRef()
     * @see #getEgyTB3EndType()
     */
    EAttribute getEgyTB3EndType_IdRef();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyTB3StartType <em>Egy TB3 Start Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy TB3 Start Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3StartType
     */
    EClass getEgyTB3StartType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3StartType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3StartType#getName()
     * @see #getEgyTB3StartType()
     */
    EAttribute getEgyTB3StartType_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3StartType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3StartType#getBtsCodes()
     * @see #getEgyTB3StartType()
     */
    EAttribute getEgyTB3StartType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3StartType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3StartType#getComment()
     * @see #getEgyTB3StartType()
     */
    EAttribute getEgyTB3StartType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3StartType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Id</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3StartType#getId()
     * @see #getEgyTB3StartType()
     */
    EAttribute getEgyTB3StartType_Id();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTB3StartType#getIdRef <em>Id Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Id Ref</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTB3StartType#getIdRef()
     * @see #getEgyTB3StartType()
     */
    EAttribute getEgyTB3StartType_IdRef();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyTxtCorpusType <em>Egy Txt Corpus Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Txt Corpus Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType
     */
    EClass getEgyTxtCorpusType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.EgyTxtCorpusType#getTCHeader <em>TC Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Header</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCHeader()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCHeader();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.EgyTxtCorpusType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getGroup()
     * @see #getEgyTxtCorpusType()
     */
    EAttribute getEgyTxtCorpusType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getPicturesTable <em>Pictures Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Pictures Table</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getPicturesTable()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_PicturesTable();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCCaption()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCCaption();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCGroup <em>TC Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Group</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCGroup()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCGroup();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCArrangement <em>TC Arrangement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Arrangement</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCArrangement()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCArrangement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCObject()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCObject();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCObjPart <em>TC Obj Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Obj Part</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCObjPart()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCObjPart();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCScene <em>TC Scene</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Scene</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCScene()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCScene();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getTCText()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_TCText();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtCorpusType#getEgyTxt <em>Egy Txt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Txt</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getEgyTxt()
     * @see #getEgyTxtCorpusType()
     */
    EReference getEgyTxtCorpusType_EgyTxt();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTxtCorpusType#getDTDVersion <em>DTD Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>DTD Version</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtCorpusType#getDTDVersion()
     * @see #getEgyTxtCorpusType()
     */
    EAttribute getEgyTxtCorpusType_DTDVersion();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyTxtType <em>Egy Txt Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Txt Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType
     */
    EClass getEgyTxtType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTxtType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getName()
     * @see #getEgyTxtType()
     */
    EAttribute getEgyTxtType_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTxtType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getBtsCodes()
     * @see #getEgyTxtType()
     */
    EAttribute getEgyTxtType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyTxtType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getComment()
     * @see #getEgyTxtType()
     */
    EAttribute getEgyTxtType_Comment();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.EgyTxtType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getGroup()
     * @see #getEgyTxtType()
     */
    EAttribute getEgyTxtType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getEgySubTxt <em>Egy Sub Txt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sub Txt</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getEgySubTxt()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_EgySubTxt();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getEgySent()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_EgySent();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getEgyTB1 <em>Egy TB1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB1</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getEgyTB1()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_EgyTB1();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getEgySzenario <em>Egy Szenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Szenario</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getEgySzenario()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_EgySzenario();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getGlosse <em>Glosse</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Glosse</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getGlosse()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_Glosse();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getEgyTB3Start <em>Egy TB3 Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 Start</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getEgyTB3Start()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_EgyTB3Start();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.EgyTxtType#getEgyTB3End <em>Egy TB3 End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 End</em>'.
     * @generated
     * @see CorpusDTDneu.EgyTxtType#getEgyTB3End()
     * @see #getEgyTxtType()
     */
    EReference getEgyTxtType_EgyTB3End();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.EgyWordType <em>Egy Word Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Egy Word Type</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType
     */
    EClass getEgyWordType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getForm <em>Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Form</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getForm()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Form();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getTranslat <em>Translat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Translat</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getTranslat()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Translat();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getGraphics <em>Graphics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Graphics</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getGraphics()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Graphics();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getBtsCodes()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getComment()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getAuthor()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getConnect <em>Connect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Connect</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getConnect()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Connect();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getFKey <em>FKey</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>FKey</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getFKey()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_FKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getLeipzig3Modul <em>Leipzig3 Modul</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Leipzig3 Modul</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getLeipzig3Modul()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Leipzig3Modul();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getLKey <em>LKey</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>LKey</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getLKey()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_LKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getLType <em>LType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>LType</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getLType()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_LType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getReihenfolge <em>Reihenfolge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Reihenfolge</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getReihenfolge()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Reihenfolge();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getReihenfolgeID <em>Reihenfolge ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Reihenfolge ID</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getReihenfolgeID()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_ReihenfolgeID();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Script</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getScript()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Script();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getStatus <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Status</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getStatus()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_Status();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getWChr <em>WChr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>WChr</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getWChr()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_WChr();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.EgyWordType#getWType <em>WType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>WType</em>'.
     * @generated
     * @see CorpusDTDneu.EgyWordType#getWType()
     * @see #getEgyWordType()
     */
    EAttribute getEgyWordType_WType();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.FormattingElementType <em>Formatting Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Formatting Element Type</em>'.
     * @generated
     * @see CorpusDTDneu.FormattingElementType
     */
    EClass getFormattingElementType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.FormattingElementType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.FormattingElementType#getValue()
     * @see #getFormattingElementType()
     */
    EAttribute getFormattingElementType_Value();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.FormattingElementType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.FormattingElementType#getBtsCodes()
     * @see #getFormattingElementType()
     */
    EAttribute getFormattingElementType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.FormattingElementType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.FormattingElementType#getType()
     * @see #getFormattingElementType()
     */
    EAttribute getFormattingElementType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.GlossePassageType <em>Glosse Passage Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Glosse Passage Type</em>'.
     * @generated
     * @see CorpusDTDneu.GlossePassageType
     */
    EClass getGlossePassageType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.GlossePassageType#getPassageID <em>Passage ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Passage ID</em>'.
     * @generated
     * @see CorpusDTDneu.GlossePassageType#getPassageID()
     * @see #getGlossePassageType()
     */
    EAttribute getGlossePassageType_PassageID();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.GlossePassageType#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Script</em>'.
     * @generated
     * @see CorpusDTDneu.GlossePassageType#getScript()
     * @see #getGlossePassageType()
     */
    EAttribute getGlossePassageType_Script();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.GlossePassageType#getType()
     * @see #getGlossePassageType()
     */
    EAttribute getGlossePassageType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.GlosseType <em>Glosse Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Glosse Type</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType
     */
    EClass getGlosseType();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.GlosseType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getGroup()
     * @see #getGlosseType()
     */
    EAttribute getGlosseType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getEgySent <em>Egy Sent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Sent</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getEgySent()
     * @see #getGlosseType()
     */
    EReference getGlosseType_EgySent();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getEgyTB1 <em>Egy TB1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB1</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getEgyTB1()
     * @see #getGlosseType()
     */
    EReference getGlosseType_EgyTB1();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getEgyTB3Start <em>Egy TB3 Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 Start</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getEgyTB3Start()
     * @see #getGlosseType()
     */
    EReference getGlosseType_EgyTB3Start();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getEgyTB3End <em>Egy TB3 End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy TB3 End</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getEgyTB3End()
     * @see #getGlosseType()
     */
    EReference getGlosseType_EgyTB3End();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getEgyWord <em>Egy Word</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Word</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getEgyWord()
     * @see #getGlosseType()
     */
    EReference getGlosseType_EgyWord();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getLineCount <em>Line Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Line Count</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getLineCount()
     * @see #getGlosseType()
     */
    EReference getGlosseType_LineCount();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Note</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getNote()
     * @see #getGlosseType()
     */
    EReference getGlosseType_Note();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getFormattingElement <em>Formatting Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Formatting Element</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getFormattingElement()
     * @see #getGlosseType()
     */
    EReference getGlosseType_FormattingElement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getLanguagePassage <em>Language Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Language Passage</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getLanguagePassage()
     * @see #getGlosseType()
     */
    EReference getGlosseType_LanguagePassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getBausteinPassage <em>Baustein Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Baustein Passage</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getBausteinPassage()
     * @see #getGlosseType()
     */
    EReference getGlosseType_BausteinPassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getLeipzigPassage <em>Leipzig Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Leipzig Passage</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getLeipzigPassage()
     * @see #getGlosseType()
     */
    EReference getGlosseType_LeipzigPassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getGlossePassage <em>Glosse Passage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Glosse Passage</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getGlossePassage()
     * @see #getGlosseType()
     */
    EReference getGlosseType_GlossePassage();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getPunctuation <em>Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getPunctuation()
     * @see #getGlosseType()
     */
    EReference getGlosseType_Punctuation();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.GlosseType#getEgyPunctuation <em>Egy Punctuation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Egy Punctuation</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getEgyPunctuation()
     * @see #getGlosseType()
     */
    EReference getGlosseType_EgyPunctuation();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.GlosseType#getPassageID <em>Passage ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Passage ID</em>'.
     * @generated
     * @see CorpusDTDneu.GlosseType#getPassageID()
     * @see #getGlosseType()
     */
    EAttribute getGlosseType_PassageID();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.LanguagePassageType <em>Language Passage Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Language Passage Type</em>'.
     * @generated
     * @see CorpusDTDneu.LanguagePassageType
     */
    EClass getLanguagePassageType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.LanguagePassageType#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Language</em>'.
     * @generated
     * @see CorpusDTDneu.LanguagePassageType#getLanguage()
     * @see #getLanguagePassageType()
     */
    EAttribute getLanguagePassageType_Language();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.LanguagePassageType#getPassageID <em>Passage ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Passage ID</em>'.
     * @generated
     * @see CorpusDTDneu.LanguagePassageType#getPassageID()
     * @see #getLanguagePassageType()
     */
    EAttribute getLanguagePassageType_PassageID();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.LanguagePassageType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.LanguagePassageType#getType()
     * @see #getLanguagePassageType()
     */
    EAttribute getLanguagePassageType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.LeipzigPassageType <em>Leipzig Passage Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Leipzig Passage Type</em>'.
     * @generated
     * @see CorpusDTDneu.LeipzigPassageType
     */
    EClass getLeipzigPassageType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.LeipzigPassageType#getAuszeichnung <em>Auszeichnung</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Auszeichnung</em>'.
     * @generated
     * @see CorpusDTDneu.LeipzigPassageType#getAuszeichnung()
     * @see #getLeipzigPassageType()
     */
    EAttribute getLeipzigPassageType_Auszeichnung();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.LeipzigPassageType#getPassageID <em>Passage ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Passage ID</em>'.
     * @generated
     * @see CorpusDTDneu.LeipzigPassageType#getPassageID()
     * @see #getLeipzigPassageType()
     */
    EAttribute getLeipzigPassageType_PassageID();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.LeipzigPassageType#getType()
     * @see #getLeipzigPassageType()
     */
    EAttribute getLeipzigPassageType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.LineCountType <em>Line Count Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Line Count Type</em>'.
     * @generated
     * @see CorpusDTDneu.LineCountType
     */
    EClass getLineCountType();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.LineCountType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @generated
     * @see CorpusDTDneu.LineCountType#getMixed()
     * @see #getLineCountType()
     */
    EAttribute getLineCountType_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.LineCountType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.LineCountType#getGroup()
     * @see #getLineCountType()
     */
    EAttribute getLineCountType_Group();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.LineCountType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.LineCountType#getValue()
     * @see #getLineCountType()
     */
    EAttribute getLineCountType_Value();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.LineCountType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.LineCountType#getComment()
     * @see #getLineCountType()
     */
    EAttribute getLineCountType_Comment();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.NoteType <em>Note Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Note Type</em>'.
     * @generated
     * @see CorpusDTDneu.NoteType
     */
    EClass getNoteType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.NoteType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.NoteType#getValue()
     * @see #getNoteType()
     */
    EAttribute getNoteType_Value();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.NoteType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.NoteType#getBtsCodes()
     * @see #getNoteType()
     */
    EAttribute getNoteType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.NoteType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.NoteType#getComment()
     * @see #getNoteType()
     */
    EAttribute getNoteType_Comment();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.PassportDataItem <em>Passport Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Passport Data Item</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItem
     */
    EClass getPassportDataItem();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.PassportDataItem#getPassportDataItem <em>Passport Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Passport Data Item</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItem#getPassportDataItem()
     * @see #getPassportDataItem()
     */
    EReference getPassportDataItem_PassportDataItem();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.PassportDataItemType <em>Passport Data Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Passport Data Item Type</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItemType
     */
    EClass getPassportDataItemType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.PassportDataItemType#getThsEntry <em>Ths Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Ths Entry</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItemType#getThsEntry()
     * @see #getPassportDataItemType()
     */
    EReference getPassportDataItemType_ThsEntry();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PassportDataItemType#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Code</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItemType#getCode()
     * @see #getPassportDataItemType()
     */
    EAttribute getPassportDataItemType_Code();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PassportDataItemType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItemType#getComment()
     * @see #getPassportDataItemType()
     */
    EAttribute getPassportDataItemType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PassportDataItemType#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Category</em>'.
     * @generated
     * @see CorpusDTDneu.PassportDataItemType#getCategory()
     * @see #getPassportDataItemType()
     */
    EAttribute getPassportDataItemType_Category();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.PicturesTableType <em>Pictures Table Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Pictures Table Type</em>'.
     * @generated
     * @see CorpusDTDneu.PicturesTableType
     */
    EClass getPicturesTableType();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.PicturesTableType#getPicture <em>Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Picture</em>'.
     * @generated
     * @see CorpusDTDneu.PicturesTableType#getPicture()
     * @see #getPicturesTableType()
     */
    EReference getPicturesTableType_Picture();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.PictureType <em>Picture Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Picture Type</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType
     */
    EClass getPictureType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getFileName()
     * @see #getPictureType()
     */
    EAttribute getPictureType_FileName();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getFilePath <em>File Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Path</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getFilePath()
     * @see #getPictureType()
     */
    EAttribute getPictureType_FilePath();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getName()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getAuthor()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getBibliography <em>Bibliography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bibliography</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getBibliography()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Bibliography();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getAuthorization <em>Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Authorization</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getAuthorization()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Authorization();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getDpi <em>Dpi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Dpi</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getDpi()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Dpi();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Height</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getHeight()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Height();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Key</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getKey()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Key();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getPictType <em>Pict Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Pict Type</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getPictType()
     * @see #getPictureType()
     */
    EAttribute getPictureType_PictType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getScale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Scale</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getScale()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Scale();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PictureType#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Width</em>'.
     * @generated
     * @see CorpusDTDneu.PictureType#getWidth()
     * @see #getPictureType()
     */
    EAttribute getPictureType_Width();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.PunctuationType <em>Punctuation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Punctuation Type</em>'.
     * @generated
     * @see CorpusDTDneu.PunctuationType
     */
    EClass getPunctuationType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PunctuationType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @generated
     * @see CorpusDTDneu.PunctuationType#getValue()
     * @see #getPunctuationType()
     */
    EAttribute getPunctuationType_Value();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PunctuationType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.PunctuationType#getBtsCodes()
     * @see #getPunctuationType()
     */
    EAttribute getPunctuationType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.PunctuationType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.PunctuationType#getComment()
     * @see #getPunctuationType()
     */
    EAttribute getPunctuationType_Comment();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCArrangementType <em>TC Arrangement Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Arrangement Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType
     */
    EClass getTCArrangementType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCArrangementType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getTCPassport()
     * @see #getTCArrangementType()
     */
    EReference getTCArrangementType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCArrangementType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getTCPicture()
     * @see #getTCArrangementType()
     */
    EReference getTCArrangementType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCArrangementType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getTCNotebook()
     * @see #getTCArrangementType()
     */
    EAttribute getTCArrangementType_TCNotebook();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCArrangementType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getGroup()
     * @see #getTCArrangementType()
     */
    EAttribute getTCArrangementType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCArrangementType#getTCArrangement <em>TC Arrangement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Arrangement</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getTCArrangement()
     * @see #getTCArrangementType()
     */
    EReference getTCArrangementType_TCArrangement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCArrangementType#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getTCObject()
     * @see #getTCArrangementType()
     */
    EReference getTCArrangementType_TCObject();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCArrangementType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getAuthor()
     * @see #getTCArrangementType()
     */
    EAttribute getTCArrangementType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCArrangementType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getSortKey()
     * @see #getTCArrangementType()
     */
    EAttribute getTCArrangementType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCArrangementType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCArrangementType#getTCName()
     * @see #getTCArrangementType()
     */
    EAttribute getTCArrangementType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCCaptionType <em>TC Caption Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Caption Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType
     */
    EClass getTCCaptionType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCCaptionType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCPassport()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCPicture()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCCaptionType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCNotebook()
     * @see #getTCCaptionType()
     */
    EAttribute getTCCaptionType_TCNotebook();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCCaptionType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getGroup()
     * @see #getTCCaptionType()
     */
    EAttribute getTCCaptionType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCCaption()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCCaption();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCGroup <em>TC Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCGroup()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCGroup();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCArrangement <em>TC Arrangement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Arrangement</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCArrangement()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCArrangement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCObject()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCObject();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCObjPart <em>TC Obj Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Obj Part</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCObjPart()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCObjPart();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCCaptionType#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCText()
     * @see #getTCCaptionType()
     */
    EReference getTCCaptionType_TCText();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCCaptionType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getAuthor()
     * @see #getTCCaptionType()
     */
    EAttribute getTCCaptionType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCCaptionType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getSortKey()
     * @see #getTCCaptionType()
     */
    EAttribute getTCCaptionType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCCaptionType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCCaptionType#getTCName()
     * @see #getTCCaptionType()
     */
    EAttribute getTCCaptionType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCGroupType <em>TC Group Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Group Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType
     */
    EClass getTCGroupType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCGroupType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCPassport()
     * @see #getTCGroupType()
     */
    EReference getTCGroupType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCGroupType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCPicture()
     * @see #getTCGroupType()
     */
    EReference getTCGroupType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCGroupType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCNotebook()
     * @see #getTCGroupType()
     */
    EAttribute getTCGroupType_TCNotebook();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCGroupType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getGroup()
     * @see #getTCGroupType()
     */
    EAttribute getTCGroupType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCGroupType#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCCaption()
     * @see #getTCGroupType()
     */
    EReference getTCGroupType_TCCaption();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCGroupType#getTCGroup <em>TC Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCGroup()
     * @see #getTCGroupType()
     */
    EReference getTCGroupType_TCGroup();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCGroupType#getTCArrangement <em>TC Arrangement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Arrangement</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCArrangement()
     * @see #getTCGroupType()
     */
    EReference getTCGroupType_TCArrangement();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCGroupType#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCObject()
     * @see #getTCGroupType()
     */
    EReference getTCGroupType_TCObject();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCGroupType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getAuthor()
     * @see #getTCGroupType()
     */
    EAttribute getTCGroupType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCGroupType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getSortKey()
     * @see #getTCGroupType()
     */
    EAttribute getTCGroupType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCGroupType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCGroupType#getTCName()
     * @see #getTCGroupType()
     */
    EAttribute getTCGroupType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCHeaderType <em>TC Header Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Header Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCHeaderType
     */
    EClass getTCHeaderType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCHeaderType#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Date</em>'.
     * @generated
     * @see CorpusDTDneu.TCHeaderType#getDate()
     * @see #getTCHeaderType()
     */
    EReference getTCHeaderType_Date();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCHeaderType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCHeaderType#getAuthor()
     * @see #getTCHeaderType()
     */
    EAttribute getTCHeaderType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCHeaderType#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Project</em>'.
     * @generated
     * @see CorpusDTDneu.TCHeaderType#getProject()
     * @see #getTCHeaderType()
     */
    EAttribute getTCHeaderType_Project();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCHeaderType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Title</em>'.
     * @generated
     * @see CorpusDTDneu.TCHeaderType#getTitle()
     * @see #getTCHeaderType()
     */
    EAttribute getTCHeaderType_Title();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCHeaderType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.TCHeaderType#getComment()
     * @see #getTCHeaderType()
     */
    EAttribute getTCHeaderType_Comment();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCLocationType <em>TC Location Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Location Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCLocationType
     */
    EClass getTCLocationType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCLocationType#getThsEntry <em>Ths Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Ths Entry</em>'.
     * @generated
     * @see CorpusDTDneu.TCLocationType#getThsEntry()
     * @see #getTCLocationType()
     */
    EReference getTCLocationType_ThsEntry();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCLocationType#getMuseumNumber <em>Museum Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Museum Number</em>'.
     * @generated
     * @see CorpusDTDneu.TCLocationType#getMuseumNumber()
     * @see #getTCLocationType()
     */
    EAttribute getTCLocationType_MuseumNumber();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCLocationType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.TCLocationType#getComment()
     * @see #getTCLocationType()
     */
    EAttribute getTCLocationType_Comment();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCObjectType <em>TC Object Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Object Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType
     */
    EClass getTCObjectType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCObjectType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCPassport()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCPicture()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCObjectType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCNotebook()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_TCNotebook();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCObjectType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getGroup()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCCaption()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCCaption();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCObject()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCObject();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCObjPart <em>TC Obj Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Obj Part</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCObjPart()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCObjPart();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCScene <em>TC Scene</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Scene</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCScene()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCScene();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCSuperText <em>TC Super Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Super Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCSuperText()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCSuperText();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjectType#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCText()
     * @see #getTCObjectType()
     */
    EReference getTCObjectType_TCText();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjectType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getAuthor()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjectType#getBearbeitungsstand <em>Bearbeitungsstand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bearbeitungsstand</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getBearbeitungsstand()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_Bearbeitungsstand();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjectType#getGIS <em>GIS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>GIS</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getGIS()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_GIS();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjectType#getObjectID <em>Object ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Object ID</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getObjectID()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_ObjectID();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjectType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getSortKey()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjectType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjectType#getTCName()
     * @see #getTCObjectType()
     */
    EAttribute getTCObjectType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCObjPartType <em>TC Obj Part Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Obj Part Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType
     */
    EClass getTCObjPartType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCObjPartType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCPassport()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCPicture()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCObjPartType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCNotebook()
     * @see #getTCObjPartType()
     */
    EAttribute getTCObjPartType_TCNotebook();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCObjPartType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getGroup()
     * @see #getTCObjPartType()
     */
    EAttribute getTCObjPartType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCCaption()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCCaption();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCObject <em>TC Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Object</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCObject()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCObject();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCObjPart <em>TC Obj Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Obj Part</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCObjPart()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCObjPart();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCScene <em>TC Scene</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Scene</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCScene()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCScene();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCSuperText <em>TC Super Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Super Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCSuperText()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCSuperText();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCObjPartType#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCText()
     * @see #getTCObjPartType()
     */
    EReference getTCObjPartType_TCText();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjPartType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getAuthor()
     * @see #getTCObjPartType()
     */
    EAttribute getTCObjPartType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjPartType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getSortKey()
     * @see #getTCObjPartType()
     */
    EAttribute getTCObjPartType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCObjPartType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCObjPartType#getTCName()
     * @see #getTCObjPartType()
     */
    EAttribute getTCObjPartType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCPassportType <em>TC Passport Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Passport Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType
     */
    EClass getTCPassportType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getDefinition()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Definition();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getProtocol()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Protocol();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getBibliography <em>Bibliography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bibliography</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getBibliography()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Bibliography();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getProvenance <em>Provenance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Provenance</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getProvenance()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_Provenance();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Date</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getDate()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_Date();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getObjectType <em>Object Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Object Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getObjectType()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_ObjectType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getDepiction <em>Depiction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Depiction</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getDepiction()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_Depiction();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getScript()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_Script();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Language</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getLanguage()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_Language();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getLangComment <em>Lang Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Lang Comment</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getLangComment()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_LangComment();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getWork <em>Work</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Work</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getWork()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_Work();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getTextType <em>Text Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Text Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getTextType()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_TextType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCPassportType#getLineCount <em>Line Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Line Count</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getLineCount()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_LineCount();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getCodes <em>Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Codes</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getCodes()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Codes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getWbFolder <em>Wb Folder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Wb Folder</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getWbFolder()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_WbFolder();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getWbSlips <em>Wb Slips</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Wb Slips</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getWbSlips()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_WbSlips();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getCode1 <em>Code1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Code1</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getCode1()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Code1();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getCode2 <em>Code2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Code2</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getCode2()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Code2();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getBtsCodes <em>Bts Codes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bts Codes</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getBtsCodes()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_BtsCodes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getComment()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getNotes()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_Notes();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getFullName <em>Full Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Full Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getFullName()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_FullName();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPassportType#getNameSort <em>Name Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name Sort</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getNameSort()
     * @see #getTCPassportType()
     */
    EAttribute getTCPassportType_NameSort();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCPassportType#getTCLocation <em>TC Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Location</em>'.
     * @generated
     * @see CorpusDTDneu.TCPassportType#getTCLocation()
     * @see #getTCPassportType()
     */
    EReference getTCPassportType_TCLocation();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCPictureType <em>TC Picture Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Picture Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCPictureType
     */
    EClass getTCPictureType();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCPictureType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @generated
     * @see CorpusDTDneu.TCPictureType#getMixed()
     * @see #getTCPictureType()
     */
    EAttribute getTCPictureType_Mixed();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCPictureType#getPictureType <em>Picture Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Picture Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCPictureType#getPictureType()
     * @see #getTCPictureType()
     */
    EAttribute getTCPictureType_PictureType();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCSceneType <em>TC Scene Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Scene Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType
     */
    EClass getTCSceneType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCSceneType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCPassport()
     * @see #getTCSceneType()
     */
    EReference getTCSceneType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSceneType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCPicture()
     * @see #getTCSceneType()
     */
    EReference getTCSceneType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCSceneType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCNotebook()
     * @see #getTCSceneType()
     */
    EAttribute getTCSceneType_TCNotebook();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCSceneType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getGroup()
     * @see #getTCSceneType()
     */
    EAttribute getTCSceneType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSceneType#getTCCaption <em>TC Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Caption</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCCaption()
     * @see #getTCSceneType()
     */
    EReference getTCSceneType_TCCaption();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSceneType#getTCScene <em>TC Scene</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Scene</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCScene()
     * @see #getTCSceneType()
     */
    EReference getTCSceneType_TCScene();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSceneType#getTCSuperText <em>TC Super Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Super Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCSuperText()
     * @see #getTCSceneType()
     */
    EReference getTCSceneType_TCSuperText();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSceneType#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCText()
     * @see #getTCSceneType()
     */
    EReference getTCSceneType_TCText();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCSceneType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getAuthor()
     * @see #getTCSceneType()
     */
    EAttribute getTCSceneType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCSceneType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getSortKey()
     * @see #getTCSceneType()
     */
    EAttribute getTCSceneType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCSceneType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCSceneType#getTCName()
     * @see #getTCSceneType()
     */
    EAttribute getTCSceneType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCSuperTextType <em>TC Super Text Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Super Text Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType
     */
    EClass getTCSuperTextType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCSuperTextType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getTCPassport()
     * @see #getTCSuperTextType()
     */
    EReference getTCSuperTextType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSuperTextType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getTCPicture()
     * @see #getTCSuperTextType()
     */
    EReference getTCSuperTextType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCSuperTextType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getTCNotebook()
     * @see #getTCSuperTextType()
     */
    EAttribute getTCSuperTextType_TCNotebook();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCSuperTextType#getTCText <em>TC Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Text</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getTCText()
     * @see #getTCSuperTextType()
     */
    EReference getTCSuperTextType_TCText();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCSuperTextType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getAuthor()
     * @see #getTCSuperTextType()
     */
    EAttribute getTCSuperTextType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCSuperTextType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getSortKey()
     * @see #getTCSuperTextType()
     */
    EAttribute getTCSuperTextType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCSuperTextType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCSuperTextType#getTCName()
     * @see #getTCSuperTextType()
     */
    EAttribute getTCSuperTextType_TCName();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.TCTextType <em>TC Text Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>TC Text Type</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType
     */
    EClass getTCTextType();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCTextType#getTCPassport <em>TC Passport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>TC Passport</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getTCPassport()
     * @see #getTCTextType()
     */
    EReference getTCTextType_TCPassport();

    /**
     * Returns the meta object for the containment reference list '{@link CorpusDTDneu.TCTextType#getTCPicture <em>TC Picture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>TC Picture</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getTCPicture()
     * @see #getTCTextType()
     */
    EReference getTCTextType_TCPicture();

    /**
     * Returns the meta object for the attribute list '{@link CorpusDTDneu.TCTextType#getTCNotebook <em>TC Notebook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute list '<em>TC Notebook</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getTCNotebook()
     * @see #getTCTextType()
     */
    EAttribute getTCTextType_TCNotebook();

    /**
     * Returns the meta object for the containment reference '{@link CorpusDTDneu.TCTextType#getEgyTxt <em>Egy Txt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Egy Txt</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getEgyTxt()
     * @see #getTCTextType()
     */
    EReference getTCTextType_EgyTxt();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCTextType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Author</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getAuthor()
     * @see #getTCTextType()
     */
    EAttribute getTCTextType_Author();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCTextType#getBearbeitungsstand <em>Bearbeitungsstand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bearbeitungsstand</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getBearbeitungsstand()
     * @see #getTCTextType()
     */
    EAttribute getTCTextType_Bearbeitungsstand();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sort Key</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getSortKey()
     * @see #getTCTextType()
     */
    EAttribute getTCTextType_SortKey();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCTextType#getTCName <em>TC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>TC Name</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getTCName()
     * @see #getTCTextType()
     */
    EAttribute getTCTextType_TCName();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.TCTextType#getTextID <em>Text ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Text ID</em>'.
     * @generated
     * @see CorpusDTDneu.TCTextType#getTextID()
     * @see #getTCTextType()
     */
    EAttribute getTCTextType_TextID();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.ThsEntryType <em>Ths Entry Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Ths Entry Type</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType
     */
    EClass getThsEntryType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.ThsEntryType#getTerm <em>Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Term</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType#getTerm()
     * @see #getThsEntryType()
     */
    EAttribute getThsEntryType_Term();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.ThsEntryType#getHierarchy <em>Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Hierarchy</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType#getHierarchy()
     * @see #getThsEntryType()
     */
    EAttribute getThsEntryType_Hierarchy();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.ThsEntryType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType#getComment()
     * @see #getThsEntryType()
     */
    EAttribute getThsEntryType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.ThsEntryType#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Category</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType#getCategory()
     * @see #getThsEntryType()
     */
    EAttribute getThsEntryType_Category();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.ThsEntryType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Key</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType#getKey()
     * @see #getThsEntryType()
     */
    EAttribute getThsEntryType_Key();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.ThsEntryType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see CorpusDTDneu.ThsEntryType#getType()
     * @see #getThsEntryType()
     */
    EAttribute getThsEntryType_Type();

    /**
     * Returns the meta object for class '{@link CorpusDTDneu.WorkType <em>Work Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Work Type</em>'.
     * @generated
     * @see CorpusDTDneu.WorkType
     */
    EClass getWorkType();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.WorkType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see CorpusDTDneu.WorkType#getName()
     * @see #getWorkType()
     */
    EAttribute getWorkType_Name();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.WorkType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @generated
     * @see CorpusDTDneu.WorkType#getComment()
     * @see #getWorkType()
     */
    EAttribute getWorkType_Comment();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.WorkType#getThesaurus <em>Thesaurus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Thesaurus</em>'.
     * @generated
     * @see CorpusDTDneu.WorkType#getThesaurus()
     * @see #getWorkType()
     */
    EAttribute getWorkType_Thesaurus();

    /**
     * Returns the meta object for the attribute '{@link CorpusDTDneu.WorkType#getVersionCode <em>Version Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Version Code</em>'.
     * @generated
     * @see CorpusDTDneu.WorkType#getVersionCode()
     * @see #getWorkType()
     */
    EAttribute getWorkType_VersionCode();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.CategoryType <em>Category Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Category Type</em>'.
     * @generated
     * @see CorpusDTDneu.CategoryType
     */
    EEnum getCategoryType();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.CategoryType1 <em>Category Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Category Type1</em>'.
     * @generated
     * @see CorpusDTDneu.CategoryType1
     */
    EEnum getCategoryType1();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.LTypeType <em>LType Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>LType Type</em>'.
     * @generated
     * @see CorpusDTDneu.LTypeType
     */
    EEnum getLTypeType();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType <em>Type Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType
     */
    EEnum getTypeType();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType1 <em>Type Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type1</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType1
     */
    EEnum getTypeType1();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType2 <em>Type Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type2</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType2
     */
    EEnum getTypeType2();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType3 <em>Type Type3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type3</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType3
     */
    EEnum getTypeType3();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType4 <em>Type Type4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type4</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType4
     */
    EEnum getTypeType4();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType5 <em>Type Type5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type5</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType5
     */
    EEnum getTypeType5();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType6 <em>Type Type6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type6</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType6
     */
    EEnum getTypeType6();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType7 <em>Type Type7</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type7</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType7
     */
    EEnum getTypeType7();

    /**
     * Returns the meta object for enum '{@link CorpusDTDneu.TypeType8 <em>Type Type8</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Type Type8</em>'.
     * @generated
     * @see CorpusDTDneu.TypeType8
     */
    EEnum getTypeType8();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.CategoryType <em>Category Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Category Type Object</em>'.
     * @model instanceClass="CorpusDTDneu.CategoryType"
     * extendedMetaData="name='Category_._type:Object' baseType='Category_._type'"
     * @generated
     * @see CorpusDTDneu.CategoryType
     */
    EDataType getCategoryTypeObject();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.CategoryType1 <em>Category Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Category Type Object1</em>'.
     * @model instanceClass="CorpusDTDneu.CategoryType1"
     * extendedMetaData="name='Category_._1_._type:Object' baseType='Category_._1_._type'"
     * @generated
     * @see CorpusDTDneu.CategoryType1
     */
    EDataType getCategoryTypeObject1();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.LTypeType <em>LType Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>LType Type Object</em>'.
     * @model instanceClass="CorpusDTDneu.LTypeType"
     * extendedMetaData="name='LType_._type:Object' baseType='LType_._type'"
     * @generated
     * @see CorpusDTDneu.LTypeType
     */
    EDataType getLTypeTypeObject();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType1 <em>Type Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType1"
     * extendedMetaData="name='Type_._1_._type:Object' baseType='Type_._1_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType1
     */
    EDataType getTypeTypeObject();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType3 <em>Type Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object1</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType3"
     * extendedMetaData="name='Type_._3_._type:Object' baseType='Type_._3_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType3
     */
    EDataType getTypeTypeObject1();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType5 <em>Type Type Object2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object2</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType5"
     * extendedMetaData="name='Type_._5_._type:Object' baseType='Type_._5_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType5
     */
    EDataType getTypeTypeObject2();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType2 <em>Type Type Object3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object3</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType2"
     * extendedMetaData="name='Type_._2_._type:Object' baseType='Type_._2_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType2
     */
    EDataType getTypeTypeObject3();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType <em>Type Type Object4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object4</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType"
     * extendedMetaData="name='Type_._type:Object' baseType='Type_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType
     */
    EDataType getTypeTypeObject4();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType6 <em>Type Type Object5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object5</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType6"
     * extendedMetaData="name='Type_._6_._type:Object' baseType='Type_._6_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType6
     */
    EDataType getTypeTypeObject5();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType4 <em>Type Type Object6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object6</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType4"
     * extendedMetaData="name='Type_._4_._type:Object' baseType='Type_._4_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType4
     */
    EDataType getTypeTypeObject6();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType7 <em>Type Type Object7</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object7</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType7"
     * extendedMetaData="name='type_._type:Object' baseType='type_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType7
     */
    EDataType getTypeTypeObject7();

    /**
     * Returns the meta object for data type '{@link CorpusDTDneu.TypeType8 <em>Type Type Object8</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Type Type Object8</em>'.
     * @model instanceClass="CorpusDTDneu.TypeType8"
     * extendedMetaData="name='Type_._7_._type:Object' baseType='Type_._7_._type'"
     * @generated
     * @see CorpusDTDneu.TypeType8
     */
    EDataType getTypeTypeObject8();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CorpusDTDneuFactory getCorpusDTDneuFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.BausteinPassageTypeImpl <em>Baustein Passage Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.BausteinPassageTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getBausteinPassageType()
         */
        EClass BAUSTEIN_PASSAGE_TYPE = eINSTANCE.getBausteinPassageType();

        /**
         * The meta object literal for the '<em><b>Baustein</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BAUSTEIN_PASSAGE_TYPE__BAUSTEIN = eINSTANCE.getBausteinPassageType_Baustein();

        /**
         * The meta object literal for the '<em><b>Passage ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID = eINSTANCE.getBausteinPassageType_PassageID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BAUSTEIN_PASSAGE_TYPE__TYPE = eINSTANCE.getBausteinPassageType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.DateThsTypeImpl <em>Date Ths Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.DateThsTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getDateThsType()
         */
        EClass DATE_THS_TYPE = eINSTANCE.getDateThsType();

        /**
         * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_THS_TYPE__TERM = eINSTANCE.getDateThsType_Term();

        /**
         * The meta object literal for the '<em><b>Lower Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_THS_TYPE__LOWER_TERM = eINSTANCE.getDateThsType_LowerTerm();

        /**
         * The meta object literal for the '<em><b>Upper Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_THS_TYPE__UPPER_TERM = eINSTANCE.getDateThsType_UpperTerm();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_THS_TYPE__TYPE = eINSTANCE.getDateThsType_Type();

        /**
         * The meta object literal for the '<em><b>Year From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_THS_TYPE__YEAR_FROM = eINSTANCE.getDateThsType_YearFrom();

        /**
         * The meta object literal for the '<em><b>Year To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_THS_TYPE__YEAR_TO = eINSTANCE.getDateThsType_YearTo();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.DateTypeImpl <em>Date Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.DateTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getDateType()
         */
        EClass DATE_TYPE = eINSTANCE.getDateType();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_TYPE__MIXED = eINSTANCE.getDateType_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_TYPE__GROUP = eINSTANCE.getDateType_Group();

        /**
         * The meta object literal for the '<em><b>Date Ths</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DATE_TYPE__DATE_THS = eINSTANCE.getDateType_DateThs();

        /**
         * The meta object literal for the '<em><b>Code</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_TYPE__CODE = eINSTANCE.getDateType_Code();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DATE_TYPE__COMMENT = eINSTANCE.getDateType_Comment();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.DocumentRootImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getDocumentRoot()
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__AUTHOR = eINSTANCE.getDocumentRoot_Author();

        /**
         * The meta object literal for the '<em><b>Baustein Passage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__BAUSTEIN_PASSAGE = eINSTANCE.getDocumentRoot_BausteinPassage();

        /**
         * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__BIBLIOGRAPHY = eINSTANCE.getDocumentRoot_Bibliography();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__BTS_CODES = eINSTANCE.getDocumentRoot_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CODE = eINSTANCE.getDocumentRoot_Code();

        /**
         * The meta object literal for the '<em><b>Code1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CODE1 = eINSTANCE.getDocumentRoot_Code1();

        /**
         * The meta object literal for the '<em><b>Code2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CODE2 = eINSTANCE.getDocumentRoot_Code2();

        /**
         * The meta object literal for the '<em><b>Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CODES = eINSTANCE.getDocumentRoot_Codes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__COMMENT = eINSTANCE.getDocumentRoot_Comment();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

        /**
         * The meta object literal for the '<em><b>Date Ths</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__DATE_THS = eINSTANCE.getDocumentRoot_DateThs();

        /**
         * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__DEFINITION = eINSTANCE.getDocumentRoot_Definition();

        /**
         * The meta object literal for the '<em><b>Depiction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__DEPICTION = eINSTANCE.getDocumentRoot_Depiction();

        /**
         * The meta object literal for the '<em><b>Egy Punctuation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_PUNCTUATION = eINSTANCE.getDocumentRoot_EgyPunctuation();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_SENT = eINSTANCE.getDocumentRoot_EgySent();

        /**
         * The meta object literal for the '<em><b>Egy Sub Txt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_SUB_TXT = eINSTANCE.getDocumentRoot_EgySubTxt();

        /**
         * The meta object literal for the '<em><b>Egy Szenario</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_SZENARIO = eINSTANCE.getDocumentRoot_EgySzenario();

        /**
         * The meta object literal for the '<em><b>Egy TB1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_TB1 = eINSTANCE.getDocumentRoot_EgyTB1();

        /**
         * The meta object literal for the '<em><b>Egy TB3 End</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_TB3_END = eINSTANCE.getDocumentRoot_EgyTB3End();

        /**
         * The meta object literal for the '<em><b>Egy TB3 Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_TB3_START = eINSTANCE.getDocumentRoot_EgyTB3Start();

        /**
         * The meta object literal for the '<em><b>Egy Txt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_TXT = eINSTANCE.getDocumentRoot_EgyTxt();

        /**
         * The meta object literal for the '<em><b>Egy Txt Corpus</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_TXT_CORPUS = eINSTANCE.getDocumentRoot_EgyTxtCorpus();

        /**
         * The meta object literal for the '<em><b>Egy Word</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__EGY_WORD = eINSTANCE.getDocumentRoot_EgyWord();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__FILE_NAME = eINSTANCE.getDocumentRoot_FileName();

        /**
         * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__FILE_PATH = eINSTANCE.getDocumentRoot_FilePath();

        /**
         * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__FORM = eINSTANCE.getDocumentRoot_Form();

        /**
         * The meta object literal for the '<em><b>Formatting Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__FORMATTING_ELEMENT = eINSTANCE.getDocumentRoot_FormattingElement();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__FULL_NAME = eINSTANCE.getDocumentRoot_FullName();

        /**
         * The meta object literal for the '<em><b>Glosse</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__GLOSSE = eINSTANCE.getDocumentRoot_Glosse();

        /**
         * The meta object literal for the '<em><b>Glosse Passage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__GLOSSE_PASSAGE = eINSTANCE.getDocumentRoot_GlossePassage();

        /**
         * The meta object literal for the '<em><b>Graphics</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__GRAPHICS = eINSTANCE.getDocumentRoot_Graphics();

        /**
         * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__HIERARCHY = eINSTANCE.getDocumentRoot_Hierarchy();

        /**
         * The meta object literal for the '<em><b>Lang Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__LANG_COMMENT = eINSTANCE.getDocumentRoot_LangComment();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

        /**
         * The meta object literal for the '<em><b>Language Passage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__LANGUAGE_PASSAGE = eINSTANCE.getDocumentRoot_LanguagePassage();

        /**
         * The meta object literal for the '<em><b>Leipzig Passage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__LEIPZIG_PASSAGE = eINSTANCE.getDocumentRoot_LeipzigPassage();

        /**
         * The meta object literal for the '<em><b>Line Count</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__LINE_COUNT = eINSTANCE.getDocumentRoot_LineCount();

        /**
         * The meta object literal for the '<em><b>Lower Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__LOWER_TERM = eINSTANCE.getDocumentRoot_LowerTerm();

        /**
         * The meta object literal for the '<em><b>Museum Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MUSEUM_NUMBER = eINSTANCE.getDocumentRoot_MuseumNumber();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

        /**
         * The meta object literal for the '<em><b>Name Sort</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__NAME_SORT = eINSTANCE.getDocumentRoot_NameSort();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__NOTE = eINSTANCE.getDocumentRoot_Note();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__NOTES = eINSTANCE.getDocumentRoot_Notes();

        /**
         * The meta object literal for the '<em><b>Object Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__OBJECT_TYPE = eINSTANCE.getDocumentRoot_ObjectType();

        /**
         * The meta object literal for the '<em><b>Passport Data Item</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__PASSPORT_DATA_ITEM = eINSTANCE.getDocumentRoot_PassportDataItem();

        /**
         * The meta object literal for the '<em><b>Picture</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__PICTURE = eINSTANCE.getDocumentRoot_Picture();

        /**
         * The meta object literal for the '<em><b>Pictures Table</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__PICTURES_TABLE = eINSTANCE.getDocumentRoot_PicturesTable();

        /**
         * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__PROJECT = eINSTANCE.getDocumentRoot_Project();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__PROTOCOL = eINSTANCE.getDocumentRoot_Protocol();

        /**
         * The meta object literal for the '<em><b>Provenance</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__PROVENANCE = eINSTANCE.getDocumentRoot_Provenance();

        /**
         * The meta object literal for the '<em><b>Punctuation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__PUNCTUATION = eINSTANCE.getDocumentRoot_Punctuation();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__SCRIPT = eINSTANCE.getDocumentRoot_Script();

        /**
         * The meta object literal for the '<em><b>TC Arrangement</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_ARRANGEMENT = eINSTANCE.getDocumentRoot_TCArrangement();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_CAPTION = eINSTANCE.getDocumentRoot_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_GROUP = eINSTANCE.getDocumentRoot_TCGroup();

        /**
         * The meta object literal for the '<em><b>TC Header</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_HEADER = eINSTANCE.getDocumentRoot_TCHeader();

        /**
         * The meta object literal for the '<em><b>TC Location</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_LOCATION = eINSTANCE.getDocumentRoot_TCLocation();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TC_NOTEBOOK = eINSTANCE.getDocumentRoot_TCNotebook();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_OBJECT = eINSTANCE.getDocumentRoot_TCObject();

        /**
         * The meta object literal for the '<em><b>TC Obj Part</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_OBJ_PART = eINSTANCE.getDocumentRoot_TCObjPart();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_PASSPORT = eINSTANCE.getDocumentRoot_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_PICTURE = eINSTANCE.getDocumentRoot_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Scene</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_SCENE = eINSTANCE.getDocumentRoot_TCScene();

        /**
         * The meta object literal for the '<em><b>TC Super Text</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_SUPER_TEXT = eINSTANCE.getDocumentRoot_TCSuperText();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TC_TEXT = eINSTANCE.getDocumentRoot_TCText();

        /**
         * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TERM = eINSTANCE.getDocumentRoot_Term();

        /**
         * The meta object literal for the '<em><b>Text Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__TEXT_TYPE = eINSTANCE.getDocumentRoot_TextType();

        /**
         * The meta object literal for the '<em><b>Ths Entry</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__THS_ENTRY = eINSTANCE.getDocumentRoot_ThsEntry();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

        /**
         * The meta object literal for the '<em><b>Translat</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TRANSLAT = eINSTANCE.getDocumentRoot_Translat();

        /**
         * The meta object literal for the '<em><b>Translation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TRANSLATION = eINSTANCE.getDocumentRoot_Translation();

        /**
         * The meta object literal for the '<em><b>Upper Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__UPPER_TERM = eINSTANCE.getDocumentRoot_UpperTerm();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

        /**
         * The meta object literal for the '<em><b>Wb Folder</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__WB_FOLDER = eINSTANCE.getDocumentRoot_WbFolder();

        /**
         * The meta object literal for the '<em><b>Wb Slips</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DOCUMENT_ROOT__WB_SLIPS = eINSTANCE.getDocumentRoot_WbSlips();

        /**
         * The meta object literal for the '<em><b>Work</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DOCUMENT_ROOT__WORK = eINSTANCE.getDocumentRoot_Work();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyPunctuationTypeImpl <em>Egy Punctuation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyPunctuationTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyPunctuationType()
         */
        EClass EGY_PUNCTUATION_TYPE = eINSTANCE.getEgyPunctuationType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_PUNCTUATION_TYPE__VALUE = eINSTANCE.getEgyPunctuationType_Value();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_PUNCTUATION_TYPE__BTS_CODES = eINSTANCE.getEgyPunctuationType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_PUNCTUATION_TYPE__COMMENT = eINSTANCE.getEgyPunctuationType_Comment();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_PUNCTUATION_TYPE__TYPE = eINSTANCE.getEgyPunctuationType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgySentTypeImpl <em>Egy Sent Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgySentTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgySentType()
         */
        EClass EGY_SENT_TYPE = eINSTANCE.getEgySentType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__VALUE = eINSTANCE.getEgySentType_Value();

        /**
         * The meta object literal for the '<em><b>Translat</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__TRANSLAT = eINSTANCE.getEgySentType_Translat();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__BTS_CODES = eINSTANCE.getEgySentType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__COMMENT = eINSTANCE.getEgySentType_Comment();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__GROUP = eINSTANCE.getEgySentType_Group();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__EGY_SENT = eINSTANCE.getEgySentType_EgySent();

        /**
         * The meta object literal for the '<em><b>Egy TB1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__EGY_TB1 = eINSTANCE.getEgySentType_EgyTB1();

        /**
         * The meta object literal for the '<em><b>Egy TB3 Start</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__EGY_TB3_START = eINSTANCE.getEgySentType_EgyTB3Start();

        /**
         * The meta object literal for the '<em><b>Egy TB3 End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__EGY_TB3_END = eINSTANCE.getEgySentType_EgyTB3End();

        /**
         * The meta object literal for the '<em><b>Egy Word</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__EGY_WORD = eINSTANCE.getEgySentType_EgyWord();

        /**
         * The meta object literal for the '<em><b>Line Count</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__LINE_COUNT = eINSTANCE.getEgySentType_LineCount();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__NOTE = eINSTANCE.getEgySentType_Note();

        /**
         * The meta object literal for the '<em><b>Formatting Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__FORMATTING_ELEMENT = eINSTANCE.getEgySentType_FormattingElement();

        /**
         * The meta object literal for the '<em><b>Language Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__LANGUAGE_PASSAGE = eINSTANCE.getEgySentType_LanguagePassage();

        /**
         * The meta object literal for the '<em><b>Baustein Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__BAUSTEIN_PASSAGE = eINSTANCE.getEgySentType_BausteinPassage();

        /**
         * The meta object literal for the '<em><b>Leipzig Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__LEIPZIG_PASSAGE = eINSTANCE.getEgySentType_LeipzigPassage();

        /**
         * The meta object literal for the '<em><b>Glosse Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__GLOSSE_PASSAGE = eINSTANCE.getEgySentType_GlossePassage();

        /**
         * The meta object literal for the '<em><b>Punctuation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__PUNCTUATION = eINSTANCE.getEgySentType_Punctuation();

        /**
         * The meta object literal for the '<em><b>Egy Punctuation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SENT_TYPE__EGY_PUNCTUATION = eINSTANCE.getEgySentType_EgyPunctuation();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__AUTHOR = eINSTANCE.getEgySentType_Author();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__LANGUAGE = eINSTANCE.getEgySentType_Language();

        /**
         * The meta object literal for the '<em><b>Leipzig3 Modul</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__LEIPZIG3_MODUL = eINSTANCE.getEgySentType_Leipzig3Modul();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SENT_TYPE__TYPE = eINSTANCE.getEgySentType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgySubTxtTypeImpl <em>Egy Sub Txt Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgySubTxtTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgySubTxtType()
         */
        EClass EGY_SUB_TXT_TYPE = eINSTANCE.getEgySubTxtType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SUB_TXT_TYPE__NAME = eINSTANCE.getEgySubTxtType_Name();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SUB_TXT_TYPE__BTS_CODES = eINSTANCE.getEgySubTxtType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SUB_TXT_TYPE__COMMENT = eINSTANCE.getEgySubTxtType_Comment();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SUB_TXT_TYPE__GROUP = eINSTANCE.getEgySubTxtType_Group();

        /**
         * The meta object literal for the '<em><b>Egy Sub Txt</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__EGY_SUB_TXT = eINSTANCE.getEgySubTxtType_EgySubTxt();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__EGY_SENT = eINSTANCE.getEgySubTxtType_EgySent();

        /**
         * The meta object literal for the '<em><b>Egy TB1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__EGY_TB1 = eINSTANCE.getEgySubTxtType_EgyTB1();

        /**
         * The meta object literal for the '<em><b>Egy Szenario</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__EGY_SZENARIO = eINSTANCE.getEgySubTxtType_EgySzenario();

        /**
         * The meta object literal for the '<em><b>Glosse</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__GLOSSE = eINSTANCE.getEgySubTxtType_Glosse();

        /**
         * The meta object literal for the '<em><b>Egy TB3 Start</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__EGY_TB3_START = eINSTANCE.getEgySubTxtType_EgyTB3Start();

        /**
         * The meta object literal for the '<em><b>Egy TB3 End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SUB_TXT_TYPE__EGY_TB3_END = eINSTANCE.getEgySubTxtType_EgyTB3End();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SUB_TXT_TYPE__SORT_KEY = eINSTANCE.getEgySubTxtType_SortKey();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgySzenarioTypeImpl <em>Egy Szenario Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgySzenarioTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgySzenarioType()
         */
        EClass EGY_SZENARIO_TYPE = eINSTANCE.getEgySzenarioType();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_SZENARIO_TYPE__EGY_SENT = eINSTANCE.getEgySzenarioType_EgySent();

        /**
         * The meta object literal for the '<em><b>Interne Nummer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_SZENARIO_TYPE__INTERNE_NUMMER = eINSTANCE.getEgySzenarioType_InterneNummer();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyTB1TypeImpl <em>Egy TB1 Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyTB1TypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTB1Type()
         */
        EClass EGY_TB1_TYPE = eINSTANCE.getEgyTB1Type();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB1_TYPE__NAME = eINSTANCE.getEgyTB1Type_Name();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB1_TYPE__BTS_CODES = eINSTANCE.getEgyTB1Type_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB1_TYPE__COMMENT = eINSTANCE.getEgyTB1Type_Comment();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB1_TYPE__GROUP = eINSTANCE.getEgyTB1Type_Group();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__EGY_SENT = eINSTANCE.getEgyTB1Type_EgySent();

        /**
         * The meta object literal for the '<em><b>Egy TB1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__EGY_TB1 = eINSTANCE.getEgyTB1Type_EgyTB1();

        /**
         * The meta object literal for the '<em><b>Egy TB3 Start</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__EGY_TB3_START = eINSTANCE.getEgyTB1Type_EgyTB3Start();

        /**
         * The meta object literal for the '<em><b>Egy TB3 End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__EGY_TB3_END = eINSTANCE.getEgyTB1Type_EgyTB3End();

        /**
         * The meta object literal for the '<em><b>Egy Word</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__EGY_WORD = eINSTANCE.getEgyTB1Type_EgyWord();

        /**
         * The meta object literal for the '<em><b>Line Count</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__LINE_COUNT = eINSTANCE.getEgyTB1Type_LineCount();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__NOTE = eINSTANCE.getEgyTB1Type_Note();

        /**
         * The meta object literal for the '<em><b>Formatting Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__FORMATTING_ELEMENT = eINSTANCE.getEgyTB1Type_FormattingElement();

        /**
         * The meta object literal for the '<em><b>Punctuation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__PUNCTUATION = eINSTANCE.getEgyTB1Type_Punctuation();

        /**
         * The meta object literal for the '<em><b>Egy Punctuation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TB1_TYPE__EGY_PUNCTUATION = eINSTANCE.getEgyTB1Type_EgyPunctuation();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyTB3EndTypeImpl <em>Egy TB3 End Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyTB3EndTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTB3EndType()
         */
        EClass EGY_TB3_END_TYPE = eINSTANCE.getEgyTB3EndType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_END_TYPE__NAME = eINSTANCE.getEgyTB3EndType_Name();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_END_TYPE__BTS_CODES = eINSTANCE.getEgyTB3EndType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_END_TYPE__COMMENT = eINSTANCE.getEgyTB3EndType_Comment();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_END_TYPE__ID = eINSTANCE.getEgyTB3EndType_Id();

        /**
         * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_END_TYPE__ID_REF = eINSTANCE.getEgyTB3EndType_IdRef();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl <em>Egy TB3 Start Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyTB3StartTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTB3StartType()
         */
        EClass EGY_TB3_START_TYPE = eINSTANCE.getEgyTB3StartType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_START_TYPE__NAME = eINSTANCE.getEgyTB3StartType_Name();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_START_TYPE__BTS_CODES = eINSTANCE.getEgyTB3StartType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_START_TYPE__COMMENT = eINSTANCE.getEgyTB3StartType_Comment();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_START_TYPE__ID = eINSTANCE.getEgyTB3StartType_Id();

        /**
         * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TB3_START_TYPE__ID_REF = eINSTANCE.getEgyTB3StartType_IdRef();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl <em>Egy Txt Corpus Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyTxtCorpusTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTxtCorpusType()
         */
        EClass EGY_TXT_CORPUS_TYPE = eINSTANCE.getEgyTxtCorpusType();

        /**
         * The meta object literal for the '<em><b>TC Header</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_HEADER = eINSTANCE.getEgyTxtCorpusType_TCHeader();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TXT_CORPUS_TYPE__GROUP = eINSTANCE.getEgyTxtCorpusType_Group();

        /**
         * The meta object literal for the '<em><b>Pictures Table</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__PICTURES_TABLE = eINSTANCE.getEgyTxtCorpusType_PicturesTable();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_CAPTION = eINSTANCE.getEgyTxtCorpusType_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_GROUP = eINSTANCE.getEgyTxtCorpusType_TCGroup();

        /**
         * The meta object literal for the '<em><b>TC Arrangement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT = eINSTANCE.getEgyTxtCorpusType_TCArrangement();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_OBJECT = eINSTANCE.getEgyTxtCorpusType_TCObject();

        /**
         * The meta object literal for the '<em><b>TC Obj Part</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_OBJ_PART = eINSTANCE.getEgyTxtCorpusType_TCObjPart();

        /**
         * The meta object literal for the '<em><b>TC Scene</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_SCENE = eINSTANCE.getEgyTxtCorpusType_TCScene();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__TC_TEXT = eINSTANCE.getEgyTxtCorpusType_TCText();

        /**
         * The meta object literal for the '<em><b>Egy Txt</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_CORPUS_TYPE__EGY_TXT = eINSTANCE.getEgyTxtCorpusType_EgyTxt();

        /**
         * The meta object literal for the '<em><b>DTD Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TXT_CORPUS_TYPE__DTD_VERSION = eINSTANCE.getEgyTxtCorpusType_DTDVersion();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyTxtTypeImpl <em>Egy Txt Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyTxtTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyTxtType()
         */
        EClass EGY_TXT_TYPE = eINSTANCE.getEgyTxtType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TXT_TYPE__NAME = eINSTANCE.getEgyTxtType_Name();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TXT_TYPE__BTS_CODES = eINSTANCE.getEgyTxtType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TXT_TYPE__COMMENT = eINSTANCE.getEgyTxtType_Comment();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_TXT_TYPE__GROUP = eINSTANCE.getEgyTxtType_Group();

        /**
         * The meta object literal for the '<em><b>Egy Sub Txt</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__EGY_SUB_TXT = eINSTANCE.getEgyTxtType_EgySubTxt();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__EGY_SENT = eINSTANCE.getEgyTxtType_EgySent();

        /**
         * The meta object literal for the '<em><b>Egy TB1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__EGY_TB1 = eINSTANCE.getEgyTxtType_EgyTB1();

        /**
         * The meta object literal for the '<em><b>Egy Szenario</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__EGY_SZENARIO = eINSTANCE.getEgyTxtType_EgySzenario();

        /**
         * The meta object literal for the '<em><b>Glosse</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__GLOSSE = eINSTANCE.getEgyTxtType_Glosse();

        /**
         * The meta object literal for the '<em><b>Egy TB3 Start</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__EGY_TB3_START = eINSTANCE.getEgyTxtType_EgyTB3Start();

        /**
         * The meta object literal for the '<em><b>Egy TB3 End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EGY_TXT_TYPE__EGY_TB3_END = eINSTANCE.getEgyTxtType_EgyTB3End();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.EgyWordTypeImpl <em>Egy Word Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.EgyWordTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getEgyWordType()
         */
        EClass EGY_WORD_TYPE = eINSTANCE.getEgyWordType();

        /**
         * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__FORM = eINSTANCE.getEgyWordType_Form();

        /**
         * The meta object literal for the '<em><b>Translat</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__TRANSLAT = eINSTANCE.getEgyWordType_Translat();

        /**
         * The meta object literal for the '<em><b>Graphics</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__GRAPHICS = eINSTANCE.getEgyWordType_Graphics();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__BTS_CODES = eINSTANCE.getEgyWordType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__COMMENT = eINSTANCE.getEgyWordType_Comment();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__AUTHOR = eINSTANCE.getEgyWordType_Author();

        /**
         * The meta object literal for the '<em><b>Connect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__CONNECT = eINSTANCE.getEgyWordType_Connect();

        /**
         * The meta object literal for the '<em><b>FKey</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__FKEY = eINSTANCE.getEgyWordType_FKey();

        /**
         * The meta object literal for the '<em><b>Leipzig3 Modul</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__LEIPZIG3_MODUL = eINSTANCE.getEgyWordType_Leipzig3Modul();

        /**
         * The meta object literal for the '<em><b>LKey</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__LKEY = eINSTANCE.getEgyWordType_LKey();

        /**
         * The meta object literal for the '<em><b>LType</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__LTYPE = eINSTANCE.getEgyWordType_LType();

        /**
         * The meta object literal for the '<em><b>Reihenfolge</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__REIHENFOLGE = eINSTANCE.getEgyWordType_Reihenfolge();

        /**
         * The meta object literal for the '<em><b>Reihenfolge ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__REIHENFOLGE_ID = eINSTANCE.getEgyWordType_ReihenfolgeID();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__SCRIPT = eINSTANCE.getEgyWordType_Script();

        /**
         * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__STATUS = eINSTANCE.getEgyWordType_Status();

        /**
         * The meta object literal for the '<em><b>WChr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__WCHR = eINSTANCE.getEgyWordType_WChr();

        /**
         * The meta object literal for the '<em><b>WType</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EGY_WORD_TYPE__WTYPE = eINSTANCE.getEgyWordType_WType();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.FormattingElementTypeImpl <em>Formatting Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.FormattingElementTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getFormattingElementType()
         */
        EClass FORMATTING_ELEMENT_TYPE = eINSTANCE.getFormattingElementType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FORMATTING_ELEMENT_TYPE__VALUE = eINSTANCE.getFormattingElementType_Value();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FORMATTING_ELEMENT_TYPE__BTS_CODES = eINSTANCE.getFormattingElementType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FORMATTING_ELEMENT_TYPE__TYPE = eINSTANCE.getFormattingElementType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.GlossePassageTypeImpl <em>Glosse Passage Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.GlossePassageTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getGlossePassageType()
         */
        EClass GLOSSE_PASSAGE_TYPE = eINSTANCE.getGlossePassageType();

        /**
         * The meta object literal for the '<em><b>Passage ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GLOSSE_PASSAGE_TYPE__PASSAGE_ID = eINSTANCE.getGlossePassageType_PassageID();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GLOSSE_PASSAGE_TYPE__SCRIPT = eINSTANCE.getGlossePassageType_Script();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GLOSSE_PASSAGE_TYPE__TYPE = eINSTANCE.getGlossePassageType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.GlosseTypeImpl <em>Glosse Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.GlosseTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getGlosseType()
         */
        EClass GLOSSE_TYPE = eINSTANCE.getGlosseType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GLOSSE_TYPE__GROUP = eINSTANCE.getGlosseType_Group();

        /**
         * The meta object literal for the '<em><b>Egy Sent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__EGY_SENT = eINSTANCE.getGlosseType_EgySent();

        /**
         * The meta object literal for the '<em><b>Egy TB1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__EGY_TB1 = eINSTANCE.getGlosseType_EgyTB1();

        /**
         * The meta object literal for the '<em><b>Egy TB3 Start</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__EGY_TB3_START = eINSTANCE.getGlosseType_EgyTB3Start();

        /**
         * The meta object literal for the '<em><b>Egy TB3 End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__EGY_TB3_END = eINSTANCE.getGlosseType_EgyTB3End();

        /**
         * The meta object literal for the '<em><b>Egy Word</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__EGY_WORD = eINSTANCE.getGlosseType_EgyWord();

        /**
         * The meta object literal for the '<em><b>Line Count</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__LINE_COUNT = eINSTANCE.getGlosseType_LineCount();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__NOTE = eINSTANCE.getGlosseType_Note();

        /**
         * The meta object literal for the '<em><b>Formatting Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__FORMATTING_ELEMENT = eINSTANCE.getGlosseType_FormattingElement();

        /**
         * The meta object literal for the '<em><b>Language Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__LANGUAGE_PASSAGE = eINSTANCE.getGlosseType_LanguagePassage();

        /**
         * The meta object literal for the '<em><b>Baustein Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__BAUSTEIN_PASSAGE = eINSTANCE.getGlosseType_BausteinPassage();

        /**
         * The meta object literal for the '<em><b>Leipzig Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__LEIPZIG_PASSAGE = eINSTANCE.getGlosseType_LeipzigPassage();

        /**
         * The meta object literal for the '<em><b>Glosse Passage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__GLOSSE_PASSAGE = eINSTANCE.getGlosseType_GlossePassage();

        /**
         * The meta object literal for the '<em><b>Punctuation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__PUNCTUATION = eINSTANCE.getGlosseType_Punctuation();

        /**
         * The meta object literal for the '<em><b>Egy Punctuation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference GLOSSE_TYPE__EGY_PUNCTUATION = eINSTANCE.getGlosseType_EgyPunctuation();

        /**
         * The meta object literal for the '<em><b>Passage ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GLOSSE_TYPE__PASSAGE_ID = eINSTANCE.getGlosseType_PassageID();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.LanguagePassageTypeImpl <em>Language Passage Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.LanguagePassageTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLanguagePassageType()
         */
        EClass LANGUAGE_PASSAGE_TYPE = eINSTANCE.getLanguagePassageType();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LANGUAGE_PASSAGE_TYPE__LANGUAGE = eINSTANCE.getLanguagePassageType_Language();

        /**
         * The meta object literal for the '<em><b>Passage ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LANGUAGE_PASSAGE_TYPE__PASSAGE_ID = eINSTANCE.getLanguagePassageType_PassageID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LANGUAGE_PASSAGE_TYPE__TYPE = eINSTANCE.getLanguagePassageType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.LeipzigPassageTypeImpl <em>Leipzig Passage Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.LeipzigPassageTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLeipzigPassageType()
         */
        EClass LEIPZIG_PASSAGE_TYPE = eINSTANCE.getLeipzigPassageType();

        /**
         * The meta object literal for the '<em><b>Auszeichnung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG = eINSTANCE.getLeipzigPassageType_Auszeichnung();

        /**
         * The meta object literal for the '<em><b>Passage ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LEIPZIG_PASSAGE_TYPE__PASSAGE_ID = eINSTANCE.getLeipzigPassageType_PassageID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LEIPZIG_PASSAGE_TYPE__TYPE = eINSTANCE.getLeipzigPassageType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.LineCountTypeImpl <em>Line Count Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.LineCountTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLineCountType()
         */
        EClass LINE_COUNT_TYPE = eINSTANCE.getLineCountType();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LINE_COUNT_TYPE__MIXED = eINSTANCE.getLineCountType_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LINE_COUNT_TYPE__GROUP = eINSTANCE.getLineCountType_Group();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LINE_COUNT_TYPE__VALUE = eINSTANCE.getLineCountType_Value();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LINE_COUNT_TYPE__COMMENT = eINSTANCE.getLineCountType_Comment();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.NoteTypeImpl <em>Note Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.NoteTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getNoteType()
         */
        EClass NOTE_TYPE = eINSTANCE.getNoteType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute NOTE_TYPE__VALUE = eINSTANCE.getNoteType_Value();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute NOTE_TYPE__BTS_CODES = eINSTANCE.getNoteType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute NOTE_TYPE__COMMENT = eINSTANCE.getNoteType_Comment();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.PassportDataItemImpl <em>Passport Data Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.PassportDataItemImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPassportDataItem()
         */
        EClass PASSPORT_DATA_ITEM = eINSTANCE.getPassportDataItem();

        /**
         * The meta object literal for the '<em><b>Passport Data Item</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM = eINSTANCE.getPassportDataItem_PassportDataItem();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.PassportDataItemTypeImpl <em>Passport Data Item Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.PassportDataItemTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPassportDataItemType()
         */
        EClass PASSPORT_DATA_ITEM_TYPE = eINSTANCE.getPassportDataItemType();

        /**
         * The meta object literal for the '<em><b>Ths Entry</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PASSPORT_DATA_ITEM_TYPE__THS_ENTRY = eINSTANCE.getPassportDataItemType_ThsEntry();

        /**
         * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PASSPORT_DATA_ITEM_TYPE__CODE = eINSTANCE.getPassportDataItemType_Code();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PASSPORT_DATA_ITEM_TYPE__COMMENT = eINSTANCE.getPassportDataItemType_Comment();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PASSPORT_DATA_ITEM_TYPE__CATEGORY = eINSTANCE.getPassportDataItemType_Category();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.PicturesTableTypeImpl <em>Pictures Table Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.PicturesTableTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPicturesTableType()
         */
        EClass PICTURES_TABLE_TYPE = eINSTANCE.getPicturesTableType();

        /**
         * The meta object literal for the '<em><b>Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PICTURES_TABLE_TYPE__PICTURE = eINSTANCE.getPicturesTableType_Picture();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.PictureTypeImpl <em>Picture Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.PictureTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPictureType()
         */
        EClass PICTURE_TYPE = eINSTANCE.getPictureType();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__FILE_NAME = eINSTANCE.getPictureType_FileName();

        /**
         * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__FILE_PATH = eINSTANCE.getPictureType_FilePath();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__NAME = eINSTANCE.getPictureType_Name();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__AUTHOR = eINSTANCE.getPictureType_Author();

        /**
         * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__BIBLIOGRAPHY = eINSTANCE.getPictureType_Bibliography();

        /**
         * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__AUTHORIZATION = eINSTANCE.getPictureType_Authorization();

        /**
         * The meta object literal for the '<em><b>Dpi</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__DPI = eINSTANCE.getPictureType_Dpi();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__HEIGHT = eINSTANCE.getPictureType_Height();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__KEY = eINSTANCE.getPictureType_Key();

        /**
         * The meta object literal for the '<em><b>Pict Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__PICT_TYPE = eINSTANCE.getPictureType_PictType();

        /**
         * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__SCALE = eINSTANCE.getPictureType_Scale();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PICTURE_TYPE__WIDTH = eINSTANCE.getPictureType_Width();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.PunctuationTypeImpl <em>Punctuation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.PunctuationTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getPunctuationType()
         */
        EClass PUNCTUATION_TYPE = eINSTANCE.getPunctuationType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PUNCTUATION_TYPE__VALUE = eINSTANCE.getPunctuationType_Value();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PUNCTUATION_TYPE__BTS_CODES = eINSTANCE.getPunctuationType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PUNCTUATION_TYPE__COMMENT = eINSTANCE.getPunctuationType_Comment();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCArrangementTypeImpl <em>TC Arrangement Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCArrangementTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCArrangementType()
         */
        EClass TC_ARRANGEMENT_TYPE = eINSTANCE.getTCArrangementType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_ARRANGEMENT_TYPE__TC_PASSPORT = eINSTANCE.getTCArrangementType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_ARRANGEMENT_TYPE__TC_PICTURE = eINSTANCE.getTCArrangementType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_ARRANGEMENT_TYPE__TC_NOTEBOOK = eINSTANCE.getTCArrangementType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_ARRANGEMENT_TYPE__GROUP = eINSTANCE.getTCArrangementType_Group();

        /**
         * The meta object literal for the '<em><b>TC Arrangement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_ARRANGEMENT_TYPE__TC_ARRANGEMENT = eINSTANCE.getTCArrangementType_TCArrangement();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_ARRANGEMENT_TYPE__TC_OBJECT = eINSTANCE.getTCArrangementType_TCObject();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_ARRANGEMENT_TYPE__AUTHOR = eINSTANCE.getTCArrangementType_Author();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_ARRANGEMENT_TYPE__SORT_KEY = eINSTANCE.getTCArrangementType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_ARRANGEMENT_TYPE__TC_NAME = eINSTANCE.getTCArrangementType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCCaptionTypeImpl <em>TC Caption Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCCaptionTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCCaptionType()
         */
        EClass TC_CAPTION_TYPE = eINSTANCE.getTCCaptionType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_PASSPORT = eINSTANCE.getTCCaptionType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_PICTURE = eINSTANCE.getTCCaptionType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_CAPTION_TYPE__TC_NOTEBOOK = eINSTANCE.getTCCaptionType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_CAPTION_TYPE__GROUP = eINSTANCE.getTCCaptionType_Group();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_CAPTION = eINSTANCE.getTCCaptionType_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_GROUP = eINSTANCE.getTCCaptionType_TCGroup();

        /**
         * The meta object literal for the '<em><b>TC Arrangement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_ARRANGEMENT = eINSTANCE.getTCCaptionType_TCArrangement();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_OBJECT = eINSTANCE.getTCCaptionType_TCObject();

        /**
         * The meta object literal for the '<em><b>TC Obj Part</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_OBJ_PART = eINSTANCE.getTCCaptionType_TCObjPart();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_CAPTION_TYPE__TC_TEXT = eINSTANCE.getTCCaptionType_TCText();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_CAPTION_TYPE__AUTHOR = eINSTANCE.getTCCaptionType_Author();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_CAPTION_TYPE__SORT_KEY = eINSTANCE.getTCCaptionType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_CAPTION_TYPE__TC_NAME = eINSTANCE.getTCCaptionType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCGroupTypeImpl <em>TC Group Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCGroupTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCGroupType()
         */
        EClass TC_GROUP_TYPE = eINSTANCE.getTCGroupType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_GROUP_TYPE__TC_PASSPORT = eINSTANCE.getTCGroupType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_GROUP_TYPE__TC_PICTURE = eINSTANCE.getTCGroupType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_GROUP_TYPE__TC_NOTEBOOK = eINSTANCE.getTCGroupType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_GROUP_TYPE__GROUP = eINSTANCE.getTCGroupType_Group();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_GROUP_TYPE__TC_CAPTION = eINSTANCE.getTCGroupType_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_GROUP_TYPE__TC_GROUP = eINSTANCE.getTCGroupType_TCGroup();

        /**
         * The meta object literal for the '<em><b>TC Arrangement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_GROUP_TYPE__TC_ARRANGEMENT = eINSTANCE.getTCGroupType_TCArrangement();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_GROUP_TYPE__TC_OBJECT = eINSTANCE.getTCGroupType_TCObject();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_GROUP_TYPE__AUTHOR = eINSTANCE.getTCGroupType_Author();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_GROUP_TYPE__SORT_KEY = eINSTANCE.getTCGroupType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_GROUP_TYPE__TC_NAME = eINSTANCE.getTCGroupType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCHeaderTypeImpl <em>TC Header Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCHeaderTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCHeaderType()
         */
        EClass TC_HEADER_TYPE = eINSTANCE.getTCHeaderType();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_HEADER_TYPE__DATE = eINSTANCE.getTCHeaderType_Date();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_HEADER_TYPE__AUTHOR = eINSTANCE.getTCHeaderType_Author();

        /**
         * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_HEADER_TYPE__PROJECT = eINSTANCE.getTCHeaderType_Project();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_HEADER_TYPE__TITLE = eINSTANCE.getTCHeaderType_Title();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_HEADER_TYPE__COMMENT = eINSTANCE.getTCHeaderType_Comment();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCLocationTypeImpl <em>TC Location Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCLocationTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCLocationType()
         */
        EClass TC_LOCATION_TYPE = eINSTANCE.getTCLocationType();

        /**
         * The meta object literal for the '<em><b>Ths Entry</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_LOCATION_TYPE__THS_ENTRY = eINSTANCE.getTCLocationType_ThsEntry();

        /**
         * The meta object literal for the '<em><b>Museum Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_LOCATION_TYPE__MUSEUM_NUMBER = eINSTANCE.getTCLocationType_MuseumNumber();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_LOCATION_TYPE__COMMENT = eINSTANCE.getTCLocationType_Comment();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCObjectTypeImpl <em>TC Object Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCObjectTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCObjectType()
         */
        EClass TC_OBJECT_TYPE = eINSTANCE.getTCObjectType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_PASSPORT = eINSTANCE.getTCObjectType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_PICTURE = eINSTANCE.getTCObjectType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__TC_NOTEBOOK = eINSTANCE.getTCObjectType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__GROUP = eINSTANCE.getTCObjectType_Group();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_CAPTION = eINSTANCE.getTCObjectType_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_OBJECT = eINSTANCE.getTCObjectType_TCObject();

        /**
         * The meta object literal for the '<em><b>TC Obj Part</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_OBJ_PART = eINSTANCE.getTCObjectType_TCObjPart();

        /**
         * The meta object literal for the '<em><b>TC Scene</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_SCENE = eINSTANCE.getTCObjectType_TCScene();

        /**
         * The meta object literal for the '<em><b>TC Super Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_SUPER_TEXT = eINSTANCE.getTCObjectType_TCSuperText();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJECT_TYPE__TC_TEXT = eINSTANCE.getTCObjectType_TCText();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__AUTHOR = eINSTANCE.getTCObjectType_Author();

        /**
         * The meta object literal for the '<em><b>Bearbeitungsstand</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__BEARBEITUNGSSTAND = eINSTANCE.getTCObjectType_Bearbeitungsstand();

        /**
         * The meta object literal for the '<em><b>GIS</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__GIS = eINSTANCE.getTCObjectType_GIS();

        /**
         * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__OBJECT_ID = eINSTANCE.getTCObjectType_ObjectID();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__SORT_KEY = eINSTANCE.getTCObjectType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJECT_TYPE__TC_NAME = eINSTANCE.getTCObjectType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCObjPartTypeImpl <em>TC Obj Part Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCObjPartTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCObjPartType()
         */
        EClass TC_OBJ_PART_TYPE = eINSTANCE.getTCObjPartType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_PASSPORT = eINSTANCE.getTCObjPartType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_PICTURE = eINSTANCE.getTCObjPartType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJ_PART_TYPE__TC_NOTEBOOK = eINSTANCE.getTCObjPartType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJ_PART_TYPE__GROUP = eINSTANCE.getTCObjPartType_Group();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_CAPTION = eINSTANCE.getTCObjPartType_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_OBJECT = eINSTANCE.getTCObjPartType_TCObject();

        /**
         * The meta object literal for the '<em><b>TC Obj Part</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_OBJ_PART = eINSTANCE.getTCObjPartType_TCObjPart();

        /**
         * The meta object literal for the '<em><b>TC Scene</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_SCENE = eINSTANCE.getTCObjPartType_TCScene();

        /**
         * The meta object literal for the '<em><b>TC Super Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_SUPER_TEXT = eINSTANCE.getTCObjPartType_TCSuperText();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_OBJ_PART_TYPE__TC_TEXT = eINSTANCE.getTCObjPartType_TCText();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJ_PART_TYPE__AUTHOR = eINSTANCE.getTCObjPartType_Author();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJ_PART_TYPE__SORT_KEY = eINSTANCE.getTCObjPartType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_OBJ_PART_TYPE__TC_NAME = eINSTANCE.getTCObjPartType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCPassportTypeImpl <em>TC Passport Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCPassportTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCPassportType()
         */
        EClass TC_PASSPORT_TYPE = eINSTANCE.getTCPassportType();

        /**
         * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__DEFINITION = eINSTANCE.getTCPassportType_Definition();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__PROTOCOL = eINSTANCE.getTCPassportType_Protocol();

        /**
         * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__BIBLIOGRAPHY = eINSTANCE.getTCPassportType_Bibliography();

        /**
         * The meta object literal for the '<em><b>Provenance</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__PROVENANCE = eINSTANCE.getTCPassportType_Provenance();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__DATE = eINSTANCE.getTCPassportType_Date();

        /**
         * The meta object literal for the '<em><b>Object Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__OBJECT_TYPE = eINSTANCE.getTCPassportType_ObjectType();

        /**
         * The meta object literal for the '<em><b>Depiction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__DEPICTION = eINSTANCE.getTCPassportType_Depiction();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__SCRIPT = eINSTANCE.getTCPassportType_Script();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__LANGUAGE = eINSTANCE.getTCPassportType_Language();

        /**
         * The meta object literal for the '<em><b>Lang Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__LANG_COMMENT = eINSTANCE.getTCPassportType_LangComment();

        /**
         * The meta object literal for the '<em><b>Work</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__WORK = eINSTANCE.getTCPassportType_Work();

        /**
         * The meta object literal for the '<em><b>Text Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__TEXT_TYPE = eINSTANCE.getTCPassportType_TextType();

        /**
         * The meta object literal for the '<em><b>Line Count</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__LINE_COUNT = eINSTANCE.getTCPassportType_LineCount();

        /**
         * The meta object literal for the '<em><b>Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__CODES = eINSTANCE.getTCPassportType_Codes();

        /**
         * The meta object literal for the '<em><b>Wb Folder</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__WB_FOLDER = eINSTANCE.getTCPassportType_WbFolder();

        /**
         * The meta object literal for the '<em><b>Wb Slips</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__WB_SLIPS = eINSTANCE.getTCPassportType_WbSlips();

        /**
         * The meta object literal for the '<em><b>Code1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__CODE1 = eINSTANCE.getTCPassportType_Code1();

        /**
         * The meta object literal for the '<em><b>Code2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__CODE2 = eINSTANCE.getTCPassportType_Code2();

        /**
         * The meta object literal for the '<em><b>Bts Codes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__BTS_CODES = eINSTANCE.getTCPassportType_BtsCodes();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__COMMENT = eINSTANCE.getTCPassportType_Comment();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__NOTES = eINSTANCE.getTCPassportType_Notes();

        /**
         * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__FULL_NAME = eINSTANCE.getTCPassportType_FullName();

        /**
         * The meta object literal for the '<em><b>Name Sort</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PASSPORT_TYPE__NAME_SORT = eINSTANCE.getTCPassportType_NameSort();

        /**
         * The meta object literal for the '<em><b>TC Location</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_PASSPORT_TYPE__TC_LOCATION = eINSTANCE.getTCPassportType_TCLocation();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCPictureTypeImpl <em>TC Picture Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCPictureTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCPictureType()
         */
        EClass TC_PICTURE_TYPE = eINSTANCE.getTCPictureType();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PICTURE_TYPE__MIXED = eINSTANCE.getTCPictureType_Mixed();

        /**
         * The meta object literal for the '<em><b>Picture Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_PICTURE_TYPE__PICTURE_TYPE = eINSTANCE.getTCPictureType_PictureType();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCSceneTypeImpl <em>TC Scene Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCSceneTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCSceneType()
         */
        EClass TC_SCENE_TYPE = eINSTANCE.getTCSceneType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SCENE_TYPE__TC_PASSPORT = eINSTANCE.getTCSceneType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SCENE_TYPE__TC_PICTURE = eINSTANCE.getTCSceneType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SCENE_TYPE__TC_NOTEBOOK = eINSTANCE.getTCSceneType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SCENE_TYPE__GROUP = eINSTANCE.getTCSceneType_Group();

        /**
         * The meta object literal for the '<em><b>TC Caption</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SCENE_TYPE__TC_CAPTION = eINSTANCE.getTCSceneType_TCCaption();

        /**
         * The meta object literal for the '<em><b>TC Scene</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SCENE_TYPE__TC_SCENE = eINSTANCE.getTCSceneType_TCScene();

        /**
         * The meta object literal for the '<em><b>TC Super Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SCENE_TYPE__TC_SUPER_TEXT = eINSTANCE.getTCSceneType_TCSuperText();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SCENE_TYPE__TC_TEXT = eINSTANCE.getTCSceneType_TCText();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SCENE_TYPE__AUTHOR = eINSTANCE.getTCSceneType_Author();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SCENE_TYPE__SORT_KEY = eINSTANCE.getTCSceneType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SCENE_TYPE__TC_NAME = eINSTANCE.getTCSceneType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCSuperTextTypeImpl <em>TC Super Text Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCSuperTextTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCSuperTextType()
         */
        EClass TC_SUPER_TEXT_TYPE = eINSTANCE.getTCSuperTextType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SUPER_TEXT_TYPE__TC_PASSPORT = eINSTANCE.getTCSuperTextType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SUPER_TEXT_TYPE__TC_PICTURE = eINSTANCE.getTCSuperTextType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SUPER_TEXT_TYPE__TC_NOTEBOOK = eINSTANCE.getTCSuperTextType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>TC Text</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_SUPER_TEXT_TYPE__TC_TEXT = eINSTANCE.getTCSuperTextType_TCText();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SUPER_TEXT_TYPE__AUTHOR = eINSTANCE.getTCSuperTextType_Author();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SUPER_TEXT_TYPE__SORT_KEY = eINSTANCE.getTCSuperTextType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_SUPER_TEXT_TYPE__TC_NAME = eINSTANCE.getTCSuperTextType_TCName();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.TCTextTypeImpl <em>TC Text Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.TCTextTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTCTextType()
         */
        EClass TC_TEXT_TYPE = eINSTANCE.getTCTextType();

        /**
         * The meta object literal for the '<em><b>TC Passport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_TEXT_TYPE__TC_PASSPORT = eINSTANCE.getTCTextType_TCPassport();

        /**
         * The meta object literal for the '<em><b>TC Picture</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_TEXT_TYPE__TC_PICTURE = eINSTANCE.getTCTextType_TCPicture();

        /**
         * The meta object literal for the '<em><b>TC Notebook</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_TEXT_TYPE__TC_NOTEBOOK = eINSTANCE.getTCTextType_TCNotebook();

        /**
         * The meta object literal for the '<em><b>Egy Txt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TC_TEXT_TYPE__EGY_TXT = eINSTANCE.getTCTextType_EgyTxt();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_TEXT_TYPE__AUTHOR = eINSTANCE.getTCTextType_Author();

        /**
         * The meta object literal for the '<em><b>Bearbeitungsstand</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_TEXT_TYPE__BEARBEITUNGSSTAND = eINSTANCE.getTCTextType_Bearbeitungsstand();

        /**
         * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_TEXT_TYPE__SORT_KEY = eINSTANCE.getTCTextType_SortKey();

        /**
         * The meta object literal for the '<em><b>TC Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_TEXT_TYPE__TC_NAME = eINSTANCE.getTCTextType_TCName();

        /**
         * The meta object literal for the '<em><b>Text ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TC_TEXT_TYPE__TEXT_ID = eINSTANCE.getTCTextType_TextID();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.ThsEntryTypeImpl <em>Ths Entry Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.ThsEntryTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getThsEntryType()
         */
        EClass THS_ENTRY_TYPE = eINSTANCE.getThsEntryType();

        /**
         * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THS_ENTRY_TYPE__TERM = eINSTANCE.getThsEntryType_Term();

        /**
         * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THS_ENTRY_TYPE__HIERARCHY = eINSTANCE.getThsEntryType_Hierarchy();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THS_ENTRY_TYPE__COMMENT = eINSTANCE.getThsEntryType_Comment();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THS_ENTRY_TYPE__CATEGORY = eINSTANCE.getThsEntryType_Category();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THS_ENTRY_TYPE__KEY = eINSTANCE.getThsEntryType_Key();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute THS_ENTRY_TYPE__TYPE = eINSTANCE.getThsEntryType_Type();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.impl.WorkTypeImpl <em>Work Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.impl.WorkTypeImpl
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getWorkType()
         */
        EClass WORK_TYPE = eINSTANCE.getWorkType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute WORK_TYPE__NAME = eINSTANCE.getWorkType_Name();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute WORK_TYPE__COMMENT = eINSTANCE.getWorkType_Comment();

        /**
         * The meta object literal for the '<em><b>Thesaurus</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute WORK_TYPE__THESAURUS = eINSTANCE.getWorkType_Thesaurus();

        /**
         * The meta object literal for the '<em><b>Version Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute WORK_TYPE__VERSION_CODE = eINSTANCE.getWorkType_VersionCode();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.CategoryType <em>Category Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.CategoryType
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryType()
         */
        EEnum CATEGORY_TYPE = eINSTANCE.getCategoryType();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.CategoryType1 <em>Category Type1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.CategoryType1
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryType1()
         */
        EEnum CATEGORY_TYPE1 = eINSTANCE.getCategoryType1();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.LTypeType <em>LType Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.LTypeType
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLTypeType()
         */
        EEnum LTYPE_TYPE = eINSTANCE.getLTypeType();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType <em>Type Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType()
         */
        EEnum TYPE_TYPE = eINSTANCE.getTypeType();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType1 <em>Type Type1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType1
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType1()
         */
        EEnum TYPE_TYPE1 = eINSTANCE.getTypeType1();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType2 <em>Type Type2</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType2
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType2()
         */
        EEnum TYPE_TYPE2 = eINSTANCE.getTypeType2();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType3 <em>Type Type3</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType3
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType3()
         */
        EEnum TYPE_TYPE3 = eINSTANCE.getTypeType3();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType4 <em>Type Type4</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType4
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType4()
         */
        EEnum TYPE_TYPE4 = eINSTANCE.getTypeType4();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType5 <em>Type Type5</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType5
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType5()
         */
        EEnum TYPE_TYPE5 = eINSTANCE.getTypeType5();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType6 <em>Type Type6</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType6
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType6()
         */
        EEnum TYPE_TYPE6 = eINSTANCE.getTypeType6();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType7 <em>Type Type7</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType7
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType7()
         */
        EEnum TYPE_TYPE7 = eINSTANCE.getTypeType7();

        /**
         * The meta object literal for the '{@link CorpusDTDneu.TypeType8 <em>Type Type8</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType8
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeType8()
         */
        EEnum TYPE_TYPE8 = eINSTANCE.getTypeType8();

        /**
         * The meta object literal for the '<em>Category Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.CategoryType
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryTypeObject()
         */
        EDataType CATEGORY_TYPE_OBJECT = eINSTANCE.getCategoryTypeObject();

        /**
         * The meta object literal for the '<em>Category Type Object1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.CategoryType1
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getCategoryTypeObject1()
         */
        EDataType CATEGORY_TYPE_OBJECT1 = eINSTANCE.getCategoryTypeObject1();

        /**
         * The meta object literal for the '<em>LType Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.LTypeType
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getLTypeTypeObject()
         */
        EDataType LTYPE_TYPE_OBJECT = eINSTANCE.getLTypeTypeObject();

        /**
         * The meta object literal for the '<em>Type Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType1
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject()
         */
        EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

        /**
         * The meta object literal for the '<em>Type Type Object1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType3
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject1()
         */
        EDataType TYPE_TYPE_OBJECT1 = eINSTANCE.getTypeTypeObject1();

        /**
         * The meta object literal for the '<em>Type Type Object2</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType5
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject2()
         */
        EDataType TYPE_TYPE_OBJECT2 = eINSTANCE.getTypeTypeObject2();

        /**
         * The meta object literal for the '<em>Type Type Object3</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType2
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject3()
         */
        EDataType TYPE_TYPE_OBJECT3 = eINSTANCE.getTypeTypeObject3();

        /**
         * The meta object literal for the '<em>Type Type Object4</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject4()
         */
        EDataType TYPE_TYPE_OBJECT4 = eINSTANCE.getTypeTypeObject4();

        /**
         * The meta object literal for the '<em>Type Type Object5</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType6
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject5()
         */
        EDataType TYPE_TYPE_OBJECT5 = eINSTANCE.getTypeTypeObject5();

        /**
         * The meta object literal for the '<em>Type Type Object6</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType4
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject6()
         */
        EDataType TYPE_TYPE_OBJECT6 = eINSTANCE.getTypeTypeObject6();

        /**
         * The meta object literal for the '<em>Type Type Object7</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType7
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject7()
         */
        EDataType TYPE_TYPE_OBJECT7 = eINSTANCE.getTypeTypeObject7();

        /**
         * The meta object literal for the '<em>Type Type Object8</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see CorpusDTDneu.TypeType8
         * @see CorpusDTDneu.impl.CorpusDTDneuPackageImpl#getTypeTypeObject8()
         */
        EDataType TYPE_TYPE_OBJECT8 = eINSTANCE.getTypeTypeObject8();

    }

} //CorpusDTDneuPackage
