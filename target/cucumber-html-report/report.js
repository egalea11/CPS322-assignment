$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/cps3222.feature");
formatter.feature({
  "line": 1,
  "name": "Web application",
  "description": "",
  "id": "web-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Affiliate Login",
  "description": "",
  "id": "web-application;successful-affiliate-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am an affiliate trying to log in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login using valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should be taken to my account admin page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_am_an_affiliate_trying_to_log_in()"
});
formatter.result({
  "duration": 4636630017,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_valid_credentials()"
});
