package com.WebTableTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeAndData_CapturingFirstCityName
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		String data=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]")).getText();
		
		System.out.println(data);
		
		driver.close();

	}

}
