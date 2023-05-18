package LearningTestNg;

import org.testng.annotations.Test;

public class LearningDependencyGroupExecution {


	@Test(groups= "Functional")
	public void LoginTest()
	{
		System.out.println("Login testcase code");
	}
	
	@Test(groups="Integration")
	public void RegisterTest()
	{
		System.out.println("Register testcase code");
	}
	@Test(groups="Integration")
	public void CartTest()
	{
		System.out.println("Cart testcase code");
	}
	
	@Test(groups="Integration", dependsOnGroups="System")
	public void WishlistTest()
	{
		System.out.println("Wishlist testcase code");
	}
	@Test(groups="System")
	public void endtoEndTest()
	{
		System.out.println("endtoEnd testcase code");
		int i=5/0;
	}
	
}
