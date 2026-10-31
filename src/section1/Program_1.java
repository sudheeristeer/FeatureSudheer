package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_1 
{
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String url=driver.getCurrentUrl();
	System.out.println("url of this page: "+url);
	String srccode=driver.getPageSource();
	System.out.println(srccode);
}
}
