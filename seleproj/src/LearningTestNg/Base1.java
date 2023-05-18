package LearningTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class Base1 {

		WebDriver driver;
		
		@Parameters({"browser","URL"})
		
		@BeforeClass(alwaysRun=true)
		
		public void browserSetup(@Optional("chrome")String browserName,String URL)
		{
			
			if(browserName.contains("chrome"))
			{
			System.setProperty("webdriver.chrome.driver",
					"./Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			 
			}
			else if(browserName.contains("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",
						"./Drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.navigate().to(URL);
			}
		
		@AfterClass
		public void browserTearDown()
		{
			driver.quit();
			
		}
}
