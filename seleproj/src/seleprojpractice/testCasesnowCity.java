package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testCasesnowCity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://snowcityblr.com/contact-us/");
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@referrerpolicy='no-referrer-when-downgrade']")));
		 
		 
		 driver.findElement(By.xpath("//a[@class='navigate-link']")).click();
		 Actions action=new Actions(driver);
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys(Keys.ENTER).build().perform();
		 
	}

}
