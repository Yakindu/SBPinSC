/**
 */
package com.yakindu.sct.domain.scenario.scenariotext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.yakindu.base.types.TypesPackage;
import org.yakindu.sct.model.sgraph.SGraphPackage;

import com.yakindu.sct.domain.scenario.scenariotext.BlockedEventSet;
import com.yakindu.sct.domain.scenario.scenariotext.EventSet;
import com.yakindu.sct.domain.scenario.scenariotext.RequestedEventSet;
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioStateScope;
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextFactory;
import com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioTextPackageImpl extends EPackageImpl implements ScenarioTextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockedEventSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestedEventSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioStateScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScenarioTextPackageImpl() {
		super(eNS_URI, ScenarioTextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScenarioTextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScenarioTextPackage init() {
		if (isInited) return (ScenarioTextPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioTextPackage.eNS_URI);

		// Obtain or create and register package
		ScenarioTextPackageImpl theScenarioTextPackage = (ScenarioTextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScenarioTextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScenarioTextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SGraphPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScenarioTextPackage.createPackageContents();

		// Initialize created meta-data
		theScenarioTextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScenarioTextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScenarioTextPackage.eNS_URI, theScenarioTextPackage);
		return theScenarioTextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockedEventSet() {
		return blockedEventSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestedEventSet() {
		return requestedEventSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioStateScope() {
		return scenarioStateScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioStateScope_EventSets() {
		return (EReference)scenarioStateScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSet() {
		return eventSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSet_Events() {
		return (EReference)eventSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioTextFactory getScenarioTextFactory() {
		return (ScenarioTextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		blockedEventSetEClass = createEClass(BLOCKED_EVENT_SET);

		requestedEventSetEClass = createEClass(REQUESTED_EVENT_SET);

		scenarioStateScopeEClass = createEClass(SCENARIO_STATE_SCOPE);
		createEReference(scenarioStateScopeEClass, SCENARIO_STATE_SCOPE__EVENT_SETS);

		eventSetEClass = createEClass(EVENT_SET);
		createEReference(eventSetEClass, EVENT_SET__EVENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SGraphPackage theSGraphPackage = (SGraphPackage)EPackage.Registry.INSTANCE.getEPackage(SGraphPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockedEventSetEClass.getESuperTypes().add(this.getEventSet());
		requestedEventSetEClass.getESuperTypes().add(this.getEventSet());
		scenarioStateScopeEClass.getESuperTypes().add(theSGraphPackage.getScope());

		// Initialize classes and features; add operations and parameters
		initEClass(blockedEventSetEClass, BlockedEventSet.class, "BlockedEventSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestedEventSetEClass, RequestedEventSet.class, "RequestedEventSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scenarioStateScopeEClass, ScenarioStateScope.class, "ScenarioStateScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioStateScope_EventSets(), ecorePackage.getEObject(), null, "eventSets", null, 0, -1, ScenarioStateScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSetEClass, EventSet.class, "EventSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventSet_Events(), theTypesPackage.getEvent(), null, "events", null, 0, -1, EventSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ScenarioTextPackageImpl
