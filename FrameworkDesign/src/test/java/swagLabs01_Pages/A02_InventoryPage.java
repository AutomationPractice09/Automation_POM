package swagLabs01_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import swagLabs00_Utility.A02_Screenshots;

public class A02_InventoryPage 
{
	
	private WebDriver driver;
	
	//initialize browser
	public A02_InventoryPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//private locators/data
	private By item = By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By addCart = By.id("add-to-cart");
	private By cart = By.xpath("//a[@class='shopping_cart_link']");
	
	
	//public methods
	public void getCount()
	{
		List<WebElement> ele = driver.findElements(item);
		int count = ele.size();
		Assert.assertEquals(6, count,"TC is Failed as Count is not matched");
		System.out.println("TC is Passed as Count is Matching");
	}
	
	
	public void getProdNames()
	{
		List<WebElement> ele = driver.findElements(item);
		
		System.out.println("");
		System.out.println("Below are List of Items");
		
		for(WebElement i:ele)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public void addToCart(String product)
	{
		List<WebElement> ele = driver.findElements(item);
		
		System.out.println("");
		System.out.println("Item to be select");
		
		for(WebElement i:ele)
		{
			if(i.getText().equalsIgnoreCase(product))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(addCart).click();
		System.out.println(product+" is added to cart");
		A02_Screenshots.screenshot(driver, "Screenshots","addCart2");
	}

	
	public void cartPage()
	{
		driver.findElement(cart).click();
	}
}
