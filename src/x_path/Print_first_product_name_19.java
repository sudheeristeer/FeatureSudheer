package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_first_product_name_19 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.className("_3704LK"));
	element.sendKeys("i phone 11");
    Thread.sleep(3000);
	element.submit();
	Thread.sleep(4000);
	String result=driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (White, 128 GB)')]")).getText();
	System.out.println(result);
	
}
}
