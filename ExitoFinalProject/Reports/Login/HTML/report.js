$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/go_to_the_page.feature");
formatter.feature({
  "name": "Go to Exito page",
  "description": "  As a Web User\n  I want to go to Exito home page\n  to do login",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Go to the Exito home page and do login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@tag1"
    },
    {
      "name": "@successLogin"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Antonio goes to the Exito home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage()"
});
formatter.result({
  "error_message": "net.serenitybdd.core.exceptions.SerenityManagedException: The following error occurred: unknown error: cannot determine loading status\nfrom unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027192.168.1.50\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\SBMEDA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62878}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: e1a902df6a7709e33e90b5cf6b6c0074\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.get(WebDriverFacade.java:181)\r\n\tat net.serenitybdd.core.pages.PageObject.openPageAtUrl(PageObject.java:860)\r\n\tat net.serenitybdd.core.pages.PageObject.open(PageObject.java:761)\r\n\tat net.serenitybdd.core.pages.PageObject.open(PageObject.java:749)\r\n\tat net.serenitybdd.screenplay.actions.OpenPage.performAs(OpenPage.java:22)\r\n\tat net.serenitybdd.screenplay.actions.OpenPage$$EnhancerByCGLIB$$dba123b6.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.actions.OpenPage$$EnhancerByCGLIB$$dba123b6$$FastClassByCGLIB$$785f3e13.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat net.serenitybdd.screenplay.actions.OpenPage$$EnhancerByCGLIB$$dba123b6.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat com.exito.certification.tasks.OpenTheBrowser.performAs(OpenTheBrowser.java:26)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9$$FastClassByCGLIB$$fb78146.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat net.serenitybdd.screenplay.Actor.wasAbleTo(Actor.java:132)\r\n\tat com.exito.certification.stepdefinitions.GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage(GoToThePageStepDefinition.java:40)\r\n\tat ✽.that Antonio goes to the Exito home page(src/test/resources/features/go_to_the_page.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "he goes to login page",
  "keyword": "And "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heGoesToLoginPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he put username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "kta_mesa@yahoo.es",
        "cataMESA2018*"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "GoToThePageStepDefinition.hePutUsernameAndPassword(LoginData\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heShouldBeLoggedIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Go to the Exito home page and do login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@tag2"
    },
    {
      "name": "@wrongUsernameAndPassword"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Antonio goes to the Exito home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: ****** Without connection to access to the Exito Home Page ****** - org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027192.168.1.50\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\SBMEDA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62951}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: fb9d24fb5b3c96b344478e974a1b83ce\n*** Element info: {Using\u003did, value\u003dheader}\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat com.exito.certification.tasks.OpenTheBrowser.performAs(OpenTheBrowser.java:29)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9$$FastClassByCGLIB$$fb78146.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat net.serenitybdd.screenplay.Actor.wasAbleTo(Actor.java:132)\r\n\tat com.exito.certification.stepdefinitions.GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage(GoToThePageStepDefinition.java:40)\r\n\tat ✽.that Antonio goes to the Exito home page(src/test/resources/features/go_to_the_page.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "he goes to login page",
  "keyword": "And "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heGoesToLoginPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he put username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "kta_canas@hotmail.com",
        "cataFail"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "GoToThePageStepDefinition.hePutUsernameAndPassword(LoginData\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heShouldBeLoggedIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Go to the Exito home page and do login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@tag3"
    },
    {
      "name": "@wrongUsername"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Antonio goes to the Exito home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: ****** Without connection to access to the Exito Home Page ****** - org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027192.168.1.50\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\SBMEDA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63018}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: 9392fd8d0aed97a3a603434c85d535eb\n*** Element info: {Using\u003did, value\u003dheader}\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat com.exito.certification.tasks.OpenTheBrowser.performAs(OpenTheBrowser.java:29)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9$$FastClassByCGLIB$$fb78146.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat net.serenitybdd.screenplay.Actor.wasAbleTo(Actor.java:132)\r\n\tat com.exito.certification.stepdefinitions.GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage(GoToThePageStepDefinition.java:40)\r\n\tat ✽.that Antonio goes to the Exito home page(src/test/resources/features/go_to_the_page.feature:28)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "he goes to login page",
  "keyword": "And "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heGoesToLoginPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he put username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "kta_canas@hotmail.com",
        "cataMESA2018*"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "GoToThePageStepDefinition.hePutUsernameAndPassword(LoginData\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heShouldBeLoggedIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Go to the Exito home page and do login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@tag4"
    },
    {
      "name": "@wrongPassword"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Antonio goes to the Exito home page",
  "keyword": "Given "
});
