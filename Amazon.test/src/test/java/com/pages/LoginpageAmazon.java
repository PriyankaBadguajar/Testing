package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageAmazon extends BaseClass{
WebDriver driver;
	
	public LoginpageAmazon(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']/div/span") WebElement SignIn;
	@FindBy(xpath="//input[@id='ap_email']") WebElement UserId;
	@FindBy(xpath="//input[@id='continue']") WebElement Continue;
	@FindBy(xpath="//input[@id='ap_password']") WebElement Pass;
	@FindBy(xpath="//input[@id='signInSubmit']") WebElement Submit;
	
	
	public SearchPage LoginToAmazon(String phnnum ,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		//System.out.println("Login start...");
		SignIn.click();
		//System.out.println("Login starting.....");
		Thread.sleep(3000);
		//SignInclick.click();
	    UserId.sendKeys(phnnum);
	    Continue.click();
		Pass.sendKeys(password);
		Submit.click();
		
		 return PageFactory.initElements(driver, SearchPage.class);
		
	}
	
}
