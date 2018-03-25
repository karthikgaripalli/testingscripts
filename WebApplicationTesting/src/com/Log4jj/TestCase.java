package com.Log4jj;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	
		public static Logger logger  = Logger.getLogger("TestCase");
		
		public static void main(String[] args) 
		{
				
			PropertyConfigurator.configure("Log4j.properties");
			
			logger.info("Firefox Browser Automation");
			
		//	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			//ChromeDriver driver = new ChromeDriver();
			
		//	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("http://newtours.demoaut.com");
			logger.info("Navigated to NewTours Application");
			
			driver.close();
			logger.info("Application Closed");


	}

}
