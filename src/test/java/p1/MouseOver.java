

package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MouseOver {

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		driver=new FirefoxDriver();
		
		
		driver.get("http://onlinestore.toolsqa.com/");
			
	
		Actions action = new Actions(driver);
		

		
		/*
		 * Use of KEYS up and down in ACTIONS classes.
		 * 
		 		here..the commands are built.. on by one
		 * 
		 * 
		 *   
		 * Actions action= new Actions(driver);
		 *
		 *action.keyDown(Keys.CONTROL).click(someElement).click(someOtherElement).keyUp(Keys.CONTROL);

		 * 
		 */
		
		
		/*
		 * 
		 * See this move to element is only required in hovering as we need to move to element in order 
		 * to see the list.. so once we see the menu items.. now
		 * 
		 * we can run normal commands
		 */
		
		action.moveToElement(driver.findElement(By.xpath("//nav/ul/li[2]/a"))).
		moveToElement(driver.findElement(By.xpath("//nav/ul/li[2]/ul/li[4]/a"))).click().perform();
		
	
		/*
		 * This code too works
		 * action.moveToElement(driver.findElement(By.xpath("//nav/ul/li[2]/a"))).perform();
		action.click(driver.findElement(By.xpath("//nav/ul/li[2]/ul/li[4]/a"))).perform();
		
		 *  here we are just identifying the menu items.. now we got it..so we can directly perform
				click operation on that.
		 * 
		 * 
		 */
				
		
		
		
		
		
		
		
		Thread.sleep(10000);
		
	/*	With some of the browser it happens that once mouse hover action is performed, 
		the menu list disappear with in the fractions of seconds before Selenium identify the 
		next submenu item and perform click action on it. In that case it is better to use ‘perform()’ 
		action on the main menu to hold the menu list till the time Selenium identify the sub menu item and click on it.*/
		
		/*
		action.moveToElement(driver.findElement(By.xpath("//nav/ul/li[2]/a"))).perform();
		
		action.moveToElement(driver.findElement(By.xpath("//nav/ul/li[2]/ul/li[4]/a"))).click().perform();
		*/
		
		/*
		 * chck the source code of perform()..It already calls build() first.so no need to call build() before perform.
		 * 
		 * ALWAYS REMEMBER FOR ALL THE ACTION CLASSES.. LAST STEP WOULD BE CALLING Perform();
		 * 
		 * 
		 * checked the source code of build()..It maintains the operation state ..till we performa any next step on that action.
		 * 
		 */
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
}
