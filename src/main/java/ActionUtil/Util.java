package ActionUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Util {
	
	
	static WebDriver driverInstance;
	
	 
	 // Actions action = new Actions(driver);
	
	
	
	/*
	 * Clear all cookies
	 * 
	 */
	
	public static void clearAllCookies(WebDriver driver){
		
		
		driver.manage().deleteAllCookies();
		
	}
	  
	  
	/*
	 * Delete specific cookie
	 * @Param driver
	 * 
	 * 
	 */
	
	public static void clearSpecificCookies(WebDriver driver, String cookiename)
	{
		
	driver.manage().deleteCookieNamed(cookiename);	
		
	}
	
	/*
	 * Get Current URL
	 * 
	 * @Param driver
	 * @return 
	 * 
	 */
	
	public static String getCurrentURL(WebDriver driver)
	{
		
		return driver.getCurrentUrl();
		
		
		
	}
	
	
	/* 
	 * 
	 * return driver instance
	 * 
	 * 
	 */
	
	public static WebDriver returnInstance(WebDriver driver){
		
		return driverInstance;
	}
	
	
	
	
	
	
	
	
	
	  /*
	   * Selecting a value from drop down By xPATH or any locator
	   * 
	   */
	  
	  public static void selectFromDropDown(WebElement we, String name ){
		  
		  Select foo=new Select(we);
		  foo.selectByVisibleText(name);
		  
		  
	  }
	  
	  

	  /*
	   * Selecting a value from drop down By xPATH or any locator
	   * 
	   */
	  
	  public static void selectFromDropDownusingClick(WebElement we, String name, WebDriver driver ){
		  
		  List<WebElement> options = driver.findElements(By.tagName("option"));
		  
		  for(WebElement option:options)
		  {
			  if(option.getText().equals(name))  //ALWAYS HAVE THE HABIT OF WRITING equals method to compare..BASICALLY FOR OBJECTS
			  {
				  option.click();
			  }
			  
		  }
		  
		  
	  }
	  
	  
	  /*
	   * 
	   * Entering a text to text box
	   * 
	   */
	  
	  	public static void sendKeys(WebElement we, String name ){
		  
	  		we.clear();;
	  		we.sendKeys(name);
		  
	  }
	  
	  	/*
	  	 * 
	  	 * clicking a command button (name is irrelevant)..based on xpath
	  	 * 
	  	 * 
	  	 */
	  
	  public static void click(WebElement we ){
		  
		 we.click();
		  
	  }
	  
	  /*
	   * check radio button selected status (Selcted or not)
	   * 
	   * 
	   */
	  
	  public static boolean checkRadiobuttonSelected(WebElement we ){
		  
			 return we.isSelected();
			  
	  }
	
	  /*
	   * Click radio button status 
	   * 
	   * 
	   */
	  
	  public static  void clickRadioButton(WebElement we ){
		  
		we.click();
			  
	  }
	  
	  
	  /*
	   * check Checkbox enabled status (Selcted or not)
	   * 
	   * 
	   */
	  public static boolean checkCheckBoxSelected(WebElement we ){
		  
			 return we.isSelected();
			  
	  }
	  
	  
	  /*
	   * click  Checkbox 
	   * 
	   * 
	   */
	  public static void clickCheckBox(WebElement we ){
		  
			we.click();
				  
		  }
	  
	  
	  
	  
	  
}
