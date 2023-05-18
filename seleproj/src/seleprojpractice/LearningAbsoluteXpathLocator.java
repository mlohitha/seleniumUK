package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAbsoluteXpathLocator {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]")).sendKeys("Laptops");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	

}
}
