package com.pragra.stepdefinitions;

import com.pragra.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	private LoginPage loginPage;
	
	public LoginStepDefinitions(LoginPage loginPage) {
		this.loginPage=loginPage;
	}
	@When("Sign in with {string}, {string}, {string}")
	public void signInWith(String clientid, String userid, String password) {loginPage.loginApplication(clientid,userid,password);}

	@Given("User is on Login Page")
	public void userIsOnLoginPage() {
	}
}
