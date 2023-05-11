package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage extends Basepage {
	
	@FindBy(css=".title") //Title of page
	private WebElement productsLbl;
	@FindBy(css=".inventory_item_name") // All products' labels
	private List<WebElement> items;
	@FindBy(css=".product_sort_container") // Sort options
	private WebElement sortSlc;
	@FindBy(css=".btn.btn_primary.btn_small.btn_inventory") //All add-item buttons
	private List<WebElement> addItemBtns;
	@FindBy(css="#item_4_title_link > div") // Title and link of the first item
	private WebElement product1Title;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[1]") // First item in the inventory
	private WebElement product1Price;
	
	private static int itemsNum = 6;
	


	public WebElement getProduct1Title() {
		return product1Title;
	}

	public WebElement getProduct1Price() {
		return product1Price;
	}

	private String addBtnText = "Add to cart";
	public String removeBtnText = "Remove";
	
	public void turnAllBtnsToAdd()
	{
		for (WebElement el : addItemBtns)
			if (getText(el).equals(removeBtnText))
				click(el);
	}
	
	public String getAddBtnText() {
		return addBtnText;
	}

	public String getRemoveBtnText() {
		return removeBtnText;
	}

	public List<WebElement> getAddItemBtns() {
		return addItemBtns;
	}

	
	
	public List<WebElement> getItems() {
		return items;
	}

	public static int getItemsNum() {
		return itemsNum;
	}

	public WebElement getProductsLbl() {
		return productsLbl;
	}

	public InventoryPage(WebDriver driver) {
		super(driver);
			
	}

	public Select getSortSlc() {
		Select s = new Select(sortSlc);
		return s;
	}
	
	

	

	

}
