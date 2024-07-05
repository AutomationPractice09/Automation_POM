package swagLabs01_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class A04_CheckoutPage 
{
	
	private WebDriver driver;
	
	public A04_CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//private data/locators
	private By title = By.xpath("//span[@class='title']");
	private By first = By.id("first-name");
	private By last = By.id("last-name");
	private By zip = By.id("postal-code");
	private By cancel = By.name("cancel");
	private By conti = By.id("continue");
	
	
	//public methods
	public void checkTitle()
	{
		String title1 = driver.findElement(title).getText();
		Assert.assertTrue(title1.contains("Checkout"),"TC is Failed as title is not matching");
		System.out.println("TC is Passed as Title is Matching");
	}
	
	public void cancelCheck()
	{
		driver.findElement(cancel).click();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("cart"),"TC is Failed as Url is not matching");
		System.out.println("TC is Passed as Url is Matching");
	}
	
	public void continuecheck(String fname, String lname, String zipc)
	{
		driver.findElement(first).sendKeys(fname);
		driver.findElement(last).sendKeys(lname);
		driver.findElement(zip).sendKeys(zipc);
		driver.findElement(conti).click();
		
		String url1 = driver.getCurrentUrl();
		Assert.assertTrue(url1.contains("step-two"),"TC is Failed as Url1 is not matching");
		System.out.println("TC is Passed as Url1 is Matching");
	}
}
