package pages;

import org.openqa.selenium.WebDriver;

import objects.OAuth_OB;
import utility.CommonFunctions;

public class OAuth_BC {
	
	WebDriver driver;
	CommonFunctions commonFunctions;
	OAuth_OB oAuth_OB;
	
	private static String authorization_code;
	public static String response_POST;
	public static String response_GET;
	public static String access_token;
	
	public OAuth_BC(WebDriver driver) {
		commonFunctions = new CommonFunctions(driver);
		this.driver = driver;
		oAuth_OB = new OAuth_OB(driver);
	}
	
	public String user_hits_url_and_enters_details() throws Exception {

		String base_url = "https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=testState";

		driver.get(base_url);

		// Enter Id
		oAuth_OB.email_ob.sendKeys("avikthetester@gmail.com");
		oAuth_OB.email_next_button_ob.click();
		Thread.sleep(4000);

		// Enter Password
		oAuth_OB.password_ob.sendKeys("Avik1988TheTester");
		oAuth_OB.password_next_button_ob.click();
		Thread.sleep(4000);

		// Enter Phone Number
//		driver.findElement(By.cssSelector("#phoneNumberId"))
//				.sendKeys("9007079853");
//		driver.findElement(By.cssSelector("#idvanyphonecollectNext > div > button")).click();
//		Thread.sleep(4000);

		String url = driver.getCurrentUrl();

		// get the autorization code from the url fetched
		String partial_code_1_index = url.split("&code=")[1];
		authorization_code = partial_code_1_index.split("&scope=")[0];
		System.out.println("authorization_code ----> " + authorization_code);
		return authorization_code;

	}
	
	
}
