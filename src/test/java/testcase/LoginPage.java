package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="input-email")
    private WebElement emailAddressField; 
	@FindBy(id="input-password")
    private WebElement passwordField;
	@FindBy(xpath= "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div[1]/div/a")
    private WebElement NewCustomerContinueButton;
	@FindBy(css = ".alert-danger")
	private WebElement getErrorMessage;
	@FindBy(linkText = "Edit your account information")
	private WebElement successMessage; 
	@FindBy(xpath ="//h2[text()= 'My Account']")
	private WebElement myAccountText;
	
    
    public LoginPage(WebDriver driver) {
       
        PageFactory.initElements(driver, this);
    }

    public void enterEmailAddress(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
    public void clickNewCustomerContinueButton() {
    	NewCustomerContinueButton.click();
    }
    public String actualWanringMessage() {
    	return getErrorMessage.getText();
    }
    public String actualSuccessMessage() {
    	return successMessage.getText();
    }
    public boolean actualSuccessMessageDisplayed() {
    	return successMessage.isDisplayed();
    }
    public boolean actualWarningMessageDisplayed() {
    	return getErrorMessage.isDisplayed();
    }
    public String successfulLoginMessage() {
    	return "User logged in successfully";
    }
    public String MyAccountText() {
    	return myAccountText.getText();
    }
    public boolean MyAccountTextDisplayed() {
    	return myAccountText.isDisplayed();
    }
}
