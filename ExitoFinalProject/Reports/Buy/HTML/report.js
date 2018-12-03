$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/buy_product.feature");
formatter.feature({
  "name": "Buy the selected item",
  "description": "  As a Web User\n  I want to go to the basket\n  to buy the item selected before",
  "keyword": "Feature"
});
formatter.background({
  "name": "Antonio is logged in",
  "description": "",
  "keyword": "Background"
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
  "error_message": "java.lang.AssertionError: ****** Without connection to access to the Exito Home Page ****** - org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\SBMEDA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53646}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: 1bf3a7fe72def32bea201d7a89728264\n*** Element info: {Using\u003did, value\u003dheader}\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat com.exito.certification.tasks.OpenTheBrowser.performAs(OpenTheBrowser.java:29)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9$$FastClassByCGLIB$$fb78146.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.exito.certification.tasks.OpenTheBrowser$$EnhancerByCGLIB$$62c3dbd9.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat net.serenitybdd.screenplay.Actor.wasAbleTo(Actor.java:132)\r\n\tat com.exito.certification.stepdefinitions.GoToThePageStepDefinition.thatAntonioGoesToTheExitoHomePage(GoToThePageStepDefinition.java:40)\r\n\tat ✽.that Antonio goes to the Exito home page(src/test/resources/features/buy_product.feature:9)\r\n",
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
formatter.step({
  "name": "that Antonio search a product frome some brand",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "Impresora Lenovo"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "SelectProductStepDefinition.thatAntonioSearchAProductFromeSomeBrand(TheProduct\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he select a product",
  "keyword": "When "
});
formatter.match({
  "location": "SelectProductStepDefinition.heSelectAProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should add the item to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectProductStepDefinition.heShouldAddTheItemToTheBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Buy the item selected",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that Antonio go to the basket page",
  "keyword": "Given "
});
formatter.match({
  "location": "BuyProductStepDefinition.thatAntonioGoToTheBasketPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he select the shipping address",
  "keyword": "When "
});
formatter.match({
  "location": "BuyProductStepDefinition.heSelectTheShippingAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he select the payment option",
  "rows": [
    {
      "cells": [
        "cardName",
        "duesNumber",
        "cardNumber"
      ]
    },
    {
      "cells": [
        "43983144",
        "4",
        "377815889347825"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BuyProductStepDefinition.heSelectThePaymentOption(PaymentData\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should make the purchase",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyProductStepDefinition.heShouldMakeThePurchase()"
});
formatter.result({
  "status": "skipped"
});
});