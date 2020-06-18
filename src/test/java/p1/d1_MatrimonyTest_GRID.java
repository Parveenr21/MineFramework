package p1;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import site1.Matrimony;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class d1_MatrimonyTest_GRID {

	WebDriver firefoxdriverLOCAL ;
	RemoteWebDriver firefoxdriverREMOTE;
	WebDriver chromedriverlocal;
	WebDriver IEdriverlocal;
	WebDriver safariDriverlocal;
	DesiredCapabilities cap= new DesiredCapabilities();
			
			
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
	
	
	
	/*
	 * 
	 * For backwards compatibility "wd"(webdriver) and "rc"(remotecontrol) roles are still a valid subset of the "node" role.
	 *  But those roles limit the types of remote connections to their corresponding API, while "node" allows
	 *   both RC and WebDriver remote connections.
	 */
	
	
	/*
	 * LINUX hub
	 * Windows NODE
	 * 
	 * You have to include the IE driver, as well as the selenium-server-standalone-1.45.0.jar in the Windows PATH environment variable,
	 *  and NOT include the "System.setProperty("webdriver.ie.driver", details[1]);" line in the test running on the linux machine
	 */
	
	@Test
	public void testSignup() throws MalformedURLException
	{
	
	
	
	//FirefoxProfile fp= new FirefoxProfile();
	
	
	//fp.setAcceptUntrustedCertificates(true);
	
	//fp.addExtension("firebug.xpi");
	
	
	
	
	
	
	/*WebDriver driver= new FirefoxDriver(fp);
	
	Matrimony M= PageFactory.initElements(driver, Matrimony.class);
	*/
	
	
	//Matrimony M= PageFactory.initElements(getFirefoxDriverlocal(), Matrimony.class);
	
	Matrimony M= PageFactory.initElements(getFirefoxDriverREMOTEInstance(), Matrimony.class);
	
		//Matrimony M= PageFactory.initElements(getSafariLocalDriver(), Matrimony.class);
		
	//Matrimony M= PageFactory.initElements(getChromeDriverInstance(), Matrimony.class);
	//Matrimony M= PageFactory.initElements(getIEDriverInstance(), Matrimony.class);
	//Matrimony M= PageFactory.initElements(getChromeDriverInstance1(), Matrimony.class);
	
	M.submitInfo("123", "Soalris1@", "pkrawat@gmail.com", "Divorcee");
	
	System.out.println(M.getAllLinksCount());
	
	
	//M.submitInfoANOTHERway("123", "Soalris1@", "pkrawat@gmail.com", "Divorcee");
	
	
}
	
	public  WebDriver getFirefoxDriverlocal(){
		
		cap = DesiredCapabilities.firefox();
			cap.setCapability("marionette", true);
			System.setProperty("webdriver.gecko.driver","/Users/parawat/Downloads/geckodriver");
			cap.setCapability("firefox_binary", "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");
		
			FirefoxDriver firefoxdriverLOCAL= new FirefoxDriver(cap);
		
			return firefoxdriverLOCAL;
	
		
		
	}
	
	
public  RemoteWebDriver  getFirefoxDriverREMOTEInstance() throws MalformedURLException{
	
	
	
	
	//firefoxdriver = new FirefoxDriver();
	
	
	cap.setBrowserName("firefox");
	cap.setCapability("marionette", true);
	System.setProperty("webdriver.gecko.driver","/Users/parawat/Downloads/geckodriver");
	//cap.setPlatform(Platform.WINDOWS);
	cap.setPlatform(Platform.LINUX);
	/*
	 * InvocationTargetException is thrown when 
	 * Error forwarding a new session can not find capabilities when set wrong capabilties.
	 * 
	 * 
	 */
	//cap.setPlatform(Platform.MAC);
	firefoxdriverREMOTE = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	
	
	return firefoxdriverREMOTE;
}


public SafariDriver getSafariLocalDriver()
{
	
	return new SafariDriver();
	
	
	//SAFARI driver does not handle alerts..
	//Alerts need to be handled using java script
	
	/*
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) webDriver;
js.executeScript("window.alert = function(){ return true;}");
el.click();
	 * 
	 */
	
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
	


public  WebDriver getRemtoeIEDriverInstance(){
	
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