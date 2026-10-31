package advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Worksheet {
   public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\selenium\\trail.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	String data=sh.getRow(2).getCell(2).getStringCellValue();
	System.out.println(data);
	
	FileOutputStream fos=new FileOutputStream("D:\\selenium\\trail.xlsx");
	sh.createRow(4).createCell(4).setCellValue(12356);
	book.write(fos);
	System.out.println("passed");
	DataFormatter df=new DataFormatter();
	
	String s=df.formatCellValue(sh.getRow(2).getCell(2));
	System.out.println(s);
}
}
