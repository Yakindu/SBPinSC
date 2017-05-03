# SBPinSC
Scenario-based Programming in Statecharts


## How to install and run the plugins

1. get an Eclipse with an YAKINDU SCT plugins
    1. The easiest way is to download YAKINDU Statechart Tools from the itemis website: https://info.itemis.com/state-machine/download-yakindu-statechart-tools
    1. alternatively you can download a standard Eclipse and build everything from source. For this case follow https://github.com/Yakindu/statecharts#build-everything-from-source
1. clone this repository
1. start YAKINDU SCT (or Eclipse) and import the plugin SBPinSc plugin projects into the workspace using 'File > Import > General > Existing Projects into Workspace'
1. The projects should be built automatically after import.
1. There will be some errors. To fix these select com.yakindu.sct.domain.scenario.lang/src/com/yakindu/sct/domain/scenario/ScenarioText.xtext and in the context menu there is a entry to generate code from the xtext file. Execute it and after rebuild of the 
1. Create a new 'Run Configuration' of type 'Eclipse Application' and launch it. A 'runtime instance' of YSCT/Eclipse starts with the additional plugins activated. 


