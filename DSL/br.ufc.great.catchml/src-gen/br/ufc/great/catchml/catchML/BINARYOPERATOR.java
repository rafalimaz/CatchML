/**
 */
package br.ufc.great.catchml.catchML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BINARYOPERATOR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufc.great.catchml.catchML.CatchMLPackage#getBINARYOPERATOR()
 * @model
 * @generated
 */
public enum BINARYOPERATOR implements Enumerator
{
  /**
   * The '<em><b>Nor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOR_VALUE
   * @generated
   * @ordered
   */
  NOR(0, "nor", "nor"),

  /**
   * The '<em><b>Nand</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NAND_VALUE
   * @generated
   * @ordered
   */
  NAND(1, "nand", "nand");

  /**
   * The '<em><b>Nor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOR
   * @model name="nor"
   * @generated
   * @ordered
   */
  public static final int NOR_VALUE = 0;

  /**
   * The '<em><b>Nand</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nand</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NAND
   * @model name="nand"
   * @generated
   * @ordered
   */
  public static final int NAND_VALUE = 1;

  /**
   * An array of all the '<em><b>BINARYOPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BINARYOPERATOR[] VALUES_ARRAY =
    new BINARYOPERATOR[]
    {
      NOR,
      NAND,
    };

  /**
   * A public read-only list of all the '<em><b>BINARYOPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BINARYOPERATOR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>BINARYOPERATOR</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BINARYOPERATOR get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BINARYOPERATOR result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BINARYOPERATOR</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BINARYOPERATOR getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BINARYOPERATOR result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BINARYOPERATOR</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BINARYOPERATOR get(int value)
  {
    switch (value)
    {
      case NOR_VALUE: return NOR;
      case NAND_VALUE: return NAND;
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
  private BINARYOPERATOR(int value, String name, String literal)
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
  
} //BINARYOPERATOR
