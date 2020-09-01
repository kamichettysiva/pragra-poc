package com.pragra.runner;


import com.pragra.framework.base.CucumberFeatureManager;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		dryRun = false,
		monochrome=true,
		strict = true,
		features = "src/test/resources/features",
		glue = {"com.pragra.stepdefinitions"},
		tags = "@BITest-Dashboard,@ADFTest-EnterJob",
		plugin = {"html:reports/cucumber-reports/cucumber-pretty",
				"json:reports/cucumber-reports/cucumber-html-report.json",
				"json:reports/cucumber.json",
				"usage:reports/cucumber-reports/cucumber-usage.json",
				"rerun:reports/cucumber-reports/failedscenarios.txt" })

public class SuiteRunner extends CucumberFeatureManager{

}
