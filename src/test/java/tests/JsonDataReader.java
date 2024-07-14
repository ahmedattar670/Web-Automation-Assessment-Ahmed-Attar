package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {

	String FirstName,LastName,myMail,Password,Company,fStreet,City,PostalCode,Number;
	
	public void JsonReader() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/tests/UserData.json";

		File srcFile = new File(filePath); 

		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 
		
		for(Object jsonObj : jarray) 
		{
			JSONObject person = (JSONObject) jsonObj ; 
			
			FirstName  = (String) person.get("FirstName"); 
			System.out.println(FirstName);

			LastName = (String) person.get("LastName"); 
			System.out.println(LastName);

			myMail = (String) person.get("myMail"); 
			System.out.println(myMail);

			Password = (String) person.get("Password"); 
			System.out.println(Password);
			
			Company = (String) person.get("Company"); 
			System.out.println(Company);
			
			fStreet = (String) person.get("fStreet"); 
			System.out.println(fStreet);
			
			City = (String) person.get("City"); 
			System.out.println(City);
			
			PostalCode = (String) person.get("PostalCode"); 
			System.out.println(PostalCode);
			
			Number = (String) person.get("Number"); 
			System.out.println(Number);

		}
		
	}
	
}
