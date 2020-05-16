package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	/*
@Test
@BeforeTest
@AfterTest
@BeforeMethod   // before method kac tane test varsa her testen once calisiyor
@AfterMethod	// after method kac tane test varsa her testen sonra calisiyor
@BeforeClass
@AfterClass
@BeforeSuite
@AfterSuite
*/
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before Suite");
	}
	
	@BeforeTest
	
	public void beforeTest() {
		System.out.println("I am before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before Method");
	}
	
	@Test (priority=2)
	public void testOne() {
		System.out.println("Test 1");
	}
	
	@Test (priority=1)
	public void testTwo() {
		System.out.println("Test 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after Method");
	}
	
		
	@AfterClass
	public void afterClass() {
		System.out.println("I am after Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("I am after Test");
	}	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after Suite");
	}

}
