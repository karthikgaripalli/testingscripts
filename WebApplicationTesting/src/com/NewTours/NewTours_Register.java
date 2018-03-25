package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register 
{
	public static void main(String[] args) 
	{
		String url="http://newtours.demoaut.com";
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		//driver.findElementByLinkText("REGISTER").click();
		
		WebElement register=driver.findElementByLinkText("REGISTER");
		register.click();
		
		String text=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font")).getText();
		
		String ExpectedText = "information";
		
		if(text.contains(ExpectedText))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		System.out.println(text);
		System.out.println(ExpectedText);
		
		driver.close();

	}

}
