package se_2_keyboardhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_division_popup {
 public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("(//td[@class='selection'])[1]")).click();
	driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
	Thread.sleep(2000);
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//String msg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete')]"))).getText();
	String msg=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
	System.out.println(msg);
}
}
