package com.Inhert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LogIn extends Constants
{
	@Test
	public void LogInTest()
	{
		System.out.println("LogIn Functionality Testing");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\srinivas1\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}
}
