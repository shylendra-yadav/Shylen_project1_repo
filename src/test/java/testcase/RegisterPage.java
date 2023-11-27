package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

			@FindBy(id="input-firstname")
			private WebElement RegisterFirstNameField;
			@FindBy(id="input-lastname")
			private WebElement RegisterLastNameField;
			@FindBy(id="input-email")
			private WebElement RegisterEmailField;
			@FindBy(id="input-telephone")
			private WebElement RegisterTelephoneField;
			@FindBy(id="input-password")
			private WebElement RegisterPasswordField;
			@FindBy(id="input-confirm")
			private WebElement RegisterConfirmPasswordField;
			@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[2]")
			private WebElement RegisterContinueButton;
			@FindBy(xpath ="/html/body/div[2]/div/div/form/div/div/input[1]")
			private WebElement CheckBox;

			public RegisterPage(WebDriver driver) {
		        
		        PageFactory.initElements(driver, this);
}
			public void enterFirstName(String firstname) {
				RegisterFirstNameField.sendKeys(firstname);
			}
			public void enterLastName(String lastname) {
				RegisterLastNameField.sendKeys(lastname);
			}
			public void enterEmailId(String emailId) {
				RegisterEmailField.sendKeys(emailId);
			}
			public void enterTelephone(String telephone) {
				RegisterTelephoneField.sendKeys(telephone);
			}
			public void enterPassword(String password) {
				RegisterPasswordField.sendKeys(password);
			}
			public void enterConfirmPasswordField(String confirmPassword) {
				RegisterConfirmPasswordField.sendKeys(confirmPassword);
			}
			public void clickContinueButton() {
				RegisterContinueButton.click();
			}
			public void clickCheckBox() {
				CheckBox.click();
			}
            }
