#Author: kta_mesa@yahoo.es
Feature: Google Search
  As a Web User
  I want to use google
  to search somentihing

  Scenario: Search norway northen lights in google
    Given that Antonio open google browser
    When he search Norway Northen lights
    Then he should see the results
