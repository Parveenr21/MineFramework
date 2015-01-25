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

public class htmlunit_Driver_2 {

	
	
	
	@Test
	public void test1()
	{
		
		
		
		DesiredCapabilities capability = DesiredCapabilities.htmlUnitWithJs();
		WebDriver driver= new HtmlUnitDriver(capability);
		
		
		
		//WebDriver driver = new FirefoxDriver();
		
		
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
	
	
	
}
