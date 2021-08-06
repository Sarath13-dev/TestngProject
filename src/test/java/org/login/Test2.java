package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	private void tc11() {
		System.out.println("test2a  "+ Thread.currentThread().getId());
	}
	@Test
	private void tc21() {
		System.out.println("test2b  "+ Thread.currentThread().getId());
	}
	@Test
	private void tc31() {
		System.out.println("test2c  "+ Thread.currentThread().getId());
	}
	@Test
	private void tc41() {
		System.out.println("test2d   "+ Thread.currentThread().getId());
	}
	@Test 
	private void tc51() {
		System.out.println("test2e   "+ Thread.currentThread().getId());
	}
}
