package p1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

 

public class Screenshot_shot {

	
	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		
		FirefoxProfile profile = new FirefoxProfile();
		
		
		driver=new FirefoxDriver(profile);
		
		
		//driver.get("http://blog.codinghorror.com/double-click-must-die/");
			
		
		driver.get("http://www.euttaranchal.com/");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File scr= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr, new File("D:\\homepage.png"));
		
		
		WebElement we1=driver.findElement(By.xpath("//div[4]/div/ul/li[10]/a"));
		
		
		
		
		
		
		we1.click();
		
		Iterator<String> itr = driver.getWindowHandles().iterator();
		
		while(itr.hasNext())
		{
			
			String temphandle=itr.next();
			driver.switchTo().window(temphandle);
			
			System.out.println(driver.getTitle());
			
			
		}
		
		
		
		
		
		 scr= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr, new File("D:\\postClick.png"));
		
	}
		
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
}
