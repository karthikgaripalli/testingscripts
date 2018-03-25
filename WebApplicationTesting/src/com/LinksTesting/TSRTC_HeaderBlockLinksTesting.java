package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlockLinksTesting
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		
		for(int a=0;a<HeaderLinks.size();a++)
		{
			String linkName=HeaderLinks.get(a).getText();
			System.out.println(a+" "+linkName);
			
			HeaderLinks.get(a).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(10);
			
			HeaderBlock=driver.findElement(By.className("menu-wrap"));			
			HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
			
		}
		
		driver.close();

	}

}
