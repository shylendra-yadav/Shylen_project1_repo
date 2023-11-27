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
	public Dimension PageLayout() {
		return PageLayout();
	}
	
}
