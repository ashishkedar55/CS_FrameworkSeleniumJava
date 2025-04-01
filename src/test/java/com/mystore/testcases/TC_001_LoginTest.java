package com.mystore.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.pageobject.LoginPage;


public class TC_001_LoginTest extends BaseClass {

	@Test(dataProvider = "LoginDataProvider")
	public void loginTest(String mobileNumber) throws InterruptedException  {
	LoginPage loginPage = new LoginPage(driver);
	logger.info("On BBPS web Home Page");
	loginPage.scrollPage();
	loginPage.clickonViewAll();
	logger.info("Login window gets opened");
	loginPage.enterMobileNumber(mobileNumber);
	loginPage.clickonSubmit();
	loginPage.clickonOTPSubmit();
	logger.info("OTP entered successfully");
	Thread.sleep(10000);
	String webLogin = driver.getTitle();
	logger.info("User is on BBPS dashboard");
    System.out.println(webLogin);

}
	
	
	
		@DataProvider (name = "LoginDataProvider")
		public Object[] [] LoginDataProvider()  {   
		    return new Object[][] { { "9028199931" }, { "9561189931" } }   ;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
	
	*/
	
	
	
	
	
	
	
	
	}
