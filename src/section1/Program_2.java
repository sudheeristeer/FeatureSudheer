package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_2 {
 public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "d:\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.get("https://www.actitime.com/");
	driver.close();
}
}
