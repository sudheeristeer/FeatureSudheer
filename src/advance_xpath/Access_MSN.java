package advance_xpath;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Access_MSN {
   public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.msn.com/en-in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\sudhe\\OneDrive\\Desktop\\abc.jpg");
	Files.copy(src, dest);
	driver.findElement(By.xpath("class=\"control top-navigation\"")).click();
}
}
