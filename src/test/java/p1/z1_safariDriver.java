package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class z1_safariDriver {
	
@Test
	public void test()
	{
		
		
	/*
	 * 
	 * Now safari driver easily get invoked but we get
	 * org.openqa.selenium.SessionNotCreatedException: Could not create a session: 
	 * You must enable the 'Allow Remote Automation' option in Safari's Develop menu to control
	 *  Safari via WebDriver. (WARNING: The server did not provide any stacktrace information)

	 * so fix is allow DEVELOP mode and enable remote automation
	 * 
	 * now from Selenium 3 onward..online SAFARI does not need external driver to be downloaded.
	 * 
	 * while for Firefox, Opera, Chrome, IE and Edge we needs external driver to be downloaded
	 * 
	 */
	
		WebDriver driver;
	       // Launch SafariDriver
	       driver = new SafariDriver();
	       // Open the web page
	       driver.get("http://google.com");
	       // Enter the text in the search box
	       WebElement searchText = driver.findElement(By.name("q"));
	       searchText.sendKeys("SafariDriver");
	       // Close the driver
	       driver.quit();
		
	}

}
