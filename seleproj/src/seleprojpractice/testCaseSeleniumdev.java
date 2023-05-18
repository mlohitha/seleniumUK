package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testCaseSeleniumdev {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("https://www.selenium.dev/");
		
		 Actions ac = new Actions(driver);
		 ac.moveToElement(driver.findElement(By.xpath("//span[text()='Downloads']"))).contextClick().build().perform();
		 ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 

	}

}
