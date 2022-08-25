package com.test.group;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Soft assert
public class Sample2 {
	@Test(groups = "@smoke_Two")
	public void tc1() {
		String s="abcdefef";
SoftAssert a =new SoftAssert();
a.assertEquals("abcdef", s);
a.assertAll();
System.out.println("assert success");
	}
	
	public void tc2() {

	}
	
	
}
