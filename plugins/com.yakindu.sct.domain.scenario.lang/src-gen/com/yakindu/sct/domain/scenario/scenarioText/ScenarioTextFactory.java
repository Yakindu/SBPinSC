/**
 */
package com.yakindu.sct.domain.scenario.scenarioText;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.yakindu.sct.domain.scenario.scenarioText.ScenarioTextPackage
 * @generated
 */
public interface ScenarioTextFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScenarioTextFactory eINSTANCE = com.yakindu.sct.domain.scenario.scenarioText.impl.ScenarioTextFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Block Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Scenario</em>'.
   * @generated
   */
  BlockScenario createBlockScenario();

  /**
   * Returns a new object of class '<em>Stat Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stat Scope</em>'.
   * @generated
   */
  StatScope createStatScope();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ScenarioTextPackage getScenarioTextPackage();

} //ScenarioTextFactory
