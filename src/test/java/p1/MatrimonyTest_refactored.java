package p1;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hamcrest.core.IsInstanceOf;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bsh.Capabilities;
import site1.Matrimony;



public class MatrimonyTest_refactored {

	
	WebDriver driver;

	

	@BeforeClass
	@Parameters("browser")
	public void initializer(String browser) throws MalformedURLException
	{

		if(browser.equalsIgnoreCase("ff"))
		{
			driver=getFirefoxDriverlocal();

		}
		else if (browser.equalsIgnoreCase("iexplore")) {

			driver=getIEDriverInstance();
		}

		else if (browser.equalsIgnoreCase("Chrome")) {
			driver=getChromeDriverInstance();	
		}

		else if (browser.equalsIgnoreCase("ffremote")) {

			//driver=getFirefoxDriverInstance();
			driver=getFirefoxDriverlocal();
		}

		
		

	}

@Test
	public void test1()
	{

		Matrimony M= PageFactory.initElements(driver, Matrimony.class);
		M.submitInfo("123", "Soalris1@", "pkrawat@gmail.com", "Divorcee");

		System.out.println(M.getAllLinksCount());


	}

	public  WebDriver getFirefoxDriverlocal(){


		FirefoxProfile fp= new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		//fp.addExtension("firebug.xpi");
		return new FirefoxDriver();
		
	}

	public  RemoteWebDriver  getFirefoxDriverInstance() throws MalformedURLException{

		DesiredCapabilities capab = new DesiredCapabilities();
		capab.setBrowserName("firefox");
		capab.setPlatform(Platform.WINDOWS);
		return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capab);


		
	}


	public  WebDriver getChromeDriverInstance(){

		System.setProperty("chromedriverHOMeDIr", System.getenv("CHROME_HOME"));
		File file =new File(System.getProperty("chromedriverHOMeDIr")+File.separator+"chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 

		
		
		return new ChromeDriver();
		

	}


	

	public  WebDriver getIEDriverInstance(){

		System.setProperty("IEDRIVErHOMeDIr", System.getenv("IE_HOME"));
		File file =new File(System.getProperty("IEDRIVErHOMeDIr")+File.separator+"IEDriverServer.exe"); 


		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		/*cap.setPlatform(Platform.WIN8);
		
		cap.setVersion("10");*/
		

		
		
		return new InternetExplorerDriver(cap);
		

	}


	@AfterClass

	public  void teardown() throws MalformedURLException{

		if(driver instanceof ChromeDriver){
			driver.close();
			driver.quit();
			
		}
		else{
			driver.quit();
		}
		
		
	}

}