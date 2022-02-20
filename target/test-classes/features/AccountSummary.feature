
Feature: Account Summary Page

  Background:
    Given User should be able to log in application
    Then User should see page title "Zero - Account Summary"

  Scenario:Account Summary page options
    Then Account Summary page should have the following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit Accounts Table
    Then Credit Accounts Table should have following columns
      | Account Credit Card Balance  |

