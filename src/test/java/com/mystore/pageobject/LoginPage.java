package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver){
	super(driver);
	}
	
	@FindBy (xpath ="(//a[@title='View All'])[3]")
	WebElement viewAll;
	
	@FindBy (name = "mobileNo")
	WebElement MobNo;
	
	@FindBy (xpath ="//button[@class='btn btn--primary']")
	WebElement submit;
		
	
	public void clickonViewAll() throws InterruptedException {
		viewAll.click();
		Thread.sleep(20000);
	}
	
	public void enterMobileNumber(String mobileNumber) throws InterruptedException {
		MobNo.sendKeys(mobileNumber);
		Thread.sleep(10000);
	}
	
	public void clickonSubmit() throws InterruptedException {
		submit.click();
		Thread.sleep(20000);
	}
	
	public void clickonOTPSubmit() throws InterruptedException {
		submit.click();
		Thread.sleep(10000);
	}
	
	public void scrollPage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(10000);
	}
	
	
	
	
}
