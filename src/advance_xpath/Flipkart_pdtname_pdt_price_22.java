package advance_xpath;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_pdtname_pdt_price_22 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("i phone 11");
		Thread.sleep(2000);
		element.submit();
		Thread.sleep(2000);
		String productname=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']")).getText();
		System.out.println(productname);
		Thread.sleep(2000);
		String pdtPrice=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']/../following-sibling::div/div[1]/div[1]/div[1]")).getText();
		System.out.println(pdtPrice);
		System.out.println(productname+" -------> "+pdtPrice);
		Thread.sleep(2000);
		driver.quit();
		
		
   }
}
