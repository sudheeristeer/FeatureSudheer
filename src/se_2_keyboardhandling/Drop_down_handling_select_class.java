package se_2_keyboardhandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_handling_select_class {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/");
	driver.manage().window();
	driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
	Thread.sleep(2000);
	List<WebElement> element=driver.findElements(By.xpath("//select[@name='country_id']"));
	/*element.click();
	//Thread.sleep(2000);
	//Select s= new Select(element);
	//s.selectByIndex(30);
	//Thread.sleep(5000);
	//s.deselectByIndex(30);
	//Thread.sleep(5000);
	//s.selectByValue("1");
	//Thread.sleep(5000);
	//s.deselectByValue("1");
	//Thread.sleep(5000);
	//s.selectByVisibleText("American Samoa");
	//Thread.sleep(5000);
	//s.deselectByVisibleText("American Samoa");
	for(WebElement a:element)
	{
		System.out.println(a.getText());
	}
*/
	Iterator<WebElement> ltr=element.iterator();
	while(ltr.hasNext())
	{
		WebElement elements=ltr.next();
		System.out.println(elements.getText());
	}
}
}
