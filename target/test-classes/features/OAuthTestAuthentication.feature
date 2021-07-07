@Regression
@OAuthAuthentication
Feature: Feature to test OAuth 2.0 Authentication
  I want to use this template for OAuth 2.0 Authentication

  @OAuthAuthentication_Test
  Scenario: Title of your scenario
    When User hits Url to get Authentication Code
    And User calls getTokenAPI with POST HTTP request to send back Authentication Code and to get the Access Token
    And User calls getCourseAPI with GET HTTP request
    And Close browser
    
