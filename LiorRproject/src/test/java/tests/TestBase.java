package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.CartPage;
import pageobjects.CheckOutStepOne;
import pageobjects.CheckOutStepTwo;
import pageobjects.InventoryPage;
import pageobjects.ItemPage;
import pageobjects.LoginPage;
import pageobjects.OrderCompletePage;



public class TestBase {
	

	WebDriver driver;
	LoginPage loginp;
	InventoryPage invp;
	ItemPage itemp;
	CartPage cartp;
	CheckOutStepOne co1p;
	CheckOutStepTwo co2p;
	OrderCompletePage ocomp;
	
	
	@BeforeClass
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("remote-allow-origins=*");
        //driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        loginp = new LoginPage(driver);
        invp = new InventoryPage(driver);
        itemp = new ItemPage(driver);
        cartp = new CartPage(driver);
        co1p = new CheckOutStepOne(driver);
        co2p = new CheckOutStepTwo(driver);
        ocomp = new OrderCompletePage(driver);
        
	}
	
	@AfterClass
	public void tearDown()
	{
		
	}
	
	
}
	


