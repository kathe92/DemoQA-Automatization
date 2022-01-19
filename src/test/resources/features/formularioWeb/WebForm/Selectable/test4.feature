Feature: Test selectable
  As a user of DemoQA website,
  I should be able to select items in the List and Grid tab of the website
  And I should be able to deselect items in the List and Grid tab of the website

  Scenario: The user select items in the list and then deselect it
    Given The user search for the List tab
    When The user click on the first item of the list
    When The user click on the second item of the list
    When The user click on the third item of the list
    When The user wait 1 second
    When The user deselects all items
    Then The system show all items deselect

  Scenario: The user select items in the grid and then deselect it
    Given The user search for the Grid tab
    When The user click on the item One of the list
    When The user click on the item Five of the list
    When The user click on the item Nine of the list
    When The user wait 3 seconds
    When The user click on the item Nine of the list again
    When The user click on the item Five of the list again
    When The user click on the item One of the list again
    Then The system show the items deselect