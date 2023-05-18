package seleprojpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningConfirmationalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		String name = "Lohitha";
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//alert.dismiss();
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
