package p1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Temp1 {

	WebDriver driver;


	@Test

	public void learn1()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();


		driver.get("http://www.w3schools.com");



	}


	@AfterTest
	public void tearDown()
	{
		if(driver!=null)driver.close();

	}

}
