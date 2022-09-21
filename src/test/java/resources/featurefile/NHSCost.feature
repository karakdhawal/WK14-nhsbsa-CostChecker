Feature: NHS Cost checker Test
  As user I want to check NHS Cost

  Scenario: The treatment a person from Wales can get with NHS UK
    Given I am on NHS cost check Home page
    When I click on Start now
    And I click on Wales Radio Button
    And I click on Next Button
    Then I am on GP practice page
    And I click on Yes Radio Button
    And I click on Next Button
    Then I am on Dental Practice page
    And I click on Wales Radio Button
    And I click on Next Button
    Then I am on Date of Birth Page
    And I enter date of birth
    And I click on Next Button
    Then I am on Partner page
    And I click on Yes Radio Button
    And I click on Next Button
    Then I am on Benefits page
    And I click on No radio Button
    And I click on Next Button
    Then I am on Pregnant page
    And I click on No radio Button
    And I click on Next Button
    Then I am was pensioner page
    And I click on No radio Button
    And I click on Next Button
    Then I am on Diabetes Page
    And I click on No radio Button
    And I click on Next Button
    Then I am on Glaucoma page
    And I click on No radio Button
    And I click on Next Button
    Then I am on CareHome Page
    And I click on No radio Button
    And I click on Next Button
    Then I am on Savings page
    And I click on Yes Radio Button
    And I click on Next Button
    Then I can see the result

Scenario: The treatment a person from Northern Ireland can get with NHS UK
  Given I am on NHS cost check Home page
  When I click on Start now
  And I click on Northern Ireland Radio Button
  And I click on Next Button
  Then I can see the Norther Ireland Result



