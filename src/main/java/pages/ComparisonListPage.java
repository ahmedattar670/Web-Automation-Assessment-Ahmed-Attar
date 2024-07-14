package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonListPage extends PageBase {

	public ComparisonListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "button.action.tocart.primary")
	WebElement AddToCartBtn;
	
	public void AddToCart() {
		clickbtn(AddToCartBtn);
	}
}
