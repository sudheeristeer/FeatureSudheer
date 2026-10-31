package advance_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Second_23 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.name("q"));
	element.sendKeys("i phone 11");
	Thread.sleep(2000);
	element.submit();
	Thread.sleep(2000);
	String pdtname=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
	Thread.sleep(2000);
	System.out.println(pdtname);
	Thread.sleep(2000);
	String pdtprice=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']/../following-sibling::div/div[1]/div[1]/div")).getText();
	Thread.sleep(2000);
	System.out.println(pdtprice);
    System.out.println(pdtname+"------->"+pdtprice);
   }
}
