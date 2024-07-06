package orangeHRM_PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A02_LoginTest extends A00_BaseClass
{
  @Test (priority=1)
  public void verifyURL() 
  {
	  String url = lp.getURL();
	  Assert.assertTrue(url.contains("orangehrmlive"),"TC is Failed");
	  System.out.println("TC is Passed");
  }
  
  
  @Test (priority=2)
  public void doLogin() 
  {
	  String url1 = lp.doLogin();
	  Assert.assertTrue(url1.contains("dashboard"),"TC is Failed");
	  System.out.println("TC is Passed");
  }
  
}
