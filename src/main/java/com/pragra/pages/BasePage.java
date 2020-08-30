package com.pragra.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pragra.framework.base.DriverManager;

public abstract class BasePage {
	 static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	 Logger logger;
	
	public BasePage(){
		driver.set(DriverManager.getDriver());
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public abstract boolean isPageDisplayed();
}
