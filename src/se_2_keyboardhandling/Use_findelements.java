package se_2_keyboardhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_findelements {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin",Keys.TAB,"admin123",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div[2]/div/div[2]/div/div/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Engineering']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//form[@class='oxd-form']/div/div/div[4]/div/div[2]/div/div")).click();
	Thread.sleep(2000);
	List<WebElement> elements=driver.findElements(By.xpath("//div[starts-with(@class,'oxd-select-dr')]"));
	Thread.sleep(2000);
	for(WebElement s:elements)
	{
		System.out.println(s.getText());
	}
}
}
