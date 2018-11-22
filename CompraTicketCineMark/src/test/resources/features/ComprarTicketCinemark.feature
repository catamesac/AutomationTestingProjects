#Author: Catalina, Malory, Daniel

Feature: Comprar boleto de Pelicula en Cinemark
  Como usuario quiero seleccionar una pelicula y comprar boleto en Cinemark

  Scenario: Compra exitosa
    Given Que puedo acceder a Cinemark
    When busco la pelicula "Una entrevista con Dios" y la selecciono
    Then Compro boletos para la pelicula
