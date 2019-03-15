#Author: Gowthaman

Feature: To test add customer

  Scenario: Add Customer
    Given The user is in add customer page
    When The user fill in the customer details
    And The user clicks the submit button
    Then The user should see the success message
    And The user should see the customer ID
    