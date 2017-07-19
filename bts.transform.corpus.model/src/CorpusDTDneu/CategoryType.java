/*
 */
package CorpusDTDneu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @model extendedMetaData="name='Category_._type'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getCategoryType()
 */
public enum CategoryType implements Enumerator {
    /**
     * The '<em><b>Provenance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #PROVENANCE_VALUE
     */
    PROVENANCE(0, "Provenance", "Provenance"),

    /**
     * The '<em><b>Date</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #DATE_VALUE
     */
    DATE(1, "Date", "Date"),

    /**
     * The '<em><b>Object Type</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #OBJECT_TYPE_VALUE
     */
    OBJECT_TYPE(2, "ObjectType", "ObjectType"),

    /**
     * The '<em><b>Depiction</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #DEPICTION_VALUE
     */
    DEPICTION(3, "Depiction", "Depiction"),

    /**
     * The '<em><b>Script</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #SCRIPT_VALUE
     */
    SCRIPT(4, "Script", "Script"),

    /**
     * The '<em><b>Language</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #LANGUAGE_VALUE
     */
    LANGUAGE(5, "Language", "Language"),

    /**
     * The '<em><b>Text Type</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #TEXT_TYPE_VALUE
     */
    TEXT_TYPE(6, "TextType", "TextType");

    /**
     * The '<em><b>Provenance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Provenance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="Provenance"
     * @generated
     * @ordered
     * @see #PROVENANCE
     */
    public static final int PROVENANCE_VALUE = 0;

    /**
     * The '<em><b>Date</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="Date"
     * @generated
     * @ordered
     * @see #DATE
     */
    public static final int DATE_VALUE = 1;

    /**
     * The '<em><b>Object Type</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Object Type</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="ObjectType"
     * @generated
     * @ordered
     * @see #OBJECT_TYPE
     */
    public static final int OBJECT_TYPE_VALUE = 2;

    /**
     * The '<em><b>Depiction</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Depiction</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="Depiction"
     * @generated
     * @ordered
     * @see #DEPICTION
     */
    public static final int DEPICTION_VALUE = 3;

    /**
     * The '<em><b>Script</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Script</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="Script"
     * @generated
     * @ordered
     * @see #SCRIPT
     */
    public static final int SCRIPT_VALUE = 4;

    /**
     * The '<em><b>Language</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Language</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="Language"
     * @generated
     * @ordered
     * @see #LANGUAGE
     */
    public static final int LANGUAGE_VALUE = 5;

    /**
     * The '<em><b>Text Type</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Text Type</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model name="TextType"
     * @generated
     * @ordered
     * @see #TEXT_TYPE
     */
    public static final int TEXT_TYPE_VALUE = 6;

    /**
     * An array of all the '<em><b>Category Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final CategoryType[] VALUES_ARRAY =
            new CategoryType[]{
                    PROVENANCE,
                    DATE,
                    OBJECT_TYPE,
                    DEPICTION,
                    SCRIPT,
                    LANGUAGE,
                    TEXT_TYPE,
            };

    /**
     * A public read-only list of all the '<em><b>Category Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<CategoryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private final int value;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private final String name;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private CategoryType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * Returns the '<em><b>Category Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static CategoryType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CategoryType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Category Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static CategoryType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CategoryType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Category Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static CategoryType get(int value) {
        switch (value) {
            case PROVENANCE_VALUE:
                return PROVENANCE;
            case DATE_VALUE:
                return DATE;
            case OBJECT_TYPE_VALUE:
                return OBJECT_TYPE;
            case DEPICTION_VALUE:
                return DEPICTION;
            case SCRIPT_VALUE:
                return SCRIPT;
            case LANGUAGE_VALUE:
                return LANGUAGE;
            case TEXT_TYPE_VALUE:
                return TEXT_TYPE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //CategoryType
