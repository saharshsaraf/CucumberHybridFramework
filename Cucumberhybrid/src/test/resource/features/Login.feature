Feature: Login Functionality
Scenario: Login with the valid credentials

Given User has navigated to the login page
When User has enters valid email "amotooricap99@gmail.com" into the email field
And User has enters valid password "12345"
And User clicks on login button
Then User should get successfully login

Scenario: Login with the invalid credentials
Given User has navigated to the login page
When User has enters invalid email "oricap99@gmail.com" into the email field
And User has enters invalid password "123451234"
And User clicks on login button
Then User should get a warning message
