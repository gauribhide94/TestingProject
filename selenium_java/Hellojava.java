package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hellojava {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		
	}

}
