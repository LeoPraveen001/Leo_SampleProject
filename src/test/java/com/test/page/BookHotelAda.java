package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClass;

public class BookHotelAda extends BaseClass{
	public BookHotelAda() {
		PageFactory.initElements(driver, this);	
	}

		
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement cc_num;
	@FindBy(name="cc_type")
	private WebElement cc_type;
	@FindBy(name="cc_exp_month")
	WebElement cc_exp_month;
	@FindBy(name="cc_exp_year")
	WebElement cc_exp_year;
	@FindBy(name="cc_cvv")
	WebElement cc_cvv;
	@FindBy(name="booknow")
	WebElement booknow;
	
	
		public WebElement getFirstName() {
			return firstname;	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	
}
		
	
	}

