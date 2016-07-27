package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class a6_GenericFindTextAJAX {

	
	WebDriver driver= new FirefoxDriver();
	
	JavascriptExecutor executor;
	
	
	//A Generic find method that can be used to identify an element presence which appears on scrolling
	
	
	
	public void find(String STR) throws InterruptedException
	{
		
		while(true)
		{
			
			executor=(JavascriptExecutor)driver;
			executor.executeScript("scroll(0,2500000)");
			Thread.sleep(2000);

			try{

				if(driver.findElement(By.xpath("//*[@id='timeline-medley']/div[2]/div[2]/div[1]/div/div/h3")).getText().contains(STR))
				{
					break;	
				}


			}

			catch(Throwable t)
			{


			}


		}
		
		
	}
	
	
	//Same can be used for AJAX elements as well with little tweaks
	//Here must have to come out from while loop incase element never comes or appears
	
	public void findAjaxElement(String STR) throws InterruptedException
	{
		int i=50;
		
		while(i<50) //Going with 50 iteration of 2 seconds.. means 100 seconds wait for the element.
		{
			
			
			

			try{

				if(driver.findElement(By.xpath("//*[@id='timeline-medley']/div[2]/div[2]/div[1]/div/div/h3")).getText().contains(STR))
				{
					break;	
				}


			}

			catch(Throwable t)
			{


			}
			Thread.sleep(2000);
			++i;
		}
		
		
	}
	
}
