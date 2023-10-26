package testcase;
import org.openqa.selenium.By;

import org.testng.annotations.Test;


import base.BaseTest;
import utilities.ReadXlsData;

public class Login extends BaseTest{
	
	
	@Test(dataProviderClass= ReadXlsData.class, dataProvider= "testdata")
	public void verifyWithValidCredentials(String username, String password)
	{
		//SoftAssert softassert = new SoftAssert();
		driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("MyAccountLoginButtonXpath"))).click();
		driver.findElement(By.id(prop.getProperty("LoginEmailId"))).sendKeys(username);
		driver.findElement(By.id(prop.getProperty("LoginPasswordId"))).sendKeys(password);
		driver.findElement(By.xpath(prop.getProperty("LoginButtonXpath"))).click();
		
		//softassert.assertTrue((driver.findElement(By.xpath("//div/h2[text()='My Account']")).isDisplayed()));
		//softassert.assertAll();
		
	}
	
}

