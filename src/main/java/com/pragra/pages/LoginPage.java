package com.pragra.pages;

import com.pragra.framework.utilities.DriverWait;
import com.pragra.framework.utilities.DriverWait.WaitTime;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.pragra.framework.utilities.UIWrappers.clickOnElement;
import static com.pragra.framework.utilities.UIWrappers.inputText;

public class LoginPage extends BasePage {
	public LoginPage() {
		logger = Logger.getLogger(LoginPage.class);
	}

	@FindBy(id="client_id")
	private WebElement clientID;

	@FindBy(id="berp")
	private WebElement CMICEnterpriseBtn;

	@FindBy(id="usernametemp")
	private WebElement username;

	@FindBy(id="passowrd")
	private WebElement passowrd;

	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	private WebElement signInButton;

	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(signInButton, WaitTime.ONEMINUTE);
	}

	public void loginApplication(String clientid, String userid,String password) {
		inputText(clientID, clientid, "Client ID");
		logger.info("Entered Client ID");
		inputText(username, userid, "Username");
		logger.info("Entered User Name");
		inputText(passowrd, password, "Password");
		logger.info("Entered Password");
		clickOnElement(signInButton, "Sign In Button");
		logger.info("Clicked SignIn Button");
		/*DriverWait.isElementDisplayed(CMICEnterpriseBtn, WaitTime.ONEMINUTE);
		logger.info("CMIC Landing Page is launched");*/


	}
}
