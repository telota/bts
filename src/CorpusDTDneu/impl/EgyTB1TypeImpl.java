/*
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyPunctuationType;
import CorpusDTDneu.EgySentType;
import CorpusDTDneu.EgyTB1Type;
import CorpusDTDneu.EgyTB3EndType;
import CorpusDTDneu.EgyTB3StartType;
import CorpusDTDneu.EgyWordType;
import CorpusDTDneu.FormattingElementType;
import CorpusDTDneu.LineCountType;
import CorpusDTDneu.NoteType;
import CorpusDTDneu.PunctuationType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Egy TB1 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getName <em>Name</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getComment <em>Comment</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getGroup <em>Group</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getEgySent <em>Egy Sent</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getEgyTB1 <em>Egy TB1</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getEgyTB3End <em>Egy TB3 End</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getEgyWord <em>Egy Word</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getLineCount <em>Line Count</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getNote <em>Note</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getFormattingElement <em>Formatting Element</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getPunctuation <em>Punctuation</em>}</li>
 * <li>{@link CorpusDTDneu.impl.EgyTB1TypeImpl#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgyTB1TypeImpl extends MinimalEObjectImpl.Container implements EgyTB1Type {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getName()
     */
    protected static final String NAME_EDEFAULT = null;
    /**
     * The default value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBtsCodes()
     */
    protected static final String BTS_CODES_EDEFAULT = null;
    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getComment()
     */
    protected static final String COMMENT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getName()
     */
    protected String name = NAME_EDEFAULT;
    /**
     * The cached value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBtsCodes()
     */
    protected String btsCodes = BTS_CODES_EDEFAULT;
    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getComment()
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getGroup()
     */
    protected FeatureMap group;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyTB1TypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorpusDTDneuPackage.Literals.EGY_TB1_TYPE;
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
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB1_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getBtsCodes() {
        return btsCodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setBtsCodes(String newBtsCodes) {
        String oldBtsCodes = btsCodes;
        btsCodes = newBtsCodes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB1_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB1_TYPE__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<EgySentType> getEgySent() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_SENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<EgyTB1Type> getEgyTB1() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_TB1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<EgyTB3StartType> getEgyTB3Start() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_TB3_START);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<EgyTB3EndType> getEgyTB3End() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_TB3_END);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<EgyWordType> getEgyWord() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_WORD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<LineCountType> getLineCount() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__LINE_COUNT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<NoteType> getNote() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__NOTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<FormattingElementType> getFormattingElement() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__FORMATTING_ELEMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<PunctuationType> getPunctuation() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__PUNCTUATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<EgyPunctuationType> getEgyPunctuation() {
        return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_PUNCTUATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_SENT:
                return ((InternalEList<?>) getEgySent()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB1:
                return ((InternalEList<?>) getEgyTB1()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_START:
                return ((InternalEList<?>) getEgyTB3Start()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_END:
                return ((InternalEList<?>) getEgyTB3End()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_WORD:
                return ((InternalEList<?>) getEgyWord()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__LINE_COUNT:
                return ((InternalEList<?>) getLineCount()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NOTE:
                return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__FORMATTING_ELEMENT:
                return ((InternalEList<?>) getFormattingElement()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__PUNCTUATION:
                return ((InternalEList<?>) getPunctuation()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_PUNCTUATION:
                return ((InternalEList<?>) getEgyPunctuation()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NAME:
                return getName();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__BTS_CODES:
                return getBtsCodes();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__COMMENT:
                return getComment();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_SENT:
                return getEgySent();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB1:
                return getEgyTB1();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_START:
                return getEgyTB3Start();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_END:
                return getEgyTB3End();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_WORD:
                return getEgyWord();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__LINE_COUNT:
                return getLineCount();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NOTE:
                return getNote();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__FORMATTING_ELEMENT:
                return getFormattingElement();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__PUNCTUATION:
                return getPunctuation();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_PUNCTUATION:
                return getEgyPunctuation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NAME:
                setName((String) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__BTS_CODES:
                setBtsCodes((String) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__COMMENT:
                setComment((String) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_SENT:
                getEgySent().clear();
                getEgySent().addAll((Collection<? extends EgySentType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB1:
                getEgyTB1().clear();
                getEgyTB1().addAll((Collection<? extends EgyTB1Type>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_START:
                getEgyTB3Start().clear();
                getEgyTB3Start().addAll((Collection<? extends EgyTB3StartType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_END:
                getEgyTB3End().clear();
                getEgyTB3End().addAll((Collection<? extends EgyTB3EndType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_WORD:
                getEgyWord().clear();
                getEgyWord().addAll((Collection<? extends EgyWordType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__LINE_COUNT:
                getLineCount().clear();
                getLineCount().addAll((Collection<? extends LineCountType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NOTE:
                getNote().clear();
                getNote().addAll((Collection<? extends NoteType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__FORMATTING_ELEMENT:
                getFormattingElement().clear();
                getFormattingElement().addAll((Collection<? extends FormattingElementType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__PUNCTUATION:
                getPunctuation().clear();
                getPunctuation().addAll((Collection<? extends PunctuationType>) newValue);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_PUNCTUATION:
                getEgyPunctuation().clear();
                getEgyPunctuation().addAll((Collection<? extends EgyPunctuationType>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__BTS_CODES:
                setBtsCodes(BTS_CODES_EDEFAULT);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP:
                getGroup().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_SENT:
                getEgySent().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB1:
                getEgyTB1().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_START:
                getEgyTB3Start().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_END:
                getEgyTB3End().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_WORD:
                getEgyWord().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__LINE_COUNT:
                getLineCount().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NOTE:
                getNote().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__FORMATTING_ELEMENT:
                getFormattingElement().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__PUNCTUATION:
                getPunctuation().clear();
                return;
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_PUNCTUATION:
                getEgyPunctuation().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__BTS_CODES:
                return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_SENT:
                return !getEgySent().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB1:
                return !getEgyTB1().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_START:
                return !getEgyTB3Start().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_TB3_END:
                return !getEgyTB3End().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_WORD:
                return !getEgyWord().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__LINE_COUNT:
                return !getLineCount().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__NOTE:
                return !getNote().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__FORMATTING_ELEMENT:
                return !getFormattingElement().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__PUNCTUATION:
                return !getPunctuation().isEmpty();
            case CorpusDTDneuPackage.EGY_TB1_TYPE__EGY_PUNCTUATION:
                return !getEgyPunctuation().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", btsCodes: ");
        result.append(btsCodes);
        result.append(", comment: ");
        result.append(comment);
        result.append(", group: ");
        result.append(group);
        result.append(')');
        return result.toString();
    }

} //EgyTB1TypeImpl
