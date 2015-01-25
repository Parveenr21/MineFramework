package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.*;
import org.testng.annotations.*;

public class W3_element_nullify_onceDOMchanges {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		driver=new FirefoxDriver();
		
		
	}
	
	
	@Test
	public void testMethod1()
	{
		
		driver.get("http://www.w3schools.com/");
		
		WebElement we=driver.findElement(By.xpath("//div/a[4]"));
		

		System.out.println("###" +we.getTagName() );
		
		System.out.println("###" + 		we.getText() );
		
		
		//we.click();
		
		/*Once the DOM get changed by element..or even we go to some other page and come back..then
		this stored web element can not be used..we need to run this findby again to find that element
		*/
		
		
		driver.get("http://www.w3schools.com/");
		
		
		
		System.out.println("###" +" " );
		
		
		System.out.println("###" +we.getTagName() );
		
		System.out.println("###" + 		we.getText() );
		

		
		
	}
	
	
}
