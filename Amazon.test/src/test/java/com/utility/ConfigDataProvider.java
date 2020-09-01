package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() throws IOException
	{
		File src=new File("./config/config.properties");
		FileInputStream file= new FileInputStream(src);
		pro= new Properties();
		pro.load(file);
		
	}
	  public String getDataFromConfig(String keyToSearch) {
	   return pro.getProperty(keyToSearch);
   }
   
   public String getBrowser() {
	   
	  return pro.getProperty("Browser"); 
   }
   
   public String getURL() {
	   
	   return pro.getProperty("qaURL");
   }
   }