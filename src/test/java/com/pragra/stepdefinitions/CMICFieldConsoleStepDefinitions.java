package com.pragra.stepdefinitions;



import com.pragra.pages.CMICConsolePage;
import com.pragra.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CMICFieldConsoleStepDefinitions {
	private LoginPage loginPage;
	private CMICConsolePage cmicconsolepage;

	public CMICFieldConsoleStepDefinitions(CMICConsolePage cmicconsolepage) {
		this.cmicconsolepage = cmicconsolepage;
	}


	@And("Click on CMIC FIELD")
	public void clickOnCMICFIELD() {
	}

	@And("Verify CMIC FIELD main console is launched")
	public void verifyCMICFIELDMainConsoleIsLaunched() {
	}

	@And("Search project {string}")
	public void searchProject(String arg0) {
	}

	@And("Navigate to Issues")
	public void navigateToIssues() {
	}

	@And("Click Add Issue")
	public void clickAddIssue() {
	}

	@And("Enter issue details {string}, {string}, {string},{string}")
	public void enterIssueDetails(String arg0, String arg1, String arg2, String arg3) {
	}

	@And("Assign issue {string} save and submit")
	public void assignIssueSaveAndSubmit(String arg0) {
	}

	@Then("Search and verify issue")
	public void searchAndVerifyIssue() {
	}
}


