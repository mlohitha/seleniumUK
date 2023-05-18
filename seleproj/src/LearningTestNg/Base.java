package LearningTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/** 
 * 
 * @author Lohitha
 *
 */
public class Base {

	/**
	 * This class is responsible to open and close the browser
	 */
	
	WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	public void browserSetup()
	{
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void browserTearDown()
	{
		driver.quit();
		
	}
}
