@login
Feature: login feature
  As a customer
  I want to login to the login functionality to check my login details
  Scenario: login with valid credential
    Given I am on login page
    When I click on login button
    Then I shoud see "Welcome, Please Sign In!" text on login page
    And I shoud see "/login" text in url