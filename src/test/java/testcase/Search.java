package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;
import base.DataProviderTest;

public class Search extends BaseTest{
	
	@Test(dataProvider= "searchData",dataProviderClass=DataProviderTest.class)
	public void verifyIfSearchItemIsDisplayed(String searchValue) {
			
		driver.findElement(By.name("search")).sendKeys(searchValue);
		driver.findElement(By.cssSelector(".btn-default")).click();
		
		
		String productLinkText;

        switch (searchValue) {
            case "Dell":
                productLinkText = "DL123";
                break;
            case "HP":
                productLinkText = "HP LP3065";
                break;
            case "Mac":
            	productLinkText = "iMac";
            default:
                productLinkText = "";
                break;
        }
        try {
        WebElement productText = driver.findElement(By.linkText(productLinkText));
        if (productText.isDisplayed()) {
            System.out.println(productLinkText + " found.");
        } else {
            System.out.println(productLinkText + " not found.");
        }
        
		   }catch (NoSuchElementException e) {
		        System.out.println(productLinkText + " not found.");
        
        }}}
	     
	
		
		

