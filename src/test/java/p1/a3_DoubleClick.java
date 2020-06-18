package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class a3_DoubleClick {

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		
		FirefoxProfile profile = new FirefoxProfile();
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(FirefoxDriver.PROFILE,profile);


		
		driver=new FirefoxDriver(cap);
		
		
		//driver.get("http://blog.codinghorror.com/double-click-must-die/");
			
		driver.get("http://www.google.com");
		
		Thread.sleep(5000);
	
		Actions action = new Actions(driver);
		
		//Double click statement written there
		//action.doubleClick(driver.findElement(By.xpath("//*[@id='gbqfba']"))).perform();
		
		
		//WebElement a= driver.findElement(By.linkText("dd"));
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
	
	
	
	
}