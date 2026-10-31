package se_2_keyboardhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_popup_handling {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='Alert']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	WebElement element=driver.findElement(By.xpath("//h2[text()='Interface Alert']"));
	String res=element.getText();
	System.out.println(res);

	
	
}
}
