package LearningTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssLoginPageDD {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 File file= new File("./TestData/Testdata1.xlsx");
			FileInputStream fis =new FileInputStream(file);
			Workbook wb =  WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet2");
			
			int row_size=sheet.getPhysicalNumberOfRows();
			int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
			String[][] data= new String[row_size][col_size];
			driver.navigate().to("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.partialLinkText("Log in")).click();
			String username="0";
			driver.findElement(By.id("Email")).sendKeys(username);
			String password ="0";
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
			for(int i=1;i<=row_size;i++)
			{
				for(int j=1;j<=col_size;j++)
				{
					data[i][j]=sheet.getRow(i).getCell(j).toString();
				
				}
			
			}
				
				
//return data;
				
				
	}

	}







