package com.pragra.stepdefinitions;



import com.pragra.pages.DashboardPage;
import com.pragra.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefinitions {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;

	public DashboardStepDefinitions(DashboardPage dashboardPage) {
		this.dashboardPage = dashboardPage;
	}

	@And("Verify dashboard page is launched")
	public void verifyDashboardPageIsLaunched() {dashboardPage.isDashboardPageDisplayed(); }

	@And("Navigate to File->New")
	public void navigateToFileNew() {dashboardPage.navigateFile_New(); }

	@And("Enter dashboard name {string} and select {string}")
	public void enterDashboardNameAndSelect(String dashboardName, String datasource) throws InterruptedException {dashboardPage.enterDashboardName(dashboardName, datasource);	}

	@And("Verify new dashboard builder page is launched")
	public void verifyNewDashboardBuilderPageIsLaunched() {dashboardPage.verifyNewDashboardBuilderPageIsLaunched();}

	@And("Select visualization type {string}")
	public void selectVisualizationType(String visualizationtype) {dashboardPage.selectVisualizationType(visualizationtype);	}

	@And("Select business area {string} and fields {string}")
	public void selectBusinessAreaAndFields(String busiessarea, String fields) throws InterruptedException {dashboardPage.selectBusinessAreaAndFields(busiessarea, fields);}


	@And("Drag the selected {string} to columns")
	public void dragTheSelectedToColumns(String fields) throws InterruptedException {dashboardPage.dragTheSelectedToColumns(fields);}

	@And("Save the dashboard with {string}")
	public void saveTheDashboardWith(String role) throws InterruptedException {dashboardPage.saveTheDashboardWith(role);}

	@Then("Verify dashboard {string} by opening")
	public void verifyDashboardByOpening(String dashboardname) throws InterruptedException {dashboardPage.verifyDashboardByOpening(dashboardname);}


}


