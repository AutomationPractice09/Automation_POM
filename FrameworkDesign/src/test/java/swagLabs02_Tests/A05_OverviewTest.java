package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A05_OverviewTest extends A00_BaseClass
{
	
	@BeforeClass
	public void pageSetup()
	{
		lp.login(pr.getData("un"),pr.getData("pwd"));
		ip.addToCart(pr.getData("product1"));
		ip.cartPage();
		cp.checkoutPro();
		co.continuecheck(pr.getData("fname"),pr.getData("lname"),pr.getData("zip"));
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
