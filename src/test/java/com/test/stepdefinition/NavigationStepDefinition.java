package com.test.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.baseclass.BaseClass;

public class NavigationStepDefinition extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	getDriver();
	driver.navigate().to("https://www.google.com/");
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("facebook");
	driver.navigate().refresh();
	Thread.sleep(2000);
	txtSearch.sendKeys("lion");



	
}
}
