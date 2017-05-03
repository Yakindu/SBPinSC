/**
 */
package com.yakindu.sct.domain.scenario.scenariotext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage
 * @generated
 */
public interface ScenarioTextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioTextFactory eINSTANCE = com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioTextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blocked Event Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blocked Event Set</em>'.
	 * @generated
	 */
	BlockedEventSet createBlockedEventSet();

	/**
	 * Returns a new object of class '<em>Requested Event Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requested Event Set</em>'.
	 * @generated
	 */
	RequestedEventSet createRequestedEventSet();

	/**
	 * Returns a new object of class '<em>Scenario State Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario State Scope</em>'.
	 * @generated
	 */
	ScenarioStateScope createScenarioStateScope();

	/**
	 * Returns a new object of class '<em>Event Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Set</em>'.
	 * @generated
	 */
	EventSet createEventSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenarioTextPackage getScenarioTextPackage();

} //ScenarioTextFactory
