package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver){
	super(driver);
	}
	
	@FindBy ( xpath ="//body//div//h2")
	WebElement heading;
	
	public boolean isBBPShomePageDisplayed() {
		try {
		return heading.isDisplayed();
		} 
		catch (Exception e) {
			return false;
		}
		
		
	}
		
	
	
	
	
	
	
}
