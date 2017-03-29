/**
 */
package com.yakindu.sct.domain.scenario.scenarioText.util;

import com.yakindu.sct.domain.scenario.scenarioText.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.yakindu.sct.domain.scenario.scenarioText.ScenarioTextPackage
 * @generated
 */
public class ScenarioTextAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScenarioTextPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioTextAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ScenarioTextPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioTextSwitch<Adapter> modelSwitch =
    new ScenarioTextSwitch<Adapter>()
    {
      @Override
      public Adapter caseBlockScenario(BlockScenario object)
      {
        return createBlockScenarioAdapter();
      }
      @Override
      public Adapter caseStatScope(StatScope object)
      {
        return createStatScopeAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.sct.domain.scenario.scenarioText.BlockScenario <em>Block Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.sct.domain.scenario.scenarioText.BlockScenario
   * @generated
   */
  public Adapter createBlockScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.sct.domain.scenario.scenarioText.StatScope <em>Stat Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.sct.domain.scenario.scenarioText.StatScope
   * @generated
   */
  public Adapter createStatScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.sgraph.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ScenarioTextAdapterFactory
