package LearningTestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends Base1{

	

	@Test
	public void registerTest()
	{
		
		driver.findElement(By.linkText("Register")).click();
		String Gender="f";
		driver.findElement(By.xpath("//input[@value=+'Gender'+]")).click();
		String Fname="John";
		driver.findElement(By.id("FirstName")).sendKeys(Fname);
		String Lname="Stephon";
		driver.findElement(By.id("LastName")).sendKeys(Lname);
		String EMAIL="johnstephon@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(EMAIL);	
		String PWD="Password@1";
		driver.findElement(By.id("Password")).sendKeys(PWD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(EMAIL))
		{
			System.out.println("PASSED: Registered successfull");
		}
		else {
			System.out.println("FAILED: Registeration Failed");
		}
	
	}
}