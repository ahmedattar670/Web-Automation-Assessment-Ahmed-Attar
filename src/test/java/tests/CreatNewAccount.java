package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegistrationPage;

public class CreatNewAccount extends TestBase{
	
	HomePage homeObject;
	RegistrationPage RegisterObject;
	
	@Test
	public void UserCanRegister() throws FileNotFoundException, IOException, ParseException {
		
		homeObject = new HomePage(driver);
		RegisterObject = new RegistrationPage(driver);
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();
		homeObject.click_CreateAcc_btn();
		RegisterObject.userRegistration(jsonReader.FirstName,jsonReader.LastName,jsonReader.myMail, jsonReader.Password);
		Assert.assertTrue(RegisterObject.successtxt.getText().contains("Thank you for registering with Main Website Store."));
	}
	

}
