package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("BOOKS")).click();
		//driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@class='button-2 product-box-add-to-cart-button']")).click();
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[text()='shopping cart']"))));
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		
	}

}
