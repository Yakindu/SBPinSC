/**
 */
package com.yakindu.sct.domain.scenario.scenariotext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.base.types.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.sct.domain.scenario.scenariotext.EventSet#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage#getEventSet()
 * @model
 * @generated
 */
public interface EventSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link org.yakindu.base.types.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage#getEventSet_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

} // EventSet
