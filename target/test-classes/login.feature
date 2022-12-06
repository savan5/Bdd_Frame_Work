@login
Feature: login feature
  As a customer
  I want to login to the login functionality to check my login details
  Scenario: Validate Login Page
    Given I am on login page
    When I click on login button
    Then I shoud see "Welcome, Please Sign In!" text on login page
    And I shoud see "/login" text in url

    Scenario: Login With Valid Credential
      Given I am on home page
      When I click on login button
      And I enter valid email "komal123@gmail.com"
      And I enter valid password "123456"
      And I click on login button on login page
      Then I shoud see logout button displayed