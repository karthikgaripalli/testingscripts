package com.FaceBookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest_chrome
{

public static void main(String[] args) 
{
	//FirefoxDriver driver = new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sys\\Downloads\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("Hello");
	//driver.findElement(By.id("pass")).sendKeys("hiiii");

	}

}
