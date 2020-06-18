package p1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class a2_CrossDomainPolicy {

	

	WebDriver driver;
	

	
	
	@Test
	public void test() throws InterruptedException
	{
		
		
/*		
 * IF we have created a firefox profile  say "webdriverProfile" to be used while running automation then
		we can access or read that in code by using following code
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("webdriverProfile");
		//Settting a prefernce
		myprofile.setAcceptUntrustedCertificates(true);
		driver=new FirefoxDriver(myprofile);
	
		*
		*/

/*

WEbdriver 3 usage

		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile=profile.getProfile("profile");

		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(FirefoxDriver.PROFILE, myprofile);
*/

		
		
		
		//IMP!!!!!!!  The below command will not create a new profile but it will create an object of the current profile to 
		//set the preferences so that we can run the test as per our need
		
		/*FirefoxProfile objectOfCurrentProfile = new FirefoxProfile();
		objectOfCurrentProfile.setAcceptUntrustedCertificates(true);
		//driver=new FirefoxDriver(objectOfCurrentProfile);
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(FirefoxDriver.PROFILE, objectOfCurrentProfile);
*/


		/*

		Earlier the way how we used to construct a FirefoxDriver is by passing desired capabilities object like FirefoxDriver(Capabilities desiredCapabilities) which is now Deprecated. But from Selenium v3.6.0 it is recommended to construct a FirefoxDriver with FirefoxOptions, like below:

FirefoxOptions options = new FirefoxOptions()
WebDriver driver = new FirefoxDriver(options);

		 */


		/*

		SAMPLE usage

		options.setLogLevel(FirefoxDriverLogLevel.TRACE);

//          profile.setPreference("devtools.toolbox.selectedTool", "netmonitor");
		profile.setPreference("devtools.toolbox.footer.height", 0);
		profile.setPreference("devtools.devedition.promo.enabled", false);
		profile.setPreference("devtools.devedition.promo.shown", false);
//		profile.addExtension(xpiFile);
		profile.addExtension(xpiFile1);
		options.addArguments("-devtools");
		 */



		FirefoxProfile objectOfCurrentProfile = new FirefoxProfile();
		objectOfCurrentProfile.setAcceptUntrustedCertificates(true);

		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(objectOfCurrentProfile);


		WebDriver driver = new FirefoxDriver(opt);






		//driver.get("http://blog.codinghorror.com/double-click-must-die/");
			
		driver.get("https://www.muscleguru.in/product_detail.php?pid=184");
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[contains(.,'Categories')]"))).perform();;
		driver.findElement(By.xpath("//a[@href='products.php?catid=3&catName=Creatine']")).click();


		driver.findElement(By.xpath("//option[@value='1']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		
		
		//Thread.sleep..here timein milliseconds..
		//Thread.sleep(33333);
		
	//now it will click on TWITTTER image and redirected to twitter domain
		//I was able to move to another domain easily
		
		//Webdriver has overcome the same origin policy issue
		
		
		driver.findElement(By.xpath("//img[@alt='twitter_icon']")).click();
		
		for( String currentWindow: driver.getWindowHandles())
		{
	        driver.switchTo().window(currentWindow);

			if(driver.getTitle().contains("Twitter"))
					break;
		
		
		}
		
		
		driver.findElement(By.xpath("//button[@class='user-actions-follow-button js-follow-btn follow-button btn']")).click();
		
		Thread.sleep(15000);
	
	}
	
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
}
