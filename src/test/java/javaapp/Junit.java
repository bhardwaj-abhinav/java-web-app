package javaapp;

import org.junit.Test;

import junit.framework.TestCase;



public class Junit extends TestCase {

	String message = "BrowserStack is the intended message";
	
	@Test
	public void testMessage() {
		System.out. println("Inside testMessage()");
		assertEquals(message, "BrowserStack is the intended message");
		}
}
