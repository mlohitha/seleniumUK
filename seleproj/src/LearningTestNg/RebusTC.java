package LearningTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RebusTC {
@Test
public void test() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
			"./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.redbus.in/");
	Thread.sleep(4000);
}
}
