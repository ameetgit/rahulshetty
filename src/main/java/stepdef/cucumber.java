package stepdef;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import rahulshetty.pageobject.baseclass;
import rahulshetty.pageobject.catalogue;
import rahulshetty.pageobject.landingpage;

public class cucumber extends baseclass{
		
	public 	landingpage obj;
		
@Given("I landed on ecommerce webpage")

	public void I_landed_on_ecommerce_webpage() throws IOException
	{
	
	 obj=ghu();
	
	
	
		
	}
@When ("I check for the (.+) in step")
public void I_check_for_the(String name)
{
	
	catalogue ct=new catalogue(driver);
	
List<WebElement>wb=ct.getlist();
	
	
	
	
	
	
	
	
	
	
	
	WebElement wr=ct.getproductbyname(name);
	
	ct.addproducttocatalogue(name);
	driver.findElement(By.cssSelector("a[class='cart-icon'] img")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	
}

}
