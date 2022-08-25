package com.test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSample2 {
	@BeforeClass
	public static void tc12() {
		System.out.println("BeforeClass");

	}
	@AfterClass
	public static void tc11() {
		System.out.println("AfterClass");

	}
	@Before
	public void tc0() {
System.out.println("Before");
	}
	@After
	public void tc1() {
		System.out.println("After");

	}
	@Test
	public void tc2() {
		System.out.println("test1");

	}
	@Test
	public void tc3() {
		System.out.println("test2");

	}

}
