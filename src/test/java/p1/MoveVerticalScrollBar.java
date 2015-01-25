package p1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MoveVerticalScrollBar {

	WebDriver driver;
	
	
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		
		
		driver.get("http://www.w3schools.com/");
			
		driver.manage().window().maximize(); //maximize the window
	

		//WAY 1
		
		/*
		 * 
		 * See to run any java script on a web page using webdriver..
		 * 
		 * we hold the DRIVER instance reference in java script executer using CASTING
		 * 
		 */
		JavascriptExecutor executer= (JavascriptExecutor) driver;  //hold the driver instance in java script executor
		
		executer.executeScript("scroll(0,250)");
		
		
		
		executer.executeScript("scroll(250,0)");
		
		
		
		
	/*	
	 * 
	 * 
	 * The below ways are not working...
		
		
		//WAY2
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.tagName("body"))).perform();
		
		action.click().perform();
		
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

		action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();

		
		
		
		//WAY3
		
		for(int i=0;i<3;i++	)
			
		{
			
			action.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
	for(int i=0;i<3;i++	)
			
		{
			
			action.sendKeys(Keys.ARROW_UP).perform();
			
		}	*/
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}