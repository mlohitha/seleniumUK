package LearningTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class LearningreadingDatafromExcel {

	public static void  main(String[] args) throws Exception {
		testData("Sheet2");
	
	}
	public static String[][] testData(String sheetName) throws IOException
	{
		File file= new File("./TestData/Testdata1.xlsx");
		FileInputStream fis =new FileInputStream(file);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		
		int row_size=sheet.getPhysicalNumberOfRows();
		int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data= new String[row_size][col_size];
		
		for(int i=0;i<row_size;i++)
		{
			for(int j=0;j<col_size;j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
			}
		return data;
		
//		for(int i=0;i<row_size;i++)
//		{
//			for(int j=0;j<col_size;j++)
//			{
//				System.out.println(data[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}



public static void singleRead() throws IOException {


	File file= new File("./TestData/Testdata1.xlsx");
	FileInputStream fis =new FileInputStream(file);
	Workbook wb =  WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	System.out.println(sheet.getRow(1).getCell(1));

}
}

