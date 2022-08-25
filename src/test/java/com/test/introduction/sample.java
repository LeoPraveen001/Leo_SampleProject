package com.test.introduction;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.baseclass.BaseClass;
import com.test.page.LoginPage;
import com.test.page.SearchHotel;

public class sample extends BaseClass {

	@Parameters({ "username", "password" })
	@Test()
	public void tc0(String s, String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	@Parameters({ "username", "password" })
	@Test
	public void Adactin1(String s1, String s2) throws InterruptedException {
		BaseClass b = new BaseClass();
		getDriver();
		BaseClass.lanchUrl("http://adactinhotelapp.com/");
		LoginPage l = new LoginPage();
		l.enterText(l.getTxtUsername(), s1);
		l.enterText(l.getTxtPassword(), s2);
		l.btnClick(l.getBtnClick());
	}
//	@Parameters({ "location", "hotels" })

//	@Test()
//		public void tc1(String s3, String s4) {
//			System.out.println(s3);
//			System.out.println(s4);
//		}
//		/
//		public void Adactin(String s3, String s4) throws InterruptedException {
//			BaseClass b = new BaseClass();
//			getDriver();
//			BaseClass.lanchUrl("http://adactinhotelapp.com/");
//		SearchHotel s = new SearchHotel();
//		s.dropDownSingleselection(s.getBtnLocation(),s);
//		s.dropDownSingleselection(s.getBtnHotels(),s1);
//		s.dropDownSingleselection(s.getDropDay(),s2);
//		s.dropDownSingleselection(s.getRoom_type(), s3);
//        s.dropDownSingleselection(s.getAdult_room(), s4);
//        s.dropDownSingleselection(s.getDatepick_in(), s5);
//        s.dropDownSingleselection(s.getDropDay(), s6);
//	}

}
