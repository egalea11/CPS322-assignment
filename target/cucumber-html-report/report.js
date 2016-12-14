$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/cps3222.feature");
formatter.feature({
  "line": 1,
  "name": "Web application",
  "description": "",
  "id": "web-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4636219984,
  "status": "passed"
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
  "duration": 490510572,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_valid_credentials()"
});
formatter.result({
  "duration": 230716333,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_be_taken_to_my_account_admin_page()"
});
formatter.result({
  "duration": 29659087,
  "status": "passed"
});
formatter.after({
  "duration": 988753556,
  "status": "passed"
});
formatter.before({
  "duration": 1952768611,
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
  "duration": 318701010,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_invalid_credentials()"
});
formatter.result({
  "duration": 220444512,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_an_error_message()"
});
formatter.result({
  "duration": 25828163,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_remain_on_the_login_page()"
});
formatter.result({
  "duration": 26133080,
  "status": "passed"
});
formatter.after({
  "duration": 828262283,
  "status": "passed"
});
formatter.before({
  "duration": 1956311296,
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
  "duration": 540338249,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_visit_my_account_admin_page()"
});
formatter.result({
  "duration": 27858664,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_my_balance()"
});
formatter.result({
  "duration": 20968730,
  "error_message": "java.lang.AssertionError: expected:\u003c1\u003e but was:\u003c0\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:555)\r\n\tat org.junit.Assert.assertEquals(Assert.java:542)\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_should_see_my_balance(StepDefinitions.java:94)\r\n\tat ✽.Then I should see my balance(feature/cps3222.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_button_allowing_me_to_withdraw_my_balance()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 807846082,
  "status": "passed"
});
formatter.before({
  "duration": 1976060785,
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
  "duration": 572518356,
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
  "duration": 3302344,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 2701918,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_try_to_withdraw_my_balance(StepDefinitions.java:112)\r\n\tat ✽.When I try to withdraw my balance(feature/cps3222.feature:23)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_message_indicating_error()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "duration": 810044651,
  "status": "passed"
});
formatter.before({
  "duration": 1947404547,
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
  "duration": 542690345,
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
  "duration": 191161,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 293799,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_try_to_withdraw_my_balance(StepDefinitions.java:112)\r\n\tat ✽.When I try to withdraw my balance(feature/cps3222.feature:23)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_message_indicating_success()"
});
formatter.result({
  "status": "skipped"
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
formatter.after({
  "duration": 835914297,
  "status": "passed"
});
formatter.before({
  "duration": 1962945920,
  "status": "passed"
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
  "duration": 557635142,
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
  "duration": 179614,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 192872,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_try_to_withdraw_my_balance(StepDefinitions.java:112)\r\n\tat ✽.When I try to withdraw my balance(feature/cps3222.feature:23)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_message_indicating_error()"
});
formatter.result({
  "status": "skipped"
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
formatter.after({
  "duration": 832721004,
  "status": "passed"
});
formatter.before({
  "duration": 1958998246,
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
  "duration": 528107344,
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
  "duration": 253599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "duration": 420812,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_try_to_withdraw_my_balance(StepDefinitions.java:112)\r\n\tat ✽.When I try to withdraw my balance(feature/cps3222.feature:23)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_message_indicating_success()"
});
formatter.result({
  "status": "skipped"
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
formatter.after({
  "duration": 840340087,
  "status": "passed"
});
});