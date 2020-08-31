package com.pragra.framework.base;

import com.pragra.framework.support.io.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Manager browser launch and kill activities Load property file and launch
 * browser based on programmer choice given properties file Kills browser for
 * completion of every class execution
 *
 */
public class DriverManager{
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static String browser;
	private static String host;
	/**
	 * This function launches browser based on browser name given in config
	 * properties file.
	 */
	public void launchApplication(String URL) throws MalformedURLException {

		browser = System.getProperty("BROWSER");
		//browser = "localchrome";
		host = System.getProperty("HUB_HOST");
		driver.set(getDriverFor(browser));
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(URL);
		getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	/**
	 * method to set driver
	 * @param brName
	 * @return browser driver
	 */
	private WebDriver getDriverFor(String brName) throws MalformedURLException {
		switch (brName.toLowerCase()) {
		case "localchrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-gpu");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--no-sandbox");
			options.addArguments("ignore-certificate-errors");
			options.setAcceptInsecureCerts(true);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			options.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver(options);
		case "localfirefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case "chrome":
			options = new ChromeOptions();
			URL url = new URL("http://"+host+":4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url,options);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			return driver;
		case "firefox":
				FirefoxOptions options1 = new FirefoxOptions();
				url = new URL("http://"+host+":4444/wd/hub");
				driver = new RemoteWebDriver(url,options1);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				return driver;
		default:
			Logger.getLogger(DriverManager.class).error("Browser is not found with specified name, allowed options are chrome, firefox, localchrome, localfirefox");
			return null;
		}
	}

	/**
	 * This function closes all browser drivers.
	 */
	public  void closeDriver() {
		if (getDriver() != null) {
			try {
				getDriver().quit();
			} catch (NoSuchMethodError nsme) {
				nsme.printStackTrace();
			} catch (NoSuchSessionException nsse) {
				nsse.printStackTrace();
			} catch (SessionNotCreatedException snce) {
				snce.printStackTrace();
			}
		}
	}

	/**
	 * method to get the driver instance
	 *
	 */
	public static WebDriver getDriver() {
		return driver.get();
	}
}