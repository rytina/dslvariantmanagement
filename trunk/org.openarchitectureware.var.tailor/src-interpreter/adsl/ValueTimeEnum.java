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
 * A representation of the literals of the enumeration '<em><b>Value Time Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adsl.AdslPackage#getValueTimeEnum()
 * @model
 * @generated
 */
public enum ValueTimeEnum implements Enumerator {
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
   * The '<em><b>NEVER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEVER_VALUE
   * @generated
   * @ordered
   */
  NEVER(1, "NEVER", "NEVER"),

  /**
   * The '<em><b>INSTANCEDEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANCEDEFINITION_VALUE
   * @generated
   * @ordered
   */
  INSTANCEDEFINITION(2, "INSTANCEDEFINITION", "INSTANCEDEFINITION"),

  /**
   * The '<em><b>DEPLOYMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPLOYMENT_VALUE
   * @generated
   * @ordered
   */
  DEPLOYMENT(3, "DEPLOYMENT", "DEPLOYMENT"),

  /**
   * The '<em><b>STARTUP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STARTUP_VALUE
   * @generated
   * @ordered
   */
  STARTUP(4, "STARTUP", "STARTUP");

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
   * The '<em><b>NEVER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEVER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEVER
   * @model
   * @generated
   * @ordered
   */
  public static final int NEVER_VALUE = 1;

  /**
   * The '<em><b>INSTANCEDEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INSTANCEDEFINITION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSTANCEDEFINITION
   * @model
   * @generated
   * @ordered
   */
  public static final int INSTANCEDEFINITION_VALUE = 2;

  /**
   * The '<em><b>DEPLOYMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEPLOYMENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPLOYMENT
   * @model
   * @generated
   * @ordered
   */
  public static final int DEPLOYMENT_VALUE = 3;

  /**
   * The '<em><b>STARTUP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STARTUP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STARTUP
   * @model
   * @generated
   * @ordered
   */
  public static final int STARTUP_VALUE = 4;

  /**
   * An array of all the '<em><b>Value Time Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ValueTimeEnum[] VALUES_ARRAY =
    new ValueTimeEnum[] {
      NULL,
      NEVER,
      INSTANCEDEFINITION,
      DEPLOYMENT,
      STARTUP,
    };

  /**
   * A public read-only list of all the '<em><b>Value Time Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ValueTimeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Value Time Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueTimeEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ValueTimeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Value Time Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueTimeEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ValueTimeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Value Time Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueTimeEnum get(int value) {
    switch (value) {
      case NULL_VALUE: return NULL;
      case INSTANCEDEFINITION_VALUE: return INSTANCEDEFINITION;
      case DEPLOYMENT_VALUE: return DEPLOYMENT;
      case STARTUP_VALUE: return STARTUP;
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
  private ValueTimeEnum(int value, String name, String literal) {
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
  
} //ValueTimeEnum
