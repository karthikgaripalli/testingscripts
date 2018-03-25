package com.WebTableTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteWebTableData
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
				String data=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
driver.close();

	}

}
