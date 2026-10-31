package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amozon_phone_suggestions {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.driver.chrome", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	element.sendKeys("phones");
	Thread.sleep(4000);
	List<WebElement> list= driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']"));
	Thread.sleep(2000);
	for(WebElement s:list)
	{
		System.out.println(s.getText());
		
	}
	Thread.sleep(2000);
	driver.quit();
	
}
}
