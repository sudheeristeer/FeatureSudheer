package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class After_popularity_print_firstElement_20 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.name("q"));
		Thread.sleep(2000);
		element.sendKeys("i phone 11");
		Thread.sleep(2000);
		element.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
		System.out.println(result);
		Thread.sleep(4000);
   		driver.quit();
	}
}
