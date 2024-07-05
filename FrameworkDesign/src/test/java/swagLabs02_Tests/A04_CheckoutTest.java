package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class A04_CheckoutTest extends A00_BaseClass
{
	@BeforeClass
	public void pageSetup()
	{
		lp.login("standard_user", "secret_sauce");
		ip.addToCart("Sauce Labs Fleece Jacket");
		ip.cartPage();
		cp.checkoutPro();
	}
	
	
  @Test(priority=1)
  public void checkTitle() 
  {
	  co.checkTitle();
  }
  
  @Test(priority=2)
  public void cancelCheckout() 
  {
	  co.cancelCheck();
  }
  
  @Test(priority=3)
  public void continueCheckout() 
  {
	  cp.checkoutPro();
	  co.continuecheck("Digvijay", "Patil", "987123");
  }
}
