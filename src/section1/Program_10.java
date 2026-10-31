package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_10 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.amazon.in/");
    Thread.sleep(3000);
    driver.navigate().to("https://www.myntra.com/");
    Thread.sleep(3000);
    driver.manage().window().minimize();
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    Thread.sleep(3000);
    driver.navigate().refresh();
    System.out.println(driver.getTitle());
    Thread.sleep(3000);
    driver.close();
    
}
}
