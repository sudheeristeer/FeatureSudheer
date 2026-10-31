package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_price_statement_18 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_3704LK")).sendKeys("i phone 11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		String result=driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
        System.out.println(result);
        Thread.sleep(2000);
        driver.close();
		
	}
}
