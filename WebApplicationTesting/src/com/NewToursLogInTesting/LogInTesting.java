package com.NewToursLogInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTesting 
{

	//FirefoxDriver driver;
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sys\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		 //driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String ExpectedText="lowest";
		String ActualText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
		
		if(ActualText.contains(ExpectedText))
		{
			System.out.println("LogIn Successful -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
