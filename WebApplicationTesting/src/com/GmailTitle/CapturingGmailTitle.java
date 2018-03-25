package com.GmailTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingGmailTitle 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		//System.out.println(driver.getTitle());
		
		String ExpectedTitle="Gmail"; // Client Req
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle(); // Developer developed
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched -- Test Passed");
		}
		else
		{
			System.out.println("Title Not Matched  -- Test Failed");
		}
		
		driver.close();
		
		driver.close();

	}

}
