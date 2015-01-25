package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ElementStaleExcep_localhost {


	
	WebDriver driver = new FirefoxDriver();


	 @FindBy(how = How.XPATH, using = "//td/a[contains(@href,'SO')]")
	  public WebElement we2;
	 
	
	@Test
	public void Tempp1()
	{
		
		driver.get("http://localhost:8080");
		
		
		
		
		/*
		 *web element is an interface which is implemented by htmlunit class and some more class 
		 * here wheneever we run any of the method say webelement.click();
		 * 
		 * Then this webelement is checked for its existence and it should be attached to DOM
		 * simply if DOM is recreated or changed after element finding..
		 * any opeeation or finding the element itself will throw the element stale exception.
	 
		 * e.g. try refreshing page or fire any Js after element finding
		 * 
		 * 
		 */
		
		WebElement we1=driver.findElement(By.xpath("//td/a[contains(@href,'SO')]"));
		
		/*driver.navigate().refresh();
					System.out.println(we1.getText());
		*/
		
		
		
		
		
		//System.out.println(driver.findElement(By.tagName("body")).getText());
		
		
		//There is find element and elements with respect to webelement tooo.. but that looks the relative path within the parent xpath...so use carefuly
		
		//System.out.println(we1.findElement(By.tagName("body")).getText());  //this will throw exception as body tag is much above
		
		
		/*But in page factory we use @FindBy annotation to get WebElement reference.. which 
		works differntly..as here also we get webelement in a variable and use the variable later on in program ..but
		when ever we call the variable operation..then element finding is done again
		
		But this WeElement fiding should be done using FindBy and accessed by object which is returned by PageFactory.initEleents
		
		*/
		
		
		ElementStaleExcep_localhost obj=PageFactory.initElements(driver, ElementStaleExcep_localhost.class);
		
		/*
		 * 
		 * Page Fatory by default opens a browser it self means it has instantiation somewhere
		 * so do not instantiate outside this..else 2 browsers will be openend.
		 * 
		 */
		
		
		System.out.println(obj.we2.getText());
		
		
		driver.navigate().refresh();
		
		System.out.println(obj.we2.getText());
		
		
	}
	
	
	@AfterTest
	public void teardow(){
		
		driver.close();
		driver.quit();
	}

	
	
}
