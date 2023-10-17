package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Desktop extends BaseTest {
	
	@Test(priority=1)
	public void addToCartDesktopPcTest() {
		
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/a")).click();
		
        WebElement productsList = driver.findElement(By.id("content"));
        if (productsList.findElements(By.cssSelector(".product-layout")).size() > 0) {
            
           driver.findElement(By.xpath("(//button[text()='Add to Cart'])[1]")).click();
            
            String successMessage = driver.findElement(By.cssSelector(".alert-success")).getText();
            Assert.assertTrue(successMessage.contains("Success: You have added"));

            System.out.println("Item added to the shopping cart.");
        } else {
            
            String noProductsMessage = driver.findElement(By.id("content")).getText();
            Assert.assertTrue(noProductsMessage.contains("There are no products to list in this category."));
            System.out.println("There are no products to list in this category.");
        }
	}
	@Test(priority=2)
	public void addToCartDesktopMacTest() {
		
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click();
		
		WebElement prodlist = driver.findElement(By.id("content"));
		if (prodlist.findElements(By.cssSelector(".product-layout")).size() > 0) {
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[2]/button[1]")).click();
			
			String successMessage = driver.findElement(By.cssSelector(".alert")).getText();
			Assert.assertTrue(successMessage.contains("Success: You have added"));
			System.out.println("Item added to the shopping cart.");
		} else {
			
			String noProductsMessage = driver.findElement(By.id("content")).getText();
            Assert.assertTrue(noProductsMessage.contains("There are no products to list in this category."));
            System.out.println("There are no products to list in this category.");
			
		}
	}
		
}


