package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNewPage extends PageBase {
	
	public WhatsNewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "img.product-image-photo")
	WebElement SleeveTopComareList;
	
	public void chooseProduct() {
		clickbtn(SleeveTopComareList);
	}
}
