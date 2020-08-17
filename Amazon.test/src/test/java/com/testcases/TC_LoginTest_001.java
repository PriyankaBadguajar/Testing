package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginpageAmazon;
import com.utility.ExcelData;
import com.utility.Helper;

public class TC_LoginTest_001 extends BaseClass{

	
	@Test
	public void loginApps() throws InterruptedException, IOException 
	{
		 logger=reports.createTest("login to Amazon");
		 LoginpageAmazon loginpage=PageFactory.initElements(driver, LoginpageAmazon.class);
		 logger.info("Starting Application");
		 loginpage.LoginToAmazon( excel.getNumericData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		 logger.pass("Login Suceessfull");
		 
		
     }	
}
