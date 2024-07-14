package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends PageBase{
	
	public ProductDetails(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "option-label-size-143-item-167")
	WebElement sizeSmall;
	
	@FindBy(id = "option-label-color-93-item-53")
	WebElement colorGreen;
	
	@FindBy(id = "qty")
	WebElement QuantityTxt;
	
	@FindBy(id = "product-addtocart-button")
	WebElement ProductAddToCart;
	
	@FindBy(linkText = "shopping cart")
	WebElement CartList;
	
	@FindBy(css = "button.action.tocart.primary")
	WebElement AddToCartBtn;
	
	@FindBy (linkText = "comparison list")
	WebElement ComparisonlistSuccess;
	
	@FindBy (css = "a.action.tocompare")
	WebElement ComparisonlistBtn;
	
	@FindBy(css = "div.ea-stickybox-hide")
	WebElement hide;
	
	public void ChooseSize() {
		clickbtn(sizeSmall);
	}
	
	public void ChooseColor() {
		clickbtn(colorGreen);
	}
	
	public void EnterQuantity() {
		clearText(QuantityTxt);
		setTextOnTextBox(QuantityTxt, "2");
	}
	
	public void addToCompareList() {
		clickbtn(hide);
		clickbtn(ComparisonlistBtn);
	}
	
	public void goToComparelist() {
		clickbtn(ComparisonlistSuccess);
	}
	
    public void NavigateToCartList() {
    	clickbtn(CartList);
    }
}
