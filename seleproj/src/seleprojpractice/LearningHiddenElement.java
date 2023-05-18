package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearningHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement hiddentextfield = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Hello';", hiddentextfield);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
	}

}
