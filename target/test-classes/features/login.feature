Feature: Login

  @smokeTest
  Scenario Outline: Successful login
    Given I am on the login page
    When I enter my username "<username>" and password "<password>"
    And I click the login button
    Then I should be logged in

    Examples:
      | username           | password |
      | rahulshettyacademy | learning |


  @smokeTest
  Scenario Outline: Unsuccessful login
    Given I am on the login page
    When I enter an incorrect username "<username>" or password "<password>"
    And I click the login button
    Then I should see an error message

    Examples:
      | username           | password           |
      | incorrect_username | incorrect_password |