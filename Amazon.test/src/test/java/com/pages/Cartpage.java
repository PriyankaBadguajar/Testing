package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage  extends Base {
	 WebDriver driver;
		
		public Cartpage(WebDriver ldriver) //constructor 
		{
			this.driver=ldriver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']") WebElement CartClick;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']") WebElement PaymentProcess;
	
	
	public void CartPayment()
	{
		CartClick.click();
		PaymentProcess.click();
		
	}

}
