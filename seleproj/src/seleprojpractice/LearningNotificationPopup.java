package seleprojpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class LearningNotificationPopup {

	public static void main(String[] args) {
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(new FirefoxProfile());
		option.addPreference("dom.webnotifications.enabled", false);
	
		//option.addArguments("disable-notifications");
		//option.addArguments("start-maximized");
		//option.addArguments("--headless");
		//option.addArguments("--incognito");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(option);
		//driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	
	}

}
