package p1;

import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class a8_GoogleListSize {

	WebDriver driver;
	
	@Test
	public void getSize() throws InterruptedException
	{
		
		
		/*LoggingPreferences logs = new LoggingPreferences();
		logs.enable(LogType.BROWSER, Level.ALL);
		logs.enable(LogType.CLIENT, Level.ALL);
		logs.enable(LogType.DRIVER, Level.ALL);
		logs.enable(LogType.PERFORMANCE, Level.ALL);
		logs.enable(LogType.PROFILER, Level.ALL);
		logs.enable(LogType.SERVER, Level.ALL);

		DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
		desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);

		
		Logs logs1 = driver.manage().logs();
		LogEntries logEntries = logs1.get(LogType.DRIVER);

		for (LogEntry logEntry : logEntries) {
		    System.out.println(logEntry.getMessage());
		}
		
		WebDriver driver = new FirefoxDriver(desiredCapabilities);*/
		
		driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		//As soon as we start typing..it gets to a new page.. so xpath of that edit box.
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("hy");
		
		
	/*	
	 * 
	 * 
		String xp="//table[@class='gssb_m']/tbody";
		
		
		List<WebElement> weList= driver.findElements(By.xpath(xp + "/tr"));
		
		
			System.out.println(weList.size());
		int counter=0;
		
		
		for(WebElement we: weList)
		{
			
		++counter;	
			
			//Webelemtn calling findby and webdriver calling find by is same..both intreface webdriver and webelemtn has this method and returns same
		
		//nosuchelement found exception..and got implemented by remotewebdriver
			
			
			
			System.out.println(we.findElement(By.xpath(xp + "/tr["+ counter +"]//tr/td/span")).getText());
			
			//table[@class='gssb_m']/tbody/tr[1]//tr/td/span
			
		
		*/
		
		
		
		//This thread.sleep is most important ..else you will alw
		
		Thread.sleep(2000); 
		
		List<WebElement> we= driver.findElements(By.xpath("//*[@class='sbdd_b']//li[@*]"));
		
		System.out.println("LIST size is " + we.size());
		
		int i=0;
		for (WebElement w:we)
		{
			
		System.out.println(i+". "+w.getText());
		}
		
		
		
		//NEW ONE
		
		
		/*
		 * Here using inspect element and firepath.. check for unique path till list box and then 
		 * list items
		 * 
		 * e.g //*[@class='sbdd_b']     --> This is list box xpath
		 * 
		 * //*[@class='sbdd_b']//li			--> This is all list items
		 * SAME as 
		 * 
		 * //*[@class='sbdd_b']//li[@*]
		 * 
		 */
		
	
		
		
	}
	
	@AfterTest
	public void teardown(){

		driver.quit();
	}

	
}
