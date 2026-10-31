package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_iphone_use_Xpath_16 {
   public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("i phone 11");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
	Thread.sleep(3000);
    driver.quit();

}
}
