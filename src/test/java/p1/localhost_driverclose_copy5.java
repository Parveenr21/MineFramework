package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class localhost_driverclose_copy5 {

	
WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		System.out.println("Inside Test method");
		FirefoxProfile profile = new FirefoxProfile();
		
		
		driver=new FirefoxDriver(profile);
		
		
		
			
		driver.get("http://localhost:8080/jquery/www.tutorialspoint.com/jquery/jquery-basics.html");
		
			
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		//driver.quit();
		
	}
	
	
	
	
	
	

}