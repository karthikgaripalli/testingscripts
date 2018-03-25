package com.CountryNames_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Regiser_Country_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		WebElement country = driver.findElement(By.name("country"));
		
		List<WebElement> country_name = country.findElements(By.tagName("option"));
		
		//for(int i=0;i<country_name.size();i++)
			//System.out.println(country_name.get(i).getText());
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Sys\\Desktop\\MarchWeekEndBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestDataFile2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		for(int i=0;i<country_name.size();i++)
		{
			System.out.println(country_name.get(i).getText());
			
			String  country_name1= country_name.get(i).getText();
			Row r = sheet.createRow(i);
			Cell c = r.createCell(0);
			
			c.setCellValue(country_name1);
			
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Sys\\Desktop\\MarchWeekEndBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestDataFile2.xlsx");
		workbook.write(fos);
		
		driver.close();

	}

}
