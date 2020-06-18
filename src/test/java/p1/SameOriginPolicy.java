package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SameOriginPolicy {

	
	WebDriver driver;
	
	
	@Test
	public void tess1(){
		
		

		
		
		//DesiredCapabilities capabilty = DesiredCapabilities.internetExplorer();
		
		//DesiredCapabilities capability1 = new DesiredCapabilities();
		//capability1.setBrowserName(BrowserType.IE);


		/*FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(profile);
		WebDriver driver = new FirefoxDriver(opt);
*/
		driver = new FirefoxDriver();

		driver.get("http://www.euttaranchal.com/");
		
		//driver.findElement(By.xpath("//div[4]/div/ul/li[10]/a")).click();
		
		
		
		
		
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		
		/*
		driver.get("http://www.sacredyatra.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@rel='country6']")).click();
		
		*/
		
	}
	
}
