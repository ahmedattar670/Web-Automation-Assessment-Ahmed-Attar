package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage_Payment extends PageBase {

	public CheckoutPage_Payment(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "button.action.primary.checkout")
	WebElement placeOrder;
	
	public void placingTheOrder() throws InterruptedException {
		Thread.sleep(4000);
		clickbtn(placeOrder);
	}
}
