package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import site1.LoginPage;


public class Testo {

	
	WebDriver driverInstance;
	
	@Test
	public void testmethod1() throws InterruptedException{
		
		driverInstance=new FirefoxDriver();
		
		//driverInstance= new HtmlUnitDriver();
		
		//Initializing LoginPage class and passing webdriver instance to it ..this also insitialize proxy of webelements
		LoginPage LP=	PageFactory.initElements(driverInstance, LoginPage.class);

		
		
		
		
		System.out.println(driverInstance.findElements(By.xpath("//html/body/div[3]/div/a")).size());
		
		try{
		LP.clicklink();
		
		
		
		}
		
		finally{
			
			
			
		}
		
		
		
		if(driverInstance==null)
		{
			
			System.out.println("null");
		}
		else{
			
			System.out.println("ull");
			
			System.out.println(System.getProperty("propertyName"));
			System.out.println(System.getProperty("buildDirectory"));
				
			
			
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException{
		
	
		Thread.sleep(5000);
		driverInstance.quit();
		Thread.sleep(5000);
	

		if(driverInstance==null)
		{
			
			System.out.println("null");
		}
		else{
			
			System.out.println("ull");
		}
	}
}
