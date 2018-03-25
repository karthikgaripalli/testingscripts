package com.Inhert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignOff extends LogIn
{
	@Test
	public void SiggnOff()
	{
		System.out.println("SignOff Functionality Testing");
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();
	}
}
