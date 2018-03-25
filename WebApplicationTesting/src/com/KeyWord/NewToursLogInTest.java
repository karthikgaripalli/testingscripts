package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest
{
	//ChromeDriver driver;
	
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver= new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sys\\Desktop\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Sys\\Desktop\\MarchWeekEndBatch\\WebApplicationTesting\\NewTours.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		
		driver.findElement(By.xpath(pr.getProperty("LogIn"))).click();
		
		
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
