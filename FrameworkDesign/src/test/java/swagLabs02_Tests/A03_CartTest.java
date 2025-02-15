package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A03_CartTest extends A00_BaseClass
{
	@BeforeClass
	public void pagesetup()
	{
		lp.login(pr.getData("un"),pr.getData("pwd"));
		ip.addToCart(pr.getData("product1"));
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
	  ip.addToCart(pr.getData("product2"));
	  ip.cartPage();
  }
  
  @Test(priority=4)
  public void checkoutPro() 
  {
	  cp.checkoutPro();
  }
}
