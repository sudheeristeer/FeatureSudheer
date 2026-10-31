package se_2_keyboardhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Scenario {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 //driver.manage().window().maximize();
	 driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	String date= driver.findElement(By.xpath("//a[text()='31']")).getText();
	System.out.println(date);
	driver.quit();
}
} 
