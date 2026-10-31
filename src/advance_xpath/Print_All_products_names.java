package advance_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_products_names {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
			   element.sendKeys("i phone 11");
				Thread.sleep(2000);
			   element.submit();
	Thread.sleep(2000);
	List<WebElement> elements=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	List<WebElement> elementss=driver.findElements(By.xpath("//div[@class='_4rR01T']/../following-sibling::div[1]/div[1]/div[1]/div[1]"));
       for(int i=0;i<elements.size();i++)
       {
    	   System.out.println((i+1)+")."+elements.get(i).getText()+"------------->"+elementss.get(i).getText());
       }

}
}
