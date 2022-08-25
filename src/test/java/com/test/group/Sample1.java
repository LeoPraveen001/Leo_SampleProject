package com.test.group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.baseclass.BaseClass;
import com.test.page.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 extends BaseClass {
	@Parameters("browser")
	public void tc0(String browser) {
if (browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
} else if (browser.equals("edge")) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("http://adactinhotelapp.com/");
}else if (browser.equals("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("http://adactinhotelapp.com/");
}

	}
	@Parameters({"browser","username","password"})
	@Test(groups = "@smoke_One",dependsOnMethods="tc0")
	public void tc1(String s,String s1) {
		BaseClass b=new BaseClass();
		LoginPage l=new LoginPage();
		l.enterText(l.getTxtUsername(), s);
		l.enterText(l.getTxtPassword(), s1);
		l.btnClick(l.getBtnClick());

	}
	
	
}
	

