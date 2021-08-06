package org.login;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	@Test
	private void tc11() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
	@Test(retryAnalyzer=Rerun.class)
	private void tc21() {
		Assert.assertTrue(false);
		System.out.println("4");
		System.out.println("5");
		
	}
	@Test(retryAnalyzer=Rerun.class)
	private void tc31() {
		Assert.assertTrue(false);
		System.out.println("10");
	}
	
	
}
