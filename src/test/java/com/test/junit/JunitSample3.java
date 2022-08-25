package com.test.junit;

import java.io.IOException;
import java.util.Date;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.test.baseclass.BaseClass;
import com.test.page.LoginPage;
import com.test.page.SearchHotel;
public class JunitSample3 extends BaseClass {
	@BeforeClass
	public static void lanchBrowser() throws InterruptedException {
		getDriver();
		lanchUrl("http://adactinhotelapp.com/");
	}
	@Before
	public void beforeMethode() throws IOException, InterruptedException {
		BaseClass b = new BaseClass();
		Date date = new Date();
		System.out.println(date);
		Thread.sleep(3000);
		b.Screenshot("C:\\Users\\leo\\eclipse-workspace\\SnapdealOne\\src\\test\\resources\\ScreenShot1.png");
	}

	@Test
	public void tc0() throws InterruptedException {
		LoginPage l = new LoginPage();
		l.enterText(l.getTxtUsername(), "Nimmi9311");
		l.enterText(l.getTxtPassword(), "123456789");
		l.btnClick(l.getBtnClick());
		Thread.sleep(3000);
	}
	@Test
	public void tc1() {
	SearchHotel s = new SearchHotel();
	s.btnClick(s.getLocation());
	s.btnClick(s.getHotels());
	s.btnClick(s.getDropDay());
	}
	@After
	public void afterMethode() throws IOException {
		BaseClass b = new BaseClass();
		Date date = new Date();
		System.out.println(date);
		b.Screenshot("C:\\Users\\leo\\eclipse-workspace\\SnapdealOne\\src\\test\\resources\\ScreenShot2.png");
	}
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
