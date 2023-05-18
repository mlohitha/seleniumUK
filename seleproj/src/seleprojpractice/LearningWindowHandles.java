package seleprojpractice;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.findElement(By.linkText("YouTube")).click();
		driver.findElement(By.partialLinkText("Books")).click();
		Set<String> WindowHandles= driver.getWindowHandles();
		for(String s: WindowHandles)
		{
			System.out.println(s);
		}
	}

}
