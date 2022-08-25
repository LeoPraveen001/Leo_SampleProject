package com.test.group;

import org.testng.annotations.Test;

public class Sample3 {


	@Test(groups = "@smoke_Three")
	public void tc2() {
		System.out.println("tc2");
		System.out.println(Thread.currentThread().getId());

	}

	@Test(groups = "@smoke_Four")
	public void tc3() {
		System.out.println("tc3");
		System.out.println(Thread.currentThread().getId());

	}

}
