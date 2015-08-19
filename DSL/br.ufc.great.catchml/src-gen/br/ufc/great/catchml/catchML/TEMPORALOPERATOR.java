/**
 */
package br.ufc.great.catchml.catchML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TEMPORALOPERATOR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getTEMPORALOPERATOR()
 * @model
 * @generated
 */
public enum TEMPORALOPERATOR implements Enumerator
{
  /**
   * The '<em><b>EX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EX_VALUE
   * @generated
   * @ordered
   */
  EX(0, "EX", "EX"),

  /**
   * The '<em><b>EG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EG_VALUE
   * @generated
   * @ordered
   */
  EG(1, "EG", "EG"),

  /**
   * The '<em><b>EF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EF_VALUE
   * @generated
   * @ordered
   */
  EF(2, "EF", "EF"),

  /**
   * The '<em><b>AX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AX_VALUE
   * @generated
   * @ordered
   */
  AX(3, "AX", "AX"),

  /**
   * The '<em><b>AG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AG_VALUE
   * @generated
   * @ordered
   */
  AG(4, "AG", "AG"),

  /**
   * The '<em><b>AF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AF_VALUE
   * @generated
   * @ordered
   */
  AF(5, "AF", "AF");

  /**
   * The '<em><b>EX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EX
   * @model
   * @generated
   * @ordered
   */
  public static final int EX_VALUE = 0;

  /**
   * The '<em><b>EG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EG
   * @model
   * @generated
   * @ordered
   */
  public static final int EG_VALUE = 1;

  /**
   * The '<em><b>EF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EF
   * @model
   * @generated
   * @ordered
   */
  public static final int EF_VALUE = 2;

  /**
   * The '<em><b>AX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AX
   * @model
   * @generated
   * @ordered
   */
  public static final int AX_VALUE = 3;

  /**
   * The '<em><b>AG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AG
   * @model
   * @generated
   * @ordered
   */
  public static final int AG_VALUE = 4;

  /**
   * The '<em><b>AF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AF
   * @model
   * @generated
   * @ordered
   */
  public static final int AF_VALUE = 5;

  /**
   * An array of all the '<em><b>TEMPORALOPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TEMPORALOPERATOR[] VALUES_ARRAY =
    new TEMPORALOPERATOR[]
    {
      EX,
      EG,
      EF,
      AX,
      AG,
      AF,
    };

  /**
   * A public read-only list of all the '<em><b>TEMPORALOPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TEMPORALOPERATOR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TEMPORALOPERATOR</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TEMPORALOPERATOR get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TEMPORALOPERATOR result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TEMPORALOPERATOR</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TEMPORALOPERATOR getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TEMPORALOPERATOR result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TEMPORALOPERATOR</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TEMPORALOPERATOR get(int value)
  {
    switch (value)
    {
      case EX_VALUE: return EX;
      case EG_VALUE: return EG;
      case EF_VALUE: return EF;
      case AX_VALUE: return AX;
      case AG_VALUE: return AG;
      case AF_VALUE: return AF;
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
  private TEMPORALOPERATOR(int value, String name, String literal)
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
  
} //TEMPORALOPERATOR
