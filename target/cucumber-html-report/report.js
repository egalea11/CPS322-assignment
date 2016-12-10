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
  "duration": 5841376877,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_valid_credentials()"
});
formatter.result({
  "duration": 10040578873,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"name\",\"selector\":\"username\"}\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.03 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027DESKTOP-QC5JN8P\u0027, ip: \u0027192.168.208.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf), userDataDir\u003dC:\\Users\\ETIENN~1\\AppData\\Local\\Temp\\scoped_dir6464_2104}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d027a394e2ca1815e240bfa4dd7331f3\n*** Element info: {Using\u003dname, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_login_using_valid_credentials(StepDefinitions.java:35)\r\n\tat ✽.When I login using valid credentials(feature/cps3222.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.i_should_be_taken_to_my_account_admin_page()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 4153382642,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_login_using_invalid_credentials()"
});
formatter.result({
  "duration": 1904774,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_login_using_invalid_credentials(StepDefinitions.java:48)\r\n\tat ✽.When I login using invalid credentials(feature/cps3222.feature:10)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_an_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_should_remain_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 316037,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_am_a_logged_in_affiliate(StepDefinitions.java:66)\r\n\tat ✽.Given I am a logged in affiliate(feature/cps3222.feature:15)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_visit_my_account_admin_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_my_balance()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_should_see_a_button_allowing_me_to_withdraw_my_balance()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 342979,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_am_a_logged_in_affiliate(StepDefinitions.java:66)\r\n\tat ✽.Given I am a logged in affiliate(feature/cps3222.feature:21)\r\n",
  "status": "pending"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 428082,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_am_a_logged_in_affiliate(StepDefinitions.java:66)\r\n\tat ✽.Given I am a logged in affiliate(feature/cps3222.feature:21)\r\n",
  "status": "pending"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 368211,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_am_a_logged_in_affiliate(StepDefinitions.java:66)\r\n\tat ✽.Given I am a logged in affiliate(feature/cps3222.feature:21)\r\n",
  "status": "pending"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 349395,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat cps3222.cucumberDemo.StepDefinitions.i_am_a_logged_in_affiliate(StepDefinitions.java:66)\r\n\tat ✽.Given I am a logged in affiliate(feature/cps3222.feature:21)\r\n",
  "status": "pending"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_try_to_withdraw_my_balance()"
});
formatter.result({
  "status": "skipped"
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
});