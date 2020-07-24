@Regression
Feature: Successful

 @successfulSignUp
 Scenario: Successful
  Given The device is setted and the application called "SarufuTest" is opened
 And Open the application and click on Login button
 And Select the Country
 When Enter the Valid username and password
 And Click on login button
 Then Verify the Dashboard
 And Now Logout from the APP

