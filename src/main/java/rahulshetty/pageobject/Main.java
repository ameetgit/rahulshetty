package rahulshetty.pageobject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Main extends baseclass{

	
	
	
	
	
	@Test
public void hrty()throws IOException
{
		 
		// TODO Auto-generated method 
		//System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
		String name="Brocolli - 1 Kg";
		
//landingpage obj=ghu();

	//obj.name("co811425", "Amarpreet@23");
		 // WebDriver driver=new EdgeDriver();
		  //driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	catalogue ct=new catalogue(driver);
	
	
	

	
	List<WebElement>wb=ct.getlist();
	
	
	
	
	
	
	
	
	
	
	
	WebElement wr=ct.getproductbyname(name);
	
	ct.addproducttocatalogue(name);
	driver.findElement(By.cssSelector("a[class='cart-icon'] img")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	cartpage cts=new cartpage(driver);
	cts.ghhu();
	WebElement uoiss=driver.findElement(By.cssSelector("select[xpath='1']"));
	

	Select ro=new Select(uoiss);
	ro.getFirstSelectedOption();
	driver.findElement(By.cssSelector(".chkAgree")).click();
	
	
	

	 }	
	}
			
				
	
		
		
		 
		  
		  
		  
		  
		  
		
	



