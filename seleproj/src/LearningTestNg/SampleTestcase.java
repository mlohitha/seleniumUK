package LearningTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestcase {

	@Test
	public void testcase() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(4000);
	}
}
