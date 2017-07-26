/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Ths Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.DateThsType#getTerm <em>Term</em>}</li>
 * <li>{@link CorpusDTDneu.DateThsType#getLowerTerm <em>Lower Term</em>}</li>
 * <li>{@link CorpusDTDneu.DateThsType#getUpperTerm <em>Upper Term</em>}</li>
 * <li>{@link CorpusDTDneu.DateThsType#getType <em>Type</em>}</li>
 * <li>{@link CorpusDTDneu.DateThsType#getYearFrom <em>Year From</em>}</li>
 * <li>{@link CorpusDTDneu.DateThsType#getYearTo <em>Year To</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='DateThs_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType()
 */
public interface DateThsType extends EObject {
    /**
     * Returns the value of the '<em><b>Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Term</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Term</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Term' namespace='##targetNamespace'"
     * @generated
     * @see #setTerm(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType_Term()
     */
    String getTerm();

    /**
     * Sets the value of the '{@link CorpusDTDneu.DateThsType#getTerm <em>Term</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Term</em>' attribute.
     * @generated
     * @see #getTerm()
     */
    void setTerm(String value);

    /**
     * Returns the value of the '<em><b>Lower Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Term</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lower Term</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='LowerTerm' namespace='##targetNamespace'"
     * @generated
     * @see #setLowerTerm(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType_LowerTerm()
     */
    String getLowerTerm();

    /**
     * Sets the value of the '{@link CorpusDTDneu.DateThsType#getLowerTerm <em>Lower Term</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lower Term</em>' attribute.
     * @generated
     * @see #getLowerTerm()
     */
    void setLowerTerm(String value);

    /**
     * Returns the value of the '<em><b>Upper Term</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Term</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Upper Term</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='UpperTerm' namespace='##targetNamespace'"
     * @generated
     * @see #setUpperTerm(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType_UpperTerm()
     */
    String getUpperTerm();

    /**
     * Sets the value of the '{@link CorpusDTDneu.DateThsType#getUpperTerm <em>Upper Term</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Upper Term</em>' attribute.
     * @generated
     * @see #getUpperTerm()
     */
    void setUpperTerm(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link CorpusDTDneu.TypeType7}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Type</em>' attribute.
     * @model unsettable="true" required="true"
     * extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.TypeType7
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType7)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType_Type()
     */
    TypeType7 getType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.DateThsType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see CorpusDTDneu.TypeType7
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     */
    void setType(TypeType7 value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.DateThsType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType7)
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.DateThsType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @generated
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType7)
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Year From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Year From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Year From</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='YearFrom' namespace='##targetNamespace'"
     * @generated
     * @see #setYearFrom(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType_YearFrom()
     */
    Object getYearFrom();

    /**
     * Sets the value of the '{@link CorpusDTDneu.DateThsType#getYearFrom <em>Year From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Year From</em>' attribute.
     * @generated
     * @see #getYearFrom()
     */
    void setYearFrom(Object value);

    /**
     * Returns the value of the '<em><b>Year To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Year To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Year To</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='YearTo' namespace='##targetNamespace'"
     * @generated
     * @see #setYearTo(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getDateThsType_YearTo()
     */
    Object getYearTo();

    /**
     * Sets the value of the '{@link CorpusDTDneu.DateThsType#getYearTo <em>Year To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Year To</em>' attribute.
     * @generated
     * @see #getYearTo()
     */
    void setYearTo(Object value);

} // DateThsType
