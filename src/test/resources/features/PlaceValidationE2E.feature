@Regression 
@PlaceValidationE2E
Feature: Validate Place APIs feature
  I want to use this template to Validate Place APIs feature

  @PlaceValidationE2E_AddPlace
  Scenario: Add Place using AddPlaceAPI
    Given User is provided with BaseUrl and common Query Parameter
    When User calls "addPlaceAPI" with "POST" HTTP request
    Then Verify API call response is Success with status code as 200
    And "status" in "POST" response body is "OK"

  @PlaceValidationE2E_GetPlace
  Scenario Outline: Verify Response using getPlaceAPI
    Given User is provided with BaseUrl and common Query Parameter
    When User calls "getPlaceAPI" with "GET" HTTP request
    Then Verify API call response is Success with status code as 200
    And "name" in "GET" response body is "<name>"
    And "language" in "GET" response body is "<language>"

    Examples: 
      | language  | name            |
      | French-IN | Frontline house |

  @PlaceValidationE2E_UpdatePlace
  Scenario Outline: Update Place using UpdatePlaceAPI
    Given User is provided with BaseUrl and common Query Parameter
    When User calls "updatePlaceAPI" with "PUT" HTTP request
    Then Verify API call response is Success with status code as 200
    When User calls "getPlaceAPI" with "GET" HTTP request
    Then "address" in "GET" response body is "<address>"

    Examples: 
      | address |
      | India   |

  @PlaceValidationE2E_DeletePlace
  Scenario: Delete Place using DeletePlaceAPI
    Given User is provided with BaseUrl and common Query Parameter
    When User calls "deletePlaceAPI" with "DELETE" HTTP request
    Then Verify API call response is Success with status code as 200
    And "status" in "DELETE" response body is "OK"
