Feature: Negative Log in Test
  @negativelogin
  Scenario Outline: Positive Log in Test
    Given The user is on the home page
    When The user navigates to sign-log in page
    Then The user should be able to see "Login to your account" text
    When The user enters incorrect "<email>" and "<password>"
    Then The user should be able to see incorrect credentials warning message

    Examples:
      |      email                 |      password       |
      | marquis1@gmail.com         |      test1234        |