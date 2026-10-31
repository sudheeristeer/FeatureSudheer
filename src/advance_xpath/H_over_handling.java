package advance_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_over_handling {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement element=driver.findElement(By.xpath("//div[@title='Do not select if this computer is shared']"));
	String s=element.getAttribute("title");
	System.out.println("h_over message is : "+s);
	if(element.isDisplayed())
	{
		System.out.println("it is displayed");
	}
	else
	{
		System.out.println("it not displayed");
	}
	if(element.isEnabled())
	{
		System.out.println("it is clickable");
	}
	else
	{
		System.out.println("it is not clickable");
		
	}
	if(element.isSelected())
	{
		System.out.println("It is selected");
	}
	else
		System.out.println("it is not selected");
}
}
