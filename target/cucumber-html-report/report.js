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
  "duration": 7508000765,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_valid_credentials()"
});
formatter.result({
  "duration": 467218825,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_be_taken_to_my_account_admin_page()"
});
formatter.result({
  "duration": 50708216,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Unsuccessful Affiliate Login",
  "description": "",
  "id": "web-application;unsuccessful-affiliate-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am an affiliate trying to log in",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login using invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see an error message",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should remain on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_an_affiliate_trying_to_log_in()"
});
formatter.result({
  "duration": 3156469186,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_invalid_credentials()"
});
formatter.result({
  "duration": 466506781,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_an_error_message()"
});
formatter.result({
  "duration": 49767378,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_remain_on_the_login_page()"
});
formatter.result({
  "duration": 1237980891,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Account Admin Page Contents",
  "description": "",
  "id": "web-application;account-admin-page-contents",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am a logged in affiliate",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I visit my account admin page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see my balance",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I should see a button allowing me to withdraw my balance",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_a_logged_in_affiliate()"
});
formatter.result({
  "duration": 3019717415,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_visit_my_account_admin_page()"
});
formatter.result({
  "duration": 36821864,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_my_balance()"
});
formatter.result({
  "duration": 27473347,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_button_allowing_me_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 29614184,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Withdrawals",
  "description": "",
  "id": "web-application;withdrawals;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I am a logged in affiliate",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "my balance is 4.99",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I try to withdraw my balance",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should see a message indicating error",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "my new balance will be 4.99",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_a_logged_in_affiliate()"
});
formatter.result({
  "duration": 3024077347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    },
    {
      "val": "99",
      "offset": 16
    }
  ],
  "location": "StepDefinitions.my_balance_is(int,int)"
});
formatter.result({
  "duration": 3207405,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 26515,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_message_indicating_error()"
});
formatter.result({
  "duration": 29080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 23
    },
    {
      "val": "99",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.my_new_balance_will_be(int,int)"
});
formatter.result({
  "duration": 121881,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Withdrawals",
  "description": "",
  "id": "web-application;withdrawals;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I am a logged in affiliate",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "my balance is 5.00",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I try to withdraw my balance",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should see a message indicating success",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "my new balance will be 0.00",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_a_logged_in_affiliate()"
});
formatter.result({
  "duration": 3343253908,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    },
    {
      "val": "00",
      "offset": 16
    }
  ],
  "location": "StepDefinitions.my_balance_is(int,int)"
});
formatter.result({
  "duration": 162937,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 210406,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    },
    {
      "val": "00",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.my_new_balance_will_be(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "Withdrawals",
  "description": "",
  "id": "web-application;withdrawals;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I am a logged in affiliate",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "my balance is 0.00",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I try to withdraw my balance",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should see a message indicating error",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "my new balance will be 0.00",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_a_logged_in_affiliate()"
});
formatter.result({
  "duration": 3131787137,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 14
    },
    {
      "val": "00",
      "offset": 16
    }
  ],
  "location": "StepDefinitions.my_balance_is(int,int)"
});
formatter.result({
  "duration": 121026,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 21810,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_message_indicating_error()"
});
formatter.result({
  "duration": 56023,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    },
    {
      "val": "00",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.my_new_balance_will_be(int,int)"
});
formatter.result({
  "duration": 459728,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Withdrawals",
  "description": "",
  "id": "web-application;withdrawals;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I am a logged in affiliate",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "my balance is 142.12",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I try to withdraw my balance",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should see a message indicating success",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "my new balance will be 0.00",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_a_logged_in_affiliate()"
});
formatter.result({
  "duration": 3009565337,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "142",
      "offset": 14
    },
    {
      "val": "12",
      "offset": 18
    }
  ],
  "location": "StepDefinitions.my_balance_is(int,int)"
});
formatter.result({
  "duration": 241197,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 47042,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    },
    {
      "val": "00",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.my_new_balance_will_be(int,int)"
});
formatter.result({
  "status": "skipped"
});
});