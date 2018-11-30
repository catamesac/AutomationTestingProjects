#Author: your.email@your.domain.com

@tag
Feature: Buscar en el navegador de google 
yo quiero buscar el tiempo en miami en google

  @tag1
  Scenario: Realizar busqueda en google
    Given Que lanze el navegador de goole
    When Abro la pagina de inicio de google
    Then busco "El tiempo en miami"
 
