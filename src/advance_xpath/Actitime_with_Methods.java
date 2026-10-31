package advance_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_with_Methods {

	WebDriver driver;
	public void launchBrowser()
	{  System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}
	public void Login() throws Exception
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	public void Execution() throws Exception
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(2000);
		String name="subbashL";
		driver.findElement(By.xpath("//input[starts-with(@class,'inputF')]")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys("he is good person");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[starts-with(@class,'components_button w')]")).click();
		Thread.sleep(2000);
		String result= driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
		System.out.println(result);
		if(result.equals(name))
		{
			System.out.println("customer created successfully");
		}
		else
		{
			System.out.println("not created");
		}


	}
	public void Logout()
	{
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
	public void closeb()
	{
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		Actitime_with_Methods as=new Actitime_with_Methods();
		as.launchBrowser();
		Thread.sleep(2000);
		as.Login();
		Thread.sleep(2000);;
		as.Execution();
		Thread.sleep(2000);
		as.Logout();
		Thread.sleep(2000);
		as.closeb();
	}
}
