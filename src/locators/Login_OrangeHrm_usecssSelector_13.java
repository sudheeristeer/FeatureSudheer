package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_OrangeHrm_usecssSelector_13 {
  public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
}
}
