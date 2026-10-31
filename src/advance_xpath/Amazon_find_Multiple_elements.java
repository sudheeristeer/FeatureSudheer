package advance_xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_find_Multiple_elements {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("amazon");
	driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	List<WebElement> elements=driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
	
	int num=elements.size();
	System.out.println(num);
	for(WebElement a:elements)
	{
		System.out.println(a.getText());
	}
}
}
