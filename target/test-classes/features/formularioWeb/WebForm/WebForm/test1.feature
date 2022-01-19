Feature: Fill the form
  As a user of DemoQA website,
  I should be able to add a new record filled all the required fields in the Web Form
  And I should not be able to add a new record if I don't fill any required field in the Web Form

  Scenario: Fill the form with all the required fields
    Given The user fill all the required fields of the form
    When The user enter First Name
    When The user enter Last Name
    When The user select a gender
    When The user enter a mobile number
    When The user clickon the submit button
    Then The system show a popup with the confirmation of the new record

  Scenario: Try to send the form without filling in data
    Given The user will not fill in any form fields
    When The user click on the submit button
    Then The system not allow send the form and show the required field with red border
