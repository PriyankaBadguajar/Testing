package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Base;
import com.pages.SearchPage;
import com.utility.BrowserFactory;

public class TC_SearchProduct_002 extends Base {
	
	
	@Test
	public void SearchItems() throws InterruptedException {
		logger.info("***  TC_SearchProduct_002  ***");
		SearchPage searchpage=PageFactory.initElements(driver, SearchPage.class);
		logger.info("Starting Application");
		searchpage.SearchInAmazon("Smart Watch");
		logger.pass("Searching Successfull");
		
		BrowserFactory.quitBrowser(driver);
		
		}
	
	

}
