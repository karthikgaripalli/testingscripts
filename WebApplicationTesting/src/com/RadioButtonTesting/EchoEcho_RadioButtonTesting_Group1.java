package com.RadioButtonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_RadioButtonTesting_Group1
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		WebElement Block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>Radio=Block.findElements(By.name("group1"));
		
		System.out.println(Radio.size());
		
		for(int i=0;i<Radio.size();i++)
		{
			Radio.get(i).click();
			for(int j=0;j<Radio.size();j++)
			{
				System.out.println(Radio.get(j).getAttribute("checked")+"  "+Radio.get(j).getAttribute("value"));
			}
		}
		
		driver.close();
		

	}

}
