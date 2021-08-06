package org.login;

import org.testng.annotations.Test;

public class Test3 {

	@Test
	private void tc11() {
		System.out.println("test3a  "+ Thread.currentThread().getId());
	}
	@Test
	private void tc21() {
		System.out.println("test3b  "+ Thread.currentThread().getId());
	}
	@Test
	private void tc31() {
		System.out.println("test3c  "+ Thread.currentThread().getId());
	}
	@Test
	private void tc41() {
		System.out.println("test3d  "+ Thread.currentThread().getId());
	}
	@Test 
	private void tc51() {
		System.out.println("test3e  "+ Thread.currentThread().getId());
	}
}
