package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebElementMEthods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement ref = driver.findElement(By.linkText("BOOKS"));
		ref.clear();
		ref.click();
		System.out.println(ref.getAttribute("href"));
		System.out.println(ref.getCssValue("color"));
		System.out.println(ref.getTagName());
		System.out.println(ref.getText());
		System.out.println(ref.isDisplayed());
		System.out.println(ref.isEnabled());
		System.out.println(ref.isSelected());
		ref.sendKeys(args);
		ref.submit();
		ref.getLocation();
		ref.getRect();
		ref.getSize();
		//ref.getScreenshotAs();
		ref.findElement(null);
		ref.findElements(null);
		
	}

}
