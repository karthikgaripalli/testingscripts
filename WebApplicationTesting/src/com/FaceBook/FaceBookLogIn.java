package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLogIn {
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("sowmyacharya.krl@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Hellotest");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();		

	}

}
