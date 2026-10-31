package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_iphone_flipkart_14 {
 public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	/*driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(4000);
	driver.findElement(By.className("_3704LK")).sendKeys("i phone 11");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("div[class='_4rR01T']")).click();*/
	
}
}