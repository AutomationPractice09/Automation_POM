package swagLabs02_Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A02_InventoryTest extends A00_BaseClass
{
	@BeforeClass
	public void pagesetup()
	{
		lp.login(pr.getData("un"),pr.getData("pwd"));
	}
	
  @Test(priority = 1)
  public void getCount() 
  {
	  ip.getCount();
  }
  
  @Test(priority = 2)
  public void getprodNames() 
  {
	  ip.getProdNames();
  }
  
  @Test(priority = 3)
  public void addCart() 
  {
	  ip.addToCart(pr.getData("product1"));
  }
  
  @Test(priority = 4)
  public void openCart() 
  {
	  ip.cartPage();
  }
}
