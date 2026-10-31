package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_8 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "d:\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(400);
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().setSize(new Dimension(400,300));
	Thread.sleep(4000);
	driver.manage().window().setPosition(new Point(400,300));
	System.out.println(driver.getTitle());
	Thread.sleep(4000);
	driver.close();
}
}
