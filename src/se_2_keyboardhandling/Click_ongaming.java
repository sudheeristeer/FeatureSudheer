package se_2_keyboardhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utilities.WebDriver_utility;

public class Click_ongaming {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebDriver_utility util=new WebDriver_utility();
     util.WiatForPageToLoad(driver);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Electronics']")).click();
	WebElement elem=driver.findElement(By.xpath("//span[@class='_2I9KP_' and text()='Electronics']"));
	Actions act=new Actions(driver);
     act.moveToElement(elem).perform();
 	driver.findElement(By.xpath("//a[@class='_3QN6WI _1MMnri _32YDvl' and text()='Gaming & Accessories']")).click();
 	String gm=driver.findElement(By.xpath("//a[@class='_1jJQdf _2Mji8F']")).getText();
 	System.out.println(gm);
	List<WebElement> elements=driver.findElements(By.xpath("//a[@class='_2SqgSY']"));
	for(WebElement elm:elements)
	{
		System.out.println(elm.getText());
	}
    }
}
