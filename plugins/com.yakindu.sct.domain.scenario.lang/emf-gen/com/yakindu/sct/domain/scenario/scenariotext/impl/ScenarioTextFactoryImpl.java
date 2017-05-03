/**
 */
package com.yakindu.sct.domain.scenario.scenariotext.impl;

import com.yakindu.sct.domain.scenario.scenariotext.*;

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
public class ScenarioTextFactoryImpl extends EFactoryImpl implements ScenarioTextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScenarioTextFactory init() {
		try {
			ScenarioTextFactory theScenarioTextFactory = (ScenarioTextFactory)EPackage.Registry.INSTANCE.getEFactory(ScenarioTextPackage.eNS_URI);
			if (theScenarioTextFactory != null) {
				return theScenarioTextFactory;
			}
		}
		catch (Exception exception) {
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
	public ScenarioTextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScenarioTextPackage.BLOCKED_EVENT_SET: return createBlockedEventSet();
			case ScenarioTextPackage.REQUESTED_EVENT_SET: return createRequestedEventSet();
			case ScenarioTextPackage.SCENARIO_STATE_SCOPE: return createScenarioStateScope();
			case ScenarioTextPackage.EVENT_SET: return createEventSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockedEventSet createBlockedEventSet() {
		BlockedEventSetImpl blockedEventSet = new BlockedEventSetImpl();
		return blockedEventSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedEventSet createRequestedEventSet() {
		RequestedEventSetImpl requestedEventSet = new RequestedEventSetImpl();
		return requestedEventSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioStateScope createScenarioStateScope() {
		ScenarioStateScopeImpl scenarioStateScope = new ScenarioStateScopeImpl();
		return scenarioStateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSet createEventSet() {
		EventSetImpl eventSet = new EventSetImpl();
		return eventSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioTextPackage getScenarioTextPackage() {
		return (ScenarioTextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenarioTextPackage getPackage() {
		return ScenarioTextPackage.eINSTANCE;
	}

} //ScenarioTextFactoryImpl
