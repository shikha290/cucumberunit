Feature: guru99
1) Valid Case
2) Invalid Case

@PositiveTesting
Scenario: To Test the Login with valid Credentials
Given I should open the browser and naviagte to the login page of guru99
When Enter Username "<user>"
And Enter Password "<pass>"
Then Click on the loginbutton 
Examples:
|user|pass|
|user|user|
|admin|admin|
#@stands for tags
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
Given I should open the browser and naviagte to the login page of guru99
When Enter Username "Rudraksh"
And Enter Password "Rudraksh"
Then Click on the loginbutton