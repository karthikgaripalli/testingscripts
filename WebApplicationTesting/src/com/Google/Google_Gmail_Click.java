package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.className("gb_P")).click();
		
		driver.close();

	}

}
