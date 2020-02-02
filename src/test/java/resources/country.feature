Feature: Create a Country
  Scenario:  Country Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And Type in the Name "CucumberCountry"
    And Type in the code "CucumberAli"
    When Click on save button
    Then "CucumberCountry" should be displayed
    And Remove the data "CucumberCountry"
    Then Verify data is removed "CucumberCountry"


#   Advantage of cucumber
#     Understandable for everyone in the team
#     Report will understandable for everyone as well
#

