package p1;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.javascript.host.geo.Position;

public class b4_PhantomJS {

	
	
	/*
	@Test
	public void test1()
	{
		
		
		p
		 * Headless browser is a browser without a GUI
		 * It would definetely be the fastest implementation but there is a catch.
		 * Actually it is not that full feature rich as the GUI based browser implementation is
		 * much better in handling of java scripts call as compared to headless browser implementation
		 * 
		 * e.g htmlunit driver:-- lightest and fastest but lacks in handling all sites
		 * phantom.js :-- much better.
		 * 
		 * 
		 * actually a webapge is firstly download at client site and then page is rendered and then 
		 * java scripts are triggered.. which happens in GUI based very well but in headless
		 * this java script triggering is ignored as it can not know if that happened.
		 * 
		 * headless cannot emulate other browsers JavaScript behavior

		Using HtmlUnitDriver is piece of cake, because HtmlUnit is pure java library, 
		but disadvantage is limited JavaScript execution support, making it usable for mostly static html sites only.

		 * 
		 
		
		
		
		
		
		
		
		
		 * DesiredCapabilities capability = DesiredCapabilities.htmlUnitWithJs();
		WebDriver driver= new HtmlUnitDriver(capability);
		//	WebDriver driver= new HtmlUnitDriver();
		 * 
		 * 
		 * here I am getting 
		
		 * java.lang.reflect.InvocationTargetException 
		 * possibly because of new browser driver gecko
		 * 
		 
		
		
	
	 * 
	 * PhantomJS is a headless browser with JavaScript API. 
	 * It is an optimal solution for Headless Website Testing, 
	 * access and manipulate webpages & comes with the standard DOM API.
	 * 
	 * 
	 * PhantomJS is a headless WebKit browser
	 *  and GhostDriver is an implementation of the WebDriver Wire Protocol that's built into PhantomJS.
	 * 
	 * 
	 * So we need to download phatomJS driver server and set it to property path
	 * just like chrome or opera driver
	 * 
	 * 
	 * 	
	 * NOW 2 things we need  
	 * 
	 * 1. DRIVER SERVER for DRIVER implmentation for PHANTOM js.. which we download and set the
	 * path of phantomJS driver server using System.setProperty
	 *
	 * 
	 * 



	 * 2. Now we need to have ..implementation class of phantom js driver.. selenium jar has bundled chromedriver, 
	 * firefoxdriver, IEdriver, edgeDriver classes
	 * 
	 * but phantomjs driver class is missing in here.. so we got it by maven dependency.
	 * 
	 * <dependency>
    <groupId>com.github.detro.ghostdriver</groupId>
    <artifactId>phantomjsdriver</artifactId>
    <version>1.2.0</version>
</dependency>
	 * 
	
	 
		
		
		
		 * 
		 * Adding PhantomJS v.1.2.0 replaces the selenium-remote-driver-2.53.0.jar with selenium-remote-driver-2.41.0.jar and hence breaks down everything. And now using V.2.41.0,
		 * 
		 * Now removed the maven dependency for now.
		 * 
		 
		
	
		
		System.setProperty("phantomjs.binary.path", "/Users/parawat/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
		
	      WebDriver driver = new PhantomJSDriver();	
	     
	      
		
		driver.get("http://www.w3schools.com/");
		
		System.out.println(driver.findElements(By.xpath("//html/body/div[3]/div/a")).size());  
		
		
		
		System.out.println(driver.getCurrentUrl());
		
	System.out.println();
		
	int x=driver.manage().window().getPosition().getX();			//4
	  	 int y =driver.manage().window().getPosition().getY();		//4
		
		int hight=driver.manage().window().getSize().getHeight();		//645
		int width=driver.manage().window().getSize().getWidth();		//1200
	
		
		System.out.println(x);		//4
		System.out.println(y);		//4
		System.out.println(hight);	//645
		System.out.println(width);	//1200
		
		
		Point p = new Point(8, 8); //to set postion
		
		
		Dimension d = new Dimension(1201, 800);
		
		
		driver.manage().window().setPosition(p);
		driver.manage().window().setSize(d);
		
		
		
		 x=driver.manage().window().getPosition().getX();			//4
	  	  y =driver.manage().window().getPosition().getY();		//4
		
		 hight=driver.manage().window().getSize().getHeight();		//645
		 width=driver.manage().window().getSize().getWidth();		//1200
	
		
		System.out.println(x);		//4
		System.out.println(y);		//4
		System.out.println(hight);	//645
		System.out.println(width);	//1200
		
		
		
		System.out.println(driver.getPageSource());
		
		
		
		
		//System.out.println(driver.switchTo().activeElement().getText());
		
		
		
		WebDriver driver1= new FirefoxDriver();
		
		
		driver1=driver;
		
		driver1.navigate().refresh();
		
		System.out.println(driver1.getCurrentUrl());
		
		
	
		System.out.println(driver1.findElements(By.xpath("//html/body/div[3]/div/a")).size());  
	
		
	
	
	}
	
	*/
	
}
