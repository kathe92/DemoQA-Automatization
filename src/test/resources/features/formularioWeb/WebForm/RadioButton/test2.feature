Feature: Change radio button
  As a user of DemoQA website,
  I should be able to see a confirmation message of the active radio button when I click on it
  And the confirmation message will change when I click on another radio button

  Scenario: The user click on Yes radio button
    Given The user search for the Yes radio button in the section Elements-Radio Button
    When The user click on Yes radio button
    Then The system show a the message You have selected Yes


  Scenario: The user click on Impressive radio button
    Given The user search for the Impressive radio button in the section Elements-Radio Button
    When The user first click on Yes radio button
    And The user later click on Impressive radio button
    Then The system show a the message You have selected Impressive
