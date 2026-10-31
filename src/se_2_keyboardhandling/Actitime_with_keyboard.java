package se_2_keyboardhandling;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_with_keyboard {
  public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.crome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("trainee");
	Thread.sleep(4000);
	   Robot r=new Robot();
	   
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	  //  Thread.sleep(2000);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	  //  Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	   // Thread.sleep(2000);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_C);
	   // Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	   // Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	  //  Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
  
	    
	    
}
}
