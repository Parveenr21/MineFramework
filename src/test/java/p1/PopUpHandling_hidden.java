package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PopUpHandling_hidden {

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		driver=new FirefoxDriver();
		
		
		driver.get("http://stackoverflow.com/questions/11736027/webdriver-wait-for-element");
			
		
		
		/*
		 * 
		 * AS this pop up comes when we click on something and it is in the same window..then 
		 * this got handled by move to element.
		 * 
		 */
		
	
		
		
		driver.findElement(By.xpath("//tbody/tr/td/div/a[1]")).click();
		
	new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@class='popup-title']"))).perform();
	
	driver.findElement(By.xpath("//*[@class='anon-newsletter-email edit-field-overlayed']")).sendKeys("temp@gmail.com");
	
	Thread.sleep(10000);
	
	
		
		
	
		
		
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}