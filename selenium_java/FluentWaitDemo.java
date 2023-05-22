package selenium_java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import dev.failsafe.Timeout;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();

   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(60))   
		.pollingEvery(Duration.ofSeconds(5));
	   
	    
	} 

}
