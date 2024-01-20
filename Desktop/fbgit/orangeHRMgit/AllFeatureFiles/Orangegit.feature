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

Scenario: Check Employee Details

When user is on PIM page
And Click Add Employee 
And Enter Creditionals of new Employee
And Click on save Button