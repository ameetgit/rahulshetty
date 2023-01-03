package rahulshetty.pageobject;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class catalogue extends abstractclass {
	
	
	WebDriver driver;
	
	
	public catalogue(WebDriver driver)
	{super(driver);
		PageFactory.initElements(driver, this);
		this.driver=driver;
			}
	
	
	  @FindBy(css=".product") 
	  List<WebElement> wb;
	 // List<WebElement> wb=driver.findElements(By.cssSelector(".product"));
	  
	  By abc=By.cssSelector("div[class='product-action'] button");
	  By gur=By.cssSelector(".product");
	  
	  
	  //STEP 1-RETURN THE WEBELEMENTS
	
	  public List<WebElement> getlist() 
	  {
		  return wb;
	  }
	  
	  
	 //STEP-2 GET THE WEBELEMENT BY NAME SEARCH it is just a method to identify the elements 
	
	 public WebElement getproductbyname(String names)

	 {
		 WebElement gy=wb.stream().filter(s->s.findElement(By.cssSelector("h4")).getText().equals(names)).findFirst().orElse(null);
			return gy;
			
	 }
	 
	 
	
	 public void addproducttocatalogue(String name)
	 {
		WebElement yu=getproductbyname( name);
		yu.findElement(abc).click();
		
		
		
	 }
	
	 //STEP-3 ADD THE ELEMENT TO THE CART and we have to search thru products 
	 
	
	
	  
	

	 

	//List<WebElement> products=driver.findElements(By.cssSelector(".product"));
	//WebElement gy=products.stream().filter(s->s.findElement(By.cssSelector("h4")).getText().equals("Brocolli - 1 Kg")).findFirst().orElse(null);
	
	
	
	//gy.findElement(By.cssSelector(div[class='product-action'] button")).click();
	
//driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
//driver.findElement(By.cssSelector("button[type='button']")).click();

	
	
	
	
//products.stream().map(product->product.findElement(By.cssSelector("b")).getText()).forEach(s->System.out.println(s));
	
	//tr.findElement(By.cssSelector(".card-bodybutton:last-of-type")).click();
	
	}



