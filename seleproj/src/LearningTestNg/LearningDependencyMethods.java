package LearningTestNg;

import org.testng.annotations.Test;

public class LearningDependencyMethods {

	
	@Test(dependsOnMethods="RegisterTest")
	public void LoginTest()
	{
		System.out.println("Login testcase code");
	}
	
	@Test()
	public void RegisterTest()
	{
		System.out.println("Register testcase code");
		int i=1/0;
	}
	@Test()
	public void CartTest()
	{
		System.out.println("Cart testcase code");
	}
	
	@Test()
	public void WishlistTest()
	{
		System.out.println("Wishlist testcase code");
	}
	@Test()
	public void endtoEndTest()
	{
		System.out.println("endtoEnd testcase code");
		
	}
	
}
