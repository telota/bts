/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.bbaw.bts.btsmodel.BTSObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Corpus Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSCorpusObject extends BTSObject {
	/**
	 * Returns the value of the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport</em>' containment reference.
	 * @see #setPassport(BTSPassport)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject_Passport()
	 * @model containment="true"
	 * @generated
	 */
	BTSPassport getPassport();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getPassport <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport</em>' containment reference.
	 * @see #getPassport()
	 * @generated
	 */
	void setPassport(BTSPassport value);

	/**
	 * Returns the value of the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corpus Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corpus Prefix</em>' attribute.
	 * @see #setCorpusPrefix(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject_CorpusPrefix()
	 * @model
	 * @generated
	 */
	String getCorpusPrefix();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corpus Prefix</em>' attribute.
	 * @see #getCorpusPrefix()
	 * @generated
	 */
	void setCorpusPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Phase</em>' attribute.
	 * @see #setWorkPhase(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject_WorkPhase()
	 * @model
	 * @generated
	 */
	String getWorkPhase();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Phase</em>' attribute.
	 * @see #getWorkPhase()
	 * @generated
	 */
	void setWorkPhase(String value);

} // BTSCorpusObject