package firstjson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class new2 {
	public static void main(String[] args) throws FileNotFoundException 
	{ 

		try
		{
			File status = new File("C:\\Users\\user\\project\\JSON\\JSONExample1.json");
			if (status.delete())
			{
				System.out.println("File deleted successfully");
			}
			else {
				BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\user\\project\\JSON\\JSONExample1.json"));
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
		Faker faker = new Faker();

		PrintWriter pw = new PrintWriter("C:\\Users\\user\\project\\JSON\\JSONExample1.json");
		//LinkedHashMap m0 = new LinkedHashMap();
		System.out.println("Enter the number of rows you want to enter");
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
		JSONObject m0 = new JSONObject();  
		//jo.put("description ", "");
		//jo.put("Student ", "");
		
			 
			
			m0.put("firstName", faker.name().firstName());
			m0.put("lastName", faker.name().lastName());
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();
			String str3=firstName.concat(".");
			String username=str3.concat(lastName);
			String emailid = username.concat("@gmail.com");
			m0.put("UserName", username);
			m0.put("mail Id", emailid);
			

			JSONArray ja = new JSONArray();
		      
		    LinkedHashMap m2 = new LinkedHashMap();
		    m2.put("type", "home address");
		    m2.put("homeAddress", faker.address().streetAddress());
			m2.put("city", faker.address().cityName());
			m2.put("streetname", faker.address().streetName());
			
		    ja.add(m2);
		      
		    LinkedHashMap m = new LinkedHashMap();
		    m.put("state", faker.address().state());
			m.put("postalCode", faker.address().zipCode());
			
		    ja.add(m);
		    m0.put("address", ja);
			
			pw.write(m0.toJSONString());




			System.out.println("Created");}
			pw.flush();
			
		
		pw.close();
	}



}