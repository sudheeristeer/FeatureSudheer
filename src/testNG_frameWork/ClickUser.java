package testNG_frameWork;

import org.apache.commons.math3.stat.regression.RegressionResults;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG_frameWork.Listoners_Implimentation.class)
public class ClickUser extends UtilityBaseClass{
	@Test(alwaysRun = true,groups = "Regression")
public void createUser()
{
		Homepage h=new Homepage(driver);
		h.clickonUser();
	//driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	Reporter.log("user created successfully");
}
}
