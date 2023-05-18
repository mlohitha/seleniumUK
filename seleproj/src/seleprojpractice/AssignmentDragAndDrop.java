package seleprojpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		for(int i=1;i<=7;i++)
		{
			WebElement source = driver.findElement(By.id("box"+i));
			WebElement target = driver.findElement(By.id("box10"+i));
			action.dragAndDrop(source, target).build().perform();
		}
//		WebElement source = driver.findElement(By.id("box1"));
//		WebElement target = driver.findElement(By.id("box101"));
//		action.dragAndDrop(source, target).build().perform();
//		WebElement source1 = driver.findElement(By.id("box2"));
//		WebElement target1 = driver.findElement(By.id("box102"));
//		action.dragAndDrop(source1, target1).build().perform();
//		WebElement source2 = driver.findElement(By.id("box3"));
//		WebElement target2 = driver.findElement(By.id("box103"));
//		action.dragAndDrop(source2, target2).build().perform();
	}

}
