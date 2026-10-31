package se_2_keyboardhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_handling {
 public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin",Keys.TAB,"admin123",Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    driver.quit();
}
}
