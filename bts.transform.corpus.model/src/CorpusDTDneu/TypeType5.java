/*
 */
package CorpusDTDneu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type5</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @model extendedMetaData="name='Type_._5_._type'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTypeType5()
 */
public enum TypeType5 implements Enumerator {
    /**
     * The '<em><b>HS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #HS_VALUE
     */
    HS(0, "HS", "HS"),

    /**
     * The '<em><b>NS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #NS_VALUE
     */
    NS(1, "NS", "NS");

    /**
     * The '<em><b>HS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>HS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #HS
     */
    public static final int HS_VALUE = 0;

    /**
     * The '<em><b>NS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #NS
     */
    public static final int NS_VALUE = 1;

    /**
     * An array of all the '<em><b>Type Type5</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final TypeType5[] VALUES_ARRAY =
            new TypeType5[]{
                    HS,
                    NS,
            };

    /**
     * A public read-only list of all the '<em><b>Type Type5</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<TypeType5> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
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
    TypeType5(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * Returns the '<em><b>Type Type5</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static TypeType5 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TypeType5 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Type Type5</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static TypeType5 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TypeType5 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Type Type5</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static TypeType5 get(int value) {
        switch (value) {
            case HS_VALUE:
                return HS;
            case NS_VALUE:
                return NS;
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

} //TypeType5
