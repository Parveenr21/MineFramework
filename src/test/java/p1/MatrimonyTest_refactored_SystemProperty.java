package p1;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import site1.Matrimony;

public class MatrimonyTest_refactored_SystemProperty {

	
	WebDriver driver;


	@BeforeClass
	
	public void initializer() throws MalformedURLException
	{

		if(System.getProperty("browser").equalsIgnoreCase("ff"))
		{
			driver=getFirefoxDriverlocal();

		}
		else if (System.getProperty("browser").equalsIgnoreCase("iexplore")) {

			driver=getIEDriverInstance();
		}

		else if (System.getProperty("browser").equalsIgnoreCase("Chrome")) {
			driver=getChromeDriverInstance();	
		}

		else if (System.getProperty("browser").equalsIgnoreCase("ffremote")) {

			driver=getFirefoxDriverInstance();
			//driver=getFirefoxDriverlocal();
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

		System.setProperty("chromedriverHOMeDIr", "D:\\SELENIUM\\chromedriver_win32");
		File file =new File(System.getProperty("chromedriverHOMeDIr")+File.separator+"chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 

		return new ChromeDriver();
		

	}


	public static WebDriver getChromeDriverInstance1(){ //THIS METHOD WILL NOT WORK.. IT GOT CHANGED

		ChromeOptions opt = new ChromeOptions();//Chrome does not have profile.. it has options ..so do it just like firefox profile
		opt.setBinary("D:\\SELENIUM\\chromedriver_win32");
		WebDriver chromedriver = new ChromeDriver(opt);
		return chromedriver;


	}

	public  WebDriver getIEDriverInstance(){

		System.setProperty("IEDRIVErHOMeDIr", "D:\\SELENIUM\\IEDriverServer_Win32_2.39.0");
		File file =new File(System.getProperty("IEDRIVErHOMeDIr")+File.separator+"IEDriverServer.exe"); 


		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);





		return new InternetExplorerDriver(cap);
		

	}


	@AfterClass

	public  void teardown() throws MalformedURLException{

		//driver.quit();
		driver.close();

	}

}