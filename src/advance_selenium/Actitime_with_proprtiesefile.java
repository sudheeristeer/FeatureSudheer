package advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_with_proprtiesefile
{
   public static void main(String[] args) throws Throwable 
   {
	   FileInputStream fis=new FileInputStream("C:\\Users\\sudhe\\OneDrive\\Desktop\\Actitime_launch.propertiese.txt");
	   Properties pro=new Properties();
	   pro.load(fis);
	   String URL=pro.getProperty("url");
	   String USERNAME= pro.getProperty("username");
	   String PASSWORD=pro.getProperty("password");
	   String BROWSER= pro.getProperty("browser");
	   WebDriver driver=new FirefoxDriver();
	   System.out.println(URL+"\n"+USERNAME+"\n"+PASSWORD+"\n"+BROWSER);
	   driver.get(URL);
	   driver.findElement(By.name("username")).sendKeys(USERNAME);
	   driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 //  driver.quit();
   }
}
