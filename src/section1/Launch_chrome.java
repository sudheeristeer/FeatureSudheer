package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome 
{
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe" );
	ChromeDriver driver =new ChromeDriver();
    driver.get("https://www.youtube.com//");
	String title=driver.getTitle();
	 System.out.println("title of the application is: "+title);
}
}
