package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OAuth_OB {
	
	WebDriver driver;
	
	@FindBy(how = How.CSS, using = "#identifierId")
	public WebElement email_ob;
	
	@FindBy(how = How.CSS, using = "#identifierNext > div > button")
	public WebElement email_next_button_ob;
	
	@FindBy(how = How.CSS, using = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
	public WebElement password_ob;
	
	@FindBy(how = How.CSS, using = "#passwordNext > div > button")
	public WebElement password_next_button_ob;
	
	public OAuth_OB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
