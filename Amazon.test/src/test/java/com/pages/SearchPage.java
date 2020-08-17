package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
   WebDriver driver;
	
	public SearchPage(WebDriver ldriver) //constructor 
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement TextBox;
	@FindBy(xpath="//input[@value='Go']") WebElement searchbtn;
	@FindBy(xpath="//a[@style='z-index: 4;']") WebElement SelectItem;
	@FindBy(xpath="//input[@id='add-to-cart-button']") WebElement Cartbutn;
	@FindBy(xpath="//a[@id='hlb-view-cart-announce']") WebElement IntoCart;
    @FindBy(name="proceedToRetailCheckout") WebElement PaymentProcess;
	//@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']") WebElement CartClick;
	//@FindBy(xpath="//input[@name='proceedToRetailCheckout']") WebElement PaymentProcess;
	
	
	//Action methods
			
	public Cartpage  SearchInAmazon(String Items) throws InterruptedException {
		Thread.sleep(2000);
		
		TextBox.sendKeys(Items);
		searchbtn.click();
		SelectItem.click();
		Thread.sleep(2000);
		Cartbutn.click();
		Thread.sleep(2000);
		IntoCart.click();
		Thread.sleep(2000);

		PaymentProcess.click();
		Thread.sleep(2000);

		//CartClick.click();
		//PaymentProcess.click();
		
 
		 return PageFactory.initElements(driver, Cartpage.class);

		
	//	PageFactory.initElements(driver, page);
		
		}


}


