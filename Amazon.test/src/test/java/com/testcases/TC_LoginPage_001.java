package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pages.Base;
import com.pages.LoginpageAmazon;


public class TC_LoginPage_001 extends Base {
	@Test
	public void loginApps() throws InterruptedException, IOException 
	{
		
		  logger.info("***  Starting TC_LoginPage_001    ***");
		// logger=reports.createTest("login to Amazon");
		 LoginpageAmazon loginpage=PageFactory.initElements(driver, LoginpageAmazon.class);
		 logger.info("Starting Application");
		 loginpage.LoginToAmazon( excel.getNumericData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		 logger.pass("Login Suceessfull");
		
		 
		
     }	

}
