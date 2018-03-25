package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_FaceBook
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//System.out.println(driver.getTitle());
		
		String ExpectedTitle="Facebook"; // Client Req
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle(); // Developer developed
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Title Matched -- Test Passed");
		}
		else
		{
			System.out.println("Title Not Matched  -- Test Failed");
		}
		
		driver.close();


	}

}
