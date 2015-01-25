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
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import site1.Matrimony;

public class MatrimonyTest {

	WebDriver firefoxdriverLOCAL ;
	RemoteWebDriver firefoxdriverREMOTE;
	WebDriver chromedriverlocal;
	WebDriver IEdriverlocal;
	/*@Test
	
	public void samplet() throws InterruptedException{
		long l=0;
		
				
				for(l=0;l<9999999;l++)
		{
		   			System.out.println(l);
					
					l=l+9;
					Thread.sleep(20);
		}
		
		
	}*/
	
	
	@Test
	public void testSignup() throws MalformedURLException
	{
	
	
	
	FirefoxProfile fp= new FirefoxProfile();
	
	
	fp.setAcceptUntrustedCertificates(true);
	
	//fp.addExtension("firebug.xpi");
	
	
	
	
	
	
	/*WebDriver driver= new FirefoxDriver(fp);
	
	Matrimony M= PageFactory.initElements(driver, Matrimony.class);
	*/
	
	
	//Matrimony M= PageFactory.initElements(getFirefoxDriverlocal(), Matrimony.class);
	
	
	//Matrimony M= PageFactory.initElements(getChromeDriverInstance(), Matrimony.class);
	Matrimony M= PageFactory.initElements(getIEDriverInstance(), Matrimony.class);
	//Matrimony M= PageFactory.initElements(getChromeDriverInstance1(), Matrimony.class);
	
	M.submitInfo("123", "Soalris1@", "pkrawat@gmail.com", "Divorcee");
	
	System.out.println(M.getAllLinksCount());
	
	
	//M.submitInfoANOTHERway("123", "Soalris1@", "pkrawat@gmail.com", "Divorcee");
	
	
}
	
	public  WebDriver getFirefoxDriverlocal(){
		
		firefoxdriverLOCAL= new FirefoxDriver();
	
		

		
		return firefoxdriverLOCAL;
	
		
		
	}
	
public  RemoteWebDriver  getFirefoxDriverInstance() throws MalformedURLException{
	
	
	
	
	//firefoxdriver = new FirefoxDriver();
	
	
	DesiredCapabilities capab = new DesiredCapabilities();
	capab.setBrowserName("firefox");
	capab.setPlatform(Platform.WINDOWS);
	firefoxdriverREMOTE = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capab);
	
	
	return firefoxdriverREMOTE;
}
	
	
public  WebDriver getChromeDriverInstance(){
		
		System.setProperty("chromedriverHOMeDIr", "D:\\SELENIUM\\chromedriver_win32");
		File file =new File(System.getProperty("chromedriverHOMeDIr")+File.separator+"chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 
				
		 chromedriverlocal = new ChromeDriver();
		return chromedriverlocal;
		
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
	
	
	
	
	
	IEdriverlocal= new InternetExplorerDriver(cap);
	return IEdriverlocal;
	
}
	

@AfterTest

public  void teardown() throws MalformedURLException{
	
	// firefoxdriverLOCAL.quit();
	/* firefoxdriverREMOTE.quit();
	 chromedriverlocal.quit();
	 IEdriverlocal.quit();
	 
	 *
	 *here if we try to quit unused instance.. it wil give Null pointer exception
	 */
	
	
}

}