package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Suggestions {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	element.sendKeys("shoes");
	Thread.sleep(2000);
	List<WebElement> elements=driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']"));
	for(WebElement s:elements)
	{
		System.out.println(s.getText());
	}
}
}
