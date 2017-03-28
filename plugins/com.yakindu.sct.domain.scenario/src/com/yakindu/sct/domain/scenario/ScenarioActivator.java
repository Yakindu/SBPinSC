/**
* Copyright (c) 2017 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	andreas muelder - itemis AG
*
*/
package com.yakindu.sct.domain.scenario;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ScenarioActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		ScenarioActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ScenarioActivator.context = null;
	}

}
