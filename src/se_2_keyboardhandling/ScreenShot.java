package se_2_keyboardhandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
     public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot st= (TakesScreenshot) driver;
		File f=st.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\selenium/bbc.png");
		Files.copy(f, dest);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("jeans");
		//driver.findElement(By.className("kfdv")).click();
		
	}
}
