package testcase;
import org.openqa.selenium.By;

import org.testng.annotations.Test;


import base.BaseTest;
import utilities.ReadXlsData;

public class Login extends BaseTest{
	
	
	@Test(dataProviderClass= ReadXlsData.class, dataProvider= "testdata")
	public void loginTest(String username, String password)
	{
		LoginPage loginpage = new LoginPage(driver);
		
	    driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("MyAccountLoginButtonXpath"))).click();
		driver.findElement(By.id(prop.getProperty("LoginEmailId"))).sendKeys(username);
		driver.findElement(By.id(prop.getProperty("LoginPasswordId"))).sendKeys(password);
		driver.findElement(By.xpath(prop.getProperty("LoginButtonXpath"))).click();
		
		
		
	}
	
}

