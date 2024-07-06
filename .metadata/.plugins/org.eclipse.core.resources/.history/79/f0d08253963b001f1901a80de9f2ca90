package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A03_CartTest extends A00_BaseClass
{
	@BeforeClass
	public void pagesetup()
	{
		lp.login("standard_user", "secret_sauce");
		ip.addToCart("Sauce Labs Fleece Jacket");
		ip.cartPage();
	}
	
  @Test(priority=1)
  public void prodDesc() 
  {
	 cp.prodDesc(); 
  }
  
  @Test(priority=2)
  public void remProd() 
  {
	  cp.remProd();
  }
  
  @Test(priority=3)
  public void continueShop() 
  {
	  cp.continueShop();
	  ip.addToCart("Sauce Labs Fleece Jacket");
	  ip.cartPage();
  }
  
  @Test(priority=4)
  public void checkoutPro() 
  {
	  cp.checkoutPro();
  }
}
