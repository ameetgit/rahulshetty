package rahulshetty.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class cartpage {

	
	
	WebDriver driver;
	public cartpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	
	
	
	
	

	
	

	

	
	public void ghhu()
	{
	driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector(".promoBtn")).click();
	driver.findElement(By.cssSelector(" div button:last-child")).click();
	
	
	

	

		
	}
}