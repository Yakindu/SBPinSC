package com.yakindu.sct.domain.scenario.validation

import com.yakindu.sct.domain.scenario.scenariotext.ScenarioTextPackage
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.yakindu.sct.model.stext.stext.StextPackage

class ScenarioTextValidator extends AbstractScenarioTextValidator {

	override List<EPackage> getEPackages() {
		var result = new ArrayList<EPackage>()
		result.add(ScenarioTextPackage.eINSTANCE)
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/sct/sgraph/2.0.0"))
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/base/base/2.0.0"))
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/base/types/2.0.0"))
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.yakindu.org/base/expressions/Expressions"))
		result.add(StextPackage.eINSTANCE);
		return result;
	}

}
