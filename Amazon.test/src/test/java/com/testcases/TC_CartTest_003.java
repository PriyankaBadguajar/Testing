package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.Cartpage;

public class TC_CartTest_003 extends BaseClass {
	
	@Test
	public void CartPaymentProcess()
	{
		Cartpage cartpage= PageFactory.initElements(driver, Cartpage.class);
		
	}

}
