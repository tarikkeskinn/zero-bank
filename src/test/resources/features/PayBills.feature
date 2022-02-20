Feature: Pay Bills Page

  Background:
    Given User should be able to log in application
    Then User should be able to navigate "Pay Bills" page

  Scenario: Verify Pay Bills page title
    Then User should see page title "Zero - Pay Bills"

  Scenario: User should be able to complete Pay Operation
    When User enter amount of payment "5000.00"
    And User enter day of payment "2022-02-19"
    And User click Pay button
    Then User should see this message: "The payment was successfully submitted."


  Scenario: User should not be able to complete Pay Operation without date information
    And User enter day of payment "2022-02-19"
    And User click Pay button
    Then User should see this alert: "Please fill out this field."

    Scenario: Amount field should not accept alphabetical or special characters
      When User enter amount of payment "500 Dollars"
      And User enter day of payment "2022-02-19"
      And User click Pay button
      Then User should not see this message: "The payment was successfully submitted."

      Scenario: Date field should not accept alphabetical characters
        When User enter amount of payment "5000"
        And User enter day of payment "22 February 2022"
        And User click Pay button
        Then User should not see this message: "The payment was successfully submitted."