#Author: kta_mesa@yahoo.es

@tag
Feature: Login in new tours page

  @tag1
  Scenario: Login in new tours
    Given The new tours page
    When I fill the user and password field
    And Click the submit button   
    Then I access to a new page
   
 