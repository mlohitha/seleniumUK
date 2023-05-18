package seleprojpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upcasting1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		//driver.launchApp(null);
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");
	}
}
