/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Config Param Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adsl.AdslPackage#getConfigParamTypeEnum()
 * @model
 * @generated
 */
public enum ConfigParamTypeEnum implements Enumerator {
  /**
   * The '<em><b>NULL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NULL_VALUE
   * @generated
   * @ordered
   */
  NULL(1, "NULL", "NULL"),

  /**
   * The '<em><b>NUMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER_VALUE
   * @generated
   * @ordered
   */
  NUMBER(1, "NUMBER", "NUMBER"),

  /**
   * The '<em><b>TEXT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_VALUE
   * @generated
   * @ordered
   */
  TEXT(2, "TEXT", "TEXT"),

  /**
   * The '<em><b>BOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOL_VALUE
   * @generated
   * @ordered
   */
  BOOL(3, "BOOL", "BOOL");

  /**
   * The '<em><b>NULL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NULL
   * @model
   * @generated
   * @ordered
   */
  public static final int NULL_VALUE = 1;

  /**
   * The '<em><b>NUMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMBER
   * @model
   * @generated
   * @ordered
   */
  public static final int NUMBER_VALUE = 1;

  /**
   * The '<em><b>TEXT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TEXT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT
   * @model
   * @generated
   * @ordered
   */
  public static final int TEXT_VALUE = 2;

  /**
   * The '<em><b>BOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOL
   * @model
   * @generated
   * @ordered
   */
  public static final int BOOL_VALUE = 3;

  /**
   * An array of all the '<em><b>Config Param Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConfigParamTypeEnum[] VALUES_ARRAY =
    new ConfigParamTypeEnum[] {
      NULL,
      NUMBER,
      TEXT,
      BOOL,
    };

  /**
   * A public read-only list of all the '<em><b>Config Param Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConfigParamTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Config Param Type Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConfigParamTypeEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ConfigParamTypeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Config Param Type Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConfigParamTypeEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ConfigParamTypeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Config Param Type Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConfigParamTypeEnum get(int value) {
    switch (value) {
      case NULL_VALUE: return NULL;
      case TEXT_VALUE: return TEXT;
      case BOOL_VALUE: return BOOL;
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
  private ConfigParamTypeEnum(int value, String name, String literal) {
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
  
} //ConfigParamTypeEnum
