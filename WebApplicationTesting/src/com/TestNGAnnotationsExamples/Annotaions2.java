package com.TestNGAnnotationsExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaions2 
{

	@BeforeTest
	public void BrowerLaunchAndLogIn()
	{
		System.out.println("Firefox Browser Launch and LogIN");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("Testing InBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("Testing Compose Mail Functionality");
	}
	
	@Test(priority=3)
	public void SentMail()
	{
		System.out.println("Testing SentMail Functionality");
	}

	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Closing Application");
	}
	
	
}
