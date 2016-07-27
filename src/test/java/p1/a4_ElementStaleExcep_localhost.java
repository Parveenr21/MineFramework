package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class a4_ElementStaleExcep_localhost {


	
//	WebDriver driver = new FirefoxDriver();
	WebDriver driver; 

	//uncommenting cache lookup will get u elementstale exception for 4th line.
	
	//@CacheLookup  
	
	
	 @FindBy(how = How.XPATH, using = "//a[contains(.,'Parallelizing Your Test Runs')]")
	  public WebElement we2;
	 
	 
	/* public ElementStaleExcep_localhost(WebDriver driver){
			
			this.driver=driver;
			
		}
	 */
	
	@Test
	public void Tempp1()
	{
		
		
		//Using Chrome Driver
		
		
		System.setProperty("webdriver.chrome.driver" ,  "/Users/parawat/Downloads/chromedriver");
		
		driver= new ChromeDriver();
		
		//driver.get("http://localhost:8080");
		driver.get("http://www.seleniumhq.org/docs/04_webdriver_advanced.jsp");
		
		
		
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
		
		WebElement we1=driver.findElement(By.xpath("//a[contains(.,'Parallelizing Your Test Runs')]"));
		
		
		
		System.out.println("1  "   + we1.getText());
		
		/*driver.navigate().refresh();
			
			uncommenting will bring elementstaleException
			
		*/
		
		System.out.println("2  " +    we1.getText());
		
		//LEARNING 1
		
		//System.out.println(driver.findElement(By.tagName("body")).getText());
		
		
		//There is find element and elements with respect to webelement tooo.. but that looks the relative path within the parent xpath...so use carefuly
		
		//System.out.println(we1.findElement(By.tagName("body")).getText());  //this will throw exception as body tag is much above
		
		
		
		
		
		//LEARNING 2
		
		
		/**  In page factory we use @FindBy annotation to get WebElement reference.. which 
		works differently..as here also we get webelement in a variable and use the variable later on in program ..but
		when ever we call the variable operation..then element finding is done again
		
		But this WeElement fiding should be done using FindBy and accessed by object which is returned by PageFactory.initEleents
		
		*/
		
		
		a4_ElementStaleExcep_localhost obj=PageFactory.initElements(driver, a4_ElementStaleExcep_localhost.class);
		
		
		//ElementLocatorFactory ef=new AjaxElementLocatorFactory(driver, 50);
		
		
		//Still need to learn proper use of AELF
		
		//The below statement set timeout for object for its visiblity here for 50 seconds..
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 50), a4_ElementStaleExcep_localhost.class);
		
		
		/*
		 * 
		 * Page Fatory by default opens a browser it self means it has instantiation somewhere
		 * so do not instantiate outside this..else 2 browsers will be openend.
		 * 
		 */
		
		driver.navigate().refresh();  //This line will not matter as the elements are found when they are used..so no element stale exception
		
		System.out.println("3    "+ obj.we2.getText());
		
		
		driver.navigate().refresh();
		
		
		
		System.out.println("4    "+ obj.we2.getText());
		
		
	}
	
	
	@AfterTest
	public void teardow(){
		
		driver.close();
		driver.quit();
	}

	
	
}
