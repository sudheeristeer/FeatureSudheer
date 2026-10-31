package se_2_keyboardhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_handling {
  
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sudheer");
    driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
    String r=driver.switchTo().alert().getText();
    System.out.println(r);
    driver.switchTo().alert().accept();
	}
}