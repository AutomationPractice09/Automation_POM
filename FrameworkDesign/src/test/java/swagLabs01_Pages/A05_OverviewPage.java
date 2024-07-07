package swagLabs01_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import swagLabs00_Utility.A02_Screenshots;

public class A05_OverviewPage 
{
	
	private WebDriver driver;
	
	public A05_OverviewPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//private locators/Data
	private By desc = By.id("checkout_summary_container");
	private By cancel = By.id("cancel");
	private By finish = By.id("finish");
	private By heading = By.xpath("//h2[@class='complete-header']");
	
	
	//public methods
	public void getDetails()
	{
		String details = driver.findElement(desc).getText();
		System.out.println(details);
	}
	
	public void cancelOrder()
	{
		driver.findElement(cancel).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"TC is Failed as URL is not Matching");
		System.out.println("TC is Passed as URL is Matching");
	}
	
	public void finish()
	{
		driver.findElement(finish).click();
		String head = driver.findElement(heading).getText();
		Assert.assertTrue(head.contains("Thank you"),"TC is Failed as heading is not matching");
		System.out.println(head);
		A02_Screenshots.screenshot(driver,"Screenshots","finish5");
		System.out.println("TC is Passed as Heading is Matching");
	}

}
