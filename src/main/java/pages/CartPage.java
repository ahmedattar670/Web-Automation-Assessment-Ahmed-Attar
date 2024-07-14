package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button")
	WebElement ProceedToCheckoutBtn;
	
	@FindBy(css = "div.ea-stickybox-hide")
	WebElement hide;
	
	public void proceedToCheckout() throws InterruptedException {
		clickbtn(hide);
		Thread.sleep(3000);
		clickbtn(ProceedToCheckoutBtn);
	}
	
}
