package swagLabs01_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import swagLabs00_Utility.A02_Screenshots;

public class A03_CartPage 
{
	
	private WebDriver driver;
	
	//initialize browser
	public A03_CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//private data/locator
	private By desc = By.xpath("//div[@class='cart_item_label']");
	private By remove = By.xpath("//button[text()='Remove']");
	private By conti = By.id("continue-shopping");
	private By checkout = By.id("checkout");
	
	
	//public methods
	public void prodDesc()
	{
		String descp = driver.findElement(desc).getText();
		System.out.println("Description of Product is: "+descp);
	}
	
	public void remProd()
	{
		driver.findElement(remove).click();
		A02_Screenshots.screenshot(driver,"Screenshots","remove3");
		System.out.println("Product is Removed");
	}
	
	public void continueShop()
	{
		driver.findElement(conti).click();
		System.out.println("Landed on Inventory page");
	}
	
	public void checkoutPro()
	{
		driver.findElement(checkout).click();
		
		A02_Screenshots.screenshot(driver,"Screenshots","checkout4");
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),"TC is failed");
		System.out.println("Landed on Checkout Page");
	}

}
