/**
 */
package com.yakindu.sct.domain.scenario.scenarioText;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yakindu.sct.model.sgraph.SGraphPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.yakindu.sct.domain.scenario.scenarioText.ScenarioTextFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioTextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scenarioText";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.yakindu.com/sct/domain/scenario/ScenarioText";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scenarioText";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScenarioTextPackage eINSTANCE = com.yakindu.sct.domain.scenario.scenarioText.impl.ScenarioTextPackageImpl.init();

  /**
   * The meta object id for the '{@link com.yakindu.sct.domain.scenario.scenarioText.impl.BlockScenarioImpl <em>Block Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.yakindu.sct.domain.scenario.scenarioText.impl.BlockScenarioImpl
   * @see com.yakindu.sct.domain.scenario.scenarioText.impl.ScenarioTextPackageImpl#getBlockScenario()
   * @generated
   */
  int BLOCK_SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_SCENARIO__EVENTS = 0;

  /**
   * The number of structural features of the '<em>Block Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_SCENARIO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.yakindu.sct.domain.scenario.scenarioText.impl.StatScopeImpl <em>Stat Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.yakindu.sct.domain.scenario.scenarioText.impl.StatScopeImpl
   * @see com.yakindu.sct.domain.scenario.scenarioText.impl.ScenarioTextPackageImpl#getStatScope()
   * @generated
   */
  int STAT_SCOPE = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_SCOPE__DECLARATIONS = SGraphPackage.SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_SCOPE__EVENTS = SGraphPackage.SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_SCOPE__VARIABLES = SGraphPackage.SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_SCOPE__REACTIONS = SGraphPackage.SCOPE__REACTIONS;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_SCOPE__SCENARIOS = SGraphPackage.SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stat Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_SCOPE_FEATURE_COUNT = SGraphPackage.SCOPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.yakindu.sct.domain.scenario.scenarioText.BlockScenario <em>Block Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Scenario</em>'.
   * @see com.yakindu.sct.domain.scenario.scenarioText.BlockScenario
   * @generated
   */
  EClass getBlockScenario();

  /**
   * Returns the meta object for the reference list '{@link com.yakindu.sct.domain.scenario.scenarioText.BlockScenario#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Events</em>'.
   * @see com.yakindu.sct.domain.scenario.scenarioText.BlockScenario#getEvents()
   * @see #getBlockScenario()
   * @generated
   */
  EReference getBlockScenario_Events();

  /**
   * Returns the meta object for class '{@link com.yakindu.sct.domain.scenario.scenarioText.StatScope <em>Stat Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stat Scope</em>'.
   * @see com.yakindu.sct.domain.scenario.scenarioText.StatScope
   * @generated
   */
  EClass getStatScope();

  /**
   * Returns the meta object for the containment reference list '{@link com.yakindu.sct.domain.scenario.scenarioText.StatScope#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see com.yakindu.sct.domain.scenario.scenarioText.StatScope#getScenarios()
   * @see #getStatScope()
   * @generated
   */
  EReference getStatScope_Scenarios();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScenarioTextFactory getScenarioTextFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.yakindu.sct.domain.scenario.scenarioText.impl.BlockScenarioImpl <em>Block Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.yakindu.sct.domain.scenario.scenarioText.impl.BlockScenarioImpl
     * @see com.yakindu.sct.domain.scenario.scenarioText.impl.ScenarioTextPackageImpl#getBlockScenario()
     * @generated
     */
    EClass BLOCK_SCENARIO = eINSTANCE.getBlockScenario();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_SCENARIO__EVENTS = eINSTANCE.getBlockScenario_Events();

    /**
     * The meta object literal for the '{@link com.yakindu.sct.domain.scenario.scenarioText.impl.StatScopeImpl <em>Stat Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.yakindu.sct.domain.scenario.scenarioText.impl.StatScopeImpl
     * @see com.yakindu.sct.domain.scenario.scenarioText.impl.ScenarioTextPackageImpl#getStatScope()
     * @generated
     */
    EClass STAT_SCOPE = eINSTANCE.getStatScope();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAT_SCOPE__SCENARIOS = eINSTANCE.getStatScope_Scenarios();

  }

} //ScenarioTextPackage
