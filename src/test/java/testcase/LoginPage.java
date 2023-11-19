package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	 @FindBy(id = "input-email")
	    private WebElement emailInput;

	    @FindBy(id = "input-password")
	    private WebElement passwordInput;
	    
	    @FindBy(xpath = "//input[@value='Login']")
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
	    public void enterEmail(String email) {
	        emailInput.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }
	    
	  
	   

}

