package LearningTestNg;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataDrivenTesting {

	@Test(dataProvider = "LoginData")
	public void LoginTestcase(String Gender,String Fname, String Lname,String Email,String PWD)
	{
		System.out.println(Gender);
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Email);
		System.out.println(PWD);
	}
	
	
	//@DataProvider(name="LoginData")
//public Object[][] testData() throws IOException {
		//return LearningreadingDatafromExcel.testData();
//		String[][] data=new String[2][2];
//		data[0][0]="mlohitha@gmail.com";
//		data[0][1]="Password@1";
//		data[1][0]="lohitha@gmail.com";
//		data[1][1]="Password@1";
//		return data;
	}

