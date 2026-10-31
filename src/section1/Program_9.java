package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_9 {
 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.actitime.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
        driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
        driver.navigate().refresh();
		Thread.sleep(3000);
         driver.close();

}
}
