package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class a8_GoogleListSize {

	WebDriver driver;
	
	@Test
	public void getSize() throws InterruptedException
	{
		
		driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		//As soon as we start typing..it gets to a new page.. so xpath of that edit box.
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("hy");
		
		
	/*	
	 * 
	 * 
		String xp="//table[@class='gssb_m']/tbody";
		
		
		List<WebElement> weList= driver.findElements(By.xpath(xp + "/tr"));
		
		
			System.out.println(weList.size());
		int counter=0;
		
		
		for(WebElement we: weList)
		{
			
		++counter;	
			
			//Webelemtn calling findby and webdriver calling find by is same..both intreface webdriver and webelemtn has this method and returns same
		
		//nosuchelement found exception..and got implemented by remotewebdriver
			
			
			
			System.out.println(we.findElement(By.xpath(xp + "/tr["+ counter +"]//tr/td/span")).getText());
			
			//table[@class='gssb_m']/tbody/tr[1]//tr/td/span
			
		
		*/
		
		
		
		//This thread.sleep is most important ..else you will alw
		
		Thread.sleep(2000); 
		
		List<WebElement> we= driver.findElements(By.xpath("//*[@class='sbdd_b']//li[@*]"));
		
		System.out.println("LIST size is " + we.size());
		
		int i=0;
		for (WebElement w:we)
		{
			
		System.out.println(i+". "+w.getText());
		}
		
		
		
		//NEW ONE
		
		
		/*
		 * Here using inspect element and firepath.. check for unique path till list box and then 
		 * list items
		 * 
		 * e.g //*[@class='sbdd_b']     --> This is list box xpath
		 * 
		 * //*[@class='sbdd_b']//li			--> This is all list items
		 * SAME as 
		 * 
		 * //*[@class='sbdd_b']//li[@*]
		 * 
		 */
		
	
		
		
	}
	
	@AfterTest
	public void teardown(){

		driver.quit();
	}

	
}
