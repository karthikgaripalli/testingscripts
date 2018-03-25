package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursApplicationLogInTesting
{

	@Parameters("Browser")
	
	@Test
	public void LogIn(String b) throws MalformedURLException
	{
		System.out.println(b);
		
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.126.134:4444/wd/hub"),cap);
		
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
