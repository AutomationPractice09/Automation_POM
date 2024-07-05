package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A05_OverviewTest extends A00_BaseClass
{
	
	@BeforeClass
	public void pageSetup()
	{
		lp.login("standard_user", "secret_sauce");
		ip.addToCart("Sauce Labs Fleece Jacket");
		ip.cartPage();
		cp.checkoutPro();
		co.continuecheck("Digvijay", "Patil", "987456");
	}
	
  @Test(priority = 1)
  public void getDetails() 
  {
	  op.getDetails();
  }
  
  
  @Test(priority = 2)
  public void finish() 
  {
	  op.finish();
  }
}
