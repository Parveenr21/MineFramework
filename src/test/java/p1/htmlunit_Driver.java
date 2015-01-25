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

public class htmlunit_Driver {

	
	
	
	@Test
	public void test1()
	{
		
		
		
		DesiredCapabilities capability = DesiredCapabilities.htmlUnitWithJs();
		WebDriver driver= new HtmlUnitDriver(capability);
		
		
		
		//WebDriver driver = new FirefoxDriver();
		
		
		
		
	      
		
		driver.get("http://irctc.co.in/");
		driver.manage().deleteAllCookies();
		
		
		
		
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
		
		driver.findElement(By.xpath("//td//input[@name='userName']")).clear();
		
		driver.findElement(By.xpath("//td//input[@name='userName']")).sendKeys("prawat6");
		
		driver.findElement(By.xpath("//td//input[@name='password']")).clear();
		
		driver.findElement(By.xpath("//td//input[@name='password']")).sendKeys("pcq997");	
	
		//driver.findElement(By.xpath("//td//input[@name='password']")).submit();
		
		
		WebDriver driver1= new FirefoxDriver();
		
		
		driver1=driver;
		
		driver1.navigate().refresh();
		
		System.out.println(driver1.getCurrentUrl());
		
		
	}
	
	
	
}
