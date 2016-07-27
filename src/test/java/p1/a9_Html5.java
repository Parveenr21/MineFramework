package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class a9_Html5 {

	WebDriver driver;
	
	@Test
	public void test(){
		
		driver= new FirefoxDriver();
		
		//This page has HTML 5
		
		driver.get("http://lostworldsfairs.com/");
		
		
		
		System.out.println(driver.findElements(By.xpath("//section[@id='explain']/div[@*]")).size());
		
		
	}
	
}
