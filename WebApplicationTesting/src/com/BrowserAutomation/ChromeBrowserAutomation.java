package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ChromeBrowserAutomation
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sys\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Sys\\Downloads\\MicrosoftWebDriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Sys\\Downloads\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		//OperaDriver drive = new OperaDriver();
		
		
		
		
		driver.get("http://newtours.demoaut.com");
		
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
		
		driver.close();

	}

}
