#Author: kta_mesa@yahoo.es
Feature: Select product to buy
  As a Web User
  I want to search some product
  to select someone to buy

  Background: Antonio is logged in
    Given that Antonio goes to the Exito home page
    And he goes to login page
    When he put username and password
      | username          | password      |
      | kta_mesa@yahoo.es | cataMESA2018* |
    Then he should be logged in

  Scenario: Title of your scenario outline
    Given that Antonio search a product frome some brand
      | product          |
      | Impresora Lenovo |
    When he select a product
    Then he should add the item to the basket
