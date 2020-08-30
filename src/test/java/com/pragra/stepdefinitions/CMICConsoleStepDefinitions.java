package com.pragra.stepdefinitions;



import com.pragra.pages.CMICConsolePage;
import com.pragra.pages.DashboardPage;
import com.pragra.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CMICConsoleStepDefinitions {
	private LoginPage loginPage;
	private CMICConsolePage cmicconsolepage;

	public CMICConsoleStepDefinitions(CMICConsolePage cmicconsolepage) {
		this.cmicconsolepage = cmicconsolepage;
	}

	@And("Verify CMIC landing page loaded succefully")
	public void verifyCMICLandingPageLoadedSuccefully() {cmicconsolepage.isPageDisplayed();	}

	@And("Click on CMIC ENTERPRISE")
	public void clickOnCMICENTERPRISE()  {cmicconsolepage.clickOnCMICENTERPRISE();}


	@And("Verify CMIC main console is launched")
	public void verifyCMICMainConsoleIsLaunched() throws InterruptedException {cmicconsolepage.verifyCMICMainConsoleIsLaunched();
	}

	@And("Navigate to Job Costing->Job->Enter Job")
	public void navigateToJobCostingJobEnterJob() throws InterruptedException {cmicconsolepage.navigateToJobCostingJobEnterJob(); }

	@And("Click Insert in job detail window")
	public void clickInsertInJobDetailWindow() throws InterruptedException {cmicconsolepage.clickInsertInJobDetailWindow(); }

	@And("Enter Job Code {string} , {string} and {string}")
	public void enterJobCodeAnd(String jobcode, String jobname, String department) throws InterruptedException {cmicconsolepage.enterJobCodeAndName(jobcode, jobname, department);}

	@And("Select Customer {string}")
	public void selectCustomer(String customer) throws InterruptedException {cmicconsolepage.selectCustomer(customer); }

	@And("Click Job Billing and select Job Map Code {string}")
	public void clickJobBillingAndSelectJobMapCode(String jobmapcode) throws InterruptedException {cmicconsolepage.clickJobBillingAndSelectJobMapCode(jobmapcode);}

	@And("Click Bank and insert Bank Department {string} and Bank Account {string}")
	public void clickBankAndInsertBankDepartmentAndBankAccount(String bankdept, String bankact) throws InterruptedException {cmicconsolepage.clickBankAndInsertBankDepartmentAndBankAccount(bankdept,bankact);	}

	@And("Click Security and insert Group Code {string}")
	public void clickSecurityAndInsertGroupCode(String secgcode) throws InterruptedException {cmicconsolepage.clickSecurityAndInsertGroupCode(secgcode);}

	@And("Click Job Details and Save job")
	public void clickJobDetailsAndSaveJob() throws InterruptedException {cmicconsolepage.clickJobDetailsAndSaveJob(); }

	@Then("Search job {string} and verify row is returned")
	public void searchJobAndVerifyRowIsReturned(String jobcode) throws InterruptedException {cmicconsolepage.searchJobAndVerifyRowIsReturned(jobcode);	}



}


