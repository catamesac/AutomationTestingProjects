$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/PruebaLoginExito.Feature");
formatter.feature({
  "name": "Do a login in exito page",
  "description": "  I want to do login with username and password in exito page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login in exito page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I navagate to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ]
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ]
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ]
    },
    {
      "cells": [
        "name3",
        "9",
        "success"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login in exito page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I navagate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginExitoSteps.i_navagate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginExitoSteps.i_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginExitoSteps.i_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login in exito page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I navagate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginExitoSteps.i_navagate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginExitoSteps.i_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginExitoSteps.i_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login in exito page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I navagate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginExitoSteps.i_navagate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginExitoSteps.i_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginExitoSteps.i_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
});