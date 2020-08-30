package com.pragra.pages;

import com.pragra.framework.utilities.DriverWait;
import com.pragra.framework.utilities.DriverWait.WaitTime;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import static com.pragra.framework.utilities.UIWrappers.clickOnElement;
import static com.pragra.framework.utilities.UIWrappers.inputText;

public class LandingPage extends BasePage{
	
	public LandingPage() {
		logger = Logger.getLogger(LandingPage.class);
	}

	@FindBy(xpath="//*[@class='product-tiles']")
	private WebElement landingPage;

	@FindBy(xpath="//div[text()='Confirm']")
	private WebElement DatePickerConfirmButton;

	@FindBy(id="product-tile-flight")
	private WebElement flightsMenu;

	@FindBy(id="aa-web-search-button")
	private WebElement searchButton;

	@FindBy(xpath="//*[@id='loginModal' and text()=' BIG Log in/Sign up ']")
	private WebElement signInButton;

	@FindBy(id="logout")
	private WebElement logoutButton;

	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(landingPage, WaitTime.ONEMINUTE);
	}

	public void flightSearchEnterLocation(String fieldName, String value){
		String cityName = value.split("\\(")[0].trim();
		String cityCode = value.split("\\(")[1].split("\\)")[0];
		clickOnElement(By.xpath("//*[@id='my-react']//div[text()='" + fieldName + "']/..//input"),cityName);
		inputText(By.xpath("//*[@id='my-react']//div[text()='" + fieldName + "']/..//input"),cityName,cityName);
		clickOnElement(By.xpath("//*[@id='my-react']//span[text()='"+cityName+"']/../..//div[text()='"+cityCode+"']"),cityName);
		logger.info("Selected " + fieldName + " city as " + cityName );
	}

	public void flightSearchSelectTravelDate(String fieldName, String value){
		clickOnElement(By.xpath("//*[@id='my-react']//div[text()='" + fieldName + "']/..//input"),fieldName);
		inputText(By.xpath("//*[@id='my-react']//div[text()='" + fieldName + "']/..//input"),value,value);
		logger.info("Selected " + fieldName + " date as " + value );
	}

	public void clickFlightsMenu(){
		DriverWait.isElementDisplayed(flightsMenu, WaitTime.ONEMINUTE);
		flightsMenu.click();
	}
	public void datePickerConfirmButton(){
		DriverWait.isElementDisplayed(DatePickerConfirmButton, WaitTime.ONEMINUTE);
		DatePickerConfirmButton.click();
	}

	public void clickSearchButton(){
		DriverWait.isElementDisplayed(searchButton, WaitTime.ONEMINUTE);
		searchButton.click();
		logger.info("Searching flights...");
	}

	public void clickSigninButton(){
		DriverWait.isElementDisplayed(searchButton, WaitTime.ONEMINUTE);
		signInButton.click();
	}

	public void verifyAccountName(String Signin){
		Assert.assertTrue(DriverWait.isElementDisplayed(By.xpath("//*[@id='loginModal' and text()='"+Signin+"']"),WaitTime.ONEMINUTE),"Sign in is not successful");
		logger.info("Account Name Verified as " + Signin);
	}
	public void clickAccountProfileButton(String Signin){
		clickOnElement(By.xpath("//*[@id='loginModal' and text()='"+Signin+"']"),Signin);
	}

	public void clickLogOutButton(){
		logoutButton.click();
	}

	public void verifyLogoutIsSuccessful(){
		DriverWait.isElementDisplayed(signInButton, WaitTime.ONEMINUTE);
		logger.info("Logout is successful - Test Passed");
	}
}
