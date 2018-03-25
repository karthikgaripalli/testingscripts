package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffMail
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		// nameee6358b0
		// named332ca96
		driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("hello");
		

	}

}
