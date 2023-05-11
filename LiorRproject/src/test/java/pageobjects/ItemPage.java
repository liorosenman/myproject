package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends Basepage {
	
	@FindBy(css="#add-to-cart-sauce-labs-backpack")
	private WebElement addToCartBtn;

	public ItemPage(WebDriver driver) {
		super(driver);

	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	
	
	
	

}
