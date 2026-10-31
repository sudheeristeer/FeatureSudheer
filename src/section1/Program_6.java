package section1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_6 {
 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "d:\\selenium\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().setSize(new Dimension(300,400));
		Thread.sleep(3000);
		driver.close();
 }
}
