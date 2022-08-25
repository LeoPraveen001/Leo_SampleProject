package com.test.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClass;

public class SelectHotel extends BaseClass{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="radiobutton_0")
	WebElement radioButton;
	@FindBy(name="continue")
	WebElement continue1;
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContinue1() {
		return continue1;
	}
	}


