package p1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

 

public class Screenshot_shot {

	
	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException, IOException
	{

		/*FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(profile);
		WebDriver driver = new FirefoxDriver(opt);*/

		WebDriver driver=new FirefoxDriver();
		
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
