package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleListSize {

	WebDriver driver;
	
	@Test
	public void getSize()
	{
		
		driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		
		driver.findElement(By.xpath("//div[@id='gs_lc0']/input")).sendKeys("RAMAYAN");
		
		
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
			
			
			
			
			
		}
		
	}
	
}
