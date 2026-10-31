package testNG_frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
   @FindBy(xpath="//div[@id='container_tasks']")
   private WebElement Task;
   @FindBy(xpath="//div[@id='container_reports']")
   private WebElement Report;
   @FindBy(xpath="//div[@id='container_users']")
   private WebElement User;
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public WebElement getTask() {
	return Task;
}
public WebElement getReport() {
	return Report;
}
public WebElement getUser() {
	return User;
}
public void clickonTask()
{
	getTask().click();
}
 public void clickonReport()
 {
	 getReport().click();
 }
 public void clickonUser()
 {
	 getUser().click();
 }
}
