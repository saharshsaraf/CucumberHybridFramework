Feature: Registration functionality
Scenario: User creates account only with mandatory field

Given User navigates to register account page
When user enters below mandatory fields
|Firstname|Arun|
|Lastname|Motoori|
|Email|Amotoori123@gmail.com|
|Telephone|9123456765|
|Password|12345|
And User select privacy policy
And User click on continue button
Then Users account get created

Scenario: User create an account with all the fields
Given User navigates to register account page
When user enters below mandatory fields
|Firstname|Arun|
|Lastname|Motoori|
|Email|Amotoori123@gmail.com|
|Telephone|9123456765|
|Password|12345|
And User select Yes for newsletter
And User select privacy policy
And User click on continue button
Then Users account get created
