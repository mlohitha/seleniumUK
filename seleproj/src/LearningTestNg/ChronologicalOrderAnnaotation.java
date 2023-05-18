package LearningTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChronologicalOrderAnnaotation {
	
	@Test
	public void testAnnaotation()
	{
		System.out.println("Test Annoatation");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Annotation");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Annotation");
	}
	

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Annotation");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Annotation");
	}

	

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Annotation");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite Annotation");
	}

}
