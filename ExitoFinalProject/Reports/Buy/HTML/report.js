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
  "status": "passed"
});
formatter.step({
  "name": "he goes to login page",
  "keyword": "And "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heGoesToLoginPage()"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "he should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "GoToThePageStepDefinition.heShouldBeLoggedIn()"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "he select a product",
  "keyword": "When "
});
formatter.match({
  "location": "SelectProductStepDefinition.heSelectAProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he should add the item to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectProductStepDefinition.heShouldAddTheItemToTheBasket()"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "he select the shipping address",
  "keyword": "When "
});
formatter.match({
  "location": "BuyProductStepDefinition.heSelectTheShippingAddress()"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "he should make the purchase",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyProductStepDefinition.heShouldMakeThePurchase()"
});
formatter.result({
  "status": "passed"
});
});