package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningUploadpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Desktop\\Lohitha\\Notes_selenium\\Java.pdf");
		}

}
