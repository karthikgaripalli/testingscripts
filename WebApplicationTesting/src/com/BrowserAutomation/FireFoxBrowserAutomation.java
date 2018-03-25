package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAutomation 
{
	public static void main(String[] args) 
	{
		FirefoxDriver swati = new FirefoxDriver();
		swati.navigate().to("http://www.google.com");
		
		FirefoxDriver hello = new FirefoxDriver();
		hello.get("http://facebook.com");

	}

}
