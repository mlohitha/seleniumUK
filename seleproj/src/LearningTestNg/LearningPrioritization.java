package LearningTestNg;

import org.testng.annotations.Test;

public class LearningPrioritization {

	

	@Test(priority=2)
	public void LoginTest()
	{
		System.out.println("Login testcase code");
	}
	
	@Test(priority=1)
	public void RegisterTest()
	{
		System.out.println("Register testcase code");
	}
	@Test(priority=4)
	public void CartTest()
	{
		System.out.println("Cart testcase code");
	}
	
	@Test(priority=3)
	public void WishlistTest()
	{
		System.out.println("Wishlist testcase code");
	}
	@Test(priority=5)
	public void endtoEndTest()
	{
		System.out.println("endtoEnd testcase code");
		
	}
	
}
