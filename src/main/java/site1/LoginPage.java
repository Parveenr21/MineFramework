package site1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ActionUtil.Util;


public class LoginPage  {

  //public static final String PAGE_URL = System.getProperty("BaseURL")+"/login.htm";
  
  
	String PAGE_URL="http://www.w3schools.com/";
  
  
  WebDriver driver;
	
  public LoginPage(WebDriver driver) {
	    this.driver=driver;
	  this.driver.get(PAGE_URL);	    	    
	  }
  
	
/*	
  public LoginPage(WebDriver driver) {
    super(driver,PAGE_URL);
  
  }

  *//**
   * Added one more constructor with dummy param to bypass opening a new page  
   * 
   *//*
  public HomePage(WebDriver driver,boolean DoNotOpenANewPage) {
    super(driver);
  }
*/  
 
  
  
  /*
   * 
   * @FindBy(how = How.NAME, using = "logonName")
private WebElement logonNameField;

@FindBy(how = How.NAME, using = "password")
private WebElement passwordField;
Now, as for How., you can have:

CLASS_NAME
CSS
ID
ID_OR_NAME
LINK_TEXT
NAME
PARTIAL_LINK_TEXT
TAG_NAME
XPATH
class
   */
  
  
  //xpath for dropdown.
  @FindBy(how = How.XPATH, using = "//select[@id='A']")
  public WebElement selA;
 
  //xpath for text box.
  @FindBy(how = How.XPATH, using = "//input[@id='B']")
  public WebElement selB;
   
  //xpath for  checkbox.
  @FindBy(how = How.XPATH, using = "//input[@id='C']")
  public WebElement selC;
  
  
 
  //xpath for Save Button.
  @FindBy(how = How.XPATH, using = "//input[@id='D']")
  public WebElement selD;
   

//First Radio button Yes
  @FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='Yes']")
  public WebElement selE;  
  


//First Radio button Yes
  @FindBy(how = How.XPATH, using = "//html/body/div[3]/div/a[5]")
  public WebElement linkJavaScript;  
  
  

  @FindBy(xpath = "//*[@id='main']/div[1]/div[1]/a[1]")
  public WebElement learnHtml;

    /*
     * 
     * less Verbose way to declare this  
     * 
     * @FindBy(name = "q")
     *  private WebElement searchBox;
     */
  
  
      /**
       * Function for Creating record
       * USE :
       * 
       */
      public void CreateRecord(String dropdownname, String AssetType, String CreativeName, String Language, String PresentationType,String ImageURLOrMediaPlexId,
          String LandingURL) throws Exception
      {
        
    	//  Util.checkRadiobuttonSelected(driver, selE);
    	  
      } 
      
      
      public int getAllLinksCount()

      {
      	
      	return (driver.findElements(By.xpath("//a[not(contains(@href,'javascript') or contains(@href,'#'))]")).size());
      	
      }


      public void getTextOrURLName()

      {
      	
      	List<WebElement> allLinks= driver.findElements(By.xpath("//a[not(contains(@href,'javascript') or contains(@href,'#'))]"));
      	
      	for(WebElement link:allLinks)
      	{
      		

      		

      		System.out.println(link.getText());
      	}
      	
      	
      	
      }
     
      
      public void CheckALLURL() throws MalformedURLException, IOException
      {
    	  List<WebElement> allLinks= driver.findElements(By.xpath("//a[not(contains(@href,'javascript') or contains(@href,'#'))]"));
        	
        	for(WebElement link:allLinks)
        	{
        	
        	
        		//System.out.println(getResponseCode(link.toString()));
        		
        	   System.out.println(link.getAttribute("href"));
        		
        	   System.out.println(getResponseCode(link.getAttribute("href").toString()));
        	   
        	   
        	   if(getResponseCode(link.getAttribute("href"))!=200)
        			   {
        		   System.out.println("****Link which is not appearing working is " + link.getText() + " and the response code resulted "
        		   		+ "is  " + getResponseCode(link.getAttribute("href")));
        			   }
        
        	
        	}
        	
    	  
      }
 	  
      
      public  int getResponseCode(String urlString) throws MalformedURLException, IOException {
    	     URL u = new URL(urlString); 
    	     HttpURLConnection huc =  (HttpURLConnection)(u.openConnection()); 
    	     huc.setRequestMethod("GET"); 
    	     huc.connect(); 
    	     
    	     return huc.getResponseCode();
    	 }
      
      
      
      public void clicklink()
      {
    	  
    	  Util.click( linkJavaScript);
    	  
    	  
      }


      public void foo()
      {
        //java.lang.NullPointerException  will come if we initialize this class like below

          /*LoginPage LP= new LoginPage(driverInstance);
          This way does notinitialize the webelements.. To initiazlise the webelements we need to use PageFactory.init elements
         LoginPage LP=	PageFactory.initElements(driverInstance, LoginPage.class);
         */



          learnHtml.isSelected();
      }


}
