package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningRightclickaction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		Thread.sleep(3000);
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@aria-label='Privacy Manager window']")));
//		action.moveToElement(driver.findElement(By.xpath("//span[text()='Accept All']/../../.."))).click();
		driver.switchTo().defaultContent();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Edit']"))).build().perform();

	}

}
