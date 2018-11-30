#Author: kta_mesa@yahoo.es

#Background: List of steps run before each of the scenarios

@tag
Feature: Login en Exito
  Quiero ingresar el usuario y la contrasena para ingresar como usuario a la pagina del exito


  Scenario Outline: Login functionality for Exito page
   Given user navigate to exito
    When I enter username as "<username>" and password as "<password>"
    Then Login should be unsuccess 

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |