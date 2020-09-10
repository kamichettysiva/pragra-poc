Feature: Create new BI Dashboard
  @BITest-Dashboard
  Scenario Outline: Login and setup and dashboard
    Given User is on Login Page
    When Sign in with "<clientid>", "<userid>", "<password>"
    And Verify dashboard page is launched
    And Navigate to File->New
    And Enter dashboard name "<dashboardname>" and select "<datasource>"
    And Verify new dashboard builder page is launched
    And Select visualization type "<visualizationtype>"
    And Select business area "<busiessarea>" and fields "<fields>"
    And Drag the selected "<fields>" to columns
    And Save the dashboard with "<role>"
    Then Verify dashboard "<dashboardname>" by opening

    Examples:
      |clientid  |userid   |password    |dashboardname  |datasource                 |visualizationtype  |busiessarea |fields                                    |role        |
      |CMICCLOUD |USERTEST |testhikuu01 |OATS14         |CMIC Default Data Source   |Table              |Job Costing |Company Code, Job Code, Job, Bill Amt     |SECURITY    |

