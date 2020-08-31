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
  "status": "passed"
});
formatter.step({
  "name": "Enter Job Code \"CAP1032\" , \"CAP1032\" and \"00\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.enterJobCodeAnd(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Customer \"ANT\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.selectCustomer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Job Billing and select Job Map Code \"VMO\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickJobBillingAndSelectJobMapCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Bank and insert Bank Department \"00\" and Bank Account \"1000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickBankAndInsertBankDepartmentAndBankAccount(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Security and insert Group Code \"MASTER\"",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickSecurityAndInsertGroupCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Job Details and Save job",
  "keyword": "And "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.clickJobDetailsAndSaveJob()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search job \"CAP1032\" and verify row is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "CMICConsoleStepDefinitions.searchJobAndVerifyRowIsReturned(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});