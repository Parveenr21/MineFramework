package p1;

import java.util.Map;

public class a7_GetPathVariables {

	public static void main(String ...dd)
	{
		
		
		System.out.println(System.getenv("IE_HOME")); //To get system varible use "getenv"
		
		//getenv() should bring up the all environmental variables set including at platform level .. we can not set those.
		System.out.println(System.getenv("CHROME_HOME")); 
		
		System.out.println("%%%%%%%  "+ System.getenv("java.home"));
		System.out.println("%%%%%%%  "+ System.getenv("JAVA_HOME"));
		Map<String, String> variables = System.getenv();

	
		//getProperties will bring up the current VM args property which we set or the currently set 
		
		//Runt time environment for a program or eclipse
		//we can setProperty() or getProperty() but only getenv()
		//e.g. 		System.setProperty("webdriver.chrome.driver" ,  "/Users/parawat/Downloads/chromedriver");

		
		System.out.println(System.getProperties());
		
		
		System.out.println("$$$$$ " + System.getProperty("java.home"));
		System.out.println("$$$$$ " + System.getProperty("JAVA_HOME"));
		
		
		for (Map.Entry<String, String> entry : variables.entrySet())
		{
		   String name = entry.getKey();
		   String value = entry.getValue();
		   System.out.println(name + "=" + value);
		}
		
		
	}
	
}
