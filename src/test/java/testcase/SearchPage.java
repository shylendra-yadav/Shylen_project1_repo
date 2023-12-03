package testcase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath= "/html/body/header/div/div/div[2]/div/input")
	private WebElement searchField;
	@FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button")
	private WebElement searchButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/h2")
	private WebElement productFoundMessage;
	@FindBy(xpath = "//p[text()='There is no product that matches the search criteria.']")
	private WebElement noProductMessage;
	@FindBy(css = ".product-layout")
	private WebElement pageLayout;
	@FindBy(linkText = "iMac")
	private WebElement iMac;
	@FindBy(linkText = "MacBook")
	private WebElement MacBook;
	@FindBy(linkText = "MacBook Air")
	private WebElement MacBookAir;
	@FindBy(linkText = "MacBook Pro")
	private WebElement MacBookPro;
	@FindBy(xpath = "//span[@class = 'hidden-xs hidden-sm hidden-md'][text() = 'Add to Cart']")
	private WebElement iMacAddToCart;
	@FindBy(css = ".alert-success")
	private WebElement addToCartSuccessMessage;
    
	public SearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendSearchData(String searchData) {
		searchField.sendKeys(searchData);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	public String ProuctFoundMessage() {
		return productFoundMessage.getText();
	}
	public boolean ProuctFoundMessageDisplayed() {
		return productFoundMessage.isDisplayed();
	}
	public String NoProductMessage() {
		return noProductMessage.getText();
	}
	public boolean NoProductMessageDisplayed() {
		return noProductMessage.isDisplayed();
	}
	public String iMacProduct() {
		return iMac.getText();
	}
	public String MacBookProduct() {
		return MacBook.getText();
	}
	public String MacBookAirProduct() {
		return MacBookAir.getText();
	}
	public String MacBookProProduct() {
		return MacBookPro.getText();
	}
	
	public boolean iMacDisplayed() {
		return iMac.isDisplayed();
	}
	public boolean MacBookDisplayed() {
		return MacBook.isDisplayed();
	}
	public boolean MacBookAirDisplayed() {
		return MacBookAir.isDisplayed();
	}
	public boolean MacBookProDisplayed() {
		return MacBookPro.isDisplayed();
	}
	public void ClickAddToCart() {
		iMacAddToCart.click();
	}
	public boolean AddToCartSuccessMessageDisplayed() {
		return addToCartSuccessMessage.isDisplayed();
	}
	public String AddToCartSuccessMessage() {
		return addToCartSuccessMessage.getText();
	}
	
	public Dimension PageLayout() {
		return PageLayout();
	}
	
}
