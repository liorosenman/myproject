package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutStepOne extends Basepage {
	
	@FindBy(css="#first-name") //first name
	private WebElement firstNameFld;
	@FindBy(css="#last-name")  //last name
	private WebElement lastNameFld;
	@FindBy(css="#postal-code") //Zip
	private WebElement zipFld;
	@FindBy(css="#continue") //continue button
	private WebElement continueBtn;

	public CheckOutStepOne(WebDriver driver) {
		super(driver);

	}
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void fillDtls(String firstname, String lastname, String zip)
	{
		fillText(firstNameFld, firstname);
		sleep(1500);
		fillText(lastNameFld, lastname);
		sleep(1500);
		fillText(zipFld, zip);
		sleep(1500);
	}
	
}