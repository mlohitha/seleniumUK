package seleprojpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();

		WebElement sortByDD = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(sortByDD);
		List<WebElement> options = sel.getOptions();

		for (int i = 0; i <options.size(); i++) {
			WebElement sortByDD1 = driver.findElement(By.id("products-orderby"));
			Select sel1 = new Select(sortByDD1);
			sel1.selectByIndex(i);
		}

	}

}
