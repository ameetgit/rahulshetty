
package rahulshetty.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class therice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahulshettyacademy");

	}

}
