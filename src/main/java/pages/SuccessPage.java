package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends PageBase {

	public SuccessPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(tagName = "h1")
	public WebElement successNotfication;
	
}
