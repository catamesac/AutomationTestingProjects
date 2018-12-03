#Author: kta_mesa@yahoo.es
#Background: List of steps run before each of the scenarios
Feature: Buy the selected item
  As a Web User
  I want to go to the basket
  to buy the item selected before

  Background: Antonio is logged in
    Given that Antonio goes to the Exito home page
    And he goes to login page
    When he put username and password
      | username          | password      |
      | kta_mesa@yahoo.es | cataMESA2018* |
    Then he should be logged in
    Given that Antonio search a product frome some brand
      | product          |
      | Impresora Lenovo |
    When he select a product
    Then he should add the item to the basket

  Scenario: Buy the item selected
    Given that Antonio go to the basket page
    When he select the shipping address
    And he select the payment option
      | cardName | duesNumber | cardNumber      |
      | 43983144 |          4 | 377815889347825 |
    Then he should make the purchase
