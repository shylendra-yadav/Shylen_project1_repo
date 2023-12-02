 package testcase;


import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXlsData;

public class LoginTest extends BaseTest {
	
	private LoginPage loginPage;
	private MyAccount myAccount;
	
	@Test(dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
     public void loginTest(String username, String password) {
		    
		    
		    loginPage = new LoginPage(driver);
		    myAccount = new MyAccount(driver);
		    
		    myAccount.clickMyAccountButton();
		    myAccount.clickMyAccountLoginButton();
	        loginPage.enterEmailAddress(username);
	        loginPage.enterPassword(password);
	        loginPage.clickLoginButton();
	     
	        
	       
	        } 
	      
	        }
	        
	 