Feature: Calculating proper upper boundary values

  Scenario: $14000.99 income scenario
    Given Tax Calculator Open
    When User Calculate income for $14000.99
    Then Total Tax to be paid as "$1470.1"


  Scenario: $48000.99 income scenario
    Given Tax Calculator Open
    When User Calculate income for $48000.99
    Then Total Tax to be paid as "$8400.17"

  Scenario: $70000.99 income scenario
    Given Tax Calculator Open
    When User Calculate income for $70000.99
    Then Total Tax to be paid as "$21000.3"


  Scenario: $180000.99 income scenario
    Given Tax Calculator Open
    When User Calculate income for $180000.99
    Then Total Tax to be paid as "$59400.33"




