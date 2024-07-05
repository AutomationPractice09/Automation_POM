package swagLabs02_Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import swagLabs01_Pages.*;

public class A00_BaseClass 
{
	
	public WebDriver driver;
	public A01_LoginPage lp;
	public A02_InventoryPage ip;
	public A03_CartPage cp;
	public A04_CheckoutPage co;
	public A05_OverviewPage op;
	
	@BeforeTest
	public void setupBrow()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp = new A01_LoginPage(driver);
		ip = new A02_InventoryPage(driver);
		cp = new A03_CartPage(driver);
		co = new A04_CheckoutPage(driver);
		op = new A05_OverviewPage(driver);
	}
	
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
