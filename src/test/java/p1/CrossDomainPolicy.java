package p1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CrossDomainPolicy {

	

	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException
	{
		
		FirefoxProfile profile = new FirefoxProfile();
		
		
		driver=new FirefoxDriver(profile);
		
		
		//driver.get("http://blog.codinghorror.com/double-click-must-die/");
			
		driver.get("https://www.muscleguru.in/product_detail.php?pid=184");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td[2]/table/tbody/tr[6]/td/table/tbody/tr/td[3]/a/img")).click();


		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/form/table/tbody/tr[8]/td/table/tbody/tr/td[4]/a")).click();
		
		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/table/tbody/tr[9]/td/table/tbody/tr/td[2]/form/table/tbody/tr[4]/td[3]/input")).sendKeys("parveen.techno@gmail.com");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/table/tbody/tr[9]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td[3]/input")).sendKeys("stvcmnpc");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/table/tbody/tr[9]/td/table/tbody/tr/td[2]/form/table/tbody/tr[6]/td[3]/input")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/input")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td[4]/span/input")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr/td[2]/span/input")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/form/table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr[2]/td[2]/span/input")).click();
		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/form/table/tbody/tr[8]/td/table/tbody/tr[3]/td/input[12]")).click();
		
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/form[3]/div/div[2]/ul/li/input")).sendKeys("ddddddddddd");
		
		
		Thread.sleep(33333);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		
		driver.quit();
		
	}
	
	
}
