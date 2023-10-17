package testcase;
import java.util.Random;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

   public  class Register extends BaseTest {
	   
	   Random random = new Random(); 
	   String firstName = "User" + random.nextInt(1000);
	   String lastName = "Lastname" + random.nextInt(1000);
	   String telephone = "123456789" + random.nextInt(1000);
       String password = "Password" + random.nextInt(1000);
	 
	
    @Test(priority=1)
	public void verifyIfUserIsableToRegisterUsingMyAccountRegisterButton()
	{
    	
    	String email = "user" + random.nextInt(1000) + "@yopmail.com";
    	driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
    	driver.findElement(By.xpath(prop.getProperty("RegisterButtonXpath"))).click();
    	driver.findElement(By.id(prop.getProperty("RegisterFirstNameId"))).sendKeys(firstName);
    	driver.findElement(By.id(prop.getProperty("RegisterLastNameId"))).sendKeys(lastName);
    	driver.findElement(By.id(prop.getProperty("RegisterEmailId"))).sendKeys(email);
    	driver.findElement(By.id(prop.getProperty("RegisterTelephoneId"))).sendKeys(telephone);
    	driver.findElement(By.id(prop.getProperty("RegisterPasswordId"))).sendKeys(password);
    	driver.findElement(By.id(prop.getProperty("RegisterConfirmPasswordId"))).sendKeys(password);
    	
    	driver.findElement(By.name("agree")).click();
    	
    	driver.findElement(By.xpath(prop.getProperty("RegisterContinueButtonXpath"))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div/h1[text()='Your Account Has Been Created!']")).isDisplayed());
		
		
	}
    @Test(priority=2)
    public void verifyIfUserIsableToRegisterFromNewCustomerPage()
    {
    	
    	String email = "user" + random.nextInt(1000) + "@yopmail.com";
    	driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
    	driver.findElement(By.xpath(prop.getProperty("MyAccountLoginButtonXpath"))).click();
    	driver.findElement(By.xpath(prop.getProperty("NewCustomerContinueButtonXpath"))).click();
    	driver.findElement(By.id(prop.getProperty("RegisterFirstNameId"))).sendKeys(firstName);
    	driver.findElement(By.id(prop.getProperty("RegisterLastNameId"))).sendKeys(lastName);
    	driver.findElement(By.id(prop.getProperty("RegisterEmailId"))).sendKeys(email);
    	driver.findElement(By.id(prop.getProperty("RegisterTelephoneId"))).sendKeys(telephone);
    	driver.findElement(By.id(prop.getProperty("RegisterPasswordId"))).sendKeys(password);
    	driver.findElement(By.id(prop.getProperty("RegisterConfirmPasswordId"))).sendKeys(password);
    	
        driver.findElement(By.name("agree")).click();
    	
    	driver.findElement(By.xpath(prop.getProperty("RegisterContinueButtonXpath"))).click();
    	
    	Assert.assertTrue(driver.findElement(By.xpath("//div/h1[text()='Your Account Has Been Created!']")).isDisplayed());
    }
    
}
