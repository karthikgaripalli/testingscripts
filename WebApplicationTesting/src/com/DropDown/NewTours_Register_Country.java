package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		
		for(int a=0;a<CountryNames.size();a++)
		{
			System.out.println(CountryNames.get(a).getText());
		}
		
		driver.close();
	}

}
