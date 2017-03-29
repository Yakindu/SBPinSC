/**
 */
package com.yakindu.sct.domain.scenario.scenarioText;

import org.eclipse.emf.common.util.EList;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stat Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.sct.domain.scenario.scenarioText.StatScope#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see com.yakindu.sct.domain.scenario.scenarioText.ScenarioTextPackage#getStatScope()
 * @model
 * @generated
 */
public interface StatScope extends Scope
{
  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link com.yakindu.sct.domain.scenario.scenarioText.BlockScenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see com.yakindu.sct.domain.scenario.scenarioText.ScenarioTextPackage#getStatScope_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<BlockScenario> getScenarios();

} // StatScope
