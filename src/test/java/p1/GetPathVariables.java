package p1;

import java.util.Map;

public class GetPathVariables {

	public static void main(String ...dd)
	{
		
		
		System.out.println(System.getenv("IE_HOME")); //To get system varible use "getenv"
		
		
		System.out.println(System.getenv("CHROME_HOME")); 
		
		Map<String, String> variables = System.getenv();

		
		
		
		for (Map.Entry<String, String> entry : variables.entrySet())
		{
		   String name = entry.getKey();
		   String value = entry.getValue();
		   System.out.println(name + "=" + value);
		}
		
		
	}
	
}
