package com.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utility.BrowserFactory;
import com.utility.ConfigDataProvider;
import com.utility.ExcelData;
import com.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	 public ExcelData excel;
	 public ConfigDataProvider config;
	 public ExtentReports reports;
	 public ExtentTest logger;
	
	@BeforeSuite
	//@Parameters()
	public  void Setupsuite() throws IOException {
	Reporter.log("Setting up reports and Test is getting ready ", true);
		
	excel= new ExcelData();
	config=new ConfigDataProvider();
	
	ExtentHtmlReporter extent= new ExtentHtmlReporter(new File("./Reports/AmazonReport _ "+Helper.getCurrentTimeDate() +".html"));
	extent.config().setReportName("Web Automation Results"); //name of my report
	extent.config().setDocumentTitle("Test Results");  //name of my reports document(title)
	reports = new ExtentReports();
	reports.attachReporter(extent);
	reports.setSystemInfo("Tester", "Priyanka badgujar");//name of tester 
	Reporter.log("Setting done- Test can be started ", true);
	//return reports;
	}
	
	
	//@Parameters("browser")
	@BeforeClass
	
	
//	public void setup( String browser) throws InterruptedException{
	public void setup() throws InterruptedException{
	
	Reporter.log("Tring to start browser and application is ready ", true);

   driver = BrowserFactory.startApplication(driver,config.getBrowser(), config.getURL());
  //driver = BrowserFactory.startApplication(driver, browser, config.getURL() );

	   
   System.out.println(driver.getTitle());
   
	Reporter.log("Browser and application is running ", true);
   
		
	}
	@AfterClass
	public void teardown() {
		//BrowserFactory.quitBrowser(driver);
	}
	
/*	@AfterMethod
	public void teardownMethod(ITestResult result ) throws IOException
	{
		Reporter.log("Test is about to end ", true);

		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.ScreenshotCapture(driver)).build());
		}
		else if( result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test pass", MediaEntityBuilder.createScreenCaptureFromPath(Helper.ScreenshotCapture(driver)).build());

		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.skip("Test skip", MediaEntityBuilder.createScreenCaptureFromPath(Helper.ScreenshotCapture(driver)).build());
		}
		
	}*/
	


}
