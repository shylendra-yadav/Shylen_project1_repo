package testcase;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    @Test(priority=3)
    public void verifyIfUserDisplayedErrorMsgWhenDetailsNotEntered() {
    	driver.findElement(By.xpath(prop.getProperty("MyAccountXpath"))).click();
    	driver.findElement(By.xpath(prop.getProperty("RegisterButtonXpath"))).click();
    	driver.findElement(By.xpath(prop.getProperty("RegisterContinueButtonXpath"))).click();
    	
    	WebElement errorWarning = driver.findElement(By.cssSelector(".alert-danger"));
    	Assert.assertEquals(errorWarning.getText(), "Warning: You must agree to the Privacy Policy!");
    	WebElement errorFirstName =  driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div"));
    	Assert.assertEquals(errorFirstName.getText(), "First Name must be between 1 and 32 characters!");
    	WebElement errorLastName = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div"));
    	Assert.assertEquals(errorLastName.getText(), "Last Name must be between 1 and 32 characters!");
    	WebElement errorEmail = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div"));
    	Assert.assertEquals(errorEmail.getText(), "E-Mail Address does not appear to be valid!");
    	WebElement errorTelephone =  driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div"));
    	Assert.assertEquals(errorTelephone.getText(), "Telephone must be between 3 and 32 characters!");
        WebElement errorPassword = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div"));
        Assert.assertEquals(errorPassword.getText(), "Password must be between 4 and 20 characters!");
    }
    
}
   
