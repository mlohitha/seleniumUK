package seleprojpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDontCloseParentWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String parenthandle = driver.getWindowHandle();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		driver.findElement(By.linkText("Google+")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String s : windowHandles) {
			driver.switchTo().window(s);
			if(!driver.getWindowHandle().equals(parenthandle))
			driver.close();
			Thread.sleep(2000);
		}
	}

}
