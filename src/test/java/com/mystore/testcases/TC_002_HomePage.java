package com.mystore.testcases;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.HomePage;
import com.mystore.pageobject.LoginPage;


public class TC_002_HomePage extends BaseClass {

	@Test
	public void HomePage() throws InterruptedException {
	LoginPage loginPage = new LoginPage(driver);
	logger.info("On BBPS web Home Page");
	loginPage.scrollPage();
	loginPage.clickonViewAll();
	logger.info("Login window gets opened");
	loginPage.enterMobileNumber("9028199931");
	loginPage.clickonSubmit();
	loginPage.clickonOTPSubmit();
	logger.info("OTP entered successfully");
	Thread.sleep(10000);
	logger.info("***TC_001 completed***");
	
	
	HomePage homepage = new HomePage(driver);
	boolean targetPage =homepage.isBBPShomePageDisplayed();
	Assert.assertTrue(targetPage);
	logger.info("***TC_002 completed***");
	
	loginPage.scrollPage();
	//scroll down
	driver.findElement(By.xpath("//span[text()=' MOBILE PREPAID ']")).click();
	logger.info("***click on mobile prepaid***");
	driver.findElement(By.id("mat-input-0")).sendKeys("9028199931");
	logger.info("******entered user mobile number******");
	Thread.sleep(2000);
	loginPage.scrollPage();
	//scroll down
	driver.findElement(By.xpath("//div[@class='swiper-wrapper swiper-height web-pad']/div[3]")).click();
	
	
	
}
}
