Feature: As a user I want to test login feature with multiple datasets

  Scenario Outline: To test login with invalid credential
    Given Application is up and running
    When I enter <username> and <password> on login page
    Then Error message should display

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury1 | mercury1 |
