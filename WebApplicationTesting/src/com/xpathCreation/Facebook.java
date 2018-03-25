package com.xpathCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("Hello");
		//driver.findElement(By.className("inputtext")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Hello");
		
		// Password
		//driver.findElement(By.className("inputtext")).sendKeys("Hiiiii");
		// data-testid="royal_pass"
		
		//driver.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys("Hiiii");
		
			
		driver.findElement(By.xpath("//*[@id='pass' and @className='inputtext']")).sendKeys("Hiii");
		

	}

}
