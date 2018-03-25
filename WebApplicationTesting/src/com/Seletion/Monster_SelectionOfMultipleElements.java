package com.Seletion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_SelectionOfMultipleElements
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		driver.manage().window().maximize();
		
		WebElement Industry=driver.findElement(By.id("id_industry"));
		
		List<WebElement>IndustryNames=Industry.findElements(By.tagName("option"));
		
		for(int i=0;i<IndustryNames.size();i++)
		{
			String IndustryName=IndustryNames.get(i).getText();
			System.out.println(IndustryName);
		}

		
		WebElement CurrentLocation=driver.findElement(By.className("border_grey1"));
		
		Select selection = new Select(CurrentLocation);
		//selection.selectByIndex(3);
		
		selection.selectByVisibleText("Chennai");
		
		Select selection1 = new Select(Industry);
		selection1.selectByIndex(3);
		selection1.selectByIndex(2);
		selection1.selectByVisibleText("Any");
		
		//driver.close();
	}

}
