Feature: Update a field of a row of the table
  As a user of DemoQA website,
  I should be able to update the "Department" field of the table

  Scenario: Update the department field of the table
    Given The user searches for the first row in the table located in the section Web Tables
    When The user searches for the department stored in the first row
    When The user click on the Edit button of the first row
    When The user enter a new department
    When The user click on Save button
    Then The record was updated