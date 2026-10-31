package Utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WebDriver_utility {
   
	public void MaximizeScreen(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void WiatForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void ScriptTimeout(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		
	}
	public void waitForElementWithCustomTimeout(WebDriver driver,WebElement element,int pollingTime)
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(pollingTime));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void SwitchToWindow(WebDriver driver,String partialWindowTitle)
	{
		Set<String> allId=driver.getWindowHandles();
		Iterator<String> it=allId.iterator();
		while(it.hasNext())
		{
			String wid=it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(partialWindowTitle))
			{
				break;
			}
		}
	}
	public void SwitchToAlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();;
	}
	public void SwitchToAlertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
   public void SwitchToAlertGetText(WebDriver driver)
   {
	   driver.switchTo().alert().getText();
   }
   public void SwithToFrame(WebDriver driver, int index)
   {
	   driver.switchTo().frame(index);
   }
   public void SwitchToFrame(WebDriver driver,String Id_name_Attribute)
   {
	   driver.switchTo().frame(Id_name_Attribute);
   }
   public void select(WebElement element,String text)
   {
	   Select sel=new Select(element);
	   sel.selectByVisibleText(text);
   }
   public void select(WebElement element,int Id)
   {
	   Select sel=new Select(element);
	   sel.selectByIndex(Id);
   }
   public void MoveToElement(WebDriver driver,WebElement element)
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(element).perform();
   }
   public void rightClickOnElement(WebDriver driver, WebElement element)
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(element).contextClick().perform();
   }
   public void MoveByoffest(WebDriver driver,int x,int y)
   {
	   Actions act=new Actions(driver);
	   act.moveByOffset(x, y).click().perform();
   }
}
