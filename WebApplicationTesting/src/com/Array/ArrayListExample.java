package com.Array;

import java.util.ArrayList;
import java.util.List;



public class ArrayListExample
{
	public static void main(String[] args) 
	{
		List<String>a=new ArrayList<>();
		a.add("Selenium");
		a.add("LoadRunner");
		a.add("QTP");
		a.add("RPA");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

	}

}
