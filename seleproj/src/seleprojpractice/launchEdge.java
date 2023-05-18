package seleprojpractice;

import org.openqa.selenium.edge.EdgeDriver;

public class launchEdge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Desktop\\Lohitha\\Selenium\\installers\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
	}

}
