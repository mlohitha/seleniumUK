package seleprojpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCalenderPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.co.uk/");
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//div[text()='May 2023']/../..//li[text()='15']")).click();
		//driver.findElement(By.xpath("//input[@id='rdatelbl']")).click();
	}

}
