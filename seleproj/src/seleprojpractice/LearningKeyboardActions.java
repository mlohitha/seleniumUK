package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.sendKeys(driver.findElement(By.id("small-searchterms")), "LAptops").build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();
	}

}
