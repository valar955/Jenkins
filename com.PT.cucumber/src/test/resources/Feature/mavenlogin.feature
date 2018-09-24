Feature: Test smoke scenarios of PHP travels

  Scenario: Test PHP travels with valid credentials
    Given Open chrome and start application
    When I enter  valid "admin@phptravels.com" and valid "demoadmin"
    Then User should be able to login
    Then Application should be closed