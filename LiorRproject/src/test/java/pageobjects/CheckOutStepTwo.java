package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutStepTwo extends Basepage {
	
	@FindBy(css=".title")
	private WebElement finalOkLbl;
	@FindBy(css="#finish")
	private WebElement finishBtn;

	public WebElement getFinalOkLbl() {
		return finalOkLbl;
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}

	public CheckOutStepTwo(WebDriver driver) {
		super(driver);

	}
	
	

}
