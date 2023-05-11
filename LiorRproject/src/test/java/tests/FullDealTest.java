package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.CartPage;
import pageobjects.CheckOutStepOne;

public class FullDealTest extends TestBase {
	
	@BeforeClass
	@Override
	public void Setup() {
		
		super.Setup();
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void validLogin() //Login with valid username and password
	{
		loginp.loginMethod("standard_user", "secret_sauce");
		invp.verifyElementFullyLoaded(invp.getProduct1Title());
	//	assertTrue(invp.getProductsLbl().isDisplayed());
		assertTrue(invp.getProduct1Title().isDisplayed());
	}
	
	@Test
	public void takeALook() // click to see item's page and add it to cart
	{
		//invp.sleep(1500);
		invp.click(invp.getProduct1Title());
		itemp.verifyElementFullyLoaded(itemp.getAddToCartBtn());
		itemp.click(itemp.getAddToCartBtn());
		assertTrue(itemp.isThisTheQuantityInCart(1));
	}
	
	@Test
	public void assureProducts()
	{
		itemp.sleep(1500);
		itemp.click(itemp.getCartBtn());
		cartp.verifyElementFullyLoaded(cartp.getCheckOutBtn());
		assertEquals(invp.getProduct1Title(), cartp.getFirstProductLbl());
		assertEquals(invp.getProduct1Price(), cartp.getFirstPrdPriceLbl());
	}
	
	public void validPersonaldtls()
	{
		cartp.click(cartp.getCheckOutBtn());
		co1p.verifyElementFullyLoaded(co1p.getContinueBtn());
		co1p.fillDtls("John", "Smith", "123456");
		co1p.click(co1p.getContinueBtn());
		co2p.sleep(2000);
		assertTrue(co2p.getFinishBtn().isDisplayed());
	}
	
	public void finalMsg()
	{
		co2p.getFinishBtn().click();
		ocomp.sleep(1000);
		assertTrue(ocomp.getOrderCompleteLbl().isDisplayed());
	}

}
