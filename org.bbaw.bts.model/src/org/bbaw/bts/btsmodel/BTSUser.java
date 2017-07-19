/*
  This file is part of Berlin Text System.

  The software Berlin Text System serves as a client user interface for working with
  text corpus data. See: aaew.bbaw.de

  The software Berlin Text System was developed at the Berlin-Brandenburg Academy
  of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
  www.bbaw.de

  Copyright (C) 2013-2015  Berlin-Brandenburg Academy
  of Sciences and Humanities

  The software Berlin Text System was developed by @author: Christoph Plutte.

  Berlin Text System is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  Berlin Text System is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with Berlin Text System.
  If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <!-- begin-model-doc -->
 * This is the user-object with user details.
 * <p>
 * user credentials such as password should not be persisted in this object.
 * <!-- end-model-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getGroupIds <em>Group Ids</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getSigle <em>Sigle</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getDescription <em>Description</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getWebDescription <em>Web Description</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getUserName <em>User Name</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getForeName <em>Fore Name</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getSureName <em>Sure Name</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getMail <em>Mail</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getWebURL <em>Web URL</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getComment <em>Comment</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getPassword <em>Password</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#isLoggedIn <em>Logged In</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#getStatus <em>Status</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSUser#isDbAdmin <em>Db Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser()
 */
public interface BTSUser extends BTSObject {
    /**
     * Returns the value of the '<em><b>Group Ids</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group Ids</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * contains ids of BTSUserGroup-objects of which this user is a member.
     * <p>
     * Used for rights management based on group membership.
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>Group Ids</em>' attribute list.
     * @model
     * @generated
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_GroupIds()
     */
    EList<String> getGroupIds();

    /**
     * Returns the value of the '<em><b>Sigle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sigle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sigle</em>' attribute.
     * @model
     * @generated
     * @see #setSigle(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Sigle()
     */
    String getSigle();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getSigle <em>Sigle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sigle</em>' attribute.
     * @generated
     * @see #getSigle()
     */
    void setSigle(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @model
     * @generated
     * @see #setDescription(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Description()
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Description</em>' attribute.
     * @generated
     * @see #getDescription()
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Web Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Web Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Web Description</em>' attribute.
     * @model
     * @generated
     * @see #setWebDescription(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_WebDescription()
     */
    String getWebDescription();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getWebDescription <em>Web Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Web Description</em>' attribute.
     * @generated
     * @see #getWebDescription()
     */
    void setWebDescription(String value);

    /**
     * Returns the value of the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * username - used for authentication.
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>User Name</em>' attribute.
     * @model
     * @generated
     * @see #setUserName(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_UserName()
     */
    String getUserName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getUserName <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>User Name</em>' attribute.
     * @generated
     * @see #getUserName()
     */
    void setUserName(String value);

    /**
     * Returns the value of the '<em><b>Fore Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fore Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Fore Name</em>' attribute.
     * @model
     * @generated
     * @see #setForeName(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_ForeName()
     */
    String getForeName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getForeName <em>Fore Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Fore Name</em>' attribute.
     * @generated
     * @see #getForeName()
     */
    void setForeName(String value);

    /**
     * Returns the value of the '<em><b>Sure Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sure Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sure Name</em>' attribute.
     * @model
     * @generated
     * @see #setSureName(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_SureName()
     */
    String getSureName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getSureName <em>Sure Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sure Name</em>' attribute.
     * @generated
     * @see #getSureName()
     */
    void setSureName(String value);

    /**
     * Returns the value of the '<em><b>Mail</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mail</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Mail</em>' attribute.
     * @model
     * @generated
     * @see #setMail(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Mail()
     */
    String getMail();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getMail <em>Mail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Mail</em>' attribute.
     * @generated
     * @see #getMail()
     */
    void setMail(String value);

    /**
     * Returns the value of the '<em><b>Web URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Web URL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Web URL</em>' attribute.
     * @model
     * @generated
     * @see #setWebURL(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_WebURL()
     */
    String getWebURL();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getWebURL <em>Web URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Web URL</em>' attribute.
     * @generated
     * @see #getWebURL()
     */
    void setWebURL(String value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Comment</em>' attribute.
     * @model
     * @generated
     * @see #setComment(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * password is transient! It only serves to temporally cache credentials.
     * <p>
     * Use secure storage mechanisms to persist password information!
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>Password</em>' attribute.
     * @model transient="true"
     * @generated
     * @see #setPassword(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Password()
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Password</em>' attribute.
     * @generated
     * @see #getPassword()
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Logged In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logged In</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * transient! Used to cache status if user is logged in or not.
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>Logged In</em>' attribute.
     * @model transient="true"
     * @generated
     * @see #setLoggedIn(boolean)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_LoggedIn()
     */
    boolean isLoggedIn();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#isLoggedIn <em>Logged In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Logged In</em>' attribute.
     * @generated
     * @see #isLoggedIn()
     */
    void setLoggedIn(boolean value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Status</em>' attribute.
     * @model
     * @generated
     * @see #setStatus(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Status()
     */
    String getStatus();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Status</em>' attribute.
     * @generated
     * @see #getStatus()
     */
    void setStatus(String value);

    /**
     * Returns the value of the '<em><b>Db Admin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Admin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Shows whether user is database administrator or not.
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>Db Admin</em>' attribute.
     * @model
     * @generated
     * @see #setDbAdmin(boolean)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_DbAdmin()
     */
    boolean isDbAdmin();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#isDbAdmin <em>Db Admin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Admin</em>' attribute.
     * @generated
     * @see #isDbAdmin()
     */
    void setDbAdmin(boolean value);

} // BTSUser
