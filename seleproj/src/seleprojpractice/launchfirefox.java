package seleprojpractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\geckodriver-v0.33.0-win32\\geckodriver.exe");

		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
	}

}
