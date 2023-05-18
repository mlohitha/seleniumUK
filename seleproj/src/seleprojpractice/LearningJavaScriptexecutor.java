package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJavaScriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.co.uk/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,300);");
	Thread.sleep(3000);
	js.executeScript("window.scroll(0,-300);");
	WebElement flight = driver.findElement(By.xpath("//div[@ class='excdeals']"));
	js.executeScript("arguments[0].scrollIntoView(true);",flight);	
	
	}

}
