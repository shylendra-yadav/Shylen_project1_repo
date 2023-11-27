package testcase;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseTest;

public class RegisterTest extends BaseTest{
    
	private MyAccount myAccount;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	
	
	@Test(priority=1)
	public void registerTestScenario1() {
		Random random = new Random();
	    String firstName = "TestUser" + random.nextInt(1000); 
	    String lastName = "LastName" + random.nextInt(1000); 
	    String email = "test" + random.nextInt(1000) + "@yopmailmail.com"; 
	    String telephone = "1234567890"; 
	    String password = "TestPassword" + random.nextInt(10000); 
	    String confirmPassword = password;
	    
		loginPage = new LoginPage(driver);
	    myAccount = new MyAccount(driver);
	    registerPage = new RegisterPage(driver);
	    
	    myAccount.clickMyAccountButton();
	    myAccount.clickMyAccountRegisterButton();
	    registerPage.enterFirstName(firstName);
	    registerPage.enterLastName(lastName);
	    registerPage.enterEmailId(email);
	    registerPage.enterTelephone(telephone);
	    registerPage.enterPassword(password);
	    registerPage.enterConfirmPasswordField(confirmPassword);
	    registerPage.clickCheckBox();
	    registerPage.clickContinueButton();
	    WebElement successMessage = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1"));
        Assert.assertTrue(successMessage.getText().contains("Your Account Has Been Created!"));
	    
	}
	@Test(priority=2)
	public void registerTestScenario2() {
		
		Random random = new Random();
	    String firstName = "TestUser" + random.nextInt(1000); 
	    String lastName = "LastName" + random.nextInt(1000); 
	    String email = "test" + random.nextInt(1000) + "@yopmailmail.com"; 
	    String telephone = "1234567890"; 
	    String password = "TestPassword" + random.nextInt(1000); 
	    String confirmPassword = password;
	    
		loginPage = new LoginPage(driver);
	    myAccount = new MyAccount(driver);
	    registerPage = new RegisterPage(driver);
	    
	    myAccount.clickMyAccountButton();
	    myAccount.clickMyAccountLoginButton();
	    loginPage.clickNewCustomerContinueButton();
	    registerPage.enterFirstName(firstName);
	    registerPage.enterLastName(lastName);
	    registerPage.enterEmailId(email);
	    registerPage.enterTelephone(telephone);
	    registerPage.enterPassword(password);
	    registerPage.enterConfirmPasswordField(confirmPassword);
	    registerPage.clickCheckBox();
	    registerPage.clickContinueButton();
	    WebElement successMessage = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1"));
        Assert.assertTrue(successMessage.getText().contains("Your Account Has Been Created!"));
	}
}
