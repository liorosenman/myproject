package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.InventoryPage;

public class Invntests extends TestBase {
	
	
	@BeforeClass
	@Override
	public void Setup() {
		super.Setup();
		PageFactory.initElements(driver, this);
		loginp.loginMethod("standard_user", "secret_sauce"); //Login
		invp.sleep(2000);
	}
	
	@Test
	public void areThereSixItems()
	{
		int expected_ItemsNum = invp.getItemsNum();
		int actual_ItemsNum = invp.getItems().size();
		assertTrue(actual_ItemsNum == expected_ItemsNum);
	}
	
	@Test
	public void switchingAddBtn()
	{
		invp.turnAllBtnsToAdd();
		for(WebElement el : invp.getAddItemBtns())
		{
			//checks if "add to cart" switches to "Remove" and vice versa
			el.click();		
			assertTrue(invp.getText(el).equals(invp.getRemoveBtnText()));
			el.click();
			assertTrue(invp.getText(el).equals(invp.getAddBtnText()));
			
		}
	}
	
	@Test
	public void isSortedZtoA()
	{
		invp.getSortSlc().selectByVisibleText("Name (Z to A)");
		int finalIndex = invp.getItems().size() - 2; //index to stop checking
		for(int i = 0; i <= finalIndex; i++)
		{
			String s1 = invp.getItems().get(i).getText(); //Current item's text
			String s2 = invp.getItems().get(i+1).getText(); //Next item's text
			int compare = s1.compareTo(s2);
			assertTrue(compare > 0);
		}
		
	}

	
}
