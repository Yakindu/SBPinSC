/**
 */
package com.yakindu.sct.domain.scenario.scenarioText.impl;

import com.yakindu.sct.domain.scenario.scenarioText.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioTextFactoryImpl extends EFactoryImpl implements ScenarioTextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScenarioTextFactory init()
  {
    try
    {
      ScenarioTextFactory theScenarioTextFactory = (ScenarioTextFactory)EPackage.Registry.INSTANCE.getEFactory(ScenarioTextPackage.eNS_URI);
      if (theScenarioTextFactory != null)
      {
        return theScenarioTextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScenarioTextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioTextFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScenarioTextPackage.BLOCK_SCENARIO: return createBlockScenario();
      case ScenarioTextPackage.STAT_SCOPE: return createStatScope();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockScenario createBlockScenario()
  {
    BlockScenarioImpl blockScenario = new BlockScenarioImpl();
    return blockScenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatScope createStatScope()
  {
    StatScopeImpl statScope = new StatScopeImpl();
    return statScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioTextPackage getScenarioTextPackage()
  {
    return (ScenarioTextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScenarioTextPackage getPackage()
  {
    return ScenarioTextPackage.eINSTANCE;
  }

} //ScenarioTextFactoryImpl
