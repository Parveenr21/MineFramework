package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WaitImplcitExplicit {

	WebDriver driver;
	
	
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		
		
		driver.get("https://www.irctc.co.in/");
			
		
		/*
		 * 
		 * before send keys always do clear first
		 * 99% it is like that
		 * 
		 */
	
		driver.findElement(By.xpath("//td//input[@name='userName']")).clear();
		driver.findElement(By.xpath("//td//input[@name='userName']")).sendKeys("prawat6");
		driver.findElement(By.xpath("//td//input[@name='password']")).clear();
		driver.findElement(By.xpath("//td//input[@name='password']")).sendKeys("pcq997");
	
		
		
		/*
		 * 
		 * Implicit Wait
		 * 
		 * 
		 * Remember to set IT before opening the Web Application or simply a domain.
		 * This works for all the elements.. It is like.. In Web driver.. the execution for any data object or web element happens only once a page 
		 * get loaded completely.. but If some element is not present then this imlicit waut will work for all the pages and all the
		 * elements for the set time. which is say 10..
		 * 
		 * so there is a default polling second.. whih is 500 milli second or simply .5 second
		 * 
		 * so every half second webdriver checkcs for the element presence till 10 seconds after that it will throw element not found exception.
		 * 
		 * 
		 * 
		 * 
		 */
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/*
		 * 
		 * Explicit wait
		 * 
		 * It is exclusively for a conditon .. while for rest of the code.it does not work... If we want to set a default timeout then use implicit wait too
		 * 
		 *  
		 * 
		 */
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td//input[@name='userName']"))));
		element.clear();
		element.sendKeys("111111111");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}