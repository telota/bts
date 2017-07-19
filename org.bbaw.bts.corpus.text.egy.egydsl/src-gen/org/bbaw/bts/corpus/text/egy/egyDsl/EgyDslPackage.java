/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @model kind="package"
 * @generated
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslFactory
 */
public interface EgyDslPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "egyDsl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://www.bbaw.org/bts/corpus/text/egy/EgyDsl";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "egyDsl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EgyDslPackage eINSTANCE = org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl.init();

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl <em>Text Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextContent()
     */
    int TEXT_CONTENT = 0;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TEXT_CONTENT__ITEMS = 0;

    /**
     * The number of structural features of the '<em>Text Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TEXT_CONTENT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl <em>Text Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextItem()
     */
    int TEXT_ITEM = 1;

    /**
     * The number of structural features of the '<em>Text Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TEXT_ITEM_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentence()
     */
    int SENTENCE = 2;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SENTENCE__ITEMS = TEXT_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Sentence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SENTENCE_FEATURE_COUNT = TEXT_ITEM_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItem()
     */
    int SENTENCE_ITEM = 3;

    /**
     * The number of structural features of the '<em>Sentence Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SENTENCE_ITEM_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl <em>Abstract Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAbstractMarker()
     */
    int ABSTRACT_MARKER = 4;

    /**
     * The number of structural features of the '<em>Abstract Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ABSTRACT_MARKER_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl <em>Ambivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAmbivalence()
     */
    int AMBIVALENCE = 5;

    /**
     * The feature id for the '<em><b>Cases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AMBIVALENCE__CASES = SENTENCE_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ambivalence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AMBIVALENCE_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCase()
     */
    int CASE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CASE__NAME = 0;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CASE__ITEMS = 1;

    /**
     * The number of structural features of the '<em>Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CASE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl <em>Sentence Item No Ambivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItemNoAmbivalence()
     */
    int SENTENCE_ITEM_NO_AMBIVALENCE = 7;

    /**
     * The number of structural features of the '<em>Sentence Item No Ambivalence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SENTENCE_ITEM_NO_AMBIVALENCE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl <em>Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMarker()
     */
    int MARKER = 8;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MARKER__TYPE = ABSTRACT_MARKER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl <em>Destruction Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestructionMarker()
     */
    int DESTRUCTION_MARKER = 9;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DESTRUCTION_MARKER__TYPE = ABSTRACT_MARKER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Destruction Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DESTRUCTION_MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl <em>Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWord()
     */
    int WORD = 10;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORD__WCHAR = SENTENCE_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Word</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORD_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl <em>Word Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordPart()
     */
    int WORD_PART = 11;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORD_PART__WCHAR = 0;

    /**
     * The number of structural features of the '<em>Word Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORD_PART_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl <em>Word Middle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordMiddle()
     */
    int WORD_MIDDLE = 12;

    /**
     * The number of structural features of the '<em>Word Middle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORD_MIDDLE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl <em>Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getChars()
     */
    int CHARS = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CHARS__NAME = WORD_MIDDLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Chars</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CHARS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl <em>Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrackets()
     */
    int BRACKETS = 14;

    /**
     * The number of structural features of the '<em>Brackets</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BRACKETS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl <em>Oval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getOval()
     */
    int OVAL = 15;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OVAL__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Oval</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OVAL_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl <em>Serech</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSerech()
     */
    int SERECH = 16;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERECH__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Serech</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERECH_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl <em>Cartouche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCartouche()
     */
    int CARTOUCHE = 17;

    /**
     * The number of structural features of the '<em>Cartouche</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CARTOUCHE_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl <em>No Cartouche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoCartouche()
     */
    int NO_CARTOUCHE = 18;

    /**
     * The number of structural features of the '<em>No Cartouche</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_CARTOUCHE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl <em>Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpanded()
     */
    int EXPANDED = 19;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPANDED__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expanded</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPANDED_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpanded()
     */
    int ANCIENT_EXPANDED = 20;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ANCIENT_EXPANDED__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ancient Expanded</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ANCIENT_EXPANDED_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl <em>No Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpanded()
     */
    int NO_EXPANDED = 21;

    /**
     * The number of structural features of the '<em>No Expanded</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_EXPANDED_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl <em>Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendation()
     */
    int EMENDATION = 22;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EMENDATION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Emendation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EMENDATION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl <em>No Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoEmendation()
     */
    int NO_EMENDATION = 23;

    /**
     * The number of structural features of the '<em>No Emendation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_EMENDATION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableReading()
     */
    int DISPUTABLE_READING = 24;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DISPUTABLE_READING__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Disputable Reading</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DISPUTABLE_READING_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDisputableReading()
     */
    int NO_DISPUTABLE_READING = 25;

    /**
     * The number of structural features of the '<em>No Disputable Reading</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_DISPUTABLE_READING_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl <em>Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getLacuna()
     */
    int LACUNA = 26;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LACUNA__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Lacuna</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LACUNA_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoLacuna()
     */
    int NO_LACUNA = 27;

    /**
     * The number of structural features of the '<em>No Lacuna</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_LACUNA_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl <em>Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletion()
     */
    int DELETION = 28;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DELETION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Deletion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DELETION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl <em>No Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDeletion()
     */
    int NO_DELETION = 29;

    /**
     * The number of structural features of the '<em>No Deletion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_DELETION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpandedColumn()
     */
    int EXPANDED_COLUMN = 30;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPANDED_COLUMN__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expanded Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPANDED_COLUMN_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpandedColumn()
     */
    int NO_EXPANDED_COLUMN = 31;

    /**
     * The number of structural features of the '<em>No Expanded Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_EXPANDED_COLUMN_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl <em>Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasur()
     */
    int RASUR = 32;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RASUR__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Rasur</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RASUR_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl <em>No Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRasur()
     */
    int NO_RASUR = 33;

    /**
     * The number of structural features of the '<em>No Rasur</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_RASUR_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoAncientExpanded()
     */
    int NO_ANCIENT_EXPANDED = 34;

    /**
     * The number of structural features of the '<em>No Ancient Expanded</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_ANCIENT_EXPANDED_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasur()
     */
    int RESTORATION_OVER_RASUR = 35;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESTORATION_OVER_RASUR__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Restoration Over Rasur</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESTORATION_OVER_RASUR_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRestorationOverRasur()
     */
    int NO_RESTORATION_OVER_RASUR = 36;

    /**
     * The number of structural features of the '<em>No Restoration Over Rasur</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_RESTORATION_OVER_RASUR_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestruction()
     */
    int PARTIAL_DESTRUCTION = 37;

    /**
     * The feature id for the '<em><b>WChar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARTIAL_DESTRUCTION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Partial Destruction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARTIAL_DESTRUCTION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoPartialDestruction()
     */
    int NO_PARTIAL_DESTRUCTION = 38;

    /**
     * The number of structural features of the '<em>No Partial Destruction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_PARTIAL_DESTRUCTION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl <em>Interfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfix()
     */
    int INTERFIX = 39;

    /**
     * The number of structural features of the '<em>Interfix</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexical()
     */
    int INTERFIX_LEXICAL = 40;

    /**
     * The number of structural features of the '<em>Interfix Lexical</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexion()
     */
    int INTERFIX_FLEXION = 41;

    /**
     * The number of structural features of the '<em>Interfix Flexion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_FLEXION_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixSuffixPronomLexical()
     */
    int INTERFIX_SUFFIX_PRONOM_LEXICAL = 42;

    /**
     * The number of structural features of the '<em>Interfix Suffix Pronom Lexical</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_SUFFIX_PRONOM_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixNonLexical()
     */
    int INTERFIX_PREFIX_NON_LEXICAL = 43;

    /**
     * The number of structural features of the '<em>Interfix Prefix Non Lexical</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_PREFIX_NON_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixLexical()
     */
    int INTERFIX_PREFIX_LEXICAL = 44;

    /**
     * The number of structural features of the '<em>Interfix Prefix Lexical</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_PREFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixConnectionSyllabicGroup()
     */
    int INTERFIX_CONNECTION_SYLLABIC_GROUP = 45;

    /**
     * The number of structural features of the '<em>Interfix Connection Syllabic Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_CONNECTION_SYLLABIC_GROUP_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl <em>Interfix Compound Words</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixCompoundWords()
     */
    int INTERFIX_COMPOUND_WORDS = 46;

    /**
     * The number of structural features of the '<em>Interfix Compound Words</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_COMPOUND_WORDS_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl <em>Interfix Phonetical Complement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPhoneticalComplement()
     */
    int INTERFIX_PHONETICAL_COMPLEMENT = 47;

    /**
     * The number of structural features of the '<em>Interfix Phonetical Complement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INTERFIX_PHONETICAL_COMPLEMENT_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl <em>Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersMarker()
     */
    int VERS_MARKER = 48;

    /**
     * The number of structural features of the '<em>Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int VERS_MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl <em>Emendation Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendationVersMarker()
     */
    int EMENDATION_VERS_MARKER = 49;

    /**
     * The number of structural features of the '<em>Emendation Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EMENDATION_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl <em>Disputable Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableVersMarker()
     */
    int DISPUTABLE_VERS_MARKER = 50;

    /**
     * The number of structural features of the '<em>Disputable Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DISPUTABLE_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl <em>Deleted Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedVersMarker()
     */
    int DELETED_VERS_MARKER = 51;

    /**
     * The number of structural features of the '<em>Deleted Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DELETED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl <em>Destroyed Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersMarker()
     */
    int DESTROYED_VERS_MARKER = 52;

    /**
     * The number of structural features of the '<em>Destroyed Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DESTROYED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl <em>Destroyed Vers Frontier Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersFrontierMarker()
     */
    int DESTROYED_VERS_FRONTIER_MARKER = 53;

    /**
     * The number of structural features of the '<em>Destroyed Vers Frontier Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int DESTROYED_VERS_FRONTIER_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl <em>Partial Destroyed Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedVersMarker()
     */
    int PARTIAL_DESTROYED_VERS_MARKER = 54;

    /**
     * The number of structural features of the '<em>Partial Destroyed Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARTIAL_DESTROYED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl <em>Missing Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMissingVersMarker()
     */
    int MISSING_VERS_MARKER = 55;

    /**
     * The number of structural features of the '<em>Missing Vers Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MISSING_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl <em>Restoration Over Rasur Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasurMarker()
     */
    int RESTORATION_OVER_RASUR_MARKER = 56;

    /**
     * The number of structural features of the '<em>Restoration Over Rasur Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESTORATION_OVER_RASUR_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl <em>Ancient Expanded Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpandedMarker()
     */
    int ANCIENT_EXPANDED_MARKER = 57;

    /**
     * The number of structural features of the '<em>Ancient Expanded Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ANCIENT_EXPANDED_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl <em>Rasur Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasurMarker()
     */
    int RASUR_MARKER = 58;

    /**
     * The number of structural features of the '<em>Rasur Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RASUR_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl <em>Vers Frontier Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersFrontierMarker()
     */
    int VERS_FRONTIER_MARKER = 59;

    /**
     * The number of structural features of the '<em>Vers Frontier Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int VERS_FRONTIER_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl <em>Versbreak Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersbreakMarker()
     */
    int VERSBREAK_MARKER = 60;

    /**
     * The number of structural features of the '<em>Versbreak Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int VERSBREAK_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl <em>Broken Versbreak Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrokenVersbreakMarker()
     */
    int BROKEN_VERSBREAK_MARKER = 61;

    /**
     * The number of structural features of the '<em>Broken Versbreak Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BROKEN_VERSBREAK_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent <em>Text Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Text Content</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent
     */
    EClass getTextContent();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems()
     * @see #getTextContent()
     */
    EReference getTextContent_Items();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextItem <em>Text Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Text Item</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextItem
     */
    EClass getTextItem();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence <em>Sentence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Sentence</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence
     */
    EClass getSentence();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence#getItems()
     * @see #getSentence()
     */
    EReference getSentence_Items();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem <em>Sentence Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Sentence Item</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem
     */
    EClass getSentenceItem();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker <em>Abstract Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Abstract Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker
     */
    EClass getAbstractMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence <em>Ambivalence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Ambivalence</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence
     */
    EClass getAmbivalence();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases <em>Cases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Cases</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases()
     * @see #getAmbivalence()
     */
    EReference getAmbivalence_Cases();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case <em>Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Case</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case
     */
    EClass getCase();

    /**
     * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName()
     * @see #getCase()
     */
    EAttribute getCase_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems()
     * @see #getCase()
     */
    EReference getCase_Items();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence <em>Sentence Item No Ambivalence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Sentence Item No Ambivalence</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence
     */
    EClass getSentenceItemNoAmbivalence();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker <em>Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker
     */
    EClass getMarker();

    /**
     * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getType()
     * @see #getMarker()
     */
    EAttribute getMarker_Type();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker <em>Destruction Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Destruction Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker
     */
    EClass getDestructionMarker();

    /**
     * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Type</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker#getType()
     * @see #getDestructionMarker()
     */
    EAttribute getDestructionMarker_Type();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word <em>Word</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Word</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word
     */
    EClass getWord();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word#getWChar()
     * @see #getWord()
     */
    EReference getWord_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart <em>Word Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Word Part</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart
     */
    EClass getWordPart();

    /**
     * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar()
     * @see #getWordPart()
     */
    EReference getWordPart_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle <em>Word Middle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Word Middle</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle
     */
    EClass getWordMiddle();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars <em>Chars</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Chars</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars
     */
    EClass getChars();

    /**
     * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars#getName()
     * @see #getChars()
     */
    EAttribute getChars_Name();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Brackets <em>Brackets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Brackets</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Brackets
     */
    EClass getBrackets();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Oval <em>Oval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Oval</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Oval
     */
    EClass getOval();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Oval#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Oval#getWChar()
     * @see #getOval()
     */
    EReference getOval_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Serech <em>Serech</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Serech</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Serech
     */
    EClass getSerech();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Serech#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Serech#getWChar()
     * @see #getSerech()
     */
    EReference getSerech_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche <em>Cartouche</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Cartouche</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche
     */
    EClass getCartouche();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche <em>No Cartouche</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Cartouche</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche
     */
    EClass getNoCartouche();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded <em>Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expanded</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded
     */
    EClass getExpanded();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded#getWChar()
     * @see #getExpanded()
     */
    EReference getExpanded_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded <em>Ancient Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Ancient Expanded</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded
     */
    EClass getAncientExpanded();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded#getWChar()
     * @see #getAncientExpanded()
     */
    EReference getAncientExpanded_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded <em>No Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Expanded</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded
     */
    EClass getNoExpanded();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation <em>Emendation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Emendation</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation
     */
    EClass getEmendation();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation#getWChar()
     * @see #getEmendation()
     */
    EReference getEmendation_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation <em>No Emendation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Emendation</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation
     */
    EClass getNoEmendation();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading <em>Disputable Reading</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Disputable Reading</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading
     */
    EClass getDisputableReading();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading#getWChar()
     * @see #getDisputableReading()
     */
    EReference getDisputableReading_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading <em>No Disputable Reading</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Disputable Reading</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading
     */
    EClass getNoDisputableReading();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna <em>Lacuna</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Lacuna</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna
     */
    EClass getLacuna();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna#getWChar()
     * @see #getLacuna()
     */
    EReference getLacuna_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna <em>No Lacuna</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Lacuna</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna
     */
    EClass getNoLacuna();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion <em>Deletion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Deletion</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion
     */
    EClass getDeletion();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion#getWChar()
     * @see #getDeletion()
     */
    EReference getDeletion_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion <em>No Deletion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Deletion</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion
     */
    EClass getNoDeletion();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn <em>Expanded Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expanded Column</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn
     */
    EClass getExpandedColumn();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar()
     * @see #getExpandedColumn()
     */
    EReference getExpandedColumn_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn <em>No Expanded Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Expanded Column</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn
     */
    EClass getNoExpandedColumn();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur <em>Rasur</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Rasur</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur
     */
    EClass getRasur();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur#getWChar()
     * @see #getRasur()
     */
    EReference getRasur_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur <em>No Rasur</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Rasur</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur
     */
    EClass getNoRasur();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded <em>No Ancient Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Ancient Expanded</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded
     */
    EClass getNoAncientExpanded();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur <em>Restoration Over Rasur</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Restoration Over Rasur</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur
     */
    EClass getRestorationOverRasur();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar()
     * @see #getRestorationOverRasur()
     */
    EReference getRestorationOverRasur_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur <em>No Restoration Over Rasur</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Restoration Over Rasur</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur
     */
    EClass getNoRestorationOverRasur();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction <em>Partial Destruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Partial Destruction</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction
     */
    EClass getPartialDestruction();

    /**
     * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar <em>WChar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>WChar</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar()
     * @see #getPartialDestruction()
     */
    EReference getPartialDestruction_WChar();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction <em>No Partial Destruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Partial Destruction</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction
     */
    EClass getNoPartialDestruction();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Interfix <em>Interfix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.Interfix
     */
    EClass getInterfix();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical <em>Interfix Lexical</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Lexical</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical
     */
    EClass getInterfixLexical();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion <em>Interfix Flexion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Flexion</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion
     */
    EClass getInterfixFlexion();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical <em>Interfix Suffix Pronom Lexical</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Suffix Pronom Lexical</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical
     */
    EClass getInterfixSuffixPronomLexical();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical <em>Interfix Prefix Non Lexical</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Prefix Non Lexical</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical
     */
    EClass getInterfixPrefixNonLexical();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical <em>Interfix Prefix Lexical</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Prefix Lexical</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical
     */
    EClass getInterfixPrefixLexical();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup <em>Interfix Connection Syllabic Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Connection Syllabic Group</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup
     */
    EClass getInterfixConnectionSyllabicGroup();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords <em>Interfix Compound Words</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Compound Words</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords
     */
    EClass getInterfixCompoundWords();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement <em>Interfix Phonetical Complement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Interfix Phonetical Complement</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement
     */
    EClass getInterfixPhoneticalComplement();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker <em>Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker
     */
    EClass getVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker <em>Emendation Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Emendation Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker
     */
    EClass getEmendationVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker <em>Disputable Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Disputable Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker
     */
    EClass getDisputableVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker <em>Deleted Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Deleted Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker
     */
    EClass getDeletedVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker <em>Destroyed Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Destroyed Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker
     */
    EClass getDestroyedVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker <em>Destroyed Vers Frontier Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Destroyed Vers Frontier Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker
     */
    EClass getDestroyedVersFrontierMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker <em>Partial Destroyed Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Partial Destroyed Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker
     */
    EClass getPartialDestroyedVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker <em>Missing Vers Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Missing Vers Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker
     */
    EClass getMissingVersMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker <em>Restoration Over Rasur Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Restoration Over Rasur Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker
     */
    EClass getRestorationOverRasurMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker <em>Ancient Expanded Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Ancient Expanded Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker
     */
    EClass getAncientExpandedMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker <em>Rasur Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Rasur Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker
     */
    EClass getRasurMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker <em>Vers Frontier Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Vers Frontier Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker
     */
    EClass getVersFrontierMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker <em>Versbreak Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Versbreak Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker
     */
    EClass getVersbreakMarker();

    /**
     * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker <em>Broken Versbreak Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Broken Versbreak Marker</em>'.
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker
     */
    EClass getBrokenVersbreakMarker();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EgyDslFactory getEgyDslFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl <em>Text Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextContent()
         */
        EClass TEXT_CONTENT = eINSTANCE.getTextContent();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TEXT_CONTENT__ITEMS = eINSTANCE.getTextContent_Items();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl <em>Text Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextItem()
         */
        EClass TEXT_ITEM = eINSTANCE.getTextItem();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl <em>Sentence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentence()
         */
        EClass SENTENCE = eINSTANCE.getSentence();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SENTENCE__ITEMS = eINSTANCE.getSentence_Items();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItem()
         */
        EClass SENTENCE_ITEM = eINSTANCE.getSentenceItem();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl <em>Abstract Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAbstractMarker()
         */
        EClass ABSTRACT_MARKER = eINSTANCE.getAbstractMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl <em>Ambivalence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAmbivalence()
         */
        EClass AMBIVALENCE = eINSTANCE.getAmbivalence();

        /**
         * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference AMBIVALENCE__CASES = eINSTANCE.getAmbivalence_Cases();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl <em>Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCase()
         */
        EClass CASE = eINSTANCE.getCase();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute CASE__NAME = eINSTANCE.getCase_Name();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference CASE__ITEMS = eINSTANCE.getCase_Items();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl <em>Sentence Item No Ambivalence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItemNoAmbivalence()
         */
        EClass SENTENCE_ITEM_NO_AMBIVALENCE = eINSTANCE.getSentenceItemNoAmbivalence();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl <em>Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMarker()
         */
        EClass MARKER = eINSTANCE.getMarker();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MARKER__TYPE = eINSTANCE.getMarker_Type();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl <em>Destruction Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestructionMarker()
         */
        EClass DESTRUCTION_MARKER = eINSTANCE.getDestructionMarker();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute DESTRUCTION_MARKER__TYPE = eINSTANCE.getDestructionMarker_Type();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl <em>Word</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWord()
         */
        EClass WORD = eINSTANCE.getWord();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference WORD__WCHAR = eINSTANCE.getWord_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl <em>Word Part</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordPart()
         */
        EClass WORD_PART = eINSTANCE.getWordPart();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference WORD_PART__WCHAR = eINSTANCE.getWordPart_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl <em>Word Middle</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordMiddle()
         */
        EClass WORD_MIDDLE = eINSTANCE.getWordMiddle();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl <em>Chars</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getChars()
         */
        EClass CHARS = eINSTANCE.getChars();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute CHARS__NAME = eINSTANCE.getChars_Name();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl <em>Brackets</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrackets()
         */
        EClass BRACKETS = eINSTANCE.getBrackets();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl <em>Oval</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getOval()
         */
        EClass OVAL = eINSTANCE.getOval();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference OVAL__WCHAR = eINSTANCE.getOval_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl <em>Serech</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSerech()
         */
        EClass SERECH = eINSTANCE.getSerech();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SERECH__WCHAR = eINSTANCE.getSerech_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl <em>Cartouche</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCartouche()
         */
        EClass CARTOUCHE = eINSTANCE.getCartouche();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl <em>No Cartouche</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoCartouche()
         */
        EClass NO_CARTOUCHE = eINSTANCE.getNoCartouche();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl <em>Expanded</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpanded()
         */
        EClass EXPANDED = eINSTANCE.getExpanded();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EXPANDED__WCHAR = eINSTANCE.getExpanded_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpanded()
         */
        EClass ANCIENT_EXPANDED = eINSTANCE.getAncientExpanded();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ANCIENT_EXPANDED__WCHAR = eINSTANCE.getAncientExpanded_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl <em>No Expanded</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpanded()
         */
        EClass NO_EXPANDED = eINSTANCE.getNoExpanded();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl <em>Emendation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendation()
         */
        EClass EMENDATION = eINSTANCE.getEmendation();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EMENDATION__WCHAR = eINSTANCE.getEmendation_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl <em>No Emendation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoEmendation()
         */
        EClass NO_EMENDATION = eINSTANCE.getNoEmendation();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableReading()
         */
        EClass DISPUTABLE_READING = eINSTANCE.getDisputableReading();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DISPUTABLE_READING__WCHAR = eINSTANCE.getDisputableReading_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDisputableReading()
         */
        EClass NO_DISPUTABLE_READING = eINSTANCE.getNoDisputableReading();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl <em>Lacuna</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getLacuna()
         */
        EClass LACUNA = eINSTANCE.getLacuna();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference LACUNA__WCHAR = eINSTANCE.getLacuna_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoLacuna()
         */
        EClass NO_LACUNA = eINSTANCE.getNoLacuna();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl <em>Deletion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletion()
         */
        EClass DELETION = eINSTANCE.getDeletion();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference DELETION__WCHAR = eINSTANCE.getDeletion_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl <em>No Deletion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDeletion()
         */
        EClass NO_DELETION = eINSTANCE.getNoDeletion();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpandedColumn()
         */
        EClass EXPANDED_COLUMN = eINSTANCE.getExpandedColumn();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference EXPANDED_COLUMN__WCHAR = eINSTANCE.getExpandedColumn_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpandedColumn()
         */
        EClass NO_EXPANDED_COLUMN = eINSTANCE.getNoExpandedColumn();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl <em>Rasur</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasur()
         */
        EClass RASUR = eINSTANCE.getRasur();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference RASUR__WCHAR = eINSTANCE.getRasur_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl <em>No Rasur</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRasur()
         */
        EClass NO_RASUR = eINSTANCE.getNoRasur();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoAncientExpanded()
         */
        EClass NO_ANCIENT_EXPANDED = eINSTANCE.getNoAncientExpanded();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasur()
         */
        EClass RESTORATION_OVER_RASUR = eINSTANCE.getRestorationOverRasur();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference RESTORATION_OVER_RASUR__WCHAR = eINSTANCE.getRestorationOverRasur_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRestorationOverRasur()
         */
        EClass NO_RESTORATION_OVER_RASUR = eINSTANCE.getNoRestorationOverRasur();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestruction()
         */
        EClass PARTIAL_DESTRUCTION = eINSTANCE.getPartialDestruction();

        /**
         * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PARTIAL_DESTRUCTION__WCHAR = eINSTANCE.getPartialDestruction_WChar();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoPartialDestruction()
         */
        EClass NO_PARTIAL_DESTRUCTION = eINSTANCE.getNoPartialDestruction();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl <em>Interfix</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfix()
         */
        EClass INTERFIX = eINSTANCE.getInterfix();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexical()
         */
        EClass INTERFIX_LEXICAL = eINSTANCE.getInterfixLexical();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexion()
         */
        EClass INTERFIX_FLEXION = eINSTANCE.getInterfixFlexion();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixSuffixPronomLexical()
         */
        EClass INTERFIX_SUFFIX_PRONOM_LEXICAL = eINSTANCE.getInterfixSuffixPronomLexical();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixNonLexical()
         */
        EClass INTERFIX_PREFIX_NON_LEXICAL = eINSTANCE.getInterfixPrefixNonLexical();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixLexical()
         */
        EClass INTERFIX_PREFIX_LEXICAL = eINSTANCE.getInterfixPrefixLexical();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixConnectionSyllabicGroup()
         */
        EClass INTERFIX_CONNECTION_SYLLABIC_GROUP = eINSTANCE.getInterfixConnectionSyllabicGroup();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl <em>Interfix Compound Words</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixCompoundWords()
         */
        EClass INTERFIX_COMPOUND_WORDS = eINSTANCE.getInterfixCompoundWords();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl <em>Interfix Phonetical Complement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPhoneticalComplement()
         */
        EClass INTERFIX_PHONETICAL_COMPLEMENT = eINSTANCE.getInterfixPhoneticalComplement();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl <em>Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersMarker()
         */
        EClass VERS_MARKER = eINSTANCE.getVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl <em>Emendation Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendationVersMarker()
         */
        EClass EMENDATION_VERS_MARKER = eINSTANCE.getEmendationVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl <em>Disputable Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableVersMarker()
         */
        EClass DISPUTABLE_VERS_MARKER = eINSTANCE.getDisputableVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl <em>Deleted Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedVersMarker()
         */
        EClass DELETED_VERS_MARKER = eINSTANCE.getDeletedVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl <em>Destroyed Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersMarker()
         */
        EClass DESTROYED_VERS_MARKER = eINSTANCE.getDestroyedVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl <em>Destroyed Vers Frontier Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersFrontierMarker()
         */
        EClass DESTROYED_VERS_FRONTIER_MARKER = eINSTANCE.getDestroyedVersFrontierMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl <em>Partial Destroyed Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedVersMarker()
         */
        EClass PARTIAL_DESTROYED_VERS_MARKER = eINSTANCE.getPartialDestroyedVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl <em>Missing Vers Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMissingVersMarker()
         */
        EClass MISSING_VERS_MARKER = eINSTANCE.getMissingVersMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl <em>Restoration Over Rasur Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasurMarker()
         */
        EClass RESTORATION_OVER_RASUR_MARKER = eINSTANCE.getRestorationOverRasurMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl <em>Ancient Expanded Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpandedMarker()
         */
        EClass ANCIENT_EXPANDED_MARKER = eINSTANCE.getAncientExpandedMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl <em>Rasur Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasurMarker()
         */
        EClass RASUR_MARKER = eINSTANCE.getRasurMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl <em>Vers Frontier Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersFrontierMarker()
         */
        EClass VERS_FRONTIER_MARKER = eINSTANCE.getVersFrontierMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl <em>Versbreak Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersbreakMarker()
         */
        EClass VERSBREAK_MARKER = eINSTANCE.getVersbreakMarker();

        /**
         * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl <em>Broken Versbreak Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl
         * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrokenVersbreakMarker()
         */
        EClass BROKEN_VERSBREAK_MARKER = eINSTANCE.getBrokenVersbreakMarker();

    }

} //EgyDslPackage
