package rahulshetty.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class baseclass {
 public static WebDriver driver;
	

 public static WebDriver hello() throws IOException
 {
	 
	 
	 
	 
	
	 
		// TODO Auto-generated method stub
		//System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		Properties p=new Properties();
				FileInputStream fin=new FileInputStream("C:\\ameetkaur\\Yath\\src\\src\\meandyou\\src\\main\\java\\resources\\hy.properties");
		p.load(fin);
		String hy=p.getProperty("browser");
		// String hu=System.getProperty("browser")!=null? System.getProperty("browser"):p.getProperty("browser");
		//if(hu.contains("chrome"))
		//{
			//ChromeOptions OP=new ChromeOptions();
			//if(hu.contains("headless"))
			//{OP.addArguments("headless");
		//	System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
			
			//}
			
			//if()
			// driver=new EdgeDriver(OP);
	//	}	
		if(hy.equalsIgnoreCase("edge"))
		{
			System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
			 driver=new EdgeDriver();
			
		}
		if (hy.equalsIgnoreCase("chrome"))
		{
			System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
			 driver=new EdgeDriver();
			
		}
		else if(hy.equalsIgnoreCase("edge"))

		{
			System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
			 driver=new EdgeDriver();
			System.out.println("kjfnks");
			
		}
		
		else
		{System.out.println("jnvks");
		
	}
	return driver;
	 
	
	 }
 
 


@BeforeMethod
public landingpage ghu() throws IOException
{
	 driver=hello();
	landingpage lp=new landingpage(driver);
	lp.hellos();
	return lp;
	
}

 
 
 
 
 public String Screenshot(String gh,WebDriver driver) throws IOException
	  {
		  
		  TakesScreenshot tr=(TakesScreenshot)driver;
	
		  File src=tr.getScreenshotAs(OutputType.FILE);
		  
		  File file=new File(System.getProperty("user.dir")+"//reports" +gh+"//.png//");
		 FileUtils.copyFile(src,file);
		return System.getProperty("user.dir")+"//reports" +gh+"//.png//";
		  
	  }

			
	  }




