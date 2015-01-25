package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Killable;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Http2Https {

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		driver=new FirefoxDriver();
		
		
		driver.get("http://irctc.co.in/");
		driver.manage().deleteAllCookies();
		
		
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//td//input[@name='userName']")).clear();
		driver.findElement(By.xpath("//td//input[@name='userName']")).sendKeys("prawat6");
		driver.findElement(By.xpath("//td//input[@name='password']")).clear();
		driver.findElement(By.xpath("//td//input[@name='password']")).sendKeys("pcq997");	
	
		driver.findElement(By.xpath("//td//input[@name='password']")).submit();
		
		
		Thread.sleep(1000);
		
	
				
		
		
		//input[@id='stationTo']
		
		
		
		
		Actions action = new Actions(driver);
		
		/*
		 * 
		 * The below code ..not SURE.. but can check..for some sites
		 * 
		 * 
		 * PART -I
		 * here we created one action and used it to select one city using "perform()"
		 * 
		 * 
		 * action.sendKeys(driver.findElement(By.xpath("//input[@id='stationFrom']")), "DDN").perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		PART -II
		
		here we are using the same perform() on the same action..so this second part will not work...as perform work on all the
		last event of action..so re instantiate action again.
		
		action.sendKeys(driver.findElement(By.xpath("//input[@id='stationTo']")), "DL").perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();*/
		
		
		
		/*
		 * NEVER USE click method..and DON'T user ENTER by SEND keys..ALWAYS use
		 * RETURN from send keys to select a value.
		 * The below is the working code. and remember to clear the text box normally
		 * 
		 * 
		 * 
		 * See the click method . is used.. when we are completely doing mouse operation..
		 * like mouse over..
		 * 
		 * 
		 */
		
		driver.findElement(By.xpath("//input[@id='stationFrom']")).clear();
		action.sendKeys(driver.findElement(By.xpath("//input[@id='stationFrom']")), "DDN").perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.UP).sendKeys(Keys.RETURN).perform();
		
		
		driver.findElement(By.xpath("//input[@id='stationTo']")).clear();
		action.sendKeys(driver.findElement(By.xpath("//input[@id='stationTo']")), "DLI").perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.UP).sendKeys(Keys.RETURN).perform();
		
		
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
	Thread.sleep(5000);
		
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}