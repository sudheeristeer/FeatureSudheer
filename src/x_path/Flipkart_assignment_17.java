package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_assignment_17 {
     public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2d')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone 11");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'Price -- Low to High')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 6 (Space Grey, 32 GB)')]")).click();
		Thread.sleep(4000);
	    driver.quit();

	}
}
