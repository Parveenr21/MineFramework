package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site1.TechnoSoftHome;
import site1.TechnoSoftInquiry;

import java.util.concurrent.TimeUnit;

public class c1_TestTechnoPageFactory {

	WebDriver driver;
	DesiredCapabilities cap;
	
	@BeforeTest
	public void setup(){
		
		 cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		
		
		
		System.setProperty("webdriver.gecko.driver","/Users/parawat/Downloads/geckodriver");
		cap.setCapability("firefox_binary", "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");

	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		System.out.println("Inside Test method");
		
		
		
		driver=new FirefoxDriver(cap);
		
		((RemoteWebDriver)driver).getCapabilities();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		TechnoSoftHome techhome= new TechnoSoftHome();
		TechnoSoftInquiry techinquiry=new TechnoSoftInquiry();
	
		techhome=PageFactory.initElements(driver, TechnoSoftHome.class);
		
		techhome.verifyPageUrl();
		techinquiry=PageFactory.initElements(driver, TechnoSoftInquiry.class);
		
		
		techhome.clickOnlineInquiry1Link();
		
		System.out.println("Exiting.");
		
	}
	
	@AfterTest
	public void teardown(){
		
		driver.close();
	}
	
	
		
	
	
	
}
