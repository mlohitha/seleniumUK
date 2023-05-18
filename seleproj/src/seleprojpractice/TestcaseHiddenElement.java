package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/index.php");
		WebElement hiddenElementfield=driver.findElement(By.xpath("//input[@class='form-control']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Lohitha';", hiddenElementfield);
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Selenium Training")).click();
	}

}
