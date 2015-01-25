package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RightClickandChooseOption {

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		driver=new FirefoxDriver();
		
		
		driver.get("http://blog.codinghorror.com/double-click-must-die/");
			
	
		Actions action = new Actions(driver);
		/*
		 * 
		 * right click on an element and then key press down events 8 times ..then click on that..its view source
		 * 
		 * 
		 */
		
		
	/*	
	 * 
	 * the below commented code has just one silly mistake...
	 * 
	 * which is i used click() method on right click menu.. which can not work.. as it is not web applicaiton
	 * Its a context menu.. so use Keys.ENTER command for that..
	 * 
	 * 
	 * :)
	 * 
		action.contextClick(driver.findElement(By.xpath("//p[3]/input"))).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
		*/
		
		
		
		action.contextClick(driver.findElement(By.xpath("//p[3]/input"))).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(10000);
		
		
		driver.get("http://www.google.com");
		

        
        
        action.contextClick(driver.findElement(By.linkText("About"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
Thread.sleep(5000);		
		
		
		
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}