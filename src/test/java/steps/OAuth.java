package steps;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.When;

import pages.OAuth_BC;

public class OAuth {
	

	private static String authorization_code;
	public static String response_POST;
	public static String response_GET;
	public static String access_token;
	

	@When("User hits Url to get Authentication Code")
	public void user_hits_Url_to_get_Authentication_Code() throws Throwable {
		
		Base.setDriver();
		WebDriver driver = Base.getDriver();
		
		OAuth_BC oAuth_BC = new OAuth_BC(driver);
		
		authorization_code = oAuth_BC.user_hits_url_and_enters_details();
	}

	@When("User calls getTokenAPI with POST HTTP request to send back Authentication Code and to get the Access Token")
	public void user_calls_getTokenAPI_with_POST_HTTP_request_to_send_back_Authentication_Code_and_to_get_the_Access_Token() {

		response_POST = given().urlEncodingEnabled(false).queryParams("code", authorization_code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();

		access_token = Base.getJsonPath(response_POST, "access_token");
		System.out.println("access_token ---> " + access_token);
		System.out.println();

	}

	@When("User calls getCourseAPI with GET HTTP request")
	public void user_calls_getCourseAPI_with_GET_HTTP_request() {

		response_GET = given().queryParams("access_token", access_token).when()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();

		System.out.println("getCourseAPI response ---> ");
		System.out.println();
		System.out.println();
		System.out.println(response_GET);

	}

	@When("Close browser")
	public void close_browser() {
		Base.closeBrowser();
	}

}
