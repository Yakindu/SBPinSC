/**
 */
package com.yakindu.sct.domain.scenario.scenariotext.impl;

import com.yakindu.sct.domain.scenario.scenariotext.EventSet;
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope;
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.sct.model.sgraph.impl.ScopeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario State Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.sct.domain.scenario.scenariotext.impl.ScenarioStateScopeImpl#getEventSets <em>Event Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioStateScopeImpl extends ScopeImpl implements ScenarioStateScope {
	/**
	 * The cached value of the '{@link #getEventSets() <em>Event Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSets()
	 * @generated
	 * @ordered
	 */
	protected EList<EventSet> eventSets;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioStateScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioTextPackage.Literals.SCENARIO_STATE_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventSet> getEventSets() {
		if (eventSets == null) {
			eventSets = new EObjectContainmentEList<EventSet>(EventSet.class, this, ScenarioTextPackage.SCENARIO_STATE_SCOPE__EVENT_SETS);
		}
		return eventSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioTextPackage.SCENARIO_STATE_SCOPE__EVENT_SETS:
				return ((InternalEList<?>)getEventSets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioTextPackage.SCENARIO_STATE_SCOPE__EVENT_SETS:
				return getEventSets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioTextPackage.SCENARIO_STATE_SCOPE__EVENT_SETS:
				getEventSets().clear();
				getEventSets().addAll((Collection<? extends EventSet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenarioTextPackage.SCENARIO_STATE_SCOPE__EVENT_SETS:
				getEventSets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenarioTextPackage.SCENARIO_STATE_SCOPE__EVENT_SETS:
				return eventSets != null && !eventSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioStateScopeImpl
