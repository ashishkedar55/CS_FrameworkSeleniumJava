package com.mystore.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	static ExtentReports extent;
	
	public static ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir")+"\\Demoreports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Result");
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ashish Kedar");
		return extent;
		
	}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
