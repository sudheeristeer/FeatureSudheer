package testNG_frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
   @FindBy(xpath="//input[@name='username']")
   private WebElement username;
   @FindBy(xpath="//input[@name='pwd']")
   private WebElement password;
   @FindBy(xpath = "//a[@id='loginButton']")
   private WebElement LoginButton;
public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginButton() {
	return LoginButton;
}
public void Login(String username,String password)
{
	getUsername().sendKeys(username);
	getPassword().sendKeys(password);
	getLoginButton().click();
	}
}
