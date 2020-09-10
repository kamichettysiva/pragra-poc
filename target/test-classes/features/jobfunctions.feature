Feature: Create New Job
  @ADFTest-EnterJob
  Scenario Outline: Login and setup and new job
    Given User is on Login Page
    When Sign in with "<clientid>", "<userid>", "<password>"
    And Verify CMIC landing page loaded succefully
    And Click on CMIC ENTERPRISE
    And Verify CMIC main console is launched
    And Navigate to Job Costing->Job->Enter Job
    And Click Insert in job detail window
    And Enter Job Code "<jobcode>" , "<jobname>" and "<department>"
    And Select Customer "<customer>"
    And Click Job Billing and select Job Map Code "<jobmapcode>"
    And Click Bank and insert Bank Department "<bankdept>" and Bank Account "<bankact>"
    And Click Security and insert Group Code "<secgcode>"
    And Click Job Details and Save job
    Then Search job "<jobcode>" and verify row is returned

    Examples: 
      |clientid   |userid    |password     |jobcode  |jobname  |department  |customer  |jobmapcode  |bankdept  |bankact  |secgcode  |
      |CMICCLOUD  |USERTEST  |testhikuu01  |CAP1032  |CAP1032  |00          |ANT       |VMO         |00        |1000     |MASTER    |


  @JSPTest-CreateTicket
  Scenario Outline: Login and add new issue
    Given User is on Login Page
    When Sign in with "<clientid>", "<userid>", "<password>"
    And Verify CMIC landing page loaded succefully
    And Click on CMIC FIELD
    And Verify CMIC FIELD main console is launched
    And Search project "<projectname>"
    And Navigate to Issues
    And Click Add Issue
    And Enter issue details "<subject>", "<type>", "<severity>","<description>"
    And Assign issue "<assignee>" save and submit
    Then Search and verify issue

    Examples:
      |clientid   |userid    |password     |projectname  |subject  |subject      |type          |severity     |assignee
      |CMICCLOUD  |USERTEST  |testhikuu01  |OATSJOB      |CAP1029  |COPT TEST5   |Field Issue   |Test         |Andrew Hung