package LearningTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LearningParalllExecution {

	
	@Test(enabled=true, invocationCount=4,threadPoolSize=2)
	public void ParallelTC()
	{
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
	
		String userName="yogbelavanaki@gmail.com";
		String password ="Password@123";
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(userName))
		{
			System.out.println("PASSED: Login successfull");
		}
		else {
			System.out.println("FAILED: Login Failed");
		}
		
		//driver.quit();
	}
}
