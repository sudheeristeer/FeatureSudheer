package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion_shoes_flipkart {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.chrome", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(4000);
	WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("shoes");
	Thread.sleep(2000);
List<WebElement> sug =	driver.findElements(By.xpath("//li[@class='Y5N33s']"));
  for(WebElement s:sug)
  {
	  System.out.println(s.getText());
  }
  Thread.sleep(2000);
  //driver.quit();
}
}
