package testcase;

import org.testng.annotations.Test;
import graphql.*;

import base.BaseTest;
import graphql.Assert;
import utilities.ReadXlsData;

//script for testing scenario 1&2

public class LoginTest extends BaseTest {

	private LoginPage loginPage;
	private MyAccount myAccount;

	@Test(dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
	public void loginWithValidUser(String username, String password) {

		loginPage = new LoginPage(driver);
		myAccount = new MyAccount(driver);

		myAccount.clickMyAccountButton();
		myAccount.clickMyAccountLoginButton();
		loginPage.enterEmailAddress(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		Assert.assertTrue(loginPage.MyAccountTextDisplayed());
		System.out.println(loginPage.MyAccountText()+" "+"is displayed after login");

		System.out.println(loginPage.successfulLoginMessage());

	}

}
