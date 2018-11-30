#Author: kta_mesa@yahoo.es

Feature: Google Translate
  As a web user
  I wanto to use google translate
  to translate words between different languages

  Scenario: Translate from English to Spanish
    Given the susan wants to translate a word
    When she translate the word cheese from English to Spanish
    Then she should see the word queso in the screen
