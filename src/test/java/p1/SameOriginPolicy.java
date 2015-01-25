package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class SameOriginPolicy {

	
	WebDriver driver;
	
	
	@Test
	public void tess1(){
		
		
		driver = new FirefoxDriver();
		
		
		DesiredCapabilities capabilty = DesiredCapabilities.internetExplorer();
		
		DesiredCapabilities capability1 = new DesiredCapabilities();
		capability1.setBrowserName(BrowserType.IE);
		
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
