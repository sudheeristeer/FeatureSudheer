package section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {
 public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element=driver.findElement(By.xpath("//a[text()='Gmail']"));
	Actions act=new Actions(driver);
	act.moveToElement(element).contextClick().build().perform();
	Robot r=new Robot();
	for(int i=1;i<=6;i++)
	{
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//driver.quit();
}
}
