/**
 */
package com.yakindu.sct.domain.scenario.scenariotext;

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
 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioTextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenariotext";

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
	String eNS_PREFIX = "ScenarioText";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioTextPackage eINSTANCE = com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.EventSetImpl <em>Event Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.EventSetImpl
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getEventSet()
	 * @generated
	 */
	int EVENT_SET = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__EVENTS = 0;

	/**
	 * The number of structural features of the '<em>Event Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.BlockedEventSetImpl <em>Blocked Event Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.BlockedEventSetImpl
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getBlockedEventSet()
	 * @generated
	 */
	int BLOCKED_EVENT_SET = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_EVENT_SET__EVENTS = EVENT_SET__EVENTS;

	/**
	 * The number of structural features of the '<em>Blocked Event Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_EVENT_SET_FEATURE_COUNT = EVENT_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.RequestedEventSetImpl <em>Requested Event Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.RequestedEventSetImpl
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getRequestedEventSet()
	 * @generated
	 */
	int REQUESTED_EVENT_SET = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_EVENT_SET__EVENTS = EVENT_SET__EVENTS;

	/**
	 * The number of structural features of the '<em>Requested Event Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_EVENT_SET_FEATURE_COUNT = EVENT_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioStateScopeImpl <em>Scenario State Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioStateScopeImpl
	 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getScenarioStateScope()
	 * @generated
	 */
	int SCENARIO_STATE_SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_STATE_SCOPE__DECLARATIONS = SGraphPackage.SCOPE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_STATE_SCOPE__EVENTS = SGraphPackage.SCOPE__EVENTS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_STATE_SCOPE__VARIABLES = SGraphPackage.SCOPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_STATE_SCOPE__REACTIONS = SGraphPackage.SCOPE__REACTIONS;

	/**
	 * The feature id for the '<em><b>Event Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_STATE_SCOPE__EVENT_SETS = SGraphPackage.SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario State Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_STATE_SCOPE_FEATURE_COUNT = SGraphPackage.SCOPE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link com.yakindu.sct.domain.scenario.scenariotext.BlockedEventSet <em>Blocked Event Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocked Event Set</em>'.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.BlockedEventSet
	 * @generated
	 */
	EClass getBlockedEventSet();

	/**
	 * Returns the meta object for class '{@link com.yakindu.sct.domain.scenario.scenariotext.RequestedEventSet <em>Requested Event Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Event Set</em>'.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.RequestedEventSet
	 * @generated
	 */
	EClass getRequestedEventSet();

	/**
	 * Returns the meta object for class '{@link com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope <em>Scenario State Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario State Scope</em>'.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope
	 * @generated
	 */
	EClass getScenarioStateScope();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope#getEventSets <em>Event Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Sets</em>'.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope#getEventSets()
	 * @see #getScenarioStateScope()
	 * @generated
	 */
	EReference getScenarioStateScope_EventSets();

	/**
	 * Returns the meta object for class '{@link com.yakindu.sct.domain.scenario.scenariotext.EventSet <em>Event Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Set</em>'.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.EventSet
	 * @generated
	 */
	EClass getEventSet();

	/**
	 * Returns the meta object for the reference list '{@link com.yakindu.sct.domain.scenario.scenariotext.EventSet#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.EventSet#getEvents()
	 * @see #getEventSet()
	 * @generated
	 */
	EReference getEventSet_Events();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.BlockedEventSetImpl <em>Blocked Event Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.BlockedEventSetImpl
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getBlockedEventSet()
		 * @generated
		 */
		EClass BLOCKED_EVENT_SET = eINSTANCE.getBlockedEventSet();

		/**
		 * The meta object literal for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.RequestedEventSetImpl <em>Requested Event Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.RequestedEventSetImpl
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getRequestedEventSet()
		 * @generated
		 */
		EClass REQUESTED_EVENT_SET = eINSTANCE.getRequestedEventSet();

		/**
		 * The meta object literal for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioStateScopeImpl <em>Scenario State Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioStateScopeImpl
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getScenarioStateScope()
		 * @generated
		 */
		EClass SCENARIO_STATE_SCOPE = eINSTANCE.getScenarioStateScope();

		/**
		 * The meta object literal for the '<em><b>Event Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_STATE_SCOPE__EVENT_SETS = eINSTANCE.getScenarioStateScope_EventSets();

		/**
		 * The meta object literal for the '{@link com.yakindu.sct.domain.scenario.scenariotext.impl.EventSetImpl <em>Event Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.EventSetImpl
		 * @see com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextPackageImpl#getEventSet()
		 * @generated
		 */
		EClass EVENT_SET = eINSTANCE.getEventSet();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SET__EVENTS = eINSTANCE.getEventSet_Events();

	}

} //ScenarioTextPackage
