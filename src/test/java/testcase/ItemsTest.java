package testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import utilities.ReadXlsData;

public class ItemsTest extends BaseTest{
	
	private ItemsPage itemsPage;
	private SearchPage searchPage;
	
	@Test(priority = 1, dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
	public void verifyPriceValuesInItemsBucket(String searchData) throws InterruptedException {
		
		itemsPage = new ItemsPage(driver);
		searchPage = new SearchPage(driver);
		SoftAssert softAssert = new SoftAssert();
		
		searchPage.sendSearchData(searchData);
		searchPage.clickSearchButton();
		searchPage.ClickAddToCart();
		Thread.sleep(2000);
		itemsPage.ClickItemsButton();
		
		softAssert.assertEquals(itemsPage.SubTotalActualValue(), itemsPage.SubTotalExpectedValue());
		System.out.println(itemsPage.SubTotalActualValue());
		
		softAssert.assertEquals(itemsPage.EcoTaxActualValue(), itemsPage.EcoTaxExpectedValue());
		System.out.println(itemsPage.EcoTaxActualValue());
		
		softAssert.assertEquals(itemsPage.VATactualValue(), itemsPage.VATexpectedValue());
		System.out.println(itemsPage.VATactualValue());
		
		softAssert.assertEquals(itemsPage.TotalActualvalue(), itemsPage.TotalExpectedValue());
		System.out.println(itemsPage.TotalActualvalue());
		
		
	}
	@Test(priority=2, dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
	public void verifyViewCartErrormessage(String searchData) throws InterruptedException   {
		itemsPage = new ItemsPage(driver);
		searchPage = new SearchPage(driver);
		SoftAssert softAssert = new SoftAssert();
		
		searchPage.sendSearchData(searchData);
		searchPage.clickSearchButton();
		searchPage.ClickAddToCart();
		Thread.sleep(2000);
		itemsPage.ClickItemsButton();
		itemsPage.ClickViewCartButton();
		itemsPage.ClickCheckOutButton();
		softAssert.assertTrue(itemsPage.ProductErrorMessageDisplayed());
		System.out.println(itemsPage.ProductErrorMessage());
	}
	

}
