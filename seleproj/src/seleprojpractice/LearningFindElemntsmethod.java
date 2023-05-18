package seleprojpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFindElemntsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		//toprint the text of all the links developed in the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
	}

}
