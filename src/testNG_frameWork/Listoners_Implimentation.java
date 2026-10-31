package testNG_frameWork;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Listoners_Implimentation implements ITestListener{
    @Override
    public void onTestStart(ITestResult result) {
    	String methodname=result.getMethod().getMethodName();
    	Reporter.log(methodname+"-----is started");
    	
    }
    @Override
    public void onTestSuccess(ITestResult result) {
    	String methodname=result.getMethod().getMethodName();
    	Reporter.log(methodname+"-----is Success");
    }
    @Override
    public void onTestFailure(ITestResult result) {
    	String methodname=result.getMethod().getMethodName();
    	Reporter.log(methodname+"-----is Failed");
    	TakesScreenshot ts=(TakesScreenshot)UtilityBaseClass.driver;
    	 File src=ts.getScreenshotAs(OutputType.FILE);
    	 File dst=new File(".\\Screenshots\\"+methodname+".png");
    	 try {
			Files.copy(src, dst);
		     } 
    	 catch (IOException e) 
    	     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		     }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
    	String methodname=result.getMethod().getMethodName();
    	Reporter.log(methodname+"-----is Skipped");
    }
    @Override
    public void onStart(ITestContext context) {
    	// TODO Auto-generated method stub
    	ITestListener.super.onStart(context);
    }
    @Override
    public void onFinish(ITestContext context) {
    	// TODO Auto-generated method stub
    	ITestListener.super.onFinish(context);
    }
}
