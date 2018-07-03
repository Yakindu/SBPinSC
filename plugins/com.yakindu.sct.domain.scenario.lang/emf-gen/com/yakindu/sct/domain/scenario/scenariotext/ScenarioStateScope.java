/**
 */
package com.yakindu.sct.domain.scenario.scenariotext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario State Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope#getEventSets <em>Event Sets</em>}</li>
 * </ul>
 *
 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage#getScenarioStateScope()
 * @model
 * @generated
 */
public interface ScenarioStateScope extends Scope {
	/**
	 * Returns the value of the '<em><b>Event Sets</b></em>' containment reference list.
	 * The list contents are of type {@link com.yakindu.sct.domain.scenario.scenariotext.EventSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Sets</em>' containment reference list.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage#getScenarioStateScope_EventSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventSet> getEventSets();

} // ScenarioStateScope
