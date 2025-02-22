Feature: As a user i should be able to successfully log in to smartbearsoftware

  @loginSmartBearTest
  Scenario: Log in functionality with valid credentials
    Given user in the smartbearsoftware Log in page
    When user enter username for smartbearsoftware
    And user enter password forsmartbearsoftware
    And user click log in button
    Then user should see "List of All Orders"

