package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_3 {
 public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "d:\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.get("https://irctc.com/");
	System.out.println("title of this page: "+driver.getTitle());
	System.out.println("url of page is: "+driver.getCurrentUrl());
    Thread.sleep(4000);
    driver.close();
	
}
}
