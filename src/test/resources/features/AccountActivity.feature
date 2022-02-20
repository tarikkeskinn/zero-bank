
Feature: Account Activity Page

  Background:
    Given User should be able to log in application
    When User should be able to navigate "Account Activity" page

  Scenario: Verify page title
    Then User should see page title "Zero - Account Activity"

  Scenario: Verify Account default drop down option
    Then Account drop down default option should be "Savings"


  Scenario: Verify Account drop down options
    Then Account drop down should have the following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: Verify Transactions table columns
    Then Transactions table should have column names
      | Date Description Deposit Withdrawal |







