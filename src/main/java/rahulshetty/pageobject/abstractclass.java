package rahulshetty.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractclass {
	
	
	WebDriver driver;
	public abstractclass(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void webwait(By findBy)
	{
		
	
	WebDriverWait waite=new WebDriverWait(driver,Duration.ofSeconds(5));
	waite.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product"))); //we have foun element from by locater instead of driver.webelement so we need by locater
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
