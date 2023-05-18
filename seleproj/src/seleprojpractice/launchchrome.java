package seleprojpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
