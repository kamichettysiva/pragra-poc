package com.pragra.stepdefinitions;

import com.pragra.framework.base.DriverManager;
import com.pragra.framework.support.io.PropertiesFile;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.File;
import java.net.MalformedURLException;

public class Hooks {
	private DriverManager manager;
	String featureName ;
	public static String baseDir = System.getProperty("user.dir");
	private static PropertiesFile envConfig;

	@Before
	public void beforeScenario(Scenario scenario) throws MalformedURLException {
		manager=new DriverManager();
		String path = baseDir + "//src//main//java//com//pragra//";
		if(envConfig==null) {
			envConfig=new PropertiesFile(path+"config//config.properties");
		}
		featureName = getFeatureFileNameFromScenarioId(scenario);
		System.out.println(envConfig.getProperty(featureName+"URL"));
		System.out.println("jobfunctionsURL");

		manager.launchApplication(envConfig.getProperty(featureName+"URL"));
		}
	
	@After
	public void afterScenario() {
		manager.closeDriver();
		}

	private String getFeatureFileNameFromScenarioId(Scenario scenario) {
		String rawFeatureName[] = scenario.getId().split("/");
		String featureName = rawFeatureName[rawFeatureName.length-1].split("\\.")[0];
		//featureName = featureName + rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
		return featureName;
	}
	}
