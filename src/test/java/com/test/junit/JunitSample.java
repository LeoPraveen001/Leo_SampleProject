package com.test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSample {
	@BeforeClass
	public static void tc0() {
		System.out.println("BeforeClass");

	}

	@Before
	public void tc1() {
		System.out.println("Before");

	}
	@Test
	public void tc2() {
		System.out.println("test");

	}
	@After
	public void tc3() {
		System.out.println("after");

	}
	@AfterClass
	public static void tc4() {
		System.out.println("Afterclass");

	}
}
