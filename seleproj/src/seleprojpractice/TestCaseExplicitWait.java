package seleprojpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name ="Lohitha";
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		if(alert.getText().contains(name))
		{
			alert.accept();
		}
		
	}

}
