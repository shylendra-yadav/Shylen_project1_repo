package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;
import utilities.ReadXlsData;


public class Search extends BaseTest{
	
	@Test(dataProviderClass= ReadXlsData.class, dataProvider= "testdata")
	public void searchTest(String search) {
			
		WebElement searchField = driver.findElement(By.name(prop.getProperty("SearchFieldName")));
		searchField.click();
		searchField.sendKeys(search);
		driver.findElement(By.cssSelector(prop.getProperty("SearchFieldButtonCss"))).click();
		
        
        }
}
	     
	
		
		

