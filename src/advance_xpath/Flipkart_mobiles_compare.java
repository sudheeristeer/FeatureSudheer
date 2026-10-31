package advance_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_mobiles_compare {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//Chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	/*driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.name("q"));
	Thread.sleep(2000);
	element.sendKeys("mobiles");
	Thread.sleep(2000);
	element.submit();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[22]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[23]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[33]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[36]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span [text()='COMPARE']")).click();*/


}
}
