package se_2_keyboardhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_handling {
 public static void main(String[] args) throws Throwable {
	System.setProperty("webdrievr.chrome.driver", "D://selenium//chromedrievr.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement element=driver.findElement(By.name("q"));
	element.sendKeys("shoes");
	element.submit();
	WebElement slider1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
	WebElement slider2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(slider1, 20, 0).perform();
	Thread.sleep(2000);
	act.dragAndDropBy(slider2, -30, 0).perform();
	
}
}
