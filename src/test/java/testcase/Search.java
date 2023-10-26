package testcase;
import org.openqa.selenium.By;


import org.testng.annotations.Test;
import base.BaseTest;


public class Search extends BaseTest{
	
	@Test()
	public void verifyIfSearchItemIsDisplayed() {
			
		driver.findElement(By.name("search"));
		driver.findElement(By.cssSelector(".btn-default")).click();
		
		
		
        
        }}
	     
	
		
		

