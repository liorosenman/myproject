package pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Basepage {
	
	@FindBy(css="#checkout") //CheckOut Button
	private WebElement checkOutBtn;
	@FindBy(css=".inventory_item_name") //First product name
	private WebElement firstProductLbl;
	@FindBy(css=".inventory_item_price") //First product price
	private WebElement firstPrdPriceLbl;

	public WebElement getFirstProductLbl() {
		return firstProductLbl;
	}



	public WebElement getFirstPrdPriceLbl() {
		return firstPrdPriceLbl;
	}



	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}



	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
//	public void compareItems() //Making sure chosen product's details are OK
//	{
//		assertEquals(firstProductLbl.getText(), Inv);
//	}
	
	
	
	
	
	

}
