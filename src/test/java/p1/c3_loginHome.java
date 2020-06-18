package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site1.TravelHomePAge;
import site1.TravelLogin;

import java.io.IOException;
import java.net.MalformedURLException;

public class c3_loginHome {


	WebDriver driverInstance;
	DesiredCapabilities cap= new DesiredCapabilities();
	
	@BeforeTest
	public void setup(){
		
		 cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver","/Users/parawat/Downloads/geckodriver");
		cap.setCapability("firefox_binary", "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");

	}
	
	@Test
	public void testmethod1() throws MalformedURLException, IOException{
		
		driverInstance=new FirefoxDriver(cap);
		
		TravelLogin travlogin = new TravelLogin(driverInstance);
		TravelHomePAge travHomepage= new TravelHomePAge(driverInstance);
		
		travlogin.setPassword1PasswordField("auth.maui71@gmail.com").setPassword2PasswordField("Test@123").clickSignInButton();
		
		
		//Added explicit wait within a new  method...check for better usage..
		travHomepage.clickBookLink();
		
		
		
	//doing logout//added explicit wait within the  method.
		travHomepage.clickMrParveenRawatSiteLink().clickSignOutLink_moveTo();
		
		
		
		travlogin.setPassword1PasswordField("auth.maui71@gmail.com").setPassword2PasswordField("Test@123").clickSignInButton();
		
		//The driverinstane will be of the latest page.
		System.out.println(driverInstance.getPageSource());
		
		
		
		
	}
	
	
}


