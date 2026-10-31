package actitime_login_create_customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass {
     @FindBy(xpath="//input[@id='username']")
     private WebElement username;
     @FindBy(xpath="//input[@name='pwd']")
     private WebElement passward;
     @FindBy(xpath = "//a[@id='loginButton']")
     private WebElement loginbutton;
     
	public POMclass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassward() {
		return passward;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
     
     public void logIn(String username,String password)
     {
    	 getUsername().sendKeys(username);
    	 getPassward().sendKeys(password);
    	 getLoginbutton().click();
     }
}
