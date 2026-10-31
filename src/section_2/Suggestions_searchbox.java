package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestions_searchbox 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf']"));
	element.sendKeys("virat kohli");
	Thread.sleep(2000);
	List<WebElement> elements =driver.findElements(By.xpath("//div[@class='aajZCb']"));
	for(WebElement suggestions: elements)
	{
		System.out.println(suggestions.getText());
	}
	Thread.sleep(2000);
	driver.quit();
}
}
