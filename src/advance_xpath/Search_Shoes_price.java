package advance_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Shoes_price {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("shoes");
	element.submit();
	Thread.sleep(2000);
	List<WebElement> pname =driver.findElements(By.xpath("//a[@class='IRpwTa']"));
	Thread.sleep(2000);
	List<WebElement> pprice =driver.findElements(By.xpath("//a[@class='IRpwTa']/following-sibling::a/div[1]/div[1]"));
    Thread.sleep(2000);
      for(int i=0;i<=pname.size()-1;i++)
      {
    	  System.out.println(i+1+")."+pname.get(i).getText()+"-------->"+pprice.get(i).getText());
      }
}
}
