package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Login_acttime_xpath_15 {
 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D://selenium//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
} 
