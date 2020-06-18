package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class a5_FBfriendList {


	public WebDriver driver;

  public JavascriptExecutor executor;


	/*
	 * There is one more javascriptexecutor.. check the correctone should from selenium side.
	 */

	@Test
	public void getFrndList() throws InterruptedException
	{


		driver= new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("p18101984@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("stvcmnpcnmocratfoene");

		driver.findElement(By.xpath("//*[@type='submit']")).click();;



//Logged in now.. clicking on loggedin User's profile or Timeline
		driver.findElement(By.xpath("//a[contains(@data-gt,'timeline')]")).click();


		Thread.sleep(2000);

		
		
		
		driver.manage().window().maximize(); 
		

//Clicking on the friends tab
		driver.findElement(By.xpath("//a[@data-tab-key='friends']")).click();

		//Prepare Java scriot executor and cast driver instance to it
		
		executor= (JavascriptExecutor) driver; //hold the driver instance in java script executor



		while(true)
		{
			executor.executeScript("scroll(0,2500000)"); //pixel specification
			Thread.sleep(2000);

			try{

//				if(driver.findElement(By.xpath("//h3[contains(.,'More About')]")).getText().contains("More About"))
	
				if(driver.findElement(By.xpath("//h3[contains(.,'More About')]")).isDisplayed())

				{
					break;	
				}


			}

			catch(Throwable t)
			{

				//Catch block.. beacuse ..when object will not be found.. catch block will keep on the iteration
				
System.out.println("inside CATCH block");
			}


		}




//Finding all friends .. counts of the logged inuser
		//Either try to check for a generic xxpath locator which will find for all user 
		//OR
		//INSPECT one ELEMENT and check for something generic and then create xpath on your own
		

		System.out.println(driver.findElements(By.xpath("//*[@class='fsl fwb fcb']")).size());



		for(WebElement s: driver.findElements(By.xpath("//*[@class='fsl fwb fcb']")))
		{
			System.out.println(s.getText());  //Printing the name of Friends

		}
	}


	@AfterTest
	public void teardown(){

		driver.quit();
	}

}
