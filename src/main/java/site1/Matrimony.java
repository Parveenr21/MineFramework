package site1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ActionUtil.Util;

public class Matrimony {

	WebDriver driverInstance;
	String baseURL="http://www.euttaranchal.com/matrimonials/register";
	
	
	public Matrimony(WebDriver driver){
		
		driverInstance=driver;
		
		driverInstance.get(baseURL);
		
		
		
	}
	
	
	

	//First command button 
	  @FindBy(how = How.XPATH, using = "//*[@id='id']")
	  public WebElement ID;
	  

		//First command button 
		  @FindBy(how = How.XPATH, using = "//*[@id='password']")
		  public WebElement pasword;
		  

			//First command button 
			  @FindBy(how = How.XPATH, using = "//*[@id='email']")
			  public WebElement email;
	
			  

				//First command button 
				  @FindBy(how = How.XPATH, using = "//tbody/tr[11]/td[2]/input[1]")
				  public WebElement male;
				  

					//First command button 
					  @FindBy(how = How.XPATH, using = "//tbody/tr[11]/td[2]/input[2]")
					  public WebElement female;
			  
					  
					  

						//First command button 
						  @FindBy(how = How.XPATH, using = "//*[@id='marital_status']")
						  public WebElement maritalstatus;

						  
						  
						  
						  
	  public void submitInfo(String ID, String password,String Email,String Maritalstatusvalue){
		  
		  Util.sendKeys(this.ID, ID);
		  Util.sendKeys(this.pasword, password);
		  Util.sendKeys(this.email, Email);
		  Util.selectFromDropDown(maritalstatus, Maritalstatusvalue);
		  
		  Util.returnInstance(driverInstance);
		  
		  System.out.println(Util.getCurrentURL(driverInstance));
		  
		  
	  }
	  
	  
	  
public void submitInfoANOTHERway(String ID, String password,String Email,String Maritalstatusvalue){
		  
		  Util.sendKeys(this.ID, ID);
		  Util.sendKeys(this.pasword, password);
		  Util.sendKeys(this.email, Email);
		  Util.selectFromDropDownusingClick(maritalstatus, Maritalstatusvalue, driverInstance);
		  
		  Util.returnInstance(driverInstance);
		  
		  System.out.println(Util.getCurrentURL(driverInstance));
		  
		  
	  }


public int getAllLinksCount()

{
	
	return (driverInstance.findElements(By.tagName("a")).size());
	
}


public void checkAllLinksWorking()

{
	
	List<WebElement> allLinks= driverInstance.findElements(By.tagName("a"));
	
	for(WebElement link:allLinks)
	{
		
		
	}
	
	
	
}
	  
	  
}
