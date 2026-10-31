package se_2_keyboardhandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/selenium//chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("i phone 11");
		element.submit();
		String parentid=driver.getWindowHandle();
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		   for(int i=0;i<elements.size();i++)
		{
			   elements.get(i).click();
		Set<String> childid=driver.getWindowHandles();
		  for(String Allid:childid)
		  {
			  if(!Allid.equals(parentid))
			  {
				 driver.switchTo().window(Allid);
			  }
		  }
		  String pname=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		  System.out.println(pname);
		  driver.close();
		 driver.switchTo().window(parentid);
	       }
}
}
