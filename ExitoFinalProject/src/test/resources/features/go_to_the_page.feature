#Author: kta_mesa@yahoo.es
@login
Feature: Go to Exito page
  As a Web User
  I want to go to Exito home page
  to do login

  @tag1 @successLogin @smokeTest
  Scenario: Go to the Exito home page and do login
    Given that Antonio goes to the Exito home page
    And he goes to login page
    When he put username and password
      | username          | password      |
      | kta_mesa@yahoo.es | cataMESA2018* |
    Then he should be logged in

  @tag2 @wrongUsernameAndPassword
  Scenario: Go to the Exito home page and do login
    Given that Antonio goes to the Exito home page
    And he goes to login page
    When he put username and password
      | username              | password |
      | kta_canas@hotmail.com | cataFail |
    Then he should be logged in

  @tag3 @wrongUsername
  Scenario: Go to the Exito home page and do login
    Given that Antonio goes to the Exito home page
    And he goes to login page
    When he put username and password
      | username              | password      |
      | kta_canas@hotmail.com | cataMESA2018* |
    Then he should be logged in

  @tag4 @wrongPassword
  Scenario: Go to the Exito home page and do login
    Given that Antonio goes to the Exito home page
    And he goes to login page
    When he put username and password
      | username          | password |
      | kta_mesa@yahoo.es | cataFail |
    Then he should be logged in
