/**
* Copyright (c) 2017 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	Andreas Muelder - itemis AG
*
*/
package com.yakindu.sct.domain.scenario.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class ScenarioUIActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "com.yakindu.sct.domain.scenario.ui"; //$NON-NLS-1$
	private static ScenarioUIActivator plugin;

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static ScenarioUIActivator getDefault() {
		return plugin;
	}

}
