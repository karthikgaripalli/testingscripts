package com.CaprutingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_CapturingURL 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		String ExpectedURL = "gmail.com";
		String ActualUrl=driver.getCurrentUrl();
		
		System.out.println(ExpectedURL);
		System.out.println(ActualUrl);
		
		
		if(ActualUrl.contains(ExpectedURL))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
		
		

	}

}
