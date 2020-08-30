$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dashboardbuilder.feature");
formatter.feature({
  "name": "Create new BI Dashboard",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login and setup and dashboard",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BITest-Dashboard"
    }
  ]
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Sign in with \"\u003cclientid\u003e\", \"\u003cuserid\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verify dashboard page is launched",
  "keyword": "And "
});
formatter.step({
  "name": "Navigate to File-\u003eNew",
  "keyword": "And "
});
formatter.step({
  "name": "Enter dashboard name \"\u003cdashboardname\u003e\" and select \"\u003cdatasource\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify new dashboard builder page is launched",
  "keyword": "And "
});
formatter.step({
  "name": "Select visualization type \"\u003cvisualizationtype\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select business area \"\u003cbusiessarea\u003e\" and fields \"\u003cfields\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Drag the selected \"\u003cfields\u003e\" to columns",
  "keyword": "And "
});
formatter.step({
  "name": "Save the dashboard with \"\u003crole\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify dashboard \"\u003cdashboardname\u003e\" by opening",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "clientid",
        "userid",
        "password",
        "dashboardname",
        "datasource",
        "visualizationtype",
        "busiessarea",
        "fields",
        "role"
      ]
    },
    {
      "cells": [
        "CMICCLOUD",
        "USERTEST",
        "testhikuu01",
        "OATS14",
        "CMIC Default Data Source",
        "Table",
        "Job Costing",
        "Company Code, Job Code, Job, Bill Amt",
        "SECURITY"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login and setup and dashboard",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BITest-Dashboard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sign in with \"CMICCLOUD\", \"USERTEST\", \"testhikuu01\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.signInWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify dashboard page is launched",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.verifyDashboardPageIsLaunched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to File-\u003eNew",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.navigateToFileNew()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter dashboard name \"OATS14\" and select \"CMIC Default Data Source\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.enterDashboardNameAndSelect(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify new dashboard builder page is launched",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.verifyNewDashboardBuilderPageIsLaunched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select visualization type \"Table\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.selectVisualizationType(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select business area \"Job Costing\" and fields \"Company Code, Job Code, Job, Bill Amt\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.selectBusinessAreaAndFields(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Drag the selected \"Company Code, Job Code, Job, Bill Amt\" to columns",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.dragTheSelectedToColumns(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Save the dashboard with \"SECURITY\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.saveTheDashboardWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify dashboard \"OATS14\" by opening",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardStepDefinitions.verifyDashboardByOpening(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/jobfunctions.feature");
formatter.feature({
  "name": "Create New Job",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login and setup and new job",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ADFTest-EnterJob"
    }
  ]
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Sign in with \"\u003cclientid\u003e\", \"\u003cuserid\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verify CMIC landing page loaded succefully",
  "keyword": "And "
});
formatter.step({
  "name": "Click on CMIC ENTERPRISE",
  "keyword": "And "
});
formatter.step({
  "name": "Verify CMIC main console is launched",
  "keyword": "And "
});
formatter.step({
  "name": "Navigate to Job Costing-\u003eJob-\u003eEnter Job",
  "keyword": "And "
});
formatter.step({
  "name": "Click Insert in job detail window",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Job Code \"\u003cjobcode\u003e\" , \"\u003cjobname\u003e\" and \"\u003cdepartment\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select Customer \"\u003ccustomer\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Job Billing and select Job Map Code \"\u003cjobmapcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Bank and insert Bank Department \"\u003cbankdept\u003e\" and Bank Account \"\u003cbankact\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Security and insert Group Code \"\u003csecgcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Job Details and Save job",
  "keyword": "And "
});
formatter.step({
  "name": "Search job \"\u003cjobcode\u003e\" and verify row is returned",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "clientid",
        "userid",
        "password",
        "jobcode",
        "jobname",
        "department",
        "customer",
        "jobmapcode",
        "bankdept",
        "bankact",
        "secgcode"
      ]
    },
    {
      "cells": [
        "CMICCLOUD",
        "USERTEST",
        "testhikuu01",
        "CAP1032",
        "CAP1032",
        "00",
        "ANT",
        "VMO",
        "00",
        "1000",
        "MASTER"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login and setup and new job",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ADFTest-EnterJob"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sign in with \"CMICCLOUD\", \"USERTEST\", \"testhikuu01\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.signInWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify CMIC landing page loaded succefully",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.verifyCMICLandingPageLoadedSuccefully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on CMIC ENTERPRISE",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickOnCMICENTERPRISE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify CMIC main console is launched",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.verifyCMICMainConsoleIsLaunched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Job Costing-\u003eJob-\u003eEnter Job",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.navigateToJobCostingJobEnterJob()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Insert in job detail window",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickInsertInJobDetailWindow()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SIVAKUKA01\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\sivakuka\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:4036}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: eec4374fad30b6038cd3a499b8c39a1f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.isEnabled(RemoteWebElement.java:156)\r\n\tat sun.reflect.GeneratedMethodAccessor10.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.isEnabled(Unknown Source)\r\n\tat com.pragra.framework.utilities.DriverWait.isElementEnabled(DriverWait.java:55)\r\n\tat com.pragra.pages.CMICConsolePage.clickInsertInJobDetailWindow(CMICConsolePage.java:184)\r\n\tat com.pragra.stepdefinitions.CMICConsoleStepDefinitions.clickInsertInJobDetailWindow(CMICConsoleStepDefinitions.java:34)\r\n\tat ✽.Click Insert in job detail window(file:src/test/resources/features/jobfunctions.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter Job Code \"CAP1032\" , \"CAP1032\" and \"00\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.enterJobCodeAnd(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Customer \"ANT\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.selectCustomer(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Job Billing and select Job Map Code \"VMO\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickJobBillingAndSelectJobMapCode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Bank and insert Bank Department \"00\" and Bank Account \"1000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickBankAndInsertBankDepartmentAndBankAccount(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Security and insert Group Code \"MASTER\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickSecurityAndInsertGroupCode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Job Details and Save job",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickJobDetailsAndSaveJob()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search job \"CAP1032\" and verify row is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.searchJobAndVerifyRowIsReturned(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});