package rahulshetty.pageobject;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class Listeners extends baseclass implements ITestListener
{
	

	ExtentTest testj;
	
	ExtentReports ty=extendreporter.gol();
	

	



	


	//ExtentReports test=gol();

	
	
	public void onTestStart(ITestResult result)
	{
		testj=ty.createTest(result.getTestName());
	
	}
	
	
	
	public void onTestSuccess(ITestResult result)
	{
		try {
			
	try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchFieldException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			String r=Screenshot(result.getMethod().getMethodName(),driver);
			
			testj.addScreenCaptureFromPath(r, result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void onTestFailure(ITestResult result)
	{
		
	}
	
	

	
	
	
	
	

	}


