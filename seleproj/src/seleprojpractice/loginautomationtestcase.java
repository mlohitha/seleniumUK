package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginautomationtestcase {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://demowebshop.tricentis.com/");

		// click on login link

		driver.findElement(By.linkText("Log in")).click();

		// enter user and password

		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gail.com");
		driver.findElement(By.name("Password")).sendKeys("Password@123");

		// click on login button

	}

}