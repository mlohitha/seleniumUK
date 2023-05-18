package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningiFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		ac.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
		// using index
		// driver.switchTo().frame(0);
		// driver.findElement(By.xpath("//a[text()='Register']")).click();

		// using String
		// driver.switchTo().frame("courses-iframe");
//	driver.switchTo().frame("iframe-name");
//	driver.findElement(By.xpath("//a[text()='Register']")).click();

		// using webelement

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}
