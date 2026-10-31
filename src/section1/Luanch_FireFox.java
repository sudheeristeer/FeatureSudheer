package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Luanch_FireFox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	System.out.println("title of the website is: "+driver.getTitle());
}
}
