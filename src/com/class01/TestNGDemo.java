package com.class01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void methodOne() {		
		System.out.println("Hello from method 1");
	}
	@Test
	public void methodTwo() {		
		System.out.println("Hello from method 2");
	//	Assert.assertTrue(false);
	}
	@Test  (dependsOnMethods = "methodTwo") //if line 15 is uncommented, this method will be fail because of depends on
	public void methodThree() {		
		System.out.println("Hello from method 3");
	}
}
