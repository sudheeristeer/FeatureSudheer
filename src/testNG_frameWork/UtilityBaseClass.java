package testNG_frameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import actitime_login_create_customer.Datautility;

public class UtilityBaseClass {
	Datautility du=new Datautility();
	static WebDriver driver;

	/* Establish data connection */
	@BeforeSuite(alwaysRun = true)
  public void createConnection()
  {
	  System.out.println("connection created successfully");
  }
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
  public void launchingBrowser(String browser ) throws Throwable
  {
		
	  String URL=du.getDataFromProperties("url");
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	  driver=new ChromeDriver();
	  }
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	 
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  System.out.println("chromeBroser launched with actitime");
  }
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
  public void LoginToapp(String browser) throws Throwable
  {
		Loginpage l=new Loginpage(driver);
	  String USERNAME=du.getDataFromProperties("username");
	  String PASSWORD=du.getDataFromProperties("password");
	  l.Login(USERNAME, PASSWORD);
//	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME);
//	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PASSWORD);
//	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  System.out.println("login successfully");
	  if(browser.equalsIgnoreCase("firefox"))
	  {
	  Thread.sleep(6000);
	  }
  }
	@Parameters("browser")
	@AfterMethod(alwaysRun = true)
  public void logoutApp(String browser) throws InterruptedException
  {
		if(browser.equalsIgnoreCase("firefox"))
		{
		Thread.sleep(6000);
		}
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  System.out.println("logout successfully");
  }
	@AfterClass(alwaysRun = true)
  public void closeBrowser() throws InterruptedException
  {
		Thread.sleep(4000);
	  driver.close();
  }
	@AfterSuite(alwaysRun = true)
  public void closeConnection()
  {
	  System.out.println("connection closed");
  }
}
