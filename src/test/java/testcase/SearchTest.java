package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import base.BaseTest;
import utilities.ReadXlsData;

//Script for testing scenario 3&4

public class SearchTest extends BaseTest {

	private SearchPage searchPage;

	@Test(priority = 1, dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
	public void verifyIfMacProductsAreDisplayed(String searchData) {
		SoftAssert softAssert = new SoftAssert();
		searchPage = new SearchPage(driver);

		searchPage.sendSearchData(searchData);
		searchPage.clickSearchButton();
		if (isProductDisplayed()) {
			searchPage.ProuctFoundMessage();

			softAssert.assertTrue(searchPage.ProuctFoundMessageDisplayed());
			System.out.println(searchPage.ProuctFoundMessage()+ " "+"is displayed");

			softAssert.assertTrue(searchPage.iMacDisplayed());
			System.out.println(searchPage.iMacProduct()+ " "+"is displayed");

			softAssert.assertTrue(searchPage.MacBookDisplayed());
			System.out.println(searchPage.MacBookProduct()+ " "+"is displayed");

			softAssert.assertTrue(searchPage.MacBookAirDisplayed());
			System.out.println(searchPage.MacBookAirProduct()+ " "+"is displayed");

			softAssert.assertTrue(searchPage.MacBookProDisplayed());
			System.out.println(searchPage.MacBookProProduct()+ " "+"is displayed");

		} else {
			searchPage.NoProductMessage();

			softAssert.assertTrue(searchPage.NoProductMessageDisplayed());
			System.out.println(searchPage.NoProductMessage());
		}

		softAssert.assertAll();

	}

	public boolean isProductDisplayed() {

		return driver.findElements(By.cssSelector(".product-layout")).size() > 0;

	}

	@Test(priority = 2, dataProviderClass = ReadXlsData.class, dataProvider = "testdata")
	public void addImacToCart(String searchData) {

		SoftAssert softAssert = new SoftAssert();
		searchPage = new SearchPage(driver);

		searchPage.sendSearchData(searchData);
		searchPage.clickSearchButton();

		if (isProductDisplayed()) {
			searchPage.ProuctFoundMessage();

			softAssert.assertTrue(searchPage.ProuctFoundMessageDisplayed());
			System.out.println(searchPage.ProuctFoundMessage());

			softAssert.assertTrue(searchPage.iMacDisplayed());
			System.out.println(searchPage.iMacProduct()+ " "+"is displayed");

			searchPage.ClickAddToCart();

			softAssert.assertTrue(searchPage.AddToCartSuccessMessageDisplayed());
			System.out.println(searchPage.AddToCartSuccessMessage());

		} else {
			searchPage.NoProductMessage();

			softAssert.assertTrue(searchPage.NoProductMessageDisplayed());
			System.out.println(searchPage.NoProductMessage());
		}

		softAssert.assertAll();

	}

	public boolean isProductDisplayed1() {

		return driver.findElements(By.cssSelector(".product-layout")).size() > 0;

	}

}
