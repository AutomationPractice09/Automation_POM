package orangeHRM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class A01_LoginPage 
{
	
	private WebDriver driver;
	
	public A01_LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//private locators
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	
	
	//public methods
	public String getURL()
	{
		String URL = driver.getCurrentUrl();
		return URL;
	}
	
	public String doLogin()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		
		String URL1 = driver.getCurrentUrl();
		return URL1;
	}

}
