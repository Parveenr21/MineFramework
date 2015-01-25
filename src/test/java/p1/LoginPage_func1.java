package p1;

import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ActionUtil.Util;
import site1.LoginPage;


public class LoginPage_func1 {

	
	WebDriver driverInstance;
	
	@Test
	public void testmethod1() throws MalformedURLException, IOException{
		
		driverInstance=new FirefoxDriver();
		
		
		
		
		//Initializing LoginPage class and passing webdriver instance to it ..this also insitialize proxy of webelements
		LoginPage LP=	PageFactory.initElements(driverInstance, LoginPage.class);

		
		System.out.println(LP.getAllLinksCount());
		
		LP.getTextOrURLName();
		LP.CheckALLURL();
		
		
		
		
		
		System.out.println(System.getProperty("favorite.berry"));
			
			System.out.println(System.getProperty("propertyName"));
			System.out.println(System.getProperty("buildDirectory"));
				
			Assert.assertEquals("PASS",true, true);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException{
		
	
		Thread.sleep(5000);
		driverInstance.quit();
		Thread.sleep(5000);
	

		
	}
}
