package LearningTestNg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class LoginTest {


	@Test(dataProvider="LoginData")
	public void loginTest( @Optional("chrome")String browserName,@Optional("https://demowebshop.tricentis.com/")String URL,String username,String password)
	{
//		String userName="yogbelavanaki@gmail.com";
//		String password ="Password@123";
//		
		System.out.println(URL);
		System.out.println(username);
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.navigate().to(URL);
		 
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(username))
		{
			System.out.println("PASSED: Login successfull");
		}
		else {
			System.out.println("FAILED: Login Failed");
		}
	}
	
	@DataProvider(name="LoginData")
	public Object[][] testData() throws IOException {
			return LearningreadingDatafromExcel.testData("Sheet2");
	
}
}
