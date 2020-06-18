package p1;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import site1.LoginPage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;


public class LoginPage_func1 {

	
	WebDriver driverInstance;
	
	@Test
	public void testmethod1() throws MalformedURLException, IOException{

		List<String> vers=WebDriverManager.firefoxdriver().getVersions();


		WebDriverManager.firefoxdriver().setup();

		driverInstance=new FirefoxDriver();


		
		


          /*

          java.lang.NullPointerException  will come if we initialize this class like below
          LoginPage LP= new LoginPage(driverInstance);

          This way does notinitialize the webelements.. To initiazlise the webelements we need to use PageFactory.init elements

         LoginPage LP=	PageFactory.initElements(driverInstance, LoginPage.class);
         */



		LoginPage LP=	PageFactory.initElements(driverInstance, LoginPage.class);



		//In Ajax Element locator factory.. timeout in seconds..
		
//		ElementLocatorFactory finder=new AjaxElementLocatorFactory(driverInstance, 100);
//		PageFactory.initElements(finder, this);

		
//	    PageFactory.initElements(new AjaxElementLocatorFactory(driverInstance, 100), this);
//	  //  or
//	    PageFactory.initElements(new AjaxElementLocatorFactory(driverInstance, 100), LP);

		
		
		
	/*	The belw line of code will always be in Page class so that all findBy webelemts
		will get checked at the timeof their use only with a timeout..very helpful 
		for ajax.
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driverInstance, 100), this);
		
		*/

			LP.foo();
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
