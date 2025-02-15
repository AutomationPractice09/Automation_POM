package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class A04_CheckoutTest extends A00_BaseClass
{
	@BeforeClass
	public void pageSetup()
	{
		lp.login(pr.getData("un"),pr.getData("pwd"));
		ip.addToCart(pr.getData("product1"));
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
	  co.continuecheck(pr.getData("fname"),pr.getData("lname"),pr.getData("zip"));
  }
}
