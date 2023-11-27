package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import base.BaseTest;
import utilities.ReadXlsData;

public class SearchTest extends BaseTest{

	private SearchPage searchPage;
	
	@Test(dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
	public void searchTest(String searchData) {
		SoftAssert softAssert = new SoftAssert();
		searchPage = new SearchPage(driver);
		
		searchPage.sendSearchData(searchData);
		searchPage.clickSearchButton();
		 if (isProductDisplayed()) {
			 searchPage.ProuctFoundMessage();
	            
	           softAssert.assertTrue(searchPage.ProuctFoundMessageDisplayed());
	           System.out.println("This product is displayed");
	        } else {
	           searchPage.NoProductMessage();
	          
	            softAssert.assertTrue(searchPage.NoProductMessageDisplayed());
	            System.out.println("This product is not displayed");
	        }

		 softAssert.assertAll();
		 
	    }
	
	public boolean isProductDisplayed() {
		
		
		 return driver.findElements(By.cssSelector(".product-layout")).size() > 0;
		    
}}
