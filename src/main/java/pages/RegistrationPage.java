package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {


	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "firstname")
	WebElement txtFname;
	
	@FindBy(id = "lastname")
	WebElement txtLname;
	
	@FindBy(id = "email_address")
	WebElement txtEmail;
	
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(id = "password-confirmation")
	WebElement txtConfirmPassword;
	
	@FindBy(css = "button.action.submit.primary")
	WebElement CreateAcc_btn;
	
	@FindBy(css = "div.message-success.success.message")
	public WebElement successtxt;
	
	@FindBy(id ="ui-id-3")
	public WebElement whatsNew_btn;
	
	public void navigateToWhatsNew() {
		clickbtn(whatsNew_btn);
	}
	
	public void userRegistration(String Fname, String Lname, String email, String password)
	{
		setTextOnTextBox(txtFname, Fname);
		setTextOnTextBox(txtLname, Lname);
		setTextOnTextBox(txtEmail, email);
		setTextOnTextBox(txtPassword, password);
		setTextOnTextBox(txtConfirmPassword, password);
		clickbtn(CreateAcc_btn);
	}
	
	
	

	
}
