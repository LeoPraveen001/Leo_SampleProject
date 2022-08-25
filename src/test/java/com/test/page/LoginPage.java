package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	 public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//input[@name='username']"), @FindBy(xpath="//input[@type='password']")})
	 private WebElement txtUsername;
	 @FindBy(xpath="//input[@type='password']")
	 private WebElement txtPassword;
	 @FindBy(xpath="//input[@type='Submit']")
	 private WebElement btnClick;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}

}
