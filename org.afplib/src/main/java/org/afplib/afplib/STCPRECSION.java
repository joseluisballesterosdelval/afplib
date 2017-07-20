/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>STCPRECSION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getSTCPRECSION()
 * @model
 * @generated
 */
public enum STCPRECSION implements Enumerator {
	/**
     * The '<em><b>Const Mustsupport</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MUSTSUPPORT_VALUE
     * @generated
     * @ordered
     */
	CONST_MUSTSUPPORT(0, "ConstMustsupport", "ConstMustsupport"),

	/**
     * The '<em><b>Const Mayusedefault</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MAYUSEDEFAULT_VALUE
     * @generated
     * @ordered
     */
	CONST_MAYUSEDEFAULT(1, "ConstMayusedefault", "ConstMayusedefault");

	/**
     * The '<em><b>Const Mustsupport</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Mustsupport</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MUSTSUPPORT
     * @model name="ConstMustsupport"
     * @generated
     * @ordered
     */
	public static final int CONST_MUSTSUPPORT_VALUE = 0;

	/**
     * The '<em><b>Const Mayusedefault</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Mayusedefault</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MAYUSEDEFAULT
     * @model name="ConstMayusedefault"
     * @generated
     * @ordered
     */
	public static final int CONST_MAYUSEDEFAULT_VALUE = 1;

	/**
     * An array of all the '<em><b>STCPRECSION</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final STCPRECSION[] VALUES_ARRAY =
		new STCPRECSION[] {
            CONST_MUSTSUPPORT,
            CONST_MAYUSEDEFAULT,
        };

	/**
     * A public read-only list of all the '<em><b>STCPRECSION</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<STCPRECSION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>STCPRECSION</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static STCPRECSION get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            STCPRECSION result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>STCPRECSION</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static STCPRECSION getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            STCPRECSION result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>STCPRECSION</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static STCPRECSION get(int value) {
        switch (value) {
            case CONST_MUSTSUPPORT_VALUE: return CONST_MUSTSUPPORT;
            case CONST_MAYUSEDEFAULT_VALUE: return CONST_MAYUSEDEFAULT;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private STCPRECSION(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //STCPRECSION
