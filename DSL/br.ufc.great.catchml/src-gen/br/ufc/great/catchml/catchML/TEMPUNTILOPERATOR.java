/**
 */
package br.ufc.great.catchml.catchML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TEMPUNTILOPERATOR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getTEMPUNTILOPERATOR()
 * @model
 * @generated
 */
public enum TEMPUNTILOPERATOR implements Enumerator
{
  /**
   * The '<em><b>E</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #E_VALUE
   * @generated
   * @ordered
   */
  E(0, "E", "E"),

  /**
   * The '<em><b>A</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #A_VALUE
   * @generated
   * @ordered
   */
  A(1, "A", "A");

  /**
   * The '<em><b>E</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>E</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #E
   * @model
   * @generated
   * @ordered
   */
  public static final int E_VALUE = 0;

  /**
   * The '<em><b>A</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #A
   * @model
   * @generated
   * @ordered
   */
  public static final int A_VALUE = 1;

  /**
   * An array of all the '<em><b>TEMPUNTILOPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TEMPUNTILOPERATOR[] VALUES_ARRAY =
    new TEMPUNTILOPERATOR[]
    {
      E,
      A,
    };

  /**
   * A public read-only list of all the '<em><b>TEMPUNTILOPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TEMPUNTILOPERATOR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TEMPUNTILOPERATOR</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TEMPUNTILOPERATOR get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TEMPUNTILOPERATOR result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TEMPUNTILOPERATOR</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TEMPUNTILOPERATOR getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TEMPUNTILOPERATOR result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TEMPUNTILOPERATOR</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TEMPUNTILOPERATOR get(int value)
  {
    switch (value)
    {
      case E_VALUE: return E;
      case A_VALUE: return A;
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
  private TEMPUNTILOPERATOR(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TEMPUNTILOPERATOR
