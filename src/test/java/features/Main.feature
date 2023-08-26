Feature: Main page
  Scenario: Go to obilet main page and check the buttons
    When check the bus button
    Then check the plane button
    Then check the hotel button
    Then check the car button
    Then check the ferryboat button

    Scenario: Go to plane page and check the texts
      When click plane button
      Then click find ticket button
      Then check morning button
      Then check noon button
      Then check evening button