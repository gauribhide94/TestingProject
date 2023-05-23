package TestNGTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
  WebDriver driver = new EdgeDriver();
  driver.get("https://www.utkarshaaacademy.com");
  driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  String Expected_title = "Utkarsha Academy";
  String Actual_title = driver.getTitle();
  Assert.assertEquals(Actual_title, Expected_title);
  driver.get("https://demoqa.com/text-box");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  Actions act= new Actions(driver);
  WebElement UserName= driver.findElement(By.xpath("//input[@id='userName']"));
  act.sendKeys(UserName, "Ravi Nangre").perform();
  
  }
}
