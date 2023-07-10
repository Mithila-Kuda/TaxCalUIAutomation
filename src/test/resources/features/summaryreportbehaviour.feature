Feature: Summary report reset once click on income input field

  Scenario: Already calculated Income summary displayed when user tries to enter a new income
    Given  Tax Calculator Open
    When  User insert income as $98765 and press Calculate
    And User try to delete the income entered
    Then  Summary report will disappear
