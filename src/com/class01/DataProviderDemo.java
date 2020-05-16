package com.class01;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class DataProviderDemo extends CommonMethods {

	@BeforeMethod
	public void openBrowserAndNavigateToHRM() {
		setUp("chrome", ORANGE_HRM_URL);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test (dataProvider = "getData")
	public void addMultipleEmployee(String name, String lastName) {

		// login HRM
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		// navigate to add employee
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();

		// add employee name and lastname

		driver.findElement(By.id("firstName")).sendKeys(name);
		driver.findElement(By.id("lastName")).sendKeys(lastName);

		String expectedEmpId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		String actualEmpId = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");

		Assert.assertEquals(actualEmpId, expectedEmpId);
	}
	
	@DataProvider
	public Object [][] getData(){
		Object[][] data= {
				{"Johnyy", "Smith"},
				{"Michaele","Knight"},
				{"Hakan A", "Sukur"}
		};
		return data;
		
	}
	
	
	
	
}
