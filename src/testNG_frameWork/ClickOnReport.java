package testNG_frameWork;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG_frameWork.Listoners_Implimentation.class)
public class ClickOnReport extends UtilityBaseClass{
	@Test(alwaysRun = true,groups ="smoke")
public void createReport()
{
		Homepage h=new Homepage(driver);
		h.clickonReport();
	//driver.findElement(By.xpath("//div[@id='container_reports']")).click();
     Reporter.log("Report created successfully");
}
}
