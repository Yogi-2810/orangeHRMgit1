Feature: OrangeHRM

Scenario: Test LoginPage Functionality

Given user is on login page
When user add credentials username and password
And click on login button

Scenario: check homepage functionality

When user click on PIM
And  click on add employee
And user enter firstname and lastname
And click on save button