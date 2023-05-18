package seleprojpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// get method
		// driver.get("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");

		driver.get("https://demowebshop.tricentis.com/");
		// get title method
		System.out.println(driver.getTitle());

		// get Current URL method
		System.out.println(driver.getCurrentUrl());

		// get page source method
		String pagesource = driver.getPageSource();
		// System.out.println(pagesource);

		// manage method
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		driver.get("https://facebook.com/");

		Thread.sleep(2000);
		// navigate method
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://online.qspiders.com/classes/77417791-861d-4879-97d4-bd061a415213");

		//findElements method
		//findElement method
		//switch to method
		//get window handles method
		// get window handle method
		
		
		// close method
		// driver.close();

		// quit method
		// driver.quit();
	}

}
