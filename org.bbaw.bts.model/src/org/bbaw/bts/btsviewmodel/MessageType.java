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
package org.bbaw.bts.btsviewmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getMessageType()
 */
public enum MessageType implements Enumerator {
    /**
     * The '<em><b>ERROR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #ERROR_VALUE
     */
    ERROR(0, "ERROR", "ERROR"),

    /**
     * The '<em><b>WARNING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #WARNING_VALUE
     */
    WARNING(1, "WARNING", "WARNING"),

    /**
     * The '<em><b>LOCKED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #LOCKED_VALUE
     */
    LOCKED(2, "LOCKED", "LOCKED"),

    /**
     * The '<em><b>NO EDITING RIGHTS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #NO_EDITING_RIGHTS_VALUE
     */
    NO_EDITING_RIGHTS(3, "NO_EDITING_RIGHTS", "NO_EDITING_RIGHTS"),

    /**
     * The '<em><b>FILTERED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #FILTERED_VALUE
     */
    FILTERED(4, "FILTERED", "FILTERED"),

    /**
     * The '<em><b>UPDATE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #UPDATE_VALUE
     */
    UPDATE(5, "UPDATE", "UPDATE"),

    /**
     * The '<em><b>INFORMATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #INFORMATION_VALUE
     */
    INFORMATION(6, "INFORMATION", "INFORMATION");

    /**
     * The '<em><b>ERROR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #ERROR
     */
    public static final int ERROR_VALUE = 0;

    /**
     * The '<em><b>WARNING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WARNING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #WARNING
     */
    public static final int WARNING_VALUE = 1;

    /**
     * The '<em><b>LOCKED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LOCKED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #LOCKED
     */
    public static final int LOCKED_VALUE = 2;

    /**
     * The '<em><b>NO EDITING RIGHTS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NO EDITING RIGHTS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #NO_EDITING_RIGHTS
     */
    public static final int NO_EDITING_RIGHTS_VALUE = 3;

    /**
     * The '<em><b>FILTERED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FILTERED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #FILTERED
     */
    public static final int FILTERED_VALUE = 4;

    /**
     * The '<em><b>UPDATE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #UPDATE
     */
    public static final int UPDATE_VALUE = 5;

    /**
     * The '<em><b>INFORMATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>INFORMATION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #INFORMATION
     */
    public static final int INFORMATION_VALUE = 6;

    /**
     * An array of all the '<em><b>Message Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final MessageType[] VALUES_ARRAY =
            new MessageType[]{
                    ERROR,
                    WARNING,
                    LOCKED,
                    NO_EDITING_RIGHTS,
                    FILTERED,
                    UPDATE,
                    INFORMATION,
            };

    /**
     * A public read-only list of all the '<em><b>Message Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<MessageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
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
    MessageType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * Returns the '<em><b>Message Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static MessageType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MessageType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Message Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static MessageType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MessageType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Message Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static MessageType get(int value) {
        switch (value) {
            case ERROR_VALUE:
                return ERROR;
            case WARNING_VALUE:
                return WARNING;
            case LOCKED_VALUE:
                return LOCKED;
            case NO_EDITING_RIGHTS_VALUE:
                return NO_EDITING_RIGHTS;
            case FILTERED_VALUE:
                return FILTERED;
            case UPDATE_VALUE:
                return UPDATE;
            case INFORMATION_VALUE:
                return INFORMATION;
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

} //MessageType
