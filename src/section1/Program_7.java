package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_7 {
 public static void main(String[] args) throws InterruptedException {		
	 System.setProperty("webdriver.chrome.driver", "d:\\selenium\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(300,400));
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(300,400));
		Thread.sleep(4000);
		driver.close();
		
		
}
}
