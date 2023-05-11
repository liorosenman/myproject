package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Basepage {
	
	@FindBy(css="#user-name")
	private WebElement userNameFld;
	@FindBy(css="#password")
	private WebElement passFld;
	@FindBy(css="#login-button")
	private WebElement loginBtn;
	@FindBy(css=".error-message-container.error")
	private WebElement errorMsg;
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getUserNameFld() {
		return userNameFld;
	}

	public WebElement getPassFld() {
		return passFld;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void loginMethod(String username, String password)
	{
		fillText(userNameFld, username);
		sleep(1000);
		fillText(passFld, password);
		sleep(1000);
		loginBtn.click();
	
	}
	
	

}
