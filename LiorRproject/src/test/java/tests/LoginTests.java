package tests;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.metrics.data.Data;
import pageobjects.InventoryPage;


public class LoginTests extends TestBase {
	
	@BeforeClass
	@Override
	public void Setup() {
		
		super.Setup();
		PageFactory.initElements(driver, this);
	}
	
	@Test (dataProvider = "allValuesOk", dataProviderClass = tests.Data.class)
	public void LoginOkValues(String username, String password)
	{
		loginp.loginMethod(username, password);
		assertTrue(invp.getProductsLbl().isDisplayed());
		invp.logOut();
	}
	
	@Test (dataProvider = "wrongValuesNoEntry", dataProviderClass = tests.Data.class)
	public void noEntryWrongValues(String username, String password) throws InterruptedException
	{
		loginp.sleep(3000);
		loginp.loginMethod(username, password);
		Thread.sleep(2000);
		assertTrue(loginp.getErrorMsg().isDisplayed());
	}
	
	

}
