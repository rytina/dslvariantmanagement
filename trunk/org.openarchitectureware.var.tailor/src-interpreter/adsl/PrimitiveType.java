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
 * A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adsl.AdslPackage#getPrimitiveType()
 * @model
 * @generated
 */
public enum PrimitiveType implements Enumerator {
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
   * The '<em><b>Int</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(1, "int", "int"),

  /**
   * The '<em><b>Char</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHAR_VALUE
   * @generated
   * @ordered
   */
  CHAR(2, "char", "char"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(3, "string", "string"),

  /**
   * The '<em><b>Short</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHORT_VALUE
   * @generated
   * @ordered
   */
  SHORT(4, "short", "short"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(5, "date", "date"),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(6, "boolean", "boolean");

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
   * The '<em><b>Int</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT
   * @model name="int"
   * @generated
   * @ordered
   */
  public static final int INT_VALUE = 1;

  /**
   * The '<em><b>Char</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHAR
   * @model name="char"
   * @generated
   * @ordered
   */
  public static final int CHAR_VALUE = 2;

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 3;

  /**
   * The '<em><b>Short</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHORT
   * @model name="short"
   * @generated
   * @ordered
   */
  public static final int SHORT_VALUE = 4;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 5;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 6;

  /**
   * An array of all the '<em><b>Primitive Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PrimitiveType[] VALUES_ARRAY =
    new PrimitiveType[] {
      NULL,
      INT,
      CHAR,
      STRING,
      SHORT,
      DATE,
      BOOLEAN,
    };

  /**
   * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Primitive Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitiveType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      PrimitiveType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitiveType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      PrimitiveType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Primitive Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitiveType get(int value) {
    switch (value) {
      case NULL_VALUE: return NULL;
      case CHAR_VALUE: return CHAR;
      case STRING_VALUE: return STRING;
      case SHORT_VALUE: return SHORT;
      case DATE_VALUE: return DATE;
      case BOOLEAN_VALUE: return BOOLEAN;
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
  private PrimitiveType(int value, String name, String literal) {
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
  
} //PrimitiveType
