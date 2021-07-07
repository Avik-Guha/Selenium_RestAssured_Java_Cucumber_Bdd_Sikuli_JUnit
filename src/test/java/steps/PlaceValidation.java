package steps;

import static io.restassured.RestAssured.given;

import apiResources.ApiResources;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import junit.framework.Assert;
import utility.TestDataBuild;
import utility.Utils;

@SuppressWarnings("deprecation")
public class PlaceValidation {

	private RequestSpecification given_body;
	private RequestSpecification requestSpecBuilder;
	private Response res;
	public static String response_POST;
	public static String response_GET;
	public static String response_PUT;
	public static String response_DELETE;
	public static String recordID = null;
	public ApiResources KEY;
	public ApiResources key;

	TestDataBuild testDataBuild = new TestDataBuild();

	@Given("User is provided with BaseUrl and common Query Parameter")
	public void user_is_provided_with_BaseUrl_and_common_Query_Parameter() throws Exception {
		requestSpecBuilder = given().spec(Utils.requestSpecification());
	}

	@When("User calls {string} with {string} HTTP request")
	public void user_calls_with_HTTP_request(String resource, String method) throws Exception {

		ApiResources apiResources = ApiResources.valueOf(resource); // this step fetches value from the enum class

		if (method.equalsIgnoreCase("POST")) {

			given_body = requestSpecBuilder.body(testDataBuild.addPlacePayLoad());
			res = given_body.when().post(apiResources.getResource());
			response_POST = res.asString();

		} else if (method.equalsIgnoreCase("GET")) {
			
			if (recordID == null)
				user_calls_with_HTTP_request("addPlaceAPI", "POST");

			KEY = ApiResources.valueOf("recordID"); // this step fetches value from the enum class

			recordID = Base.getJsonPath(response_POST, KEY.getResource());

			given_body = requestSpecBuilder.queryParam("place_id", recordID);
			res = given_body.when().get(apiResources.getResource());
			response_GET = res.asString();

		} else if (method.equalsIgnoreCase("PUT")) {

			if (recordID == null)
				user_calls_with_HTTP_request("addPlaceAPI", "POST");

			KEY = ApiResources.valueOf("recordID"); // this step fetches value from the enum class
			key = ApiResources.valueOf("key");

			recordID = Base.getJsonPath(response_POST, KEY.getResource());

			given_body = requestSpecBuilder.queryParam("place_id", recordID)
					.body(testDataBuild.updatePlacePayLoad(recordID, key.getResource()));
			res = given_body.when().put(apiResources.getResource());
			response_PUT = res.asString();

		} else if (method.equalsIgnoreCase("DELETE")) {

			if (recordID == null)
				user_calls_with_HTTP_request("addPlaceAPI", "POST");

			KEY = ApiResources.valueOf("recordID"); // this step fetches value from the enum class

			recordID = Base.getJsonPath(response_POST, KEY.getResource());

			given_body = requestSpecBuilder.body("{\r\n" + "\"place_id\":\"" + recordID + "\"}");
			res = given_body.when().delete(apiResources.getResource());
			response_DELETE = res.asString();

		}
	}

	@Then("Verify API call response is Success with status code as {int}")
	public void verify_API_call_response_is_Success_with_status_code_as(Integer int1) {
		Assert.assertEquals(res.getStatusCode(), 200);
	}

	@Then("{string} in {string} response body is {string}")
	public void in_response_body_is(String key, String method, String expected_value) {

		if (method.equalsIgnoreCase("POST")) {

			String actual_value = Base.getJsonPath(response_POST, key);
			Assert.assertEquals(actual_value, expected_value);

		} else if (method.equalsIgnoreCase("GET")) {

			String actual_value = Base.getJsonPath(response_GET, key);
			Assert.assertEquals(actual_value, expected_value);

		} else if (method.equalsIgnoreCase("PUT")) {

			String actual_value = Base.getJsonPath(response_PUT, key);
			Assert.assertEquals(actual_value, expected_value);

		} else if (method.equalsIgnoreCase("DELETE")) {

			String actual_value = Base.getJsonPath(response_DELETE, key);
			Assert.assertEquals(actual_value, expected_value);

		}
	}

}
