package com.pragra.pages;

import com.pragra.framework.utilities.DriverWait;
import com.pragra.framework.utilities.DriverWait.WaitTime;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.pragra.framework.utilities.UIWrappers.inputText;

public class CMICConsolePage extends BasePage {
	public CMICConsolePage() {
		logger = Logger.getLogger(CMICConsolePage.class);
	}
	Random objGenerator = new Random();
	int tempNum = objGenerator.nextInt(10000);
	int randomNumber = tempNum;
	@FindBy(id="berp")
	private WebElement CMICEnterpriseBtn;

	@FindBy(xpath="//span[text()='General Ledger']/../../div")
	private WebElement generalLedger;

	@FindBy(xpath="//input[@placeholder='Search for programs...']")
	private WebElement programSearchBox;

	@FindBy(xpath="//span[text()='Job Costing']")
	private WebElement jobCosting;

	@FindBy(xpath="//span[text()='Job Costing']/ancestor::span//span[text()='Job']")
	private WebElement jobCosting_job;

	@FindBy(xpath="//span[text()='Job Costing']/ancestor::span//span[text()='Enter Job']")
	private WebElement jobCosting_job_EnterJob;

	@FindBy(xpath="///h1[text()='Job Detail']")
	private WebElement jobSetUpWindow;

	@FindBy(xpath="//div[@title='Insert Record']")
	private WebElement insertButton;

	@FindBy(xpath="//label[text()='Job Code']/../input")
	private WebElement jobCode;

	@FindBy(xpath="//label[text()='Enter Job Name']/../input")
	private WebElement jobName;

	@FindBy(xpath="//label[text()='Department']/../input")
	private WebElement Department;

	@FindBy(xpath="//a[@title='Search: Customer']")
	private WebElement customerSearchIcon;

	@FindBy(xpath="//div[text()='Customer List']")
	private WebElement customerListPopUp;

	@FindBy(xpath="//label[text()='Code']/../input")
	private WebElement customerCodeTextbox;

	@FindBy(xpath="//div[text()='Customer List']/ancestor::table//table//span[text()='Search']")
	private WebElement customerListSearch;

	@FindBy(xpath="//div[text()='Customer List']/ancestor::table//table//span[text()='ANT']/../..")
	private WebElement selectCustomerCode;

	@FindBy(xpath="//div[text()='Customer List']/ancestor::table//table//span[text()='OK']")
	private WebElement selectCustomerOKButton;

	@FindBy(xpath="//div[@role='presentation']/a[text()='Job Billing']")
	private WebElement jobBillingMenu;

	@FindBy(xpath="//a[@title='Search: JB Map Code']")
	private WebElement jbMapcodeSearchIcon;

	@FindBy(xpath="//div[text()='JB Map Code List']")
	private WebElement jbMapcodeCodesPopUp;

	@FindBy(xpath="//div[text()='JB Map Code List']/ancestor::table//table//label[text()='Code']/../input")
	private WebElement jobMapCodeTextBox;

	@FindBy(xpath="//div[text()='JB Map Code List']/ancestor::table//table//span[text()='Search']")
	private WebElement jbMapCodeSearchBtn;

	@FindBy(xpath="//div[text()='JB Map Code List']/ancestor::table//table//span[text()='VMO']")
	private WebElement selectJobMapCode;

	@FindBy(xpath="//div[text()='JB Map Code List']/ancestor::table//table//span[text()='OK']")
	private WebElement jobMapCodeOKBtn;

	@FindBy(xpath="//div[@role='presentation']/a[text()='Bank']")
	private WebElement bankMenu;

	@FindBy(xpath="//label[contains(text(),'Department:')]/../input")
	private WebElement bankDepartmenttxt;

	@FindBy(xpath="//label[contains(text(),'Bank Account:')]/../input")
	private WebElement bankAccounttxt;

	@FindBy(xpath="//div[@role='presentation']/a[text()='Security']")
	private WebElement securityMenu;

	@FindBy(xpath="//a[@title='Search: Group Code']")
	private WebElement groupCodeSearchBtn;

	@FindBy(xpath="//div[text()='Group List']")
	private WebElement groupListPopup;

	@FindBy(xpath="//div[text()='Group List']/ancestor::table//table//span[text()='MASTER']")
	private WebElement selectGroupCode;

	@FindBy(xpath="//div[text()='Group List']/ancestor::table//table//span[text()='OK']")
	private WebElement groupcodeOKBtn;

	@FindBy(xpath="//div[@role='presentation']/a[text()='Job Detail']")
	private WebElement jobDetailMenu;

	@FindBy(xpath="//div[@title='Save (Ctrl+S)']")
	private WebElement saveButton;

	@FindBy(xpath="//span[text()='Search']/..")
	private WebElement searchButton;

	@FindBy(xpath="//h1[text()='Search']")
	private WebElement searchPopUp;

	@FindBy(xpath="//h1[text()='Search']/ancestor::table//table//label[text()='Job Code']/../input")
	private WebElement searchJobCodetxt;

	@FindBy(xpath="//h1[text()='Search']/ancestor::table//table//span[text()='Search']")
	private WebElement searchJobButton;

	@FindBy(xpath="//span[text()='Query Returned 1 Row']")
	private WebElement jobSearchResult;



	@Override
	public boolean isPageDisplayed() {	logger.info("CMIC Landing Page Displayed"); return DriverWait.isElementDisplayed(CMICEnterpriseBtn, WaitTime.ONEMINUTE);}

	public void isCMICConsolePageDisplayed() {
		DriverWait.isElementDisplayed(generalLedger, WaitTime.ONEMINUTE);
		logger.info("CMIC Console Page Displayed");
	}

	public void clickOnCMICENTERPRISE() {
		DriverWait.isElementDisplayed(CMICEnterpriseBtn, WaitTime.ONEMINUTE);
		CMICEnterpriseBtn.click();
		logger.info("Clicked on CMIC Enterprise");

	}
	public void verifyCMICMainConsoleIsLaunched() throws InterruptedException {
		Thread.sleep(25000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.get().getWindowHandles());
		driver.get().switchTo().window(tabs2.get(1));
		logger.info("Switched to" +  driver.get().getTitle() + " tab");
		Thread.sleep(6000);
		driver.get().switchTo().frame(1);
		DriverWait.isElementDisplayed(generalLedger, WaitTime.ONEMINUTE);
	}

	public void navigateToJobCostingJobEnterJob() throws InterruptedException {
		jobCosting.click();
		jobCosting_job.click();
		jobCosting_job_EnterJob.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.get().getWindowHandles());
		driver.get().switchTo().window(tabs2.get(1));
		DriverWait.isElementDisplayed(jobCode, WaitTime.ONEMINUTE);
		logger.info("Navigated to Job Setup Window");
	}

	public void clickInsertInJobDetailWindow() throws InterruptedException {
		DriverWait.isElementDisplayed(insertButton, WaitTime.ONEMINUTE);
		DriverWait.isElementEnabled(insertButton, WaitTime.ONEMINUTE);
		jobDetailMenu.click();
		Thread.sleep(3000);
		StaleElementHandleClick(insertButton);
		DriverWait.isElementEnabled(jobCode, WaitTime.ONEMINUTE);
		logger.info("New Job Setup Window is launched");
	}

	public void enterJobCodeAndName(String jobcode, String jobname, String department) throws InterruptedException {
		Thread.sleep(3000);
		inputText(jobCode, jobcode+randomNumber, "Job Code");
		inputText(jobName, jobname+randomNumber, "Job Name");
		inputText(Department, department, "Department");
		logger.info("Entered Job Code and Job Name");
	}

	public void selectCustomer(String customer) throws InterruptedException {
		Thread.sleep(2000);
		customerSearchIcon.click();
		DriverWait.isElementDisplayed(customerListPopUp, WaitTime.ONEMINUTE);
		inputText(customerCodeTextbox, customer, "Customer");
		customerListSearch.click();
		Thread.sleep(2000);
		selectCustomerCode.click();
		Thread.sleep(1000);
		selectCustomerOKButton.click();
		logger.info("Selected Customer Code");

	}

	public void clickJobBillingAndSelectJobMapCode(String jobmapcode) throws InterruptedException {
		Thread.sleep(2000);
		jobBillingMenu.click();
		DriverWait.isElementEnabled(jbMapcodeSearchIcon, WaitTime.ONEMINUTE);
		jbMapcodeSearchIcon.click();
		DriverWait.isElementEnabled(jbMapcodeCodesPopUp, WaitTime.ONEMINUTE);
		inputText(jobMapCodeTextBox,jobmapcode, "Job Map Code");
		jbMapCodeSearchBtn.click();
		Thread.sleep(2000);
		selectJobMapCode.click();
		Thread.sleep(1000);
		jobMapCodeOKBtn.click();
		logger.info("Selected Job Map Code");

	}

	public void clickBankAndInsertBankDepartmentAndBankAccount(String bankdept, String bankact) throws InterruptedException {
		Thread.sleep(2000);
		bankMenu.click();
		Thread.sleep(3000);
		insertButton.click();
		DriverWait.isElementEnabled(bankDepartmenttxt, WaitTime.ONEMINUTE);
		inputText(bankDepartmenttxt, bankdept, "Bank Department" );
		inputText(bankAccounttxt, bankact, "Bank Account" );
		logger.info("Entered Bank Details");

	}

	public void clickSecurityAndInsertGroupCode(String secgcode) throws InterruptedException {
		Thread.sleep(2000);
		securityMenu.click();
		Thread.sleep(3000);
		insertButton.click();
		DriverWait.isElementEnabled(groupCodeSearchBtn, WaitTime.ONEMINUTE);
		groupCodeSearchBtn.click();
		DriverWait.isElementEnabled(groupListPopup, WaitTime.ONEMINUTE);
		Thread.sleep(2000);
		selectGroupCode.click();
		groupcodeOKBtn.click();
		logger.info("Entered Security Group");

	}

	public  void clickJobDetailsAndSaveJob() throws InterruptedException {
		Thread.sleep(2000);
		jobDetailMenu.click();
		logger.info("Clicked Job Detail Menu");
		Thread.sleep(2000);
		DriverWait.isElementEnabled(saveButton, WaitTime.ONEMINUTE);
		saveButton.click();
		Thread.sleep(7000);
		logger.info("Saved Job");
	}

	public void searchJobAndVerifyRowIsReturned(String jobcode) throws InterruptedException {
		Thread.sleep(2000);
		searchButton.click();
		Thread.sleep(3000);
		DriverWait.isElementEnabled(searchPopUp, WaitTime.ONEMINUTE);
		inputText(searchJobCodetxt, jobcode+randomNumber, "Job Code");
		searchJobButton.click();
		Thread.sleep(3000);
		DriverWait.isElementDisplayed(jobSearchResult, WaitTime.ONEMINUTE);
		logger.info("Searched job and results verified");


	}


	public void StaleElementHandleClick (WebElement element)
	{
		int count = 0;
		boolean clicked = false;
		while (count < 4 && !clicked)
		{
			try
			{
				logger.info("Trying to recover from a stale element :" );
				element.click();
				clicked = true;
			}
			catch (StaleElementReferenceException e)
			{
				e.toString();
				logger.info("Trying to recover from a stale element :" + e.getMessage());
				count = count+1;
			}
		}
	}
}
