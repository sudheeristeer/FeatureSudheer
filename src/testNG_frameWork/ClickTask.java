package testNG_frameWork;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG_frameWork.Listoners_Implimentation.class)
public class ClickTask extends UtilityBaseClass{
	@Test(alwaysRun = true,groups = {"smoke","regression"})
	public void createTask()
	{ 
		Homepage h=new Homepage(driver);
		h.clickonTask();
		//driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Reporter.log("Task created successfully");
	}

}
