package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DoubleClick {

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		
		FirefoxProfile profile = new FirefoxProfile();
		
		
		driver=new FirefoxDriver(profile);
		
		
		//driver.get("http://blog.codinghorror.com/double-click-must-die/");
			
		driver.get("http://www.google.com");
		
		Thread.sleep(5000);
	
		Actions action = new Actions(driver);
		
		action.doubleClick(driver.findElement(By.xpath("//*[@id='gbqfba']"))).perform();
		
		
		//WebElement a= driver.findElement(By.linkText("dd"));
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}