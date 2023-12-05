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
		System.out.println("actual price ="+" "+itemsPage.SubTotalActualValue()+" "+"expected price ="+" "+itemsPage.SubTotalExpectedValue());
		
		softAssert.assertEquals(itemsPage.EcoTaxActualValue(), itemsPage.EcoTaxExpectedValue());
		System.out.println("actual price ="+" "+itemsPage.EcoTaxActualValue()+" "+"expected price ="+" "+ itemsPage.EcoTaxExpectedValue());
		
		softAssert.assertEquals(itemsPage.VATactualValue(), itemsPage.VATexpectedValue());
		System.out.println("actual price ="+" "+itemsPage.VATactualValue()+" "+"expected price ="+" "+ itemsPage.VATexpectedValue());
		
		softAssert.assertEquals(itemsPage.TotalActualvalue(), itemsPage.TotalExpectedValue());
		System.out.println("actual price ="+" "+itemsPage.TotalActualvalue()+" "+"expected price ="+" "+ itemsPage.TotalExpectedValue());
		
		
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
