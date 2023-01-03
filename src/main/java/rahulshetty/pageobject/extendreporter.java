package rahulshetty.pageobject;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendreporter {
	
	
	@Test
	public static ExtentReports gol()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("new report");
		reporter.config().setDocumentTitle("title");
		
ExtentReports test=new ExtentReports();
test.attachReporter(reporter);
test.setSystemInfo("tester", "rahul");
test.createTest(path);
return test;

}
}
