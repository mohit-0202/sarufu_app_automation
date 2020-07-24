$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SignUp.feature");
formatter.feature({
  "line": 2,
  "name": "Successful",
  "description": "",
  "id": "successful",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Successful",
  "description": "",
  "id": "successful;successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@successfulSignUp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open the application and click on Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Select the Country",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter the Valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify the Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Now Logout from the APP",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.open_the_application_and_click_on_Login_button()"
});
formatter.result({
  "duration": 754137000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.select_the_Country()"
});
formatter.result({
  "duration": 52400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.enter_the_Valid_username_and_password()"
});
formatter.result({
  "duration": 50500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.click_on_login_button()"
});
formatter.result({
  "duration": 70400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.verify_the_Dashboard()"
});
formatter.result({
  "duration": 59400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.now_Logout_from_the_APP()"
});
formatter.result({
  "duration": 51600,
  "status": "passed"
});
});