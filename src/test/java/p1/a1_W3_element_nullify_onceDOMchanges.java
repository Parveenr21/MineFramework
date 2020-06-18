package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.*;
import org.testng.annotations.*;

public class a1_W3_element_nullify_onceDOMchanges {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{


		/*

		cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", false);	//DEFAULT is true and marionette needs it true.
		System.setProperty("webdriver.gecko.driver","/Users/parawat/Downloads/geckodriver");
		cap.setCapability("firefox_binary", "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");

		//The below statement is required when we use marionette TRUE..else legacy one will worl
		//DEFAULT capability is TRUE for marionette.



		 */
DesiredCapabilities cap= DesiredCapabilities.firefox();
		
		cap.setCapability("marionette", true);	//RUN by keeping it true only
		cap.setCapability("firefox_binary", "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");

		System.setProperty("webdriver.gecko.driver","/Users/parawat/Downloads/geckodriver");

		driver=new FirefoxDriver();
		
		
	}
	
	
	@Test
	public void testMethod1()
	{
		
		driver.get("http://www.w3schools.com/");
		
		WebElement we=driver.findElement(By.xpath("//div/a[4]"));
		

		System.out.println("###" +we.getTagName() );
		
		System.out.println("###" + 		we.getText() );
		
		
		//we.click();
		
		/*Once the DOM get changed by element..or even we go to some other page and come back..then
		this stored web element can not be used..we need to run this findby again to find that element
		*/
		
		
		driver.get("http://www.w3schools.com/");
		
		
		
		System.out.println("###" +" " );
		
		
		System.out.println("###" +we.getTagName() );
		
		System.out.println("###" + 		we.getText() );
		

		
		
	}
	
	
}
