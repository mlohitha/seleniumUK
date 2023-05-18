package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTestcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Downloads/iframe.html");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[text()='FOOD']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
