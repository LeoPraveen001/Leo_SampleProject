package com.test.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Xpath
		String xpUserNAme="//input[@type='text']";
		//Data's
		String dataUrl="https://adactinhotelapp.com";
		String dataUserName="Nimmi9311";
		driver.get(dataUrl);
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.xpath(xpUserNAme));
		txtUsername.sendKeys(dataUserName);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@type='Submit']"));
		btnLogin.click();
//		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
//		btnSearch.click();
		Thread.sleep(2000);
		WebElement btnLocation = driver.findElement(By.xpath("//select[@name='location']"));
		btnLocation.click();
		WebElement dropDay = driver.findElement(By.id("location"));
		Select sE=new Select(dropDay);
		sE.selectByIndex(4);
		
		WebElement btnHotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		btnHotels.click();
		WebElement dropDayhotels = driver.findElement(By.id("hotels"));
		Select sH=new Select(dropDayhotels);
		sH.selectByIndex(4);
		WebElement dropDayroom = driver.findElement(By.id("room_type"));
		Select sR=new Select(dropDayroom);
		sR.selectByIndex(2);
		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSearch.click();
		WebElement btnBooking = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		btnBooking.click();
		//input[@name='continue']
		WebElement btnContinue = driver.findElement(By.xpath("//input[@name='continue']"));
		btnContinue.click();
		WebElement txtFstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		txtFstname.sendKeys("Nimmi");
		WebElement txtLstname = driver.findElement(By.xpath("//input[@name='last_name']"));
		txtLstname.sendKeys("Praveen");
		//textarea[@name='address']
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
		txtAddress.sendKeys("sivagangai");
		WebElement txtCrenum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		txtCrenum.sendKeys("6543217863248976");
		WebElement dropCctype = driver.findElement(By.id("cc_type"));
		Select sC=new Select(dropCctype);
		sC.selectByIndex(2);
		WebElement dropCcmonth = driver.findElement(By.id("cc_exp_month"));
		Select sM=new Select(dropCcmonth);
		sM.selectByIndex(7);
		WebElement dropCcyear = driver.findElement(By.id("cc_exp_year"));
		Select sY=new Select(dropCcyear);
		sY.selectByIndex(12);
		WebElement txtCcvnum = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		txtCcvnum.sendKeys("53458");
		WebElement btnBooknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		btnBooknow.click();
		Thread.sleep(7000);
		WebElement textValue = driver.findElement(By.xpath("//input[@name='order_no']"));
		String getvalue=textValue.getAttribute("value");
		System.out.println(getvalue);
	}
	}


