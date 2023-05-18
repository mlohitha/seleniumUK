package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningdifftypesXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Reg')]")).click();
	
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();

		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Chakri");
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("T");
	
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("lohiroyal@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@1");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password@1");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
	}

}
