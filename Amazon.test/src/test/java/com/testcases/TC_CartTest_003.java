package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Base;
import com.pages.Cartpage;

public class TC_CartTest_003 extends Base {
	
	@Test
	public void CartPaymentProcess()
	{   
		logger.info("***  Starting TC_CartTest_003  ***");
        Cartpage cartpage= PageFactory.initElements(driver, Cartpage.class);
        logger.pass("Cartpayment sucessfull");
       
		
	}

}
