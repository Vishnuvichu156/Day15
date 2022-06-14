package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	private void test() {
		System.out.println("Test1");

	}
	
	@AfterClass
	private void afterclass() {
		System.out.println("AfterClass");
	}
}
