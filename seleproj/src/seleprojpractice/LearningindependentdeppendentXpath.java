package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningindependentdeppendentXpath {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		
		String price = driver.findElement(By.xpath("//a[contains(text(),'14.1-inch Laptop')]"
				+ "/../..//span[@class='price actual-price']")).getText();

		System.out.println(price);
	}

}
