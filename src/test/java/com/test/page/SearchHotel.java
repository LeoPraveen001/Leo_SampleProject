package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.baseclass.BaseClass;
public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	WebElement location;
	@FindBy(name="hotels")
	WebElement hotel;
	@FindBy(name="room_type")
	WebElement room_type;
	@FindBy(name="room_nos")
	WebElement room_nos;
	@FindBy(name="adult_room")
	WebElement adult_room;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(name="child_room")
	WebElement child_room;
	@FindBy(name="datepick_in")
	WebElement datepick_in;
	@FindBy(name="datepick_out")
	WebElement datepick_out;
	@FindBy(name="Submit")
	WebElement login;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	
}
