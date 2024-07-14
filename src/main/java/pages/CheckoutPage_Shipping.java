package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage_Shipping extends PageBase{

	public CheckoutPage_Shipping(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[3]/div/input")
	WebElement company;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input")
	WebElement street1;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")
	WebElement city;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")
	WebElement zipCode;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select")
	WebElement country;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")
	WebElement phoneNumber;
	
	@FindBy(css = "button.button.action.continue.primary")
	WebElement nextBtn ;

	@FindBy(css = "div.ea-stickybox-hide")
	WebElement hide;
	
public void FillingCheckoutDetails(String comp, String fstreet, String fCity,String pCode, String phoneNum) throws InterruptedException {
		
	    clickbtn(hide);
	    Thread.sleep(2000);
		setTextOnTextBox(company, comp);
		setTextOnTextBox(street1, fstreet);
		setTextOnTextBox(city, fCity);
		setTextOnTextBox(zipCode, pCode);
		select = new Select(country);
		select.selectByVisibleText("Egypt");
		setTextOnTextBox(phoneNumber, phoneNum);
	    Thread.sleep(4000);
		clickbtn(nextBtn);
		
	}
	
	
	
	
}
