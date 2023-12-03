package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage {
	
	@FindBy(xpath = "//span[@id= 'cart-total']")
	private WebElement itemsButton;
	
	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/table/tbody/tr[1]/td[2]")
	private WebElement subTotal;
	
	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/table/tbody/tr[2]/td[2]")
	private WebElement ecoTax;
	
	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/table/tbody/tr[3]/td[2]")
	private WebElement vat;
	
	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/table/tbody/tr[4]/td[2]")
	private WebElement total;
	
	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]/strong")
	private WebElement viewCartButton;
	
	@FindBy(xpath = "//a[@class= 'btn btn-primary']")
	private WebElement checkOutButton;
	
	@FindBy(css = ".alert-danger")
	private WebElement productErrorMessage;
	
    public ItemsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
        }
		
		public void ClickItemsButton() {
			itemsButton.click();
		}
		public String SubTotalActualValue() {
			return subTotal.getText();	
		}
		public String SubTotalExpectedValue() {
			return "$100.00";
		}
		public String EcoTaxActualValue() {
			return ecoTax.getText();
		}
		public String EcoTaxExpectedValue() {
			return "$2.00";
		}
		public String VATactualValue() {
			return vat.getText();	
		}
		public String VATexpectedValue() {
			return "$20.00";
		
		}
		public String TotalActualvalue() {
			return total.getText();
		}
		public String TotalExpectedValue() {
			return "$122.00";
		}	
		public void ClickViewCartButton() {
			viewCartButton.click();
		}
		public void ClickCheckOutButton() {
			checkOutButton.click();
		}
		public String ProductErrorMessage() {
			return productErrorMessage.getText();
		}
		public boolean ProductErrorMessageDisplayed() {
			return productErrorMessage.isDisplayed();
		}

}
