package actitime_login_create_customer;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {
  public static void main(String[] args) throws Throwable {
	  Datautility dutil=new Datautility();
	//Fetch data from properties file
	 String URL= dutil.getDataFromProperties("url");
	 String USERNAME=dutil.getDataFromProperties("username");
	 String PASSWORD=dutil.getDataFromProperties("password");
	 //fetch data from excel file
	 String Customername=dutil.getDatafromXcel("Sheet2", 1, 1);
	 String Description=dutil.getDatafromXcel("Sheet2", 2, 1);
	 Random r=new Random();
	 int num=r.nextInt(1000); //generate new numbers
	 WebDriver driver=new ChromeDriver();
	 driver.get(URL);
	 dutil.Implicitlywait(driver);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
	 driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	 driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	 driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	 driver.findElement(By.xpath("//input[contains(@class,'inputNameField')]")).sendKeys(Customername+num);
	 driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(Description);
	 driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
	// Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	 driver.quit();
	
	
}
}
