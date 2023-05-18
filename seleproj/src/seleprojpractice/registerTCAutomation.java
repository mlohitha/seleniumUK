package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerTCAutomation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		// click on register
		driver.findElement(By.linkText("Register")).click();
		// Enter the values and click on radio button
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("LohithaPriya");
		driver.findElement(By.name("LastName")).sendKeys("Murahari");
		driver.findElement(By.id("Email")).sendKeys("mLohitha30@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Password@1");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@1");
		// click on register button
		driver.findElement(By.id("register-button")).click();

	}

}
