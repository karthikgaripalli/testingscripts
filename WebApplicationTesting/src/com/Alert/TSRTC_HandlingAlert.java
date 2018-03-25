package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HandlingAlert
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Sleeper.sleepTightInSeconds(10);
		alt.accept();
		//alt.dismiss();
		//alt.sendKeys("Hello");
		
		driver.close();
		
		

	}

}
