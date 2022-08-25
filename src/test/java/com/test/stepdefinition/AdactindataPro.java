package com.test.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.baseclass.BaseClass;
import com.test.page.LoginPage;
import com.test.page.SearchHotel;
import com.test.page.SelectHotel;

public class AdactindataPro {
	public class AdactinWithDataProvider extends BaseClass {
		BaseClass b=new BaseClass();
		@BeforeClass
		public void browser() throws InterruptedException  {
			getDriver();
			b.lanchUrl("http://adactinhotelapp.com/");
                     }
		@Test(dataProvider="data1",dataProviderClass=DataProvider.class)
		public void tc0(String s,String s1) {
			BaseClass b=new BaseClass();
			LoginPage l=new LoginPage();
			l.enterText(l.getTxtUsername(), s);
			l.enterText(l.getTxtPassword(), s1);
			l.btnClick(l.getBtnClick());
		}
		@Test(dataProvider="data2",dataProviderClass=DataProvider.class)
		public void tc1(String s,String s1,String s2,String s3,String s4,
				String s5,String s6,String s7) throws IOException{
			BaseClass b=new BaseClass();
			SearchHotel se=new SearchHotel();
			b.dropDownSingleselection(se.getLocation(), s);
			b.dropDownSingleselection(se.getHotel(), s1);
			b.dropDownSingleselection(se.getRoom_type(), s2);
			b.dropDownSingleselection(se.getRoom_type(), s3);
			b.dropDownSingleselection(se.getAdult_room(), s4);
			b.dropDownSingleselection(se.getChild_room(), s5);
			b.enterText(se.getDatepick_in(),s6);
			b.enterText(se.getDatepick_in(),s7);
			SelectHotel sel=new SelectHotel();
			b.btnClick(sel.getRadioButton());
			b.btnClick(sel.getContinue1());
			HotelBook hb=new HotelBook();
			
			
		}
		
			

	}
	}
