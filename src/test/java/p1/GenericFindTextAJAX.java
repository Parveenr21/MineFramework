package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GenericFindTextAJAX {

	
	WebDriver driver= new FirefoxDriver();
	
	JavascriptExecutor executor;
	
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
	
	
}
