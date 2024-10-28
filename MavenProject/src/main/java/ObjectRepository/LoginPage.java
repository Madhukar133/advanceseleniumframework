package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Element Intialization   by creating constructor with class name
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Element Declaration
	@FindBy(name="user_name")
	private WebElement usertextfiled;
	
	@FindBy(name="user_password")
	private WebElement passwordtextfiled;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	//getter methods
	
	
	public WebElement getusertextfiled() {
		return usertextfiled;
	}
	
	public WebElement getPasswordtextfiled() {
		return passwordtextfiled;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	//business logics
	/**
	 * This method
	 * 
	 */
	
	
	public void loginToVtiger(String username, String password) {
		usertextfiled.sendKeys(username);
		passwordtextfiled.sendKeys(password);
		loginbutton.click();
		
	}
	
	
	

}
