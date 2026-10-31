package actitime_login_create_customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Datautility {
 
	public String getDataFromProperties(String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream("D:\\selenium\\Actitime_log.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String commondata=pro.getProperty(data);
		return commondata;
	}
	public String getDatafromXcel(String sheetname,int rowNum,int cellNum) throws Throwable, Throwable
	{
		FileInputStream fis=new FileInputStream("D:\\selenium\\trail.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter df=new DataFormatter();
		String testData=df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));

		return testData;
	}
	public void Implicitlywait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
}
