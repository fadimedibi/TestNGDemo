package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class OrangeHRMTitleAndLoginValidation extends CommonMethods {
	/* TC 1: Orange HRM Application Login:
	1. Open chrome browser
	2. Go to “https://opensource-demo.orangehrmlive.com/index.php/auth/login”
	3. Enter valid username and password
	4. Click on login button
	5. Then verify Syntax Logo is displayed
	6. Close the browser */

	
	@BeforeMethod
	public void openBrowserAndNavigateToHRM() {
		setUp("chrome", ORANGE_HRM_URL);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test (groups= {"regression", "login"})
	public void titleValidation() {
		String expTitle="OrangeHRM";
		String actTitle=driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle, "Title mismatch");
	}
	 @Test(groups= {"smoke", "login"})
	 public void loginValidation() {
		 // enter username and password
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 
		 // click login btn
		 driver.findElement(By.id("btnLogin")).click();
		 
		 // logo displayed?
		 WebElement logo=driver.findElement(By.xpath("//div[@id='branding']/a/img"));
			
			Assert.assertTrue(logo.isDisplayed(), "Login FAIL");
	 }
}
