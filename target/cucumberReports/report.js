$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/OAuthTestAuthentication.feature");
formatter.feature({
  "name": "Feature to test OAuth 2.0 Authentication",
  "description": "  I want to use this template for OAuth 2.0 Authentication",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@OAuthAuthentication"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@OAuthAuthentication"
    },
    {
      "name": "@OAuthAuthentication_Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User hits Url to get Authentication Code",
  "keyword": "When "
});
formatter.match({
  "location": "steps.OAuth.user_hits_Url_to_get_Authentication_Code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls getTokenAPI with POST HTTP request to send back Authentication Code and to get the Access Token",
  "keyword": "And "
});
formatter.match({
  "location": "steps.OAuth.user_calls_getTokenAPI_with_POST_HTTP_request_to_send_back_Authentication_Code_and_to_get_the_Access_Token()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls getCourseAPI with GET HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "steps.OAuth.user_calls_getCourseAPI_with_GET_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.OAuth.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/PlaceValidationE2E.feature");
formatter.feature({
  "name": "Validate Place APIs feature",
  "description": "  I want to use this template to Validate Place APIs feature",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@PlaceValidationE2E"
    }
  ]
});
formatter.scenario({
  "name": "Add Place using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@PlaceValidationE2E"
    },
    {
      "name": "@PlaceValidationE2E_AddPlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is provided with BaseUrl and common Query Parameter",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.PlaceValidation.user_is_provided_with_BaseUrl_and_common_Query_Parameter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"addPlaceAPI\" with \"POST\" HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PlaceValidation.user_calls_with_HTTP_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify API call response is Success with status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PlaceValidation.verify_API_call_response_is_Success_with_status_code_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in \"POST\" response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.PlaceValidation.in_response_body_is(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify Response using getPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PlaceValidationE2E_GetPlace"
    }
  ]
});
formatter.step({
  "name": "User is provided with BaseUrl and common Query Parameter",
  "keyword": "Given "
});
formatter.step({
  "name": "User calls \"getPlaceAPI\" with \"GET\" HTTP request",
  "keyword": "When "
});
formatter.step({
  "name": "Verify API call response is Success with status code as 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"name\" in \"GET\" response body is \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"language\" in \"GET\" response body is \"\u003clanguage\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "language",
        "name"
      ]
    },
    {
      "cells": [
        "French-IN",
        "Frontline house"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Response using getPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@PlaceValidationE2E"
    },
    {
      "name": "@PlaceValidationE2E_GetPlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is provided with BaseUrl and common Query Parameter",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.PlaceValidation.user_is_provided_with_BaseUrl_and_common_Query_Parameter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"getPlaceAPI\" with \"GET\" HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PlaceValidation.user_calls_with_HTTP_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify API call response is Success with status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PlaceValidation.verify_API_call_response_is_Success_with_status_code_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"name\" in \"GET\" response body is \"Frontline house\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.PlaceValidation.in_response_body_is(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"language\" in \"GET\" response body is \"French-IN\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.PlaceValidation.in_response_body_is(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Update Place using UpdatePlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PlaceValidationE2E_UpdatePlace"
    }
  ]
});
formatter.step({
  "name": "User is provided with BaseUrl and common Query Parameter",
  "keyword": "Given "
});
formatter.step({
  "name": "User calls \"updatePlaceAPI\" with \"PUT\" HTTP request",
  "keyword": "When "
});
formatter.step({
  "name": "Verify API call response is Success with status code as 200",
  "keyword": "Then "
});
formatter.step({
  "name": "User calls \"getPlaceAPI\" with \"GET\" HTTP request",
  "keyword": "When "
});
formatter.step({
  "name": "\"address\" in \"GET\" response body is \"\u003caddress\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "address"
      ]
    },
    {
      "cells": [
        "India"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Update Place using UpdatePlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@PlaceValidationE2E"
    },
    {
      "name": "@PlaceValidationE2E_UpdatePlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is provided with BaseUrl and common Query Parameter",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.PlaceValidation.user_is_provided_with_BaseUrl_and_common_Query_Parameter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"updatePlaceAPI\" with \"PUT\" HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PlaceValidation.user_calls_with_HTTP_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify API call response is Success with status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PlaceValidation.verify_API_call_response_is_Success_with_status_code_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"getPlaceAPI\" with \"GET\" HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PlaceValidation.user_calls_with_HTTP_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"address\" in \"GET\" response body is \"India\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PlaceValidation.in_response_body_is(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Place using DeletePlaceAPI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@PlaceValidationE2E"
    },
    {
      "name": "@PlaceValidationE2E_DeletePlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is provided with BaseUrl and common Query Parameter",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.PlaceValidation.user_is_provided_with_BaseUrl_and_common_Query_Parameter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"deletePlaceAPI\" with \"DELETE\" HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PlaceValidation.user_calls_with_HTTP_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify API call response is Success with status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PlaceValidation.verify_API_call_response_is_Success_with_status_code_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in \"DELETE\" response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.PlaceValidation.in_response_body_is(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});