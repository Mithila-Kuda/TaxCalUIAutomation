Feature: Calculating all the boundary values

  Scenario: $0 income scenario
    Given Tax Calculator Open
    When User Calculate income for $0.0
    Then an error message will display "An error occurred while calculating tax."

  Scenario: $1 income scenario
    Given Tax Calculator Open
    When User Calculate income for $1.0
    Then Total Tax to be paid as "$0.11"

  Scenario: $14000 income scenario
    Given Tax Calculator Open
    When User Calculate income for $14000.0
    Then Total Tax to be paid as "$1470"

  Scenario: $14001 income scenario
    Given Tax Calculator Open
    When User Calculate income for $14001.0
    Then Total Tax to be paid as "$2450.17"


  Scenario: $48000 income scenario
    Given Tax Calculator Open
    When User Calculate income for $48000.0
    Then Total Tax to be paid as "$8400"

  Scenario: $48001 income scenario
    Given Tax Calculator Open
    When User Calculate income for $48001.0
    Then Total Tax to be paid as "$14400.3"

  Scenario: $70000 income scenario
    Given Tax Calculator Open
    When User Calculate income for $70000.0
    Then Total Tax to be paid as "$21000"

  Scenario: $70001 income scenario
    Given Tax Calculator Open
    When User Calculate income for $70001.00
    Then Total Tax to be paid as "$23100.33"

  Scenario: $180000 income scenario
    Given Tax Calculator Open
    When User Calculate income for $180000.0
    Then Total Tax to be paid as "$59400"

  Scenario: $180001 income scenario
    Given Tax Calculator Open
    When User Calculate income for $180001.0
    Then Total Tax to be paid as "$70200.39"


