package se_2_keyboardhandling;




import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Local_calender_handle {
 public static void main(String[] args) {
	Calendar cl=Calendar.getInstance();
	cl.add(Calendar.DAY_OF_MONTH, -1);
	Date d=cl.getTime();
	System.out.println(d);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
String date=	sdf.format(d);
System.out.println(date);
	
}
}
