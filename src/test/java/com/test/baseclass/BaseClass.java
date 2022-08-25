package com.test.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver  getDriver() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void lanchUrl(String url) throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://adactinhotelapp.com");

	}
	public void Screenshot() throws IOException  {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\leo\\eclipse-workspace\\SnapdealOne\\src\\test\\resources\\ScreenShot.jpg");
	FileUtils.copyFile(ScreenshotAs, f);
		}
	public void Screenshot(String location) throws IOException  {
		File f=new File(location);
		TakesScreenshot ts=(TakesScreenshot)driver;
	File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(ScreenshotAs, f);
		}
	
	
	public void enterText(WebElement element,String text) {
		element.sendKeys(text);
}
	public void btnClick(WebElement element ) {
		element.click();
	}
	public void getattribute(WebElement element,String text) {
		element.getAttribute(text);
	}
	public void selectByIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void selectOptionbyText(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
}
	public void selectOptionbyValue(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByValue(text);
	}
	public void dropDownSingleselection(WebElement element, String arg) {
		Select s = new Select(element);
		s.selectByVisibleText(arg);
	}

	public void deselectOptionbyValue(WebElement element, String text) {
		Select s=new Select(element);
		s.deselectByValue(text);
	}
	public void deselectOptionbyText(WebElement element, String text) {
		Select s=new Select(element);
		s.deselectByVisibleText(text);
	}
		public void deselectAll(WebElement element) {
			Select s=new Select(element);
			s.deselectAll();
	}
		public void getAlltheOptions(WebElement element) {
			Select s=new Select(element);
		List<WebElement> options = s.getOptions();
			

	}
	public void DragAndDrop(WebElement source,WebElement desk) {
	  Actions a=new Actions(driver);
	  a.dragAndDrop(source, desk).perform();
	  
	}
	public void elementRightClick(WebElement desk) {
		  Actions a=new Actions(driver);
		  a.contextClick(desk).perform();
	}
	public void elementDoubleClick(WebElement desk) {
		  Actions a=new Actions(driver);
		  a.doubleClick(desk).perform();
	}
	public void Screenshots() throws IOException  {
	TakesScreenshot ts=(TakesScreenshot)driver;
File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
File f=new File("C:\\Users\\leo\\eclipse-workspace\\SeleniumProgram\\Screenshot");
FileUtils.copyFile(ScreenshotAs, f);
	}
	
	public void framesHandling(String frameName) {
driver.switchTo().frame(frameName);
	}
	public void framesHandling(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
			}
	public void framesHandling(int indexValue) {
		driver.switchTo().frame(indexValue);
			}
//	Element get value by Java executor
	public void javascript(WebElement element) {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].getAttribute('value')",element);	
}
//	handling alert by accept
	public void handleAlertByAccept() {
	Alert a=driver.switchTo().alert();
	a.accept();

	}
//	handling alert by dismiss
	public void handleAlertByDismiss() {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
//	mouse over action by action class
		public void mouseOvertoElement(WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
			

}
}