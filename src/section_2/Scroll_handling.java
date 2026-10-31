package section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_handling {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement element=driver.findElement(By.name("q"));
	element.sendKeys("shoes");
	element.submit();
	Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-500);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,0);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,500);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,1000);");	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,1500);");	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,2000);");	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,2500);");	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,3000);");
	driver.quit();


}
}
