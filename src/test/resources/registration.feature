@registration
  Feature: registration feature
    As a customer
    I want to register to check my registration functionality
  Scenario: Valid registration with valid data
    Given I am on home page
    And I click on register button
    When I enter firstname "jemish"
    And I enter last name "bathani"
    And I enter valid email on registration page "jemish123@gmail.com"
    And I enter password on registration page "jemish@123"
    And I confirm password on registration page "jemish@123"
    And I click on register button on registration page
    Then I should see "Your registration completed" on registration page
    And I should see logout button displayed
    Then I should see text "/registerresult" in URL
