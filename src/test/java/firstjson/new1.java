package firstjson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class new1 {
	 public static void main(String[] args) throws FileNotFoundException 
	    { 
		 
		 try
         {
               File status = new File("C:\\Users\\user\\project\\JSON\\JSONExample.json");
              if (status.delete())
              {
                   System.out.println("File deleted successfully");
              }
              else {
           		  BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\user\\project\\\\JSON\\JSONExample.json"));
           	      String str;
           	      while ((str = bufferedReader.readLine()) != null)
           	      {
           	           System.out.println(str);
           	      }
           	      bufferedReader.close();
              }
}
catch (IOException ioe)
{
 System.out.println("File not found");
ioe.printStackTrace();
}

		 PrintWriter pw = new PrintWriter("C:\\Users\\user\\project\\JSON\\JSONExample.json");
	      
	        JSONObject jo = new JSONObject();  
		       
	        
    jo.put("firstName", "Mayank");
    jo.put("lastName", "Agrawal");
   
   
    LinkedHashMap m = new LinkedHashMap();
    m.put("streetAddress", "Avantika Nagar");
    m.put("city", "Gajraula");
    m.put("state", "UP");
    m.put("postalCode", 244235);
      
    jo.put("address", m);
    
    JSONArray ja = new JSONArray();
      
    LinkedHashMap m2 = new LinkedHashMap();
    m2.put("type", "home");
    m2.put("number", "9997520218"); 
    // adding map to list
    ja.add(m2);
      
    LinkedHashMap m3 = new LinkedHashMap();
    m3.put("type", "fax");
    m3.put("number", "05924 0244256");
      
    // adding map to list
    ja.add(m3);
      
    jo.put("phoneNumbers", ja);

    pw.write(jo.toJSONString());
      System.out.println("Created");
  System.out.println("\n");
    JSONObject jo1 = new JSONObject();
    
    jo1.put("firstName", "John");
    jo1.put("lastName", "Smith");
    jo1.put("age", 25);
   
    LinkedHashMap m1 = new LinkedHashMap();
    m1.put("streetAddress", "21 2nd Street");
    m1.put("city", "New York");
    m1.put("state", "NY");
    m1.put("postalCode", 10021);
      
    jo1.put("address", m1);
    
    JSONArray ja1 = new JSONArray();
      
    LinkedHashMap m4 = new LinkedHashMap(2);
    m4.put("type", "home");
    m4.put("number", "212 555-1234"); 
    ja1.add(m4);
      
    LinkedHashMap m5 = new LinkedHashMap(2);
    m5.put("type", "fax");
    m5.put("number", "212 555-1234");
      
    ja1.add(m5);
      
    jo1.put("phoneNumbers", ja1);

    pw.write(jo1.toJSONString());
      System.out.println("Created");
   // pw.flush();
    pw.close();
}

}
