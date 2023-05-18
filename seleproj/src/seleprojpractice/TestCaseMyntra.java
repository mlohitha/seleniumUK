package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCaseMyntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //Myntra site is not working here in UK so swapped to amazon
		 driver.get("https://www.amazon.co.uk/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		 Actions ac = new Actions(driver);
			ac.sendKeys(Keys.PAGE_DOWN).build().perform();
			ac.sendKeys(Keys.PAGE_DOWN).build().perform();
			ac.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ENTER).perform();
	}

}
