package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.SearchPage;
import com.utility.BrowserFactory;

public class TC_SearchProduct_002 extends BaseClass {
	
	
	@Test
	public void SearchItems() throws InterruptedException {
		
		SearchPage searchpage=PageFactory.initElements(driver, SearchPage.class);
		searchpage.SearchInAmazon("Smart Watch");
		
		BrowserFactory.teardown(driver);
		
		}
	
	

}
