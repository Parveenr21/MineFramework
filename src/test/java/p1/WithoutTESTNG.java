package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WithoutTESTNG {


	static WebDriver driver;

	public static void main(String ...ccc)
	{
		FirefoxProfile profile = new FirefoxProfile();

		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(profile);

		driver = new FirefoxDriver(opt);

		driver.get("http://localhost:8080/jquery/www.tutorialspoint.com/jquery/jquery-basics.html");




	}

}

