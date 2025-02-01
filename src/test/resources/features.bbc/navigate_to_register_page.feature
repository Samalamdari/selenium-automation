Feature: Navigate to bbc web page

  Background:
    Given I am on the bbc web page

  Scenario: Navigate to bbc web page to click on register
    When I will click on the register button
    Then I should see the register page