package advance_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoes {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
	element.sendKeys("shoes");
	element.submit();
	Thread.sleep(2000);
	String pdtname=driver.findElement(By.xpath("(//h2[contains(@class,'a-')])[1]")).getText();
	Thread.sleep(2000);
	System.out.println(pdtname);
	Thread.sleep(2000);
	String pdtprice=driver.findElement(By.xpath("(//h2[contains(@class,'a-')])[1]/../following-sibling::div[2]/div/a/span/span/span[2]")).getText();
    
	Thread.sleep(2000);
	System.out.println(pdtprice);
    System.out.println(pdtname+"------------>"+pdtprice);
    driver.quit();
}
}
