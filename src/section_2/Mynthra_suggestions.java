package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra_suggestions {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(4000);
	WebElement element=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	element.sendKeys("headphones");
	Thread.sleep(2000);
	List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='desktop-group']"));
	for(WebElement s:elements)
	{
		System.out.println(s.getText());
	}
}
}
