package tests;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import pages.CartPage;
import pages.CheckoutPage_Payment;
import pages.CheckoutPage_Shipping;
import pages.ComparisonListPage;
import pages.HomePage;
import pages.ProductDetails;
import pages.RegistrationPage;
import pages.SuccessPage;
import pages.WhatsNewPage;

public class TestPlaceOrderWithCheckout extends TestBase {
	
	HomePage homeObject;
	RegistrationPage registerObject;
	WhatsNewPage whatsnewObject;
	CartPage cartObject;
	CheckoutPage_Shipping shippingObject;
	CheckoutPage_Payment paymentObject;
	ComparisonListPage fproductObject;
	ProductDetails productDetailsObject;
	SuccessPage successObject;
	ComparisonListPage comparisonObject;
	JsonDataReader jsonReader = new JsonDataReader();
	
	@Test(priority = 1)
	public void UserRegistration() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		homeObject = new HomePage(driver);
		registerObject = new RegistrationPage(driver);
		jsonReader.JsonReader();
		homeObject.click_CreateAcc_btn();
		registerObject.userRegistration(jsonReader.FirstName,jsonReader.LastName,jsonReader.myMail, jsonReader.Password);
		AssertJUnit.assertTrue(registerObject.successtxt.getText().contains("Thank you for registering with Main Website Store."));
		registerObject.whatsNew_btn.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void chooseTheProduct() throws InterruptedException{
		whatsnewObject = new WhatsNewPage(driver);
		whatsnewObject.chooseProduct();
		 Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void addToComparelist() throws InterruptedException {
	
		productDetailsObject = new ProductDetails(driver);
		comparisonObject = new ComparisonListPage(driver);
		productDetailsObject.addToCompareList();
		productDetailsObject.goToComparelist();
		comparisonObject.AddToCart();
		Thread.sleep(2000);
		productDetailsObject.NavigateToCartList();
		
	}
	
	@Test(priority = 4)
	public void proceedAndFillCheckout() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		cartObject = new CartPage(driver);
		shippingObject = new CheckoutPage_Shipping(driver);
		paymentObject = new CheckoutPage_Payment(driver);
		successObject = new SuccessPage(driver);
		cartObject.proceedToCheckout();
		shippingObject.FillingCheckoutDetails(jsonReader.Company,jsonReader.fStreet,jsonReader.City,jsonReader.PostalCode, jsonReader.Number);
		paymentObject.placingTheOrder();
		Assert.assertTrue(successObject.successNotfication.isDisplayed());	
		Thread.sleep(4000);
	}
	

}
