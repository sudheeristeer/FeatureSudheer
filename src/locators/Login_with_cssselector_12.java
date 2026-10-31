package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_with_cssselector_12 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	
}
}
