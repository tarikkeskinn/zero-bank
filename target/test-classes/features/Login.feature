
Feature: Online Banking Login Scenarios

  Background:
    Given the user is on the login page

  Scenario:User should be able to login with valid credentials
    And User should be able to login with valid credentials
    Then User should see page title "Zero - Account Summary"


  Scenario Outline: User should not be able to login with invalid credentials
    And User logins with invalid "<username>" and "<password>"
    Then User should see "Login and/or password are wrong." message

    Examples:
      | username | password |
      | username | asd      |
      | asd      | password |
      | asd      | asd      |


