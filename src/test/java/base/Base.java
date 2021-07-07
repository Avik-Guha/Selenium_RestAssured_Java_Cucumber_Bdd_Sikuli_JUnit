package base;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.path.json.JsonPath;

public class Base {

	public static JsonPath js;
	public static String base_URI;
	public static PrintStream log;
	public static WebDriver driver;

	private static File env_json = new File("src\\test\\resources\\testData\\Env.json");
	private static File browser_json = new File("src\\test\\resources\\testData\\Browser.json");
	public static JSONParser parser = new JSONParser();

	public static void setEnv() throws Exception, IOException, ParseException {
		// Method to set environment value

		JSONObject object = (JSONObject) parser.parse(new FileReader(env_json));
		String env = (String) object.get("Env");

		if (env.equals("QA"))
			base_URI = "https://rahulshettyacademy.com";
		else if (env.equals("UAT"))
			base_URI = "https://rahulshettyacademy.com.uat";
		else
			fail("Enter correct env!!! Please check your 'Env.json' file");
	}

	public static void setDriver() throws Exception, IOException, ParseException {
		//Method to set browser driver
		
		JSONObject object = (JSONObject) parser.parse(new FileReader(browser_json));
		String browser = (String) object.get("Browser");
		String headless = (String) object.get("ExecuteInHeadlessMode");
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
	    	ChromeOptions options = new ChromeOptions();
	    	if (headless.contains("true")) {
		    	options.addArguments("--headless");
		    	}
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
	    else if (browser.equals("Firefox")) {
	    	WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
	    }
	    else
	    	fail("Enter correct browser!!! Please check your 'Browser.json' file");
	}

	public static String getEnv() {
		// Method to fetch environment value
		return base_URI;
	}
	
	public static WebDriver getDriver() {
		// Method to fetch driver value
		return driver;
	}

	public static String getJsonPath(String response, String key) {
		// This method accepts String response, converts it in Json
		// Then traverse through the Json to fetch the required key value
		// Returns the value

		js = new JsonPath(response);
		return js.get(key).toString();
	}

	public static PrintStream logSetup() throws Exception {
		// Method to set logger

		log = new PrintStream(new FileOutputStream("logs\\logging.txt"));
		return log;
	}
	
	public static void waitForPageToLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
