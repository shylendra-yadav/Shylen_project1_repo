package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountButton;
	@FindBy(xpath= "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
	private WebElement MyAccountLoginButton;
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")
	private WebElement MyAccountRegisterButton;
	
	
	public MyAccount(WebDriver driver) {
        
        PageFactory.initElements(driver, this);
	}
	public void clickMyAccountButton() {
		MyAccountButton.click();
	}
	public void clickMyAccountLoginButton() {
		MyAccountLoginButton.click();
	}
	public void clickMyAccountRegisterButton() {
		MyAccountRegisterButton.click();
	}
	
	}
	