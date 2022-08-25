package com.test.introduction;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.baseclass.BaseClass;
import com.test.page.BookHotelAda;
import com.test.page.LoginPage;
import com.test.page.SearchHotel;

public class DataProvSample extends BaseClass {
	
	@BeforeClass
	public void tc0() throws InterruptedException {
		getDriver();
	lanchUrl("http://adactinhotelapp.com/");
	}
	@Test(dataProvider="data1",dataProviderClass=DataProviderAdactin.class)
	public void tc1(String s,String s1) {
		BaseClass b=new BaseClass();
		LoginPage login=new LoginPage();
		b.enterText(login.getTxtUsername(), s);
		b.enterText(login.getTxtPassword(), s1);
		
		b.btnClick(login.getBtnClick());
	}
	@Test(dataProvider="data2",dataProviderClass=DataProviderAdactin.class)
	public void tc1(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7) {
		BaseClass b=new BaseClass();
		SearchHotel sh = new SearchHotel();
		b.dropDownSingleselection(sh.getLocation(),s);
		b.dropDownSingleselection(sh.getHotel(),s1);
		b.dropDownSingleselection(sh.getRoom_type(), s2);
//		b.dropDownSingleselection(sh.getRoom_nos(), s3);
//        b.dropDownSingleselection(sh.getAdult_room(), s4);
//        b.dropDownSingleselection(sh.getChild_room(), s5);
//        b.enterText(sh.getDatepick_in(),s6);
//		b.enterText(sh.getDatepick_out(),s7);
		b.btnClick(sh.getLogin());
        SelectHotel seh=new SelectHotel(); 	
        b.btnClick(seh.getRadioButton());
		b.btnClick(seh.getContinue1());
}
	@Test(dataProvider="data3",dataProviderClass=DataProviderAdactin.class)
	public void tc2(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7) {
		BaseClass b=new BaseClass();
BookHotelAda hb=new BookHotelAda();
b.getattribute(hb.getFirstName(),s);
b.enterText(hb.getLastname(),s1);
b.enterText(hb.getAddress(),s2);
b.enterText(hb.getCc_num(),s3);
b.dropDownSingleselection(hb.getCc_type(), s4);
b.dropDownSingleselection(hb.getCc_exp_month(), s5);
b.dropDownSingleselection(hb.getCc_exp_year(), s6);
b.enterText(hb.getCc_cvv(),s7);
b.btnClick(hb.getBooknow());
	}
	

}