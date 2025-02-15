package orangeHRM_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class A00_BaseClass 
{
	
	public WebDriver driver;
	A01_LoginPage lp;
	
	
	@BeforeTest
	public void pageSetup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp = PageFactory.initElements(driver, A01_LoginPage.class);
	}
	

}
