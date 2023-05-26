
Feature: Log In Automation Exercise
  @login
  Scenario Outline: Positive Log in Test
    Given The user is on the home page
    When The user navigates to sign-log in page
    Then The user should be able to see "Login to your account" text
    When The user enters correct "<email>" and "<password>"
    Then The welcome message contains "<username>"

    Examples:
    |      email                 |      password       |   username  |
    | marquis1@gmail.com         |      test123        |   marquis   |