package swagLabs02_Tests;

import org.testng.annotations.*;
import org.testng.Assert;

public class A01_LoginTest extends A00_BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  String url = lp.getUrl();
	  Assert.assertTrue(url.contains("demo"),"TC is failed");
	  System.out.println("TC is Passed");
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title = lp.getTitle();
	  Assert.assertTrue(title.contains("Labs"),"TC is failed");
	  System.out.println("TC is Passed");
  }
  
  @Test(priority=3)
  public void login() 
  {
	  String pgurl = lp.login(pr.getData("un"),pr.getData("pwd"));
	  Assert.assertTrue(pgurl.contains("inventory"),"TC is failed");
	  System.out.println("TC is Passed");
  }
}
