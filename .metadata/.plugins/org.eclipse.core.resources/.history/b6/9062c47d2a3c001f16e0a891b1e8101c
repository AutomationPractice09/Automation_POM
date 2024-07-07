package swagLabs01_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class A01_LoginPage 
{
	
	private WebDriver driver;
	
	//initialize browser
	public A01_LoginPage(WebDriver driver)     //this driver comes from base class
	{
		this.driver = driver;
	}
	
	
	//private locators
	private By un = By.id("user-name");
	private By pwd = By.id("password");
	private By btn = By.id("login-button");
	
	
	//public methods
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String login(String usnm, String pswd)
	{
		driver.findElement(un).sendKeys(usnm);
		driver.findElement(pwd).sendKeys(pswd);
		driver.findElement(btn).click();
		return driver.getCurrentUrl();
	}

	
	
}
