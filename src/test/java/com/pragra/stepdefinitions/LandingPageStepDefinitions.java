package com.pragra.stepdefinitions;

import com.pragra.pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LandingPageStepDefinitions {
	private LandingPage landingPage;
	
	public LandingPageStepDefinitions(LandingPage dashboardPage) {
		this.landingPage=dashboardPage;
	}

	@Given("User is on Landing Page")
	public void is_on_Landing_Page() {
		Assert.assertTrue(landingPage.isPageDisplayed(), "Landing Page is not displayed");
	}

	@When("User selects Flights menu item on search widget")
	public void user_selects_Flights_menu_item_on_search_widget() {
		landingPage.clickFlightsMenu();
	}

	@And("Enter from location {string}")
	public void enterFromLocation(String fromLocation) {landingPage.flightSearchEnterLocation("From",fromLocation);}

	@And("Enter to location {string}")
	public void enterToLocation(String toLocation) {landingPage.flightSearchEnterLocation("To",toLocation);}

	@And("Select depart date {string}")
	public void selectDepartDate(String departDate) {	landingPage.flightSearchSelectTravelDate("Depart date",departDate); }

	@And("Select return date {string}")
	public void selectReturnDate(String retrunDate) {	landingPage.flightSearchSelectTravelDate("Return date",retrunDate);	}

	@And("Click confrim on date picker")
	public void clickConfrimOnDatePicker() {
		landingPage.datePickerConfirmButton();
	}

	@And("Click search")
	public void clickSearch() {
		landingPage.clickSearchButton();
	}

	@When("User clicks on BIG Login")
	public void userClicksOnBIGLogin() {
		landingPage.clickSigninButton();
	}

	@And("Verify account name {string}is displayed")
	public void verifyAccountNameIsDisplayed(String accountName) {
		landingPage.verifyAccountName(accountName);
	}

	@And("Click on account profile name {string}")
	public void clickOnAccountProfileName(String accountName) {
		landingPage.clickAccountProfileButton(accountName);
	}

	@And("Click logout")
	public void clickLogout() {
		landingPage.clickLogOutButton();
	}

	@Then("Verify logout is successful")
	public void verifyLogoutIsSuccessful() {
		landingPage.verifyLogoutIsSuccessful();
	}


}

