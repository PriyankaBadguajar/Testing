package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public  static String  ScreenshotCapture( WebDriver driver) throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String screenshotPath =System.getProperty("./Screenshots/Zerodha"+ getCurrentTimeDate() +".png");
		String screenshotPath =("./Screenshots/Zerodha"+ getCurrentTimeDate() +".png");
		FileHandler.copy(src, new File(screenshotPath));
		System.out.println("Screenshot Captured");
	    return screenshotPath;
	    
	}

	
	public  static String getCurrentTimeDate()
	{
		DateFormat Customformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
	    return Customformat.format(currentDate);
	}
	
}
