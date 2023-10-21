package testcase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
            
           driver.findElement(By.xpath("(//span[text()='Add to Cart']")).click();
            
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
			
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			
			String successMessage = driver.findElement(By.cssSelector(".alert")).getText();
			Assert.assertTrue(successMessage.contains("Success: You have added"));
			System.out.println("Item added to the shopping cart.");
		} else {
			
			String noProductsMessage = driver.findElement(By.id("content")).getText();
            Assert.assertTrue(noProductsMessage.contains("There are no products to list in this category."));
            System.out.println("There are no products to list in this category.");
			
		}
	}
	    @Test(priority=3)
        public void addToCartLaptopNotebooksMacs() 
        {
		
		driver.findElement(By.linkText("Laptops & Notebooks")).click();
		driver.findElement(By.linkText("Macs (0)")).click();
		
		WebElement prodlist = driver.findElement(By.id("content"));
		if (prodlist.findElements(By.cssSelector(".product-layout")).size() > 0) {
			
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			
			String successMessage = driver.findElement(By.cssSelector(".alert")).getText();
			Assert.assertTrue(successMessage.contains("Success: You have added"));
			System.out.println("Item added to the shopping cart.");
		} else {
			
			String noProductsMessage = driver.findElement(By.id("content")).getText();
            Assert.assertTrue(noProductsMessage.contains("There are no products to list in this category."));
            System.out.println("There are no products to list in this category.");
		
}
        }
	    @Test(priority=4)
	    public void addToCartLaptopNotebooksWindows() 
        {
		
		driver.findElement(By.linkText("Laptops & Notebooks")).click();
		driver.findElement(By.linkText("Windows (0)")).click();
		
		WebElement prodlist = driver.findElement(By.id("content"));
		if (prodlist.findElements(By.cssSelector(".product-layout")).size() > 0) {
			
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			
			String successMessage = driver.findElement(By.cssSelector(".alert")).getText();
			Assert.assertTrue(successMessage.contains("Success: You have added"));
			System.out.println("Item added to the shopping cart.");
		} else {
			
			String noProductsMessage = driver.findElement(By.id("content")).getText();
            Assert.assertTrue(noProductsMessage.contains("There are no products to list in this category."));
            System.out.println("There are no products to list in this category.");
}
        }
	    @Test(priority=5)
	    public void addToCartComponentsMonitors() throws InterruptedException 
        {
		
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		WebElement prodlist = driver.findElement(By.id("content"));
		if (prodlist.findElements(By.cssSelector(".product-layout")).size() > 0) {
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/button[1]/span")).click();
			driver.findElement(By.name("option[218]")).click();
			driver.findElement(By.name("option[223][]")).click();
			driver.findElement(By.id("input-option217")).click();
			driver.findElement(By.xpath("//option[@value=\"4\"]")).click();
			driver.findElement(By.id("input-option209")).sendKeys("abc");
			WebElement fileInput= driver.findElement(By.id("button-upload222"));
			String filepath = "C:\\Users\\Admin\\Downloads";
			fileInput.sendKeys(filepath);
			
			Alert confirmAlert = driver.switchTo().alert();
			String alertText = confirmAlert.getText();
			System.out.println("Alert Text: " + alertText);
			confirmAlert.accept();
			driver.findElement(By.id("button-cart")).click();
			String successMessage = driver.findElement(By.cssSelector(".alert")).getText();
			Assert.assertTrue(successMessage.contains("Success: You have added"));
			System.out.println("Item added to the shopping cart.");
		} else {
			
			String noProductsMessage = driver.findElement(By.id("content")).getText();
            Assert.assertTrue(noProductsMessage.contains("There are no products to list in this category."));
            System.out.println("There are no products to list in this category.");
	    }}}
