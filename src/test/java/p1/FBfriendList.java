package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FBfriendList {


	public WebDriver driver;

	JavascriptExecutor executor= (JavascriptExecutor) driver;  //hold the driver instance in java script executor


	/*
	 * There is one more javascriptexecutor.. check the correctone should from selenium side.
	 */

	@Test
	public void getFrndList() throws InterruptedException
	{


		driver= new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@class='inputtext' and @type='text']")).sendKeys("p18101984@gmail.com");
		driver.findElement(By.xpath("//*[@class='inputtext' and @type='password']")).sendKeys("stvcmnpcnmocratfoene");

		driver.findElement(By.xpath("//*[@type='submit']")).click();;




		driver.findElement(By.xpath("//*[@class='navItem firstItem tinyman litestandNavItem']/a/span")).click();


		Thread.sleep(2000);

		driver.manage().window().maximize(); 
		


		driver.findElement(By.xpath("//*[@id='fbTimelineHeadline']//a[contains(@href,'friends')]")).click();


		executor= (JavascriptExecutor) driver;



		while(true)
		{
			executor.executeScript("scroll(0,2500000)");
			Thread.sleep(2000);

			try{

				if(driver.findElement(By.xpath("//*[@id='timeline-medley']/div[2]/div[2]/div[1]/div/div/h3")).getText().contains("More About"))
				{
					break;	
				}


			}

			catch(Throwable t)
			{


			}


		}






		System.out.println(driver.findElements(By.xpath("//*[@class='fsl fwb fcb']")).size());



		for(WebElement s: driver.findElements(By.xpath("//*[@class='fsl fwb fcb']")))
		{
			System.out.println(s.getText());

		}
	}


	@AfterTest
	public void teardown(){

		driver.quit();
	}

}
