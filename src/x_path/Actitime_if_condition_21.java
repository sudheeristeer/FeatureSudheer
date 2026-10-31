package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_if_condition_21 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("container_tasks")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	Thread.sleep(2000);
	String name="sudheerL";
	driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder n')]")).sendKeys(name);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("he is valuble customer");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	Thread.sleep(2000);
	String result=driver.findElement(By.className("titleEditButtonContainer")).getText();
	 Thread.sleep(4000);
	System.out.println(result);
	Thread.sleep(4000);
	if(result.equals(name))
	{
		System.out.println("customer created successfully");
	}
	else {
		System.out.println("not created successfully");
	}

}
}
