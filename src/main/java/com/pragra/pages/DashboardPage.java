package com.pragra.pages;

import com.pragra.framework.utilities.DriverWait;
import com.pragra.framework.utilities.DriverWait.WaitTime;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static com.pragra.framework.utilities.UIWrappers.clickOnElement;
import static com.pragra.framework.utilities.UIWrappers.inputText;

public class DashboardPage extends BasePage {
	public DashboardPage() {
		logger = Logger.getLogger(DashboardPage.class);
	}
	Random objGenerator = new Random();
	int randomNumber = objGenerator.nextInt(10000);
	Actions action = new Actions(driver.get());
	@FindBy(xpath="//h1[text()='Dashboard Builder']")
	private WebElement dashboardLabel;

	@FindBy(xpath="//a[text()='File']")
	private WebElement fileMenu;

	@FindBy(xpath="//td[text()='New...']")
	private WebElement file_New;

	@FindBy(xpath="//div[text()='New Dashboard']")
	private WebElement newDashboardPopup;

	@FindBy(xpath="//label[text()='Name']//../..//input")
	private WebElement newDashboardName;

	@FindBy(xpath="//label[text()='Data Source']//../..//a")
	private WebElement dataSourceSearchIcon;

	@FindBy(xpath="//div[text()='Search and Select Data Source']")
	private WebElement dataSourceSelectionPopup;

	@FindBy(xpath="//div[text()='Search and Select Data Source']/ancestor::table//input")
	private WebElement dataSourceSearchNameTxt;

	@FindBy(xpath="//div[text()='Search and Select Data Source']/ancestor::table//span[text()='Search']")
	private WebElement dataSourceSearcBtn;

	@FindBy(xpath="//span[text()='CMiC Default Data Source']")
	private WebElement dataSourceSearchResult;

	@FindBy(xpath="//div[text()='Search and Select Data Source']/ancestor::table//span[text()='OK']")
	private WebElement dataSourceOKBtn;

	@FindBy(xpath="//div[text()='New Dashboard']/ancestor::table//span[text()='OK']")
	private WebElement getNewDashboardPopupOKBtn;

	@FindBy(xpath="//h3[text()='OATS2']")
	private WebElement newDashboardTitle;

	@FindBy(xpath="//h3[text()='Visualizations']/ancestor::td//*[contains(@class,'AFVizIconContainer')]")
	private WebElement visualizationsContainer;

	@FindBy(xpath="//h3[text()='Visualizations']/ancestor::td//img[@alt=\"Table\"]")
	private WebElement chartType;

	@FindBy(xpath="//h3[text()='Fields ']")
	private WebElement feildsSelectionLabel;

	@FindBy(xpath="//div[text()='CMiC Default Data Source']")
	private WebElement fieldsSelectionPopup;

	@FindBy(xpath="//label[text()='Business Area']/ancestor::tr//select")
	private WebElement businessAreaSelectionDropdown;

	@FindBy(xpath="//span[text()='JC Jobs']/../../../span/a")
	private WebElement expandBusinessArea;

	@FindBy(xpath="//span[text()='Company Code']")
	private WebElement fieldsSelection;

	@FindBy(xpath="//div[text()='CMiC Default Data Source']/ancestor::tr//span[text()='OK']")
	private WebElement fieldsSelectionOK;

	@FindBy(xpath="//td[text()='JC Jobs']/ancestor::span/..//a")
	private WebElement expandJCjobs;

	@FindBy(xpath="//td[text()='Save']")
	private WebElement file_Save;

	@FindBy(xpath="//div[text()='Assign User Role']")
	private WebElement assignUserRolePopup;

	@FindBy(xpath="//div[text()='Assign User Role']/ancestor::table//li[text()='SECURITY']")
	private WebElement userRoleSecurity;

	@FindBy(xpath="//div[text()='Assign User Role']/ancestor::table//span[text()='Save']")
	private WebElement assignUserRolePopupSaveBtn;

	@FindBy(xpath="//td[text()='Open...']")
	private WebElement file_Open;

	@FindBy(xpath="//div[text()='Search and Open Dashboard']")
	private WebElement searchAndOpenDashboardPopup;

	@FindBy(xpath="//div[text()='Search and Open Dashboard']/ancestor::table//label[text()='Name']/../input")
	private WebElement searchAndOpenDashboardNametxt;

	@FindBy(xpath="//div[text()='Search and Open Dashboard']/ancestor::table//span[text()='Search']")
	private WebElement searchAndOpenDashboardSearchBtn;

	@FindBy(xpath="//div[text()='Search and Open Dashboard']/ancestor::table//a[@title='Close']")
	private WebElement searchAndOpenDashboardCloseBtn;



	@Override
	public boolean isPageDisplayed() {return DriverWait.isElementDisplayed(dashboardLabel, WaitTime.ONEMINUTE);	}

	public void isDashboardPageDisplayed() {
		DriverWait.isElementDisplayed(dashboardLabel, WaitTime.ONEMINUTE);
		logger.info("Dashboard Page Displayed");
	}

	public void navigateFile_New() {
		DriverWait.isElementDisplayed(fileMenu, WaitTime.TWOMINUTES);
		fileMenu.click();
		logger.info("Clicked on File");
		DriverWait.isElementDisplayed(file_New, WaitTime.ONEMINUTE);
		file_New.click();
		logger.info("Clicked on File_New");
	}

	public void enterDashboardName(String dashboardName, String datasource) throws InterruptedException {
		DriverWait.isElementDisplayed(newDashboardPopup, WaitTime.ONEMINUTE);
		inputText(newDashboardName, dashboardName+randomNumber, "Dashboard Name");
		logger.info("Entered Dashboard Name");
		Thread.sleep(2000);
		DriverWait.isElementDisplayed(dataSourceSearchIcon, WaitTime.ONEMINUTE);
		dataSourceSearchIcon.click();
		DriverWait.isElementDisplayed(dataSourceSelectionPopup, WaitTime.ONEMINUTE);
		inputText(dataSourceSearchNameTxt, datasource, "Datasource Name");
		dataSourceSearcBtn.click();
		Thread.sleep(2000);
		dataSourceSearchResult.click();
		dataSourceOKBtn.click();
		logger.info("Selected Data Source");
		Thread.sleep(2000);
		getNewDashboardPopupOKBtn.click();
	}

	public void verifyNewDashboardBuilderPageIsLaunched(){
		DriverWait.isElementDisplayed(visualizationsContainer, WaitTime.ONEMINUTE);
	}

	public void selectVisualizationType(String visualizationtype){
		DriverWait.isElementDisplayed(visualizationsContainer, WaitTime.ONEMINUTE);
		chartType.click();
	}

	public void  selectBusinessAreaAndFields(String busiessarea, String fields) throws InterruptedException {
		feildsSelectionLabel.click();
		DriverWait.isElementDisplayed(fieldsSelectionPopup, WaitTime.ONEMINUTE);
		Select businessAreaDropdown = new Select(businessAreaSelectionDropdown);
		businessAreaDropdown.selectByVisibleText(busiessarea);
		expandBusinessArea.click();
		String FieldsArray[] = fields.split(",");
		for(int i = 0;i < FieldsArray.length; i++) {
			Thread.sleep(2000);
			action.doubleClick(driver.get().findElement(By.xpath("//span[text()='" + FieldsArray[i].trim()+ "']"))).perform();
		}
		fieldsSelectionOK.click();
	}

	public void dragTheSelectedToColumns(String fields) throws InterruptedException {
		DriverWait.isElementDisplayed(expandJCjobs, WaitTime.ONEMINUTE);
		expandJCjobs.click();
		String FieldsArray[] = fields.split(",");
		for(int i = 0;i < FieldsArray.length; i++) {
			Thread.sleep(2000);
			action.dragAndDrop(driver.get().findElement(By.xpath("//td[text()='" + FieldsArray[i].trim()+ "']")),driver.get().findElement(By.xpath("//div[text()='Drag data fields here']"))).perform();

		}
	}

	public void saveTheDashboardWith(String role) throws InterruptedException {
		Thread.sleep(2000);
		fileMenu.click();
		Thread.sleep(1000);
		file_Save.click();
		DriverWait.isElementDisplayed(assignUserRolePopup, WaitTime.ONEMINUTE);
		userRoleSecurity.click();
		Thread.sleep(2000);
		assignUserRolePopupSaveBtn.click();
		logger.info("Saved Dashboard" );
		Thread.sleep(3000);
	}

	public void verifyDashboardByOpening(String dashboardname) throws InterruptedException {
		fileMenu.click();;
		Thread.sleep(1000);
		file_Open.click();
		DriverWait.isElementDisplayed(searchAndOpenDashboardPopup, WaitTime.ONEMINUTE);
		logger.info("Search dashboard popup displayed");
		DriverWait.isElementEnabled(searchAndOpenDashboardNametxt, WaitTime.ONEMINUTE);
		inputText(searchAndOpenDashboardNametxt, dashboardname+randomNumber, "Dashboard Name");
		searchAndOpenDashboardSearchBtn.click();
		DriverWait.isElementDisplayed(By.xpath("//div[text()='Search and Open Dashboard']/ancestor::table//span[text()='"+dashboardname+randomNumber+"']"),WaitTime.ONEMINUTE);
		Thread.sleep(2000);
		searchAndOpenDashboardCloseBtn.click();
		logger.info("Verified the newly created dashboard");
	}
}
