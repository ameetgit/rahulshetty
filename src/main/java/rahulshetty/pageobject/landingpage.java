package rahulshetty.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class landingpage {
WebDriver driver;

public landingpage(WebDriver driver)
{        
	this.driver=driver;
	
}
	
	//@FindBy(id="userEmail")
	//WebElement wb;
	
	
	//@FindBy(id="login")
	//WebElement login;
	
	
	//@FindBy(id="userPassword")
	//WebElement pwd;
	
	//@Test
	// public void name(String email,String pwdr)
	// {
	//	 wb.sendKeys(email);
		// pwd.sendKeys(pwdr);
		// login.click();
		 
	// }

	 public void hellos()
	 {
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 }
	 
	
	

	}


