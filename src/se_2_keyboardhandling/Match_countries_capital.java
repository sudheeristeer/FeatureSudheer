package se_2_keyboardhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Match_countries_capital {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dra=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	WebElement drp=driver.findElement(By.xpath("(//div[@class='dragableBoxRight'])[7]"));
	 Actions act=new Actions(driver);
	 act.dragAndDrop(dra, drp);
	 WebElement draRome=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement drpItaly=driver.findElement(By.xpath("//div[text()='Italy']"));
		act.dragAndDrop(draRome, drpItaly);
		 WebElement draOslo=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
			WebElement drpNorway=driver.findElement(By.xpath("//div[text()='Norway']"));
			act.dragAndDrop(draOslo, drpNorway);
			 WebElement draStockholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
				WebElement drpSweden=driver.findElement(By.xpath("//div[text()='Sweden']"));
				act.dragAndDrop(draStockholm, drpSweden);
				 WebElement draCopenhagen=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
					WebElement drpDenmark=driver.findElement(By.xpath("//div[text()='Denmark']"));
					act.dragAndDrop(draCopenhagen, drpDenmark);
					 WebElement draSeoul=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
						WebElement drpSouthKorea=driver.findElement(By.xpath("//div[text()='South Korea']"));
						act.dragAndDrop(draSeoul, drpSouthKorea);
						WebElement draMadrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
						WebElement drpSpain=driver.findElement(By.xpath("//div[text()='Spain']"));
						act.dragAndDrop(draMadrid, drpSpain); 
						
	 act.perform();
	// driver.quit();
	 
}
}
