package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Demo {

	public static void main(String[] args) {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("start-maximized");
		option.addArguments("--incognito");
		option.addArguments("--headless");
		WebDriver driver = new EdgeDriver(option);
		
		String Google = ("https://www.google.com");
		String Facebook = ("https://www.facebook.com");
		driver.get(Google);
		
		driver.get("https://www.google.com");
		System.out.println("User successfully nevigate to google page");
		
		driver.navigate().to(Facebook);
		System.out.println("User successfully nevigate to facebook page");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		System.out.println("page");
		
				

	}

}
