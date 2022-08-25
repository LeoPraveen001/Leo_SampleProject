package com.test.stepdefinition;

import org.test.pages.SelectHotel;

import com.test.baseclass.BaseClass;
import com.test.baseclass.BaseClass1;
import com.test.page.LoginPage;
import com.test.page.SearchHotel;

public class AdactinHotel extends BaseClass{

	

	public static void main(String[] args) throws InterruptedException {
		BaseClass b=new BaseClass();
		getDriver();
		BaseClass.lanchUrl("http://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		l.enterText(l.getTxtUsername(), "Nimmi9311");
		l.enterText(l.getTxtPassword(), "123456789");
		l.btnClick(l.getBtnClick());
	SearchHotel s=new SearchHotel();
	b.dropDownSingleselection(s.getLocation(), "London");
	b.dropDownSingleselection(s.getHotel(), "Hotel Creek");
	s.dropDownSingleselection(s.getRoom_type(), "Double");
	s.dropDownSingleselection(s.getAdult_room(), "1-One");
	s.dropDownSingleselection(s.getChild_room(), "1-One");
	s.enterText(s.getDatepick_in(),"17/02/2022");
	s.enterText(s.getDatepick_out(),"18/02/2022");
	s.btnClick(s.getLogin());
	SelectHotel seh=new SelectHotel();
	b.btnClick(seh.getRadioButton());
	b.btnClick(seh.getContinue1());
	HotelBook hb=new HotelBook();
	
	}

}
