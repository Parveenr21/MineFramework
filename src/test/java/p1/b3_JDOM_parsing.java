package p1;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class b3_JDOM_parsing {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * JDOM is not like SAX or DOM, which bundled in JDK. To use JDOM, you need to download the library manually.



<dependency>
	<groupId>jdom</groupId>
	<artifactId>jdom</artifactId>
	<version>1.1</version>
    </dependency>
    
    
		 *
		 * 
		 * 
		 */
		
		
		/*
		 * DOM provides a way to represent that document for easy and efficient reading,
		 *  manipulation, and writing. It has a straightforward API, is a lightweight and fast, 
		 *  and is optimized for the Java programmer. It’s an alternative to DOM and SAX, although 
		 *  it integrates well with both DOM and SAX.
		 *  
		 * 
 */
		
		
		
		
		
		  SAXBuilder builder = new SAXBuilder();
		  File xmlFile = new File("file.xml");
		  
	 
		  try {
	 
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			
			
	
			System.out.println(rootNode.toString());
			
			
			List list = rootNode.getChildren("staff");
	
			for (int i = 0; i < list.size(); i++) {
	 
			   Element node = (Element) list.get(i);
	 
			   System.out.println("First Name : " + node.getChildText("firstname"));
			   System.out.println("Last Name : " + node.getChildText("lastname"));
			   System.out.println("Nick Name : " + node.getChildText("nickname"));
			   System.out.println("Salary : " + node.getChildText("salary"));
	 
			}
	 
		  } catch (IOException io) {
			System.out.println(io.getMessage());
		  } catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		  }
		}
	
	
	/*public static String getFile(String fileName) {

	      String result = "";
	     try {

	          result = IOUtils.toString(Utility.class.getClassLoader().getResourceAsStream(fileName));
	} catch (IOException e) {
	e.printStackTrace();
	}

	return result;

	}*/
	
}
