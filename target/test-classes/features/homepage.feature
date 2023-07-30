Feature: Homepage

  Background:
    Given I am on the login page
    When I enter my username "rahulshettyacademy" and password "learning"
    And I click the login button
    Then I should be logged in

  @homepage
  Scenario: Verify elements on the homepage
    Given I am on the homepage
    Then I should see the homepage elements

  @homepage
  Scenario: Verify navigation to other pages from the homepage
    Given I am on the homepage
    When I click on a navigation link
    Then I should be redirected to the corresponding page