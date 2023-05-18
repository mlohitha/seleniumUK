package LearningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions {

	@Test
	public void assertionTest()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://demowebshop.tricentis.com/");
		 //Assert.assertTrue(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"));
//		Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
//		Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		 
		 SoftAssert ast= new SoftAssert();
		 ast.assertEquals(driver.getTitle(),"Dem Web Shop");
		
		 driver.quit();
		 ast.assertAll();
	}
	
}
