package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class Login extends BaseTest{
	
	
	@Test(priority=1)
	public void verifyWithValidCredentials()
	{
		SoftAssert softassert = new SoftAssert();
		driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("MyAccountLoginButtonXpath"))).click();
		driver.findElement(By.id(prop.getProperty("LoginEmailId"))).sendKeys("testing@yopmail.com");
		driver.findElement(By.id(prop.getProperty("LoginPasswordId"))).sendKeys("Test@123");
		driver.findElement(By.xpath(prop.getProperty("LoginButtonXpath"))).click();
		
		softassert.assertTrue((driver.findElement(By.xpath("//div/h2[text()='My Account']")).isDisplayed()));
		softassert.assertAll();
		
	}
	@Test(priority=2)
	public void verifyIfErrorMessageIsDisplayedForInvalidPassword()
	{
		
	driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
	driver.findElement(By.xpath(prop.getProperty("MyAccountLoginButtonXpath"))).click();
	driver.findElement(By.id(prop.getProperty("LoginEmailId"))).sendKeys("testing@yopmail.com");
	driver.findElement(By.id(prop.getProperty("LoginPasswordId"))).sendKeys("Test@1234");
	driver.findElement(By.xpath(prop.getProperty("LoginButtonXpath"))).click();

	try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
     WebElement errorMessage = driver.findElement(By.cssSelector(".alert-danger"));
	if (errorMessage.isDisplayed() && errorMessage.getText().contains("Warning: No match for E-Mail Address and/or Password.")) {
        System.out.println("Test Passed: Error message is displayed for invalid password.");
    } else {
        System.out.println("Test Failed: Error message is not displayed for invalid password.");
    }
	
}
}
