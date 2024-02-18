Feature: Search Functionality
Scenario: User search for a valid product

Given User is on home page
When User search for a valid product "HP" on search box
And User click on search button
Then User should get valid search product

Scenario: User search for a invalid product

Given User is on home page
When User search for a invalid product "Honda" on search box
And User click on search button
Then User should  get a message about no product match