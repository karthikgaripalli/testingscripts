package com.CookieTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		Set<Cookie>MyCookies=driver.manage().getCookies();
		
		System.out.println(MyCookies.size());
		
		driver.manage().deleteAllCookies();
		
	Iterator<Cookie>it =	MyCookies.iterator();
	
	while(it.hasNext())
	{
		Cookie c=it.next();
		System.out.println(c.getName()+"  "+c.getDomain());
	}
		MyCookies=driver.manage().getCookies();
		
		System.out.println(MyCookies.size());
		
		driver.close();

	}

}
